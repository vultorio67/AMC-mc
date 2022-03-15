/*
 * This file ("ItemToolAA.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.items.base;

import de.ellpeck.actuallyadditions.api.misc.IDisableableItem;
import de.ellpeck.actuallyadditions.mod.util.ItemUtil;
import de.ellpeck.actuallyadditions.mod.util.StackUtil;
import net.minecraft.block.Block;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.tags.ITag;

import java.util.Set;

public class ItemToolAA extends ToolItem implements IDisableableItem {

    private final String name;
    private final ItemStack repairItem;
    private final ITag<Item> repairTag;
    private final boolean disabled;

    public ItemToolAA(float p_i48512_1_, float p_i48512_2_, IItemTier p_i48512_3_, Set<Block> p_i48512_4_, Properties p_i48512_5_, String name, ItemStack repairItem, ITag<Item> repairTag) {
        super(p_i48512_1_, p_i48512_2_, p_i48512_3_, p_i48512_4_, p_i48512_5_);

        this.name = name;
        this.repairItem = repairItem;
        this.repairTag = repairTag;
        this.disabled = false;
    }

//    public ItemToolAA(float attack, float speed, IItemTier toolMat, String repairItem, String unlocalizedName, Rarity rarity, Set<Block> effectiveStuff) {
//        this(attack, speed, toolMat, ItemStack.EMPTY, unlocalizedName, rarity, effectiveStuff);
//        this.repairOredict = repairItem;
//    }

//    public ItemToolAA(float attack, float speed, ToolMaterial toolMat, ItemStack repairItem, String unlocalizedName, Rarity rarity, Set<Block> effectiveStuff) {
//        super(attack, speed, toolMat, effectiveStuff);
//
//        this.repairItem = repairItem;
//        this.name = unlocalizedName;
//        this.rarity = rarity;
////        this.disabled = ConfigurationHandler.config.getBoolean("Disable: " + StringUtil.badTranslate(unlocalizedName), "Tool Control", false, "This will disable the " + StringUtil.badTranslate(unlocalizedName) + ". It will not be registered.");
////        if (!this.disabled) {
////            this.register();
////        }
//    }

    private void register() {
    }

    @Override
    public boolean isValidRepairItem(ItemStack itemToRepair, ItemStack stack) {
        if (StackUtil.isValid(this.repairItem)) {
            return ItemUtil.areItemsEqual(this.repairItem, stack, false);
        } else if (this.repairTag != null) {
            return repairTag.contains(stack.getItem());
        }
        return false;
    }

    @Override
    public boolean isDisabled() {
        return this.disabled;
    }
}
