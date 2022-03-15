/*
 * This file ("ContainerEnervator.java") is part of the Actually Additions mod for Minecraft.
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
import de.ellpeck.actuallyadditions.mod.tile.TileEntityEnervator;
import de.ellpeck.actuallyadditions.mod.util.StackUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.energy.CapabilityEnergy;

import java.util.Objects;

public class ContainerEnervator extends Container {

    public final TileEntityEnervator enervator;

    public static ContainerEnervator fromNetwork(int windowId, PlayerInventory inv, PacketBuffer data) {
        return new ContainerEnervator(windowId, inv, (TileEntityEnervator) Objects.requireNonNull(inv.player.level.getBlockEntity(data.readBlockPos())));
    }

    public ContainerEnervator(int windowId, PlayerInventory inventory, TileEntityEnervator tile) {
        super(ActuallyContainers.ENERVATOR_CONTAINER.get(), windowId);
        this.enervator = tile;

        this.addSlot(new SlotItemHandlerUnconditioned(this.enervator.inv, 0, 76, 73));
        this.addSlot(new SlotOutput(this.enervator.inv, 1, 76, 42));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlot(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 97 + i * 18));
            }
        }
        for (int i = 0; i < 9; i++) {
            this.addSlot(new Slot(inventory, i, 8 + i * 18, 155));
        }

        for (int k = 0; k < 4; ++k) {
            EquipmentSlotType slot = ContainerEnergizer.VALID_EQUIPMENT_SLOTS[k];
            this.addSlot(new Slot(inventory, 36 + 3 - k, 102, 19 + k * 18) {
                @Override
                public int getMaxStackSize() {
                    return 1;
                }

                // TODO: [port] validate that this is correct
                @Override
                public boolean mayPlace(ItemStack stack) {
                    return StackUtil.isValid(stack) && stack.getItem() instanceof ArmorItem;
                }

                // TODO: [port] add this back

                //                @Override
                //                @OnlyIn(Dist.CLIENT)
                //                public String getSlotTexture() {
                //                    return ItemArmor.EMPTY_SLOT_NAMES[slot.getIndex()];
                //                }
            });
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

            //Slots in Inventory to shift from
            if (slot == 1) {
                if (!this.moveItemStackTo(newStack, inventoryStart, hotbarEnd + 1, true)) {
                    return StackUtil.getEmpty();
                }
                theSlot.onQuickCraft(newStack, currentStack);
            }
            //Other Slots in Inventory excluded
            else if (slot >= inventoryStart) {
                //Shift from Inventory
                if (newStack.getCapability(CapabilityEnergy.ENERGY).isPresent()) {
                    if (!this.moveItemStackTo(newStack, 0, 1, false)) {
                        return StackUtil.getEmpty();
                    }
                }
                //

                else if (slot >= inventoryStart && slot <= inventoryEnd) {
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
        return this.enervator.canPlayerUse(player);
    }
}
