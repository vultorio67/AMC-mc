
package com.alpha67.amcmc.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.alpha67.amcmc.itemgroup.AlphatabItemGroup;
import com.alpha67.amcmc.AmcmcModElements;

@AmcmcModElements.ModElement.Tag
public class AlphariumShovelItem extends AmcmcModElements.ModElement {
	@ObjectHolder("amcmc:alpharium_shovel")
	public static final Item block = null;

	public AlphariumShovelItem(AmcmcModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AlphariumingotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(AlphatabItemGroup.tab)) {
		}.setRegistryName("alpharium_shovel"));
	}
}
