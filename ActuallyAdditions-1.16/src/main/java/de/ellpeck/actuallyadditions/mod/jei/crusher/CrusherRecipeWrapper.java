///*
// * This file ("CrusherRecipeWrapper.java") is part of the Actually Additions mod for Minecraft.
// * It is created and owned by Ellpeck and distributed
// * under the Actually Additions License to be found at
// * http://ellpeck.de/actaddlicense
// * View the source code at https://github.com/Ellpeck/ActuallyAdditions
// *
// * © 2015-2017 Ellpeck
// */
//
//package de.ellpeck.actuallyadditions.mod.jei.crusher;
//
//import de.ellpeck.actuallyadditions.api.booklet.IBookletPage;
//import de.ellpeck.actuallyadditions.api.recipe.CrusherRecipe;
//import de.ellpeck.actuallyadditions.mod.blocks.ActuallyBlocks;
//import de.ellpeck.actuallyadditions.mod.booklet.misc.BookletUtils;
//import de.ellpeck.actuallyadditions.mod.jei.RecipeWrapperWithButton;
//import de.ellpeck.actuallyadditions.mod.util.StackUtil;
//import de.ellpeck.actuallyadditions.mod.util.StringUtil;
//import mezz.jei.api.ingredients.IIngredients;
//import mezz.jei.api.ingredients.VanillaTypes;
//import net.minecraft.client.Minecraft;
//import net.minecraft.item.ItemStack;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class CrusherRecipeWrapper extends RecipeWrapperWithButton {
//
//    public final CrusherRecipe theRecipe;
//
//    public CrusherRecipeWrapper(CrusherRecipe recipe) {
//        this.theRecipe = recipe;
//    }
//
//    @Override
//    public void getIngredients(IIngredients ingredients) {
//        ingredients.setInputs(VanillaTypes.ITEM, Arrays.asList(this.theRecipe.getInput().getMatchingStacks()));
//
//        List<ItemStack> list = new ArrayList<>();
//        list.add(this.theRecipe.getOutputOne());
//        if (StackUtil.isValid(this.theRecipe.getOutputTwo())) {
//            list.add(this.theRecipe.getOutputTwo());
//        }
//        ingredients.setOutputs(VanillaTypes.ITEM, list);
//    }
//
//    @Override
//    public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY) {
//        if (StackUtil.isValid(this.theRecipe.getOutputTwo())) {
//            minecraft.fontRenderer.drawString(this.theRecipe.getSecondChance() + "%", 60, 60, StringUtil.DECIMAL_COLOR_GRAY_TEXT, false);
//        }
//
//        super.drawInfo(minecraft, recipeWidth, recipeHeight, mouseX, mouseY);
//    }
//
//    @Override
//    public int getButtonX() {
//        return -5;
//    }
//
//    @Override
//    public int getButtonY() {
//        return 26;
//    }
//
//    @Override
//    public IBookletPage getPage() {
//        return BookletUtils.findFirstPageForStack(new ItemStack(ActuallyBlocks.blockGrinder));
//    }
//}
