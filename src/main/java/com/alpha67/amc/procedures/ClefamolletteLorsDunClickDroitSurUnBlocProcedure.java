package com.alpha67.amc.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

import com.alpha67.amc.AmcMod;

public class ClefamolletteLorsDunClickDroitSurUnBlocProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AmcMod.LOGGER.warn("Failed to load dependency world for procedure ClefamolletteLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AmcMod.LOGGER.warn("Failed to load dependency x for procedure ClefamolletteLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AmcMod.LOGGER.warn("Failed to load dependency y for procedure ClefamolletteLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AmcMod.LOGGER.warn("Failed to load dependency z for procedure ClefamolletteLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AmcMod.LOGGER.warn("Failed to load dependency entity for procedure ClefamolletteLorsDunClickDroitSurUnBloc!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(((new Object() {
				public int getEnergyStored(IWorld world, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, new BlockPos(x, y, z))) + "/" + (new Object() {
				public int getMaxEnergyStored(IWorld world, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
					return _retval.get();
				}
			}.getMaxEnergyStored(world, new BlockPos(x, y, z))) + " energy at " + null)), (true));
		}
	}
}
