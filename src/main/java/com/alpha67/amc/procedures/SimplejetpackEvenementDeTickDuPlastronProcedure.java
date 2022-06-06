package com.alpha67.amc.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Random;
import java.util.Map;

import com.alpha67.amc.item.SimplejetpackItem;
import com.alpha67.amc.AmcMod;

public class SimplejetpackEvenementDeTickDuPlastronProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AmcMod.LOGGER.warn("Failed to load dependency world for procedure SimplejetpackEvenementDeTickDuPlastron!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AmcMod.LOGGER.warn("Failed to load dependency x for procedure SimplejetpackEvenementDeTickDuPlastron!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AmcMod.LOGGER.warn("Failed to load dependency y for procedure SimplejetpackEvenementDeTickDuPlastron!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AmcMod.LOGGER.warn("Failed to load dependency z for procedure SimplejetpackEvenementDeTickDuPlastron!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AmcMod.LOGGER.warn("Failed to load dependency entity for procedure SimplejetpackEvenementDeTickDuPlastron!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				AmcMod.LOGGER.warn("Failed to load dependency itemstack for procedure SimplejetpackEvenementDeTickDuPlastron!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(SimplejetpackItem.body)) : false) {
			entity.getPersistentData().putBoolean("simplejetpack", (true));
		} else {
			entity.getPersistentData().putBoolean("simplejetpack", (false));
		}
		entity.getPersistentData().putDouble("energie", (20000 - (itemstack).getDamage()));
		if ((itemstack).getMaxDamage() > (itemstack).getDamage() + 5) {
			if (entity.getPersistentData().getBoolean("Fly")) {
				entity.setMotion((entity.getMotion().getX()), 0.2, (entity.getMotion().getZ()));
				{
					ItemStack _ist = itemstack;
					if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
			if (!entity.isOnGround()) {
				{
					ItemStack _ist = itemstack;
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				world.addParticle(ParticleTypes.FLAME, (x + (Math.random() - Math.random()) * 0.4), (y + 0.7),
						(z + (Math.random() - Math.random()) * 0.4), 0, (-1), 0);
				world.addParticle(ParticleTypes.FLAME, (x + (Math.random() - Math.random()) * 0.4), (y + 0.7),
						(z + (Math.random() - Math.random()) * 0.4), 0, (-1), 0);
				world.addParticle(ParticleTypes.FLAME, (x + (Math.random() - Math.random()) * 0.4), (y + 0.7),
						(z + (Math.random() - Math.random()) * 0.4), 0, (-1), 0);
			}
		}
	}
}
