
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

import com.alpha67.amc.procedures.Processgui9coalgeneratorProcedure;
import com.alpha67.amc.procedures.Processgui8coalgeneratorProcedure;
import com.alpha67.amc.procedures.Processgui7coalgeneratorProcedure;
import com.alpha67.amc.procedures.Processgui6coalgeneratorProcedure;
import com.alpha67.amc.procedures.Processgui5coalgeneratorProcedure;
import com.alpha67.amc.procedures.Processgui4coalgeneratorProcedure;
import com.alpha67.amc.procedures.Processgui3coalgeneratorProcedure;
import com.alpha67.amc.procedures.Processgui2coalgeneratorProcedure;
import com.alpha67.amc.procedures.Processgui1coalgeneratorProcedure;
import com.alpha67.amc.procedures.Processgui12coalgeneratorProcedure;
import com.alpha67.amc.procedures.Processgui11coalgeneratorProcedure;
import com.alpha67.amc.procedures.Processgui10coalgeneratorProcedure;

@OnlyIn(Dist.CLIENT)
public class BasiccoalgeneratorGuiWindow extends ContainerScreen<BasiccoalgeneratorGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = BasiccoalgeneratorGui.guistate;

	public BasiccoalgeneratorGuiWindow(BasiccoalgeneratorGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 179;
		this.ySize = 149;
	}

	private static final ResourceLocation texture = new ResourceLocation("amc:textures/basiccoalgenerator.png");

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/noiretblanc.png"));
		this.blit(ms, this.guiLeft + 81, this.guiTop + 38, 0, 0, 16, 22, 16, 22);

		if (Processgui12coalgeneratorProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/unamed11e.png"));
			this.blit(ms, this.guiLeft + 81, this.guiTop + 38, 0, 0, 16, 22, 16, 22);
		}
		if (Processgui11coalgeneratorProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/unnamed10e.png"));
			this.blit(ms, this.guiLeft + 81, this.guiTop + 38, 0, 0, 16, 22, 16, 22);
		}
		if (Processgui10coalgeneratorProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/unnamed9e.png"));
			this.blit(ms, this.guiLeft + 81, this.guiTop + 38, 0, 0, 16, 22, 16, 22);
		}
		if (Processgui9coalgeneratorProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/unnamed8e.png"));
			this.blit(ms, this.guiLeft + 81, this.guiTop + 38, 0, 0, 16, 22, 16, 22);
		}
		if (Processgui8coalgeneratorProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/unnamed7e.png"));
			this.blit(ms, this.guiLeft + 81, this.guiTop + 38, 0, 0, 16, 22, 16, 22);
		}
		if (Processgui7coalgeneratorProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/unnamed6e.png"));
			this.blit(ms, this.guiLeft + 81, this.guiTop + 38, 0, 0, 16, 22, 16, 22);
		}
		if (Processgui6coalgeneratorProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/unnamed5e.png"));
			this.blit(ms, this.guiLeft + 81, this.guiTop + 38, 0, 0, 16, 22, 16, 22);
		}
		if (Processgui5coalgeneratorProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/unnamed4e.png"));
			this.blit(ms, this.guiLeft + 81, this.guiTop + 38, 0, 0, 16, 22, 16, 22);
		}
		if (Processgui4coalgeneratorProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/unnamed3e.png"));
			this.blit(ms, this.guiLeft + 81, this.guiTop + 38, 0, 0, 16, 22, 16, 22);
		}
		if (Processgui3coalgeneratorProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/unnamed2e.png"));
			this.blit(ms, this.guiLeft + 81, this.guiTop + 38, 0, 0, 16, 22, 16, 22);
		}
		if (Processgui2coalgeneratorProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/unnamed1e.png"));
			this.blit(ms, this.guiLeft + 81, this.guiTop + 38, 0, 0, 16, 22, 16, 22);
		}
		if (Processgui1coalgeneratorProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/unnamede.png"));
			this.blit(ms, this.guiLeft + 81, this.guiTop + 38, 0, 0, 16, 22, 16, 22);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/guisolarpaneleclaire.png"));
		this.blit(ms, this.guiLeft + 130, this.guiTop + 24, 0, 0, 16, 16, 16, 16);

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
		this.font.drawString(ms, "Basic coal generator", 36, 5, -1);
		this.font.drawString(ms, "Upgrade:", 9, 23, -12829636);
		this.font.drawString(ms, "" + (new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "energie")) + "/1000", 108, 42, -12829636);
		this.font.drawString(ms, "Fe/T", 127, 51, -12829636);
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
