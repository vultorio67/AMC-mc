package com.alpha67.amc.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import com.alpha67.amc.AmcMod;

public class JetpackflyToucheEnfonceeProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AmcMod.LOGGER.warn("Failed to load dependency entity for procedure JetpackflyToucheEnfoncee!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putBoolean("Fly", (true));
	}
}
