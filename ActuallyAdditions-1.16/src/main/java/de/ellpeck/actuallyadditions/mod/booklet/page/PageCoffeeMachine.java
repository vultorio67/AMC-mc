///*
// * This file ("PageCoffeeMachine.java") is part of the Actually Additions mod for Minecraft.
// * It is created and owned by Ellpeck and distributed
// * under the Actually Additions License to be found at
// * http://ellpeck.de/actaddlicense
// * View the source code at https://github.com/Ellpeck/ActuallyAdditions
// *
// * © 2015-2017 Ellpeck
// */
//
//package de.ellpeck.actuallyadditions.mod.booklet.page;
//
//import de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI;
//import de.ellpeck.actuallyadditions.api.booklet.internal.GuiBookletBase;
//import de.ellpeck.actuallyadditions.api.recipe.CoffeeIngredient;
//import de.ellpeck.actuallyadditions.mod.booklet.gui.GuiBooklet;
//import de.ellpeck.actuallyadditions.mod.items.ActuallyItems;
//import net.minecraft.item.ItemStack;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//import net.minecraftforge.fml.client.gui.GuiUtils;
//
//import java.util.List;
//
//public class PageCoffeeMachine extends BookletPage {
//
//    private final CoffeeIngredient ingredient;
//    private final ItemStack outcome;
//    private int counter = 0;
//    private int rotate = 0;
//    private final ItemStack[] stacks;
//
//    public PageCoffeeMachine(int localizationKey, CoffeeIngredient ingredient) {
//        super(localizationKey);
//        this.ingredient = ingredient;
//        this.stacks = ingredient.getInput().getItems();
//
//        this.outcome = new ItemStack(ActuallyItems.COFFEE.get());
//        ActuallyAdditionsAPI.methodHandler.addEffectToStack(this.outcome, this.ingredient);
//    }
//
//    @Override
//    @OnlyIn(Dist.CLIENT)
//    public void drawScreenPre(GuiBookletBase gui, int startX, int startY, int mouseX, int mouseY, float partialTicks) {
//        super.drawScreenPre(gui, startX, startY, mouseX, mouseY, partialTicks);
//
//        gui.getMinecraft().getTextureManager().bind(GuiBooklet.RES_LOC_GADGETS);
//        GuiUtils.drawTexturedModalRect(startX + 5, startY + 10, 0, 74, 117, 72, 0);
//
//        gui.renderScaledAsciiString("(Coffee Maker Recipe)", startX + 6, startY + 78, 0, false, gui.getMediumFontSize());
//        gui.renderSplitScaledAsciiString("Hover over this to see the effect!", startX + 5, startY + 51, 0, false, gui.getSmallFontSize(), 35);
//
//        PageTextOnly.renderTextToPage(gui, this, startX + 6, startY + 90);
//
//        if (this.counter++ % 50 == 0) {
//            gui.addOrModifyItemRenderer(this.stacks[this.rotate++ % this.stacks.length], startX + 5 + 82, startY + 10 + 1, 1F, true);
//        }
//    }
//
//    @Override
//    @OnlyIn(Dist.CLIENT)
//    public void init(GuiBookletBase gui, int startX, int startY) {
//        super.init(gui, startX, startY);
//
//        gui.addOrModifyItemRenderer(this.stacks[0], startX + 5 + 82, startY + 10 + 1, 1F, true);
//        gui.addOrModifyItemRenderer(this.outcome, startX + 5 + 36, startY + 10 + 42, 1F, false);
//
//        gui.addOrModifyItemRenderer(new ItemStack(ActuallyItems.COFFEE_CUP.get()), startX + 5 + 37, startY + 10 + 1, 1F, true);
//        gui.addOrModifyItemRenderer(new ItemStack(ActuallyItems.COFFEE.get()), startX + 5 + 1, startY + 10 + 1, 1F, true);
//    }
//
//    @Override
//    public void getItemStacksForPage(List<ItemStack> list) {
//        super.getItemStacksForPage(list);
//
//        list.add(this.outcome);
//    }
//}
