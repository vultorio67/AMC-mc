/*
 * This file ("GuiFeeder.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.inventory.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import de.ellpeck.actuallyadditions.mod.ActuallyAdditions;
import de.ellpeck.actuallyadditions.mod.inventory.ContainerFeeder;
import de.ellpeck.actuallyadditions.mod.tile.TileEntityFeeder;
import de.ellpeck.actuallyadditions.mod.util.AssetUtil;
import de.ellpeck.actuallyadditions.mod.util.StringUtil;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;

@OnlyIn(Dist.CLIENT)
public class GuiFeeder extends AAScreen<ContainerFeeder> {

    private static final ResourceLocation RES_LOC = AssetUtil.getGuiLocation("gui_feeder");
    public final TileEntityFeeder tileFeeder;

    public GuiFeeder(ContainerFeeder container, PlayerInventory inventory, ITextComponent title) {
        super(container, inventory, title);
        this.tileFeeder = container.feeder;
        this.imageWidth = 176;
        this.imageHeight = 70 + 86;
    }

    @Override
    public void render(@Nonnull MatrixStack matrices, int x, int y, float f) {
        super.render(matrices, x, y, f);
        if (x >= this.leftPos + 69 && y >= this.topPos + 30 && x <= this.leftPos + 69 + 10 && y <= this.topPos + 30 + 10) {
            String[] array = new String[]{this.tileFeeder.currentAnimalAmount + " " + StringUtil.localize("info." + ActuallyAdditions.MODID + ".gui.animals"), this.tileFeeder.currentAnimalAmount >= 2 && this.tileFeeder.currentAnimalAmount < TileEntityFeeder.THRESHOLD
                ? StringUtil.localize("info." + ActuallyAdditions.MODID + ".gui.enoughToBreed")
                : this.tileFeeder.currentAnimalAmount >= TileEntityFeeder.THRESHOLD
                    ? StringUtil.localize("info." + ActuallyAdditions.MODID + ".gui.tooMany")
                    : StringUtil.localize("info." + ActuallyAdditions.MODID + ".gui.notEnough")};
            //this.drawHoveringText(Arrays.asList(array), x, y);
        }
    }

    @Override
    public void renderLabels(@Nonnull MatrixStack matrices, int x, int y) {
        AssetUtil.displayNameString(matrices, this.font, this.imageWidth, -10, this.tileFeeder);
    }

    @Override
    public void renderBg(MatrixStack matrices, float f, int x, int y) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.getMinecraft().getTextureManager().bind(AssetUtil.GUI_INVENTORY_LOCATION);
        this.blit(matrices, this.leftPos, this.topPos + 70, 0, 0, 176, 86);
        this.getMinecraft().getTextureManager().bind(RES_LOC);
        this.blit(matrices, this.leftPos, this.topPos, 0, 0, 176, 70);

        if (this.tileFeeder.currentTimer > 0) {
            int i = this.tileFeeder.getCurrentTimerToScale(20);
            this.blit(matrices, this.leftPos + 85, this.topPos + 42 - i, 181, 19 + 19 - i, 6, 20);
        }

        if (this.tileFeeder.currentAnimalAmount >= 2 && this.tileFeeder.currentAnimalAmount < TileEntityFeeder.THRESHOLD) {
            this.blit(matrices, this.leftPos + 70, this.topPos + 31, 192, 16, 8, 8);
        }

        if (this.tileFeeder.currentAnimalAmount >= TileEntityFeeder.THRESHOLD) {
            this.blit(matrices, this.leftPos + 70, this.topPos + 31, 192, 24, 8, 8);
        }
    }
}
