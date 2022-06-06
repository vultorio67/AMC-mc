
package com.alpha67.amc.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.alpha67.amc.procedures.SinuitProcedure;
import com.alpha67.amc.procedures.ProcedureguilogogenerationelecProcedure;
import com.alpha67.amc.procedures.Procedurebarredechargement9Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement8Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement7Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement6Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement5Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement54Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement53Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement52Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement51Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement50Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement4Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement49Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement48Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement47Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement46Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement45Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement44Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement43Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement42Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement41Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement40Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement3Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement39Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement38Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement37Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement36Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement35Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement34Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement33Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement32Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement31Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement30Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement2Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement29Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement28Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement27Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement26Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement25Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement24Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement23Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement22Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement21Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement20Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement1Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement19Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement18Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement17Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement16Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement15Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement14Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement13Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement12Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement11Procedure;
import com.alpha67.amc.procedures.Procedurebarredechargement10Procedure;

@OnlyIn(Dist.CLIENT)
public class GuisolarpanelTier1GuiWindow extends ContainerScreen<GuisolarpanelTier1Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = GuisolarpanelTier1Gui.guistate;

	public GuisolarpanelTier1GuiWindow(GuisolarpanelTier1Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("amc:textures/guisolarpanel_tier_1.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		if (Procedurebarredechargement54Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec54.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement53Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec53.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement52Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec52.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement51Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec51.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement50Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec50.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement49Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec49.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement48Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec48.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement47Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec47.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement46Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec46.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement45Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec45.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement44Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec44.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement43Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec43.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement42Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec42.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement41Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec41.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement40Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec40.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement39Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec39.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement38Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec38.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement37Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec37.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement36Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec36.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement35Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec35.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement34Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec34.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement33Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec33.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement32Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec32.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement31Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec31.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement30Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec30.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement29Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec29.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement28Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec28.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement27Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec27.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement26Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec26.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement25Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec25.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement24Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec24.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement23Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec23.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement22Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec22.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement21Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec21.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement20Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec20.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement19Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec19.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement18Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec18.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement17Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec17.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement16Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec16.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement15Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec15.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement14Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec14.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement13Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec13.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement12Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec12.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement11Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec11.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement10Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec10.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement9Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec9.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement8Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec8.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement7Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec7.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement6Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec6.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement5Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec5.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement4Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec4.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement3Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec3.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement2Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec2.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (Procedurebarredechargement1Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpanelbarelec1.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 22, 0, 0, 54, 7, 54, 7);
		}
		if (ProcedureguilogogenerationelecProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpaneleclaire.png"));
			this.blit(ms, this.guiLeft + 61, this.guiTop + 18, 0, 0, 16, 16, 16, 16);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpaneleclaire.png"));
		this.blit(ms, this.guiLeft + 148, this.guiTop + 55, 0, 0, 16, 16, 16, 16);

		if (ProcedureguilogogenerationelecProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/sunguisolarpanel.png"));
			this.blit(ms, this.guiLeft + 28, this.guiTop + 18, 0, 0, 16, 16, 16, 16);
		}
		if (SinuitProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/gffxbfxcb.png"));
			this.blit(ms, this.guiLeft + 21, this.guiTop + 14, 0, 0, 256, 256, 256, 256);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/hgtrhfghythj.png"));
		this.blit(ms, this.guiLeft + 24, this.guiTop + 13, 0, 0, 256, 256, 256, 256);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Energie stoqu\uFFFD: " + ((int) new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "energie")) + "FE", 5, 48, -12829636);
		this.font.drawString(ms, "Energie produite :  " + ((int) new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "energieproduite")) + "FE/T", 5, 60, -65485);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
	}
}
