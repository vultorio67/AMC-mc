
package com.alpha67.amc.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.alpha67.amc.procedures.Procedureencadre4Procedure;
import com.alpha67.amc.procedures.Procedureencadre42Procedure;
import com.alpha67.amc.procedures.Procedureencadre3Procedure;
import com.alpha67.amc.procedures.Procedureencadre32Procedure;
import com.alpha67.amc.procedures.Procedureencadre2Procedure;
import com.alpha67.amc.procedures.Procedureencadre22Procedure;
import com.alpha67.amc.procedures.Procedureencadre1Procedure;
import com.alpha67.amc.procedures.Procedureencadre12Procedure;
import com.alpha67.amc.procedures.Lavatestgui2Procedure;
import com.alpha67.amc.procedures.Lavatestgui1Procedure;
import com.alpha67.amc.AmcMod;

@OnlyIn(Dist.CLIENT)
public class GuiblockfakerGuiWindow extends ContainerScreen<GuiblockfakerGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = GuiblockfakerGui.guistate;

	public GuiblockfakerGuiWindow(GuiblockfakerGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 196;
		this.ySize = 193;
	}

	private static final ResourceLocation texture = new ResourceLocation("amc:textures/guiblockfaker.png");

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/face_1_gui_block_faker.png"));
		this.blit(ms, this.guiLeft + 33, this.guiTop + 4, 0, 0, 25, 31, 25, 31);

		if (Procedureencadre1Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/parti3guiblockfacker.png"));
			this.blit(ms, this.guiLeft + 33, this.guiTop + 1, 0, 0, 26, 31, 26, 31);
		}
		if (Procedureencadre12Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/party2guiblockfacker.png"));
			this.blit(ms, this.guiLeft + 18, this.guiTop + 2, 0, 0, 45, 29, 45, 29);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/face_2_gui_block_faker.png"));
		this.blit(ms, this.guiLeft + 33, this.guiTop + 32, 0, 0, 25, 31, 25, 31);

		if (Procedureencadre2Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/parti3guiblockfacker.png"));
			this.blit(ms, this.guiLeft + 33, this.guiTop + 28, 0, 0, 26, 31, 26, 31);
		}
		if (Procedureencadre3Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/parti3guiblockfacker.png"));
			this.blit(ms, this.guiLeft + 33, this.guiTop + 55, 0, 0, 26, 31, 26, 31);
		}
		if (Procedureencadre4Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/parti3guiblockfacker.png"));
			this.blit(ms, this.guiLeft + 33, this.guiTop + 82, 0, 0, 26, 31, 26, 31);
		}
		if (Procedureencadre22Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/party2guiblockfacker.png"));
			this.blit(ms, this.guiLeft + 18, this.guiTop + 29, 0, 0, 45, 29, 45, 29);
		}
		if (Procedureencadre32Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/party2guiblockfacker.png"));
			this.blit(ms, this.guiLeft + 18, this.guiTop + 56, 0, 0, 45, 29, 45, 29);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/face_3_gui_block_faker.png"));
		this.blit(ms, this.guiLeft + 33, this.guiTop + 59, 0, 0, 25, 31, 25, 31);

		if (Procedureencadre42Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/party2guiblockfacker.png"));
			this.blit(ms, this.guiLeft + 18, this.guiTop + 83, 0, 0, 45, 29, 45, 29);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/face_4_gui_block_faker.png"));
		this.blit(ms, this.guiLeft + 33, this.guiTop + 85, 0, 0, 25, 31, 25, 31);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/.png"));
		this.blit(ms, this.guiLeft + 90, this.guiTop + 59, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/vfgvfhdvjnfjdk.png"));
		this.blit(ms, this.guiLeft + 128, this.guiTop + 50, 0, 0, 32, 32, 32, 32);

		if (Lavatestgui2Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/checkbox.png"));
			this.blit(ms, this.guiLeft + 131, this.guiTop + 54, 0, 0, 20, 42, 20, 42);
		}
		if (Lavatestgui1Procedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("amc:textures/checkbox1.png"));
			this.blit(ms, this.guiLeft + 131, this.guiTop + 54, 0, 0, 20, 42, 20, 42);
		}
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
		this.font.drawString(ms, "The super mega supra", 76, 6, -10066330);
		this.font.drawString(ms, "bloc faker", 137, 18, -10066330);
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
		this.addButton(new Button(this.guiLeft + 2, this.guiTop + 8, 30, 20, new StringTextComponent("1"), e -> {
			if (true) {
				AmcMod.PACKET_HANDLER.sendToServer(new GuiblockfakerGui.ButtonPressedMessage(0, x, y, z));
				GuiblockfakerGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 2, this.guiTop + 34, 30, 20, new StringTextComponent("2"), e -> {
			if (true) {
				AmcMod.PACKET_HANDLER.sendToServer(new GuiblockfakerGui.ButtonPressedMessage(1, x, y, z));
				GuiblockfakerGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 2, this.guiTop + 61, 30, 20, new StringTextComponent("3"), e -> {
			if (true) {
				AmcMod.PACKET_HANDLER.sendToServer(new GuiblockfakerGui.ButtonPressedMessage(2, x, y, z));
				GuiblockfakerGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 2, this.guiTop + 88, 30, 20, new StringTextComponent("4"), e -> {
			if (true) {
				AmcMod.PACKET_HANDLER.sendToServer(new GuiblockfakerGui.ButtonPressedMessage(3, x, y, z));
				GuiblockfakerGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
