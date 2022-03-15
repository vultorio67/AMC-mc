/*
 * This file ("GuiCoalGenerator.java") is part of the Actually Additions mod for Minecraft.
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
import de.ellpeck.actuallyadditions.mod.inventory.ContainerCoalGenerator;
import de.ellpeck.actuallyadditions.mod.tile.TileEntityCoalGenerator;
import de.ellpeck.actuallyadditions.mod.util.AssetUtil;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;

@OnlyIn(Dist.CLIENT)
public class GuiCoalGenerator extends AAScreen<ContainerCoalGenerator> {

    private static final ResourceLocation RES_LOC = AssetUtil.getGuiLocation("gui_coal_generator");
    private final TileEntityCoalGenerator generator;
    private EnergyDisplay energy;

    public GuiCoalGenerator(ContainerCoalGenerator container, PlayerInventory inventory, ITextComponent title) {
        super(container, inventory, title);
        this.generator = container.generator;
        this.imageWidth = 176;
        this.imageHeight = 93 + 86;
    }

    @Override
    public void init() {
        super.init();
        this.energy = new EnergyDisplay(this.leftPos + 42, this.topPos + 5, this.generator.storage);
        titleLabelX = (int) (imageWidth / 2.0f - font.width(title) / 2.0f);
        titleLabelY = -10;
    }

    @Override
    public void render(@Nonnull MatrixStack matrices, int x, int y, float f) {
        renderBackground(matrices);
        super.render(matrices, x, y, f);
        this.energy.render(matrices, x, y);
        renderTooltip(matrices, x, y);
    }

    @Override
    public void renderBg(MatrixStack matrices, float f, int x, int y) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);

        this.getMinecraft().getTextureManager().bind(AssetUtil.GUI_INVENTORY_LOCATION);
        this.blit(matrices, this.leftPos, this.topPos + 93, 0, 0, 176, 86);

        this.getMinecraft().getTextureManager().bind(RES_LOC);
        this.blit(matrices, this.leftPos, this.topPos, 0, 0, 176, 93);

        if (this.generator.currentBurnTime > 0) {
            int i = this.generator.getBurningScaled(13);
            this.blit(matrices, this.leftPos + 87, this.topPos + 27 + 12 - i, 176, 96 - i, 14, i);
        }

        this.energy.draw(matrices);
    }
}
