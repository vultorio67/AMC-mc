/*
 * This file ("IMethodHandler.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.api.internal;

import de.ellpeck.actuallyadditions.api.recipe.CoffeeIngredient;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.BlockPos;

import java.util.List;

/**
 * This is the internal method handler.
 * Use ActuallyAdditionsAPI.methodHandler for calling
 * This is not supposed to be implemented.
 */
public interface IMethodHandler {

    boolean addEffectToStack(ItemStack stack, CoffeeIngredient ingredient);

    EffectInstance getSameEffectFromStack(ItemStack stack, EffectInstance effect);

    void addEffectProperties(ItemStack stack, EffectInstance effect, boolean addDur, boolean addAmp);

    void addEffectToStack(ItemStack stack, EffectInstance effect);

    EffectInstance[] getEffectsFromStack(ItemStack stack);

    boolean invokeConversionLens(BlockState hitState, BlockPos hitBlock, IAtomicReconstructor tile);

    boolean invokeReconstructor(IAtomicReconstructor tile);

    boolean addCrusherRecipes(List<ItemStack> inputs, List<ItemStack> outputOnes, int outputOneAmounts, List<ItemStack> outputTwos, int outputTwoAmounts, int outputTwoChance);

    @Deprecated
        //Use Ingredient input on AA API class
    boolean addCrusherRecipes(List<ItemStack> inputs, ItemStack outputOne, int outputOneAmount, ItemStack outputTwo, int outputTwoAmount, int outputTwoChance);

//    IBookletPage generateTextPage(int id);
//
//    IBookletPage generatePicturePage(int id, ResourceLocation resLoc, int textStartY);
//
//    IBookletPage generateCraftingPage(int id, IRecipe... recipes);
//
//    IBookletPage generateFurnacePage(int id, ItemStack input, ItemStack result);
//
//    IBookletChapter generateBookletChapter(String identifier, IBookletEntry entry, ItemStack displayStack, IBookletPage... pages);
//
//    IBookletPage generateTextPage(int id, int priority);
//
//    IBookletPage generatePicturePage(int id, ResourceLocation resLoc, int textStartY, int priority);
//
//    IBookletPage generateCraftingPage(int id, int priority, IRecipe... recipes);
//
//    IBookletPage generateFurnacePage(int id, ItemStack input, ItemStack result, int priority);
//
//    IBookletChapter generateBookletChapter(String identifier, IBookletEntry entry, ItemStack displayStack, int priority, IBookletPage... pages);
//
//    IBookletChapter createTrial(String identifier, ItemStack displayStack, boolean textOnSecondPage);
}
