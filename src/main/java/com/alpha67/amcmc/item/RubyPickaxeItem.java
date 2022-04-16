
package com.alpha67.amcmc.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.alpha67.amcmc.itemgroup.AlphatabItemGroup;
import com.alpha67.amcmc.AmcmcModElements;

@AmcmcModElements.ModElement.Tag
public class RubyPickaxeItem extends AmcmcModElements.ModElement {
	@ObjectHolder("amcmc:ruby_pickaxe")
	public static final Item block = null;

	public RubyPickaxeItem(AmcmcModElements instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3500;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RefinedRubyItem.block));
			}
		}, 1, -3f, new Item.Properties().group(AlphatabItemGroup.tab)) {
		}.setRegistryName("ruby_pickaxe"));
	}
}