/*
 * This file ("RecipeBioMash.java") is part of the Actually Additions mod for Minecraft.
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
public class RecipeBioMash { //extends IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {
    //
    //    public RecipeBioMash(ResourceLocation location) {
    //        RecipeHelper.addRecipe(location.getPath(), this);
    //    }
    //
    //    @Override
    //    public boolean matches(InventoryCrafting inv, World world) {
    //        boolean foundFood = false;
    //        boolean hasKnife = false;
    //
    //        for (int i = 0; i < inv.getSizeInventory(); i++) {
    //            ItemStack stack = inv.getStackInSlot(i);
    //            if (StackUtil.isValid(stack)) {
    //                if (stack.getItem() instanceof ItemKnife) {
    //                    if (hasKnife) {
    //                        return false;
    //                    } else {
    //                        hasKnife = true;
    //                    }
    //                } else if (stack.getItem() instanceof ItemFood) {
    //                    foundFood = true;
    //                } else {
    //                    return false;
    //                }
    //            }
    //        }
    //
    //        return foundFood && hasKnife;
    //    }
    //
    //    @Override
    //    public ItemStack getCraftingResult(InventoryCrafting inv) {
    //        int amount = 0;
    //
    //        for (int i = 0; i < inv.getSizeInventory(); i++) {
    //            ItemStack stack = inv.getStackInSlot(i);
    //            if (StackUtil.isValid(stack)) {
    //                if (stack.getItem() instanceof ItemFood) {
    //                    ItemFood food = (ItemFood) stack.getItem();
    //                    float heal = food.getHealAmount(stack);
    //                    float sat = food.getSaturationModifier(stack);
    //
    //                    amount += MathHelper.ceil(heal * sat);
    //                }
    //            }
    //        }
    //
    //        if (amount > 0 && amount <= 64) {
    //            return new ItemStack(InitItems.itemMisc, amount, TheMiscItems.MASHED_FOOD.ordinal());
    //        } else {
    //            return StackUtil.getEmpty();
    //        }
    //    }
    //
    //    @Override
    //    public boolean canFit(int width, int height) {
    //        return width * height > 5;
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
