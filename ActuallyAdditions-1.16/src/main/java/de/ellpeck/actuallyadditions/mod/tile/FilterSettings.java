/*
 * This file ("FilterSettings.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.tile;

import de.ellpeck.actuallyadditions.mod.inventory.ContainerFilter;
import de.ellpeck.actuallyadditions.mod.inventory.slot.SlotFilter;
import de.ellpeck.actuallyadditions.mod.items.DrillItem;
import de.ellpeck.actuallyadditions.mod.util.ItemStackHandlerAA;
import de.ellpeck.actuallyadditions.mod.util.StackUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class FilterSettings {

    public final int whitelistButtonId;
    public final int metaButtonId;
    public final int nbtButtonId;
    public final int oredictButtonId;
    public final int modButtonId;
    public final ItemStackHandlerAA filterInventory;
    public boolean isWhitelist;
    public boolean respectMeta;
    public boolean respectNBT;
    public boolean respectMod;
    public int respectOredict;
    private boolean lastWhitelist;
    private boolean lastRespectMeta;
    private boolean lastRespectNBT;
    private boolean lastRespectMod;
    private int lastRecpectOredict;

    public FilterSettings(int slots, boolean defaultWhitelist, boolean defaultRespectMeta, boolean defaultRespectNBT, boolean defaultRespectMod, int defaultRespectOredict, int buttonIdStart) {
        this.filterInventory = new ItemStackHandlerAA(slots);

        this.isWhitelist = defaultWhitelist;
        this.respectMeta = defaultRespectMeta;
        this.respectNBT = defaultRespectNBT;
        this.respectMod = defaultRespectMod;
        this.respectOredict = defaultRespectOredict;

        this.whitelistButtonId = buttonIdStart;
        this.metaButtonId = buttonIdStart + 1;
        this.nbtButtonId = buttonIdStart + 2;
        this.oredictButtonId = buttonIdStart + 3;
        this.modButtonId = buttonIdStart + 4;
    }

    public static boolean check(ItemStack stack, ItemStackHandlerAA filter, boolean whitelist, boolean meta, boolean nbt, boolean mod, int oredict) {
        if (StackUtil.isValid(stack)) {
            for (int i = 0; i < filter.getSlots(); i++) {
                ItemStack slot = filter.getStackInSlot(i);

                if (StackUtil.isValid(slot)) {
                    if (SlotFilter.isFilter(slot)) {
                        ItemStackHandlerAA inv = new ItemStackHandlerAA(ContainerFilter.SLOT_AMOUNT);
                        DrillItem.loadSlotsFromNBT(inv, slot);
                        for (int k = 0; k < inv.getSlots(); k++) {
                            ItemStack filterSlot = inv.getStackInSlot(k);
                            if (StackUtil.isValid(filterSlot) && areEqualEnough(filterSlot, stack, meta, nbt, mod, oredict)) {
                                return whitelist;
                            }
                        }
                    } else if (areEqualEnough(slot, stack, meta, nbt, mod, oredict)) {
                        return whitelist;
                    }
                }
            }
        }
        return !whitelist;
    }

    private static boolean areEqualEnough(ItemStack first, ItemStack second, boolean meta, boolean nbt, boolean mod, int oredict) {
        Item firstItem = first.getItem();
        Item secondItem = second.getItem();
        if (mod && firstItem.getRegistryName().getNamespace().equals(secondItem.getRegistryName().getNamespace())) {
            return true;
        }

//        if (oredict != 0) {
//            boolean firstEmpty = ArrayUtils.isEmpty(firstIds);
//            boolean secondEmpty = ArrayUtils.isEmpty(secondIds);
//
//            //Both empty, meaning none has OreDict entries, so they are equal
//            if (firstEmpty && secondEmpty) {
//                return true;
//            }
//            //Only one empty, meaning they are not equal
//            else if (firstEmpty || secondEmpty) {
//                return false;
//            } else {
//                for (int id : firstIds) {
//                    if (ArrayUtils.contains(secondIds, id)) {
//                        //Needs to match only one id, so return true on first match
//                        if (oredict == 1) {
//                            return true;
//                        }
//                    }
//                    //Needs to match every id, so just return false when no match
//                    else if (oredict == 2) {
//                        return false;
//                    }
//
//                }
//                //If oredict mode 1, this will fail because nothing matched
//                //If oredict mode 2, this will mean nothing hasn't matched
//                return oredict == 2;
//            }
//        }

        if (firstItem != secondItem) {
            return false;
        }

        boolean nbtFine = !nbt || ItemStack.tagMatches(first, second);
        if (nbtFine) {
            return true;
        }
        return false;
    }

    public void writeToNBT(CompoundNBT tag, String name) {
        CompoundNBT compound = new CompoundNBT();
        compound.putBoolean("Whitelist", this.isWhitelist);
        compound.putBoolean("Meta", this.respectMeta);
        compound.putBoolean("NBT", this.respectNBT);
        compound.putBoolean("Mod", this.respectMod);
        compound.putInt("Oredict", this.respectOredict);
        TileEntityInventoryBase.saveSlots(this.filterInventory, compound);
        tag.put(name, compound);
    }

    public void readFromNBT(CompoundNBT tag, String name) {
        CompoundNBT compound = tag.getCompound(name);
        this.isWhitelist = compound.getBoolean("Whitelist");
        this.respectMeta = compound.getBoolean("Meta");
        this.respectNBT = compound.getBoolean("NBT");
        this.respectMod = compound.getBoolean("Mod");
        this.respectOredict = compound.getInt("Oredict");
        TileEntityInventoryBase.loadSlots(this.filterInventory, compound);
    }

    public boolean needsUpdateSend() {
        return this.lastWhitelist != this.isWhitelist || this.lastRespectMeta != this.respectMeta || this.lastRespectNBT != this.respectNBT || this.lastRespectMod != this.respectMod || this.lastRecpectOredict != this.respectOredict;
    }

    public void updateLasts() {
        this.lastWhitelist = this.isWhitelist;
        this.lastRespectMeta = this.respectMeta;
        this.lastRespectNBT = this.respectNBT;
        this.lastRespectMod = this.respectMod;
        this.lastRecpectOredict = this.respectOredict;
    }

    public void onButtonPressed(int id) {
        if (id == this.whitelistButtonId) {
            this.isWhitelist = !this.isWhitelist;
        } else if (id == this.metaButtonId) {
            this.respectMeta = !this.respectMeta;
        } else if (id == this.nbtButtonId) {
            this.respectNBT = !this.respectNBT;
        } else if (id == this.modButtonId) {
            this.respectMod = !this.respectMod;

            if (this.respectMod) {
                this.respectMeta = false;
                this.respectNBT = false;
                this.respectOredict = 0;
            }
        } else if (id == this.oredictButtonId) {
            if (this.respectOredict + 1 > 2) {
                this.respectOredict = 0;
            } else {
                this.respectOredict++;
            }
        }
    }

    public boolean check(ItemStack stack) {
        return !this.needsCheck() || check(stack, this.filterInventory, this.isWhitelist, this.respectMeta, this.respectNBT, this.respectMod, this.respectOredict);
    }

    public boolean needsCheck() {
        for (int i = 0; i < this.filterInventory.getSlots(); i++) {
            if (StackUtil.isValid(this.filterInventory.getStackInSlot(i))) {
                return true;
            }
        }
        return this.isWhitelist;
    }
}
