/*
 * This file ("RecipePotionRingCharging.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.crafting;

// TODO: [port] MOVE TO DATA_GENERATOR
@Deprecated
public class RecipePotionRingCharging { //extends IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {
    //
    //    public RecipePotionRingCharging(ResourceLocation location) {
    //        RecipeHelper.addRecipe(location.getPath(), this);
    //    }
    //
    //    @Override
    //    public boolean matches(InventoryCrafting inv, World worldIn) {
    //        boolean hasRing = false;
    //
    //        for (int i = 0; i < inv.getSizeInventory(); i++) {
    //            ItemStack stack = inv.getStackInSlot(i);
    //            if (StackUtil.isValid(stack)) {
    //                if (stack.getItem() instanceof ItemPotionRing) {
    //                    if (!hasRing) {
    //                        hasRing = true;
    //                    } else {
    //                        return false;
    //                    }
    //                } else if (stack.getItem() != Items.BLAZE_POWDER) { return false; }
    //            }
    //        }
    //
    //        return hasRing;
    //    }
    //
    //    @Override
    //    public ItemStack getCraftingResult(InventoryCrafting inv) {
    //        ItemStack inputRing = StackUtil.getEmpty();
    //        int totalBlaze = 0;
    //
    //        for (int i = 0; i < inv.getSizeInventory(); i++) {
    //            ItemStack stack = inv.getStackInSlot(i);
    //            if (StackUtil.isValid(stack)) {
    //                if (stack.getItem() instanceof ItemPotionRing) {
    //                    inputRing = stack;
    //                } else if (stack.getItem() == Items.BLAZE_POWDER) {
    //                    totalBlaze += 20;
    //                }
    //            }
    //        }
    //
    //        if (StackUtil.isValid(inputRing) && totalBlaze > 0) {
    //            ItemStack copy = inputRing.copy();
    //
    //            int total = ItemPotionRing.getStoredBlaze(copy) + totalBlaze;
    //            if (total <= ItemPotionRing.MAX_BLAZE) {
    //                ItemPotionRing.setStoredBlaze(copy, total);
    //                return copy;
    //            }
    //        }
    //
    //        return StackUtil.getEmpty();
    //    }
    //
    //    @Override
    //    public boolean canFit(int width, int height) {
    //        return width * height > 3;
    //    }
    //
    //    @Override
    //    public ItemStack getRecipeOutput() {
    //        return StackUtil.getEmpty();
    //    }
    //
    //    @Override
    //    public NonNullList<ItemStack> getRemainingItems(InventoryCrafting inv) {
    //        return ForgeHooks.defaultRecipeGetRemainingItems(inv);
    //    }
}
