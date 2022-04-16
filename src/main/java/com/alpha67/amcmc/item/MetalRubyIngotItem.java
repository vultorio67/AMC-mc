
package com.alpha67.amcmc.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.alpha67.amcmc.itemgroup.AlphatabItemGroup;
import com.alpha67.amcmc.AmcmcModElements;

@AmcmcModElements.ModElement.Tag
public class MetalRubyIngotItem extends AmcmcModElements.ModElement {
	@ObjectHolder("amcmc:metal_ruby_ingot")
	public static final Item block = null;

	public MetalRubyIngotItem(AmcmcModElements instance) {
		super(instance, 62);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AlphatabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("metal_ruby_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
