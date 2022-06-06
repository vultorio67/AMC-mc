
package com.alpha67.amc.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.alpha67.amc.procedures.SimplejetpackEvenementDeTickDuPlastronProcedure;
import com.alpha67.amc.itemgroup.AlphatabItemGroup;
import com.alpha67.amc.AmcModElements;

@AmcModElements.ModElement.Tag
public class SimplejetpackItem extends AmcModElements.ModElement {
	@ObjectHolder("amc:simplejetpack_helmet")
	public static final Item helmet = null;
	@ObjectHolder("amc:simplejetpack_chestplate")
	public static final Item body = null;
	@ObjectHolder("amc:simplejetpack_leggings")
	public static final Item legs = null;
	@ObjectHolder("amc:simplejetpack_boots")
	public static final Item boots = null;

	public SimplejetpackItem(AmcModElements instance) {
		super(instance, 294);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1250;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 0, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 0;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "simplejetpack";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(AlphatabItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new Modelsteve().Body;
				armorModel.bipedLeftArm = new Modelsteve().LeftArm;
				armorModel.bipedRightArm = new Modelsteve().RightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "amc:textures/texturesimplejetpack.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				SimplejetpackEvenementDeTickDuPlastronProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
								new AbstractMap.SimpleEntry<>("entity", entity), new AbstractMap.SimpleEntry<>("itemstack", itemstack))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}.setRegistryName("simplejetpack_chestplate"));
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelsteve extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;

		public Modelsteve() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(36, 44).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);
			Body.setTextureOffset(2, 48).addBox(-4.0F, 9.0F, 2.0F, 8.0F, -8.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(9, 1).addBox(0.3F, 7.5F, 3.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 8).addBox(-1.3F, 7.5F, 3.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 0).addBox(-0.9F, 2.1F, 3.3F, 2.0F, 5.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(3, 9).addBox(-4.3F, 8.0F, 5.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(3, 9).addBox(3.3F, 8.0F, 5.8F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			Body.setTextureOffset(29, 0).addBox(2.8F, 1.0F, 2.3F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(23, 11).addBox(-4.8F, 1.0F, 2.3F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(24, 21).addBox(-4.8F, 1.0F, 5.3F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(6, 23).addBox(2.8F, 1.0F, 5.3F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(23, 0).addBox(4.8F, 1.0F, 3.3F, 1.0F, 9.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(18, 22).addBox(-5.8F, 1.0F, 3.3F, 1.0F, 9.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(0, 23).addBox(1.8F, 1.0F, 3.3F, 1.0F, 9.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(12, 22).addBox(-2.8F, 1.0F, 3.3F, 1.0F, 9.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(32, 26).addBox(2.8F, 0.0F, 3.3F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(8, 16).addBox(-4.8F, 0.0F, 3.3F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(40, 8).addBox(2.8F, 9.7F, 3.3F, 2.0F, -1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(37, 1).addBox(-4.8F, 9.7F, 3.3F, 2.0F, -1.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(30, 24).addBox(-2.0F, 0.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(17, 0).addBox(-1.5F, 0.4F, 2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 16).addBox(3.475F, 1.0F, -2.6F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Body.setTextureOffset(9, 8).addBox(-4.475F, 1.0F, -2.6F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Body.setTextureOffset(10, 15).addBox(3.475F, 6.0F, -2.6F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Body.setTextureOffset(9, 0).addBox(-4.475F, 6.0F, -2.6F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Body.setTextureOffset(0, 35).addBox(4.4F, 1.5F, 4.9F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(31, 32).addBox(-5.4F, 1.5F, 4.9F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(9, 33).addBox(2.2F, 1.5F, 4.9F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(27, 32).addBox(-3.2F, 1.5F, 4.9F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(26, 42).addBox(4.4F, 1.5F, 2.7F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(23, 32).addBox(-5.4F, 1.5F, 2.7F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(5, 33).addBox(2.2F, 1.5F, 2.7F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(30, 15).addBox(-3.2F, 1.5F, 2.7F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 1.5708F, -1.5708F);
			cube_r1.setTextureOffset(26, 27).addBox(1.6F, 1.0F, -6.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, -1.5708F, 1.5708F);
			cube_r2.setTextureOffset(29, 10).addBox(-2.6F, 1.0F, -6.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
			cube_r3.setTextureOffset(0, 0).addBox(-2.6F, 1.0F, -3.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 8).addBox(-2.6F, 6.0F, -3.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(48, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}
