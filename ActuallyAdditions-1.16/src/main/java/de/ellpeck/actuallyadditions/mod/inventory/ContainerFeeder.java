/*
 * This file ("ContainerFeeder.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.inventory;

import de.ellpeck.actuallyadditions.mod.inventory.slot.SlotItemHandlerUnconditioned;
import de.ellpeck.actuallyadditions.mod.tile.TileEntityFeeder;
import de.ellpeck.actuallyadditions.mod.util.StackUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;

import java.util.Objects;

public class ContainerFeeder extends Container {

    public final TileEntityFeeder feeder;

    public static ContainerFeeder fromNetwork(int windowId, PlayerInventory inv, PacketBuffer data) {
        return new ContainerFeeder(windowId, inv, (TileEntityFeeder) Objects.requireNonNull(inv.player.level.getBlockEntity(data.readBlockPos())));
    }

    public ContainerFeeder(int windowId, PlayerInventory inventory, TileEntityFeeder tile) {
        super(ActuallyContainers.FEEDER_CONTAINER.get(), windowId);
        this.feeder = tile;
        this.addSlot(new SlotItemHandlerUnconditioned(this.feeder.inv, 0, 80, 45));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlot(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 74 + i * 18));
            }
        }
        for (int i = 0; i < 9; i++) {
            this.addSlot(new Slot(inventory, i, 8 + i * 18, 132));
        }
    }

    @Override
    public ItemStack quickMoveStack(PlayerEntity player, int slot) {
        int inventoryStart = 1;
        int inventoryEnd = inventoryStart + 26;
        int hotbarStart = inventoryEnd + 1;
        int hotbarEnd = hotbarStart + 8;

        Slot theSlot = this.slots.get(slot);

        if (theSlot != null && theSlot.hasItem()) {
            ItemStack newStack = theSlot.getItem();
            ItemStack currentStack = newStack.copy();

            //Other Slots in Inventory excluded
            if (slot >= inventoryStart) {
                //Shift from Inventory
                if (!this.moveItemStackTo(newStack, 0, 1, false)) {
                    //
                    if (slot >= inventoryStart && slot <= inventoryEnd) {
                        if (!this.moveItemStackTo(newStack, hotbarStart, hotbarEnd + 1, false)) {
                            return StackUtil.getEmpty();
                        }
                    } else if (slot >= inventoryEnd + 1 && slot < hotbarEnd + 1 && !this.moveItemStackTo(newStack, inventoryStart, inventoryEnd + 1, false)) {
                        return StackUtil.getEmpty();
                    }
                }
            } else if (!this.moveItemStackTo(newStack, inventoryStart, hotbarEnd + 1, false)) {
                return StackUtil.getEmpty();
            }

            if (!StackUtil.isValid(newStack)) {
                theSlot.set(StackUtil.getEmpty());
            } else {
                theSlot.setChanged();
            }

            if (newStack.getCount() == currentStack.getCount()) {
                return StackUtil.getEmpty();
            }
            theSlot.onTake(player, newStack);

            return currentStack;
        }
        return StackUtil.getEmpty();
    }

    @Override
    public boolean stillValid(PlayerEntity player) {
        return this.feeder.canPlayerUse(player);
    }
}
