/*
 * This file ("TileEntityItemViewerHopping.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.tile;

import de.ellpeck.actuallyadditions.mod.ActuallyAdditions;
import de.ellpeck.actuallyadditions.mod.blocks.ActuallyBlocks;
import de.ellpeck.actuallyadditions.mod.util.StackUtil;
import de.ellpeck.actuallyadditions.mod.util.WorldUtil;
import de.ellpeck.actuallyadditions.mod.util.compat.SlotlessableItemHandlerWrapper;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

import java.util.List;

public class TileEntityItemInterfaceHopping extends TileEntityItemInterface {

    private SlotlessableItemHandlerWrapper handlerToPullFrom;
    private SlotlessableItemHandlerWrapper handlerToPushTo;

    public TileEntityItemInterfaceHopping() {
        super(ActuallyBlocks.ITEM_INTERFACE_HOPPING.getTileEntityType());
    }

    @Override
    public void updateEntity() {
        super.updateEntity();

        // TODO: [port] validate this is the correct way to get total game time getGameTime
        if (!this.level.isClientSide && this.level.getLevelData().getGameTime() % 10 == 0) {
            if (this.handlerToPullFrom != null) {
                WorldUtil.doItemInteraction(this.handlerToPullFrom, this.itemHandler, 4);
            } else {
                if (this.level.getLevelData().getGameTime() % 20 == 0) {
                    //TODO hmm?
                    AxisAlignedBB axisAlignedBB = new AxisAlignedBB(this.getBlockPos().getX(), this.getBlockPos().getY() + 0.5, this.getBlockPos().getZ(), this.getBlockPos().getX() + 1, this.getBlockPos().getY() + 2, this.getBlockPos().getZ() + 1);
                    List<ItemEntity> items = this.level.getEntities(EntityType.ITEM, axisAlignedBB, EntityPredicates.ENTITY_STILL_ALIVE);
                    if (items != null && !items.isEmpty()) {
                        for (ItemEntity item : items) {
                            if (item != null && item.isAlive()) {
                                if (ActuallyAdditions.commonCapsLoaded) {
                                    Object slotless = this.itemHandler.getSlotlessHandler();
                                    // TODO: [port] add back?
                                    //                                    if (slotless instanceof ISlotlessItemHandler) {
                                    //                                        ItemStack left = ((ISlotlessItemHandler) slotless).insertItem(item.getItem(), false);
                                    //                                        item.setItem(left);
                                    //
                                    //                                        if (!StackUtil.isValid(left)) {
                                    //                                            item.remove();
                                    //                                            continue;
                                    //                                        }
                                    //                                    }
                                }

                                LazyOptional<IItemHandler> handler = this.itemHandler.getNormalHandler();
                                handler.ifPresent(cap -> {
                                    for (int i = 0; i < cap.getSlots(); i++) {
                                        ItemStack left = cap.insertItem(i, item.getItem(), false);
                                        item.setItem(left);

                                        if (!StackUtil.isValid(left)) {
                                            item.remove();
                                            break;
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            }

            if (this.handlerToPushTo != null) {
                WorldUtil.doItemInteraction(this.itemHandler, this.handlerToPushTo, 4);
            }
        }
    }

    @Override
    public void saveDataOnChangeOrWorldStart() {
        super.saveDataOnChangeOrWorldStart();

        this.handlerToPullFrom = null;
        this.handlerToPushTo = null;

        TileEntity from = this.level.getBlockEntity(this.getBlockPos().relative(Direction.UP));
        if (from != null && !(from instanceof TileEntityItemInterface)) {
            LazyOptional<IItemHandler> normal = from.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, Direction.DOWN);

            Object slotless = null;
            // TODO: [port] add back

            //            if (ActuallyAdditions.commonCapsLoaded) {
            //                if (from.hasCapability(SlotlessItemHandlerConfig.CAPABILITY, Direction.DOWN)) {
            //                    slotless = from.getCapability(SlotlessItemHandlerConfig.CAPABILITY, Direction.DOWN);
            //                }
            //            }

            this.handlerToPullFrom = new SlotlessableItemHandlerWrapper(normal, slotless);
        }

        BlockState state = this.level.getBlockState(this.getBlockPos());
        Direction facing = state.getValue(BlockStateProperties.FACING);

        BlockPos toPos = this.getBlockPos().relative(facing);
        if (this.level.isLoaded(toPos)) {
            TileEntity to = this.level.getBlockEntity(toPos);
            if (to != null && !(to instanceof TileEntityItemInterface)) {
                LazyOptional<IItemHandler> normal = to.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, facing.getOpposite());

                Object slotless = null;
                //                TODO: [port] Add back
                //                if (ActuallyAdditions.commonCapsLoaded) {
                //                    if (to.hasCapability(SlotlessItemHandlerConfig.CAPABILITY, facing.getOpposite())) {
                //                        slotless = to.getCapability(SlotlessItemHandlerConfig.CAPABILITY, facing.getOpposite());
                //                    }
                //                }

                this.handlerToPushTo = new SlotlessableItemHandlerWrapper(normal, slotless);
            }
        }
    }
}
