/*
 * This file ("ItemWaterBowl.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.items;

import de.ellpeck.actuallyadditions.mod.config.CommonConfig;
import de.ellpeck.actuallyadditions.mod.items.base.ItemBase;
import de.ellpeck.actuallyadditions.mod.util.StackUtil;
import de.ellpeck.actuallyadditions.mod.util.WorldUtil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ItemWaterBowl extends ItemBase {

    public ItemWaterBowl() {
        super(ActuallyItems.defaultProps().stacksTo(1));
        //MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerInteractEvent(PlayerInteractEvent.RightClickItem event) {
        if (event.getWorld() != null) {
            if (CommonConfig.Other.WATER_BOWL.get()) {
                if (StackUtil.isValid(event.getItemStack()) && event.getItemStack().getItem() == Items.BOWL) {
                    RayTraceResult rayTrace = WorldUtil.getNearestBlockWithDefaultReachDistance(event.getWorld(), event.getPlayer(), true, false, false);
                    if (rayTrace.getType() != RayTraceResult.Type.BLOCK) {
                        return;
                    }

                    BlockRayTraceResult trace = (BlockRayTraceResult) rayTrace;
                    ActionResult<ItemStack> result = ForgeEventFactory.onBucketUse(event.getPlayer(), event.getWorld(), event.getItemStack(), trace);
                    if (result == null) {
                        if (event.getPlayer().mayUseItemAt(trace.getBlockPos().relative(trace.getDirection()), trace.getDirection(), event.getItemStack())) {
                            BlockState state = event.getWorld().getBlockState(trace.getBlockPos());
                            Block block = state.getBlock();

                            // TODO: Validate fluid check
                            if ((block == Blocks.WATER) && state.getValue(BlockStateProperties.LEVEL) == 0) {
                                event.getPlayer().playSound(SoundEvents.BUCKET_FILL, 1.0F, 1.0F);

                                if (!event.getWorld().isClientSide) {
                                    event.getWorld().setBlock(trace.getBlockPos(), Blocks.AIR.defaultBlockState(), 11);
                                    ItemStack reduced = StackUtil.shrink(event.getItemStack(), 1);

                                    ItemStack bowl = new ItemStack(ActuallyItems.WATER_BOWL.get());
                                    if (!StackUtil.isValid(reduced)) {
                                        event.getPlayer().setItemInHand(event.getHand(), bowl);
                                    } else if (!event.getPlayer().inventory.add(bowl.copy())) {
                                        ItemEntity entityItem = new ItemEntity(event.getWorld(), event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), bowl.copy());
                                        entityItem.setPickUpDelay(0);
                                        event.getWorld().addFreshEntity(entityItem);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);

        RayTraceResult trace = WorldUtil.getNearestBlockWithDefaultReachDistance(world, player);
        ActionResult<ItemStack> result = ForgeEventFactory.onBucketUse(player, world, stack, trace);
        if (result != null) {
            return result;
        }

        if (trace == null) {
            return ActionResult.pass(stack);
        } else if (trace.getType() != RayTraceResult.Type.BLOCK) {
            return ActionResult.pass(stack);
        } else {
            BlockRayTraceResult blockTrace = (BlockRayTraceResult) trace;
            BlockPos pos = blockTrace.getBlockPos();

            if (!world.mayInteract(player, pos)) {
                return ActionResult.fail(stack);
            } else {
                BlockPos pos1 = world.getBlockState(pos).getMaterial().isReplaceable() && blockTrace.getDirection() == Direction.UP
                    ? pos
                    : pos.relative(blockTrace.getDirection());

                if (!player.mayUseItemAt(pos1, blockTrace.getDirection(), stack)) {
                    return ActionResult.fail(stack);
                } else if (this.tryPlaceContainedLiquid(player, world, pos1, false)) {
                    return !player.isCreative()
                        ? ActionResult.success(new ItemStack(Items.BOWL))
                        : ActionResult.success(stack);
                } else {
                    return ActionResult.fail(stack);
                }
            }
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        if (!world.isClientSide) {
            if (CommonConfig.Other.WATER_BOWL_LOSS.get()) {
                if (world.getGameTime() % 10 == 0 && world.random.nextFloat() >= 0.5F) {
                    int lastX = 0;
                    int lastY = 0;

                    if (stack.hasTag()) {
                        CompoundNBT compound = stack.getOrCreateTag();
                        lastX = compound.getInt("lastX");
                        lastY = compound.getInt("lastY");
                    }

                    boolean change = false;
                    if (lastX != 0 && lastX != (int) entity.getX() || lastY != 0 && lastY != (int) entity.getY()) {
                        if (!entity.isShiftKeyDown()) {
                            if (entity instanceof PlayerEntity) {
                                PlayerEntity player = (PlayerEntity) entity;
                                if (this.tryPlaceContainedLiquid(player, world, player.blockPosition(), true)) {
                                    this.checkReplace(player, stack, new ItemStack(Items.BOWL), itemSlot);
                                }
                            }
                        }
                        change = true;
                    }

                    if (change || lastX == 0 || lastY == 0) {
                        CompoundNBT compound = stack.getOrCreateTag();
                        compound.putInt("lastX", (int) entity.getX());
                        compound.putInt("lastY", (int) entity.getY());
                    }
                }
            }
        }
    }

    private void checkReplace(PlayerEntity player, ItemStack old, ItemStack stack, int slot) {
        if (player.inventory.getItem(slot) == old) {
            player.inventory.setItem(slot, stack);
        } else if (player.inventory.offhand.get(slot) == old) {
            player.inventory.offhand.set(slot, stack);
        }
    }

    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return !ItemStack.isSame(oldStack, newStack);
    }

    public boolean tryPlaceContainedLiquid(PlayerEntity player, World world, BlockPos pos, boolean finite) {
        BlockState state = world.getBlockState(pos);
        Material material = state.getMaterial();
        boolean nonSolid = !material.isSolid();
        boolean replaceable = state.getMaterial().isReplaceable();

        if (!world.isEmptyBlock(pos) && !nonSolid && !replaceable) {
            return false;
        } else {
            if (world.dimensionType().ultraWarm()) {
                world.playSound(player, pos, SoundEvents.FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (world.random.nextFloat() - world.random.nextFloat()) * 0.8F);

                for (int k = 0; k < 8; k++) {
                    world.addParticle(ParticleTypes.LARGE_SMOKE, pos.getX() + Math.random(), pos.getY() + Math.random(), pos.getZ() + Math.random(), 0.0D, 0.0D, 0.0D);
                }
            } else {
                if (!world.isClientSide && (nonSolid || replaceable) && !material.isLiquid()) {
                    world.destroyBlock(pos, true);
                }

                world.playSound(player, pos, SoundEvents.BUCKET_EMPTY, SoundCategory.BLOCKS, 1.0F, 1.0F);

                BlockState placeState = Blocks.WATER.defaultBlockState();
                world.setBlock(pos, placeState, 3);
            }

            return true;
        }
    }
}
