/*
 * This file ("ItemWaterRemovalRing.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.items;

import de.ellpeck.actuallyadditions.mod.items.base.ItemEnergy;
import de.ellpeck.actuallyadditions.mod.util.StackUtil;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ItemWaterRemovalRing extends ItemEnergy {

    public ItemWaterRemovalRing() {
        super(800000, 1000);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity player, int itemSlot, boolean isSelected) {
        if (!(player instanceof PlayerEntity) || player.level.isClientSide || player.isShiftKeyDown()) {
            return;
        }

        ItemStack equipped = ((PlayerEntity) player).getMainHandItem();

        int energyUse = 150;
        if (StackUtil.isValid(equipped) && equipped == stack && this.getEnergyStored(stack) >= energyUse) {

            //Setting everything to air
            int range = 3;
            for (int x = -range; x < range + 1; x++) {
                for (int z = -range; z < range + 1; z++) {
                    for (int y = -range; y < range + 1; y++) {
                        int theX = MathHelper.floor(player.getX() + x);
                        int theY = MathHelper.floor(player.getY() + y);
                        int theZ = MathHelper.floor(player.getZ() + z);

                        //Remove Water
                        BlockPos pos = new BlockPos(theX, theY, theZ);
                        Block block = world.getBlockState(pos).getBlock();
                        // TODO: Ensure water check is correct
                        if ((block == Blocks.WATER) && this.getEnergyStored(stack) >= energyUse) {
                            world.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());

                            if (!((PlayerEntity) player).isCreative()) {
                                this.extractEnergyInternal(stack, energyUse, false);
                            }
                        }
                        //Remove Lava
                        // TODO: Ensure lava check is correct
                        else if ((block == Blocks.LAVA) && this.getEnergyStored(stack) >= energyUse * 2) {
                            world.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());

                            if (!((PlayerEntity) player).isCreative()) {
                                this.extractEnergyInternal(stack, energyUse * 2, false);
                            }
                        }
                    }
                }
            }
        }
    }
}
