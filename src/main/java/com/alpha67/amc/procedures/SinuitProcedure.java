package com.alpha67.amc.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;

import java.util.Map;

import com.alpha67.amc.AmcMod;

public class SinuitProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AmcMod.LOGGER.warn("Failed to load dependency world for procedure Sinuit!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (!((world instanceof World) ? ((World) world).isDaytime() : false)) {
			return false;
		}
		return true;
	}
}
