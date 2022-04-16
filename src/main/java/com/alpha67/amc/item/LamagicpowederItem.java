
package com.alpha67.amc.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.alpha67.amc.itemgroup.AlphatabItemGroup;
import com.alpha67.amc.AmcModElements;

@AmcModElements.ModElement.Tag
public class LamagicpowederItem extends AmcModElements.ModElement {
	@ObjectHolder("amc:lamagicpoweder")
	public static final Item block = null;

	public LamagicpowederItem(AmcModElements instance) {
		super(instance, 101);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AlphatabItemGroup.tab).maxDamage(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("lamagicpoweder");
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
