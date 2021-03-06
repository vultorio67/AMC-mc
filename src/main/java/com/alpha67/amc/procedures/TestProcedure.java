package com.alpha67.amc.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;

import java.util.Map;

import com.alpha67.amc.AmcMod;

public class TestProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AmcMod.LOGGER.warn("Failed to load dependency world for procedure Test!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld)
			((ServerWorld) world).setDayTime((int) 1);
	}
}
