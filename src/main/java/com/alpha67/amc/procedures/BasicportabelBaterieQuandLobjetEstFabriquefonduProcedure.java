package com.alpha67.amc.procedures;

import net.minecraft.item.ItemStack;

import java.util.Map;

import com.alpha67.amc.AmcMod;

public class BasicportabelBaterieQuandLobjetEstFabriquefonduProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				AmcMod.LOGGER.warn("Failed to load dependency itemstack for procedure BasicportabelBaterieQuandLobjetEstFabriquefondu!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		(itemstack).setDamage((int) 4999);
		itemstack.getOrCreateTag().putDouble("energie", 0);
	}
}
