package de.ellpeck.actuallyadditions.mod.crafting;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class SingleItem implements IInventory {
    private final ItemStack itemStack;

    public SingleItem(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    @Override
    public int getContainerSize() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public ItemStack getItem(int pIndex) {
        return itemStack;
    }

    public ItemStack getItem() {
        return itemStack;
    }

    @Override
    public ItemStack removeItem(int pIndex, int pCount) {
        return ItemStack.EMPTY;
    }

    @Override
    public ItemStack removeItemNoUpdate(int pIndex) {
        return ItemStack.EMPTY;
    }

    @Override
    public void setItem(int pIndex, ItemStack pStack) {

    }

    @Override
    public void setChanged() {

    }

    @Override
    public boolean stillValid(PlayerEntity pPlayer) {
        return false;
    }

    @Override
    public void clearContent() {

    }
}
