
package com.alpha67.amc.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import com.alpha67.amc.itemgroup.AlphatabItemGroup;
import com.alpha67.amc.AmcModElements;

@AmcModElements.ModElement.Tag
public class AlphariumAxeItem extends AmcModElements.ModElement {
	@ObjectHolder("amc:alpharium_axe")
	public static final Item block = null;

	public AlphariumAxeItem(AmcModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3500;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AlphariumingotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(AlphatabItemGroup.tab)) {
		}.setRegistryName("alpharium_axe"));
	}
}
