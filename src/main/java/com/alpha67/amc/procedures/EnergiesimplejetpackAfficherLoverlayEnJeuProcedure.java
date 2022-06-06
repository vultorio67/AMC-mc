package com.alpha67.amc.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import com.alpha67.amc.AmcMod;

public class EnergiesimplejetpackAfficherLoverlayEnJeuProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AmcMod.LOGGER.warn("Failed to load dependency entity for procedure EnergiesimplejetpackAfficherLoverlayEnJeu!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getBoolean("simplejetpack")) {
			return true;
		}
		return false;
	}
}
