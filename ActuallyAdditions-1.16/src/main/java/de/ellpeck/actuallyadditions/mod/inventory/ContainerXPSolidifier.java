/*
 * This file ("ContainerXPSolidifier.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.inventory;

import de.ellpeck.actuallyadditions.mod.inventory.slot.SlotItemHandlerUnconditioned;
import de.ellpeck.actuallyadditions.mod.inventory.slot.SlotOutput;
import de.ellpeck.actuallyadditions.mod.items.ItemSolidifiedExperience;
import de.ellpeck.actuallyadditions.mod.tile.TileEntityXPSolidifier;
import de.ellpeck.actuallyadditions.mod.util.StackUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;

import java.util.Objects;

public class ContainerXPSolidifier extends Container {

    public final TileEntityXPSolidifier solidifier;

    public static ContainerXPSolidifier fromNetwork(int windowId, PlayerInventory inv, PacketBuffer data) {
        return new ContainerXPSolidifier(windowId, inv, (TileEntityXPSolidifier) Objects.requireNonNull(inv.player.level.getBlockEntity(data.readBlockPos())));
    }

    public ContainerXPSolidifier(int windowId, PlayerInventory inventory, TileEntityXPSolidifier tile) {
        super(ActuallyContainers.XPSOLIDIFIER_CONTAINER.get(), windowId);
        this.solidifier = tile;

        this.addSlot(new SlotOutput(this.solidifier.inv, 0, 95, 8));
        this.addSlot(new SlotItemHandlerUnconditioned(this.solidifier.inv, 1, 65, 8));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlot(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 97 + i * 18));
            }
        }
        for (int i = 0; i < 9; i++) {
            this.addSlot(new Slot(inventory, i, 8 + i * 18, 155));
        }
    }

    @Override
    public ItemStack quickMoveStack(PlayerEntity player, int slot) {
        int inventoryStart = 2;
        int inventoryEnd = inventoryStart + 26;
        int hotbarStart = inventoryEnd + 1;
        int hotbarEnd = hotbarStart + 8;

        Slot theSlot = this.slots.get(slot);

        if (theSlot != null && theSlot.hasItem()) {
            ItemStack newStack = theSlot.getItem();
            ItemStack currentStack = newStack.copy();

            //Other Slots in Inventory excluded
            if (slot >= inventoryStart) {
                if (newStack.getItem() instanceof ItemSolidifiedExperience) {
                    if (!this.moveItemStackTo(newStack, 1, 2, false)) {
                        return StackUtil.getEmpty();
                    }
                } else if (slot >= inventoryStart && slot <= inventoryEnd) {
                    if (!this.moveItemStackTo(newStack, hotbarStart, hotbarEnd + 1, false)) {
                        return StackUtil.getEmpty();
                    }
                } else if (slot >= inventoryEnd + 1 && slot < hotbarEnd + 1 && !this.moveItemStackTo(newStack, inventoryStart, inventoryEnd + 1, false)) {
                    return StackUtil.getEmpty();
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
        return this.solidifier.canPlayerUse(player);
    }
}
