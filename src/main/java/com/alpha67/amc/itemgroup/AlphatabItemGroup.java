
package com.alpha67.amc.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.alpha67.amc.item.AlphariumingotItem;
import com.alpha67.amc.AmcModElements;

@AmcModElements.ModElement.Tag
public class AlphatabItemGroup extends AmcModElements.ModElement {
	public AlphatabItemGroup(AmcModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabalphatab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AlphariumingotItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
