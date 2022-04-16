
package com.alpha67.amc.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.alpha67.amc.block.FakeblockacacialogonefaceBlock;
import com.alpha67.amc.AmcModElements;

@AmcModElements.ModElement.Tag
public class FakeblockItemGroup extends AmcModElements.ModElement {
	public FakeblockItemGroup(AmcModElements instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfakeblock") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(FakeblockacacialogonefaceBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
