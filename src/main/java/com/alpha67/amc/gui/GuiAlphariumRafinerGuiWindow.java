
package com.alpha67.amc.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
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

import com.alpha67.amc.procedures.Lavabuketprocedure9Procedure;
import com.alpha67.amc.procedures.Lavabuketprocedure8Procedure;
import com.alpha67.amc.procedures.Lavabuketprocedure7Procedure;
import com.alpha67.amc.procedures.Lavabuketprocedure6Procedure;
import com.alpha67.amc.procedures.Lavabuketprocedure5Procedure;
import com.alpha67.amc.procedures.Lavabuketprocedure4Procedure;
import com.alpha67.amc.procedures.Lavabuketprocedure3Procedure;
import com.alpha67.amc.procedures.Lavabuketprocedure2Procedure;
import com.alpha67.amc.procedures.Lavabuketprocedure1Procedure;
import com.alpha67.amc.procedures.Lavabuketprocedure10Procedure;
import com.alpha67.amc.procedures.Lavabuketprocedure0Procedure;

@OnlyIn(Dist.CLIENT)
public class GuiAlphariumRafinerGuiWindow extends ContainerScreen<GuiAlphariumRafinerGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = GuiAlphariumRafinerGui.guistate;

	public GuiAlphariumRafinerGuiWindow(GuiAlphariumRafinerGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("amc:textures/gui_alpharium_rafiner.png");

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
		if (Lavabuketprocedure10Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/11.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 7, 0, 0, 10, 54, 10, 54);
		}
		if (Lavabuketprocedure9Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/10.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 7, 0, 0, 10, 54, 10, 54);
		}
		if (Lavabuketprocedure8Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/9.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 7, 0, 0, 10, 54, 10, 54);
		}
		if (Lavabuketprocedure7Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/8.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 7, 0, 0, 10, 54, 10, 54);
		}
		if (Lavabuketprocedure6Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/7.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 7, 0, 0, 10, 54, 10, 54);
		}
		if (Lavabuketprocedure5Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/6.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 7, 0, 0, 10, 54, 10, 54);
		}
		if (Lavabuketprocedure4Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/5.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 7, 0, 0, 10, 54, 10, 54);
		}
		if (Lavabuketprocedure3Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/4.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 7, 0, 0, 10, 54, 10, 54);
		}
		if (Lavabuketprocedure2Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/3.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 7, 0, 0, 10, 54, 10, 54);
		}
		if (Lavabuketprocedure1Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/2.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 7, 0, 0, 10, 54, 10, 54);
		}
		if (Lavabuketprocedure0Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/1.png"));
			this.blit(ms, this.guiLeft + 15, this.guiTop + 7, 0, 0, 10, 54, 10, 54);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/barre4.png"));
		this.blit(ms, this.guiLeft + 70, this.guiTop + 34, 0, 0, 64, 8, 64, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/barre3.png"));
		this.blit(ms, this.guiLeft + 70, this.guiTop + 34, 0, 0, 64, 8, 64, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/barre1.png"));
		this.blit(ms, this.guiLeft + 70, this.guiTop + 34, 0, 0, 64, 8, 64, 8);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/barre0.png"));
		this.blit(ms, this.guiLeft + 70, this.guiTop + 34, 0, 0, 64, 8, 64, 8);

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
