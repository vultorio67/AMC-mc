package com.alpha67.amc.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tags.BlockTags;
import net.minecraft.block.BlockState;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;

import com.alpha67.amc.block.Energiewiretier3Block;
import com.alpha67.amc.block.Energiewiretier34Block;
import com.alpha67.amc.block.Energiewiretier33Block;
import com.alpha67.amc.block.Energiewiretier32Block;
import com.alpha67.amc.AmcMod;

public class Energiewiretier3MiseAjourdutickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AmcMod.LOGGER.warn("Failed to load dependency world for procedure Energiewiretier3MiseAjourdutick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AmcMod.LOGGER.warn("Failed to load dependency x for procedure Energiewiretier3MiseAjourdutick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AmcMod.LOGGER.warn("Failed to load dependency y for procedure Energiewiretier3MiseAjourdutick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AmcMod.LOGGER.warn("Failed to load dependency z for procedure Energiewiretier3MiseAjourdutick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double nbblockconnecter = 0;
		double down = 0;
		double north = 0;
		double west = 0;
		double south = 0;
		double east = 0;
		double up = 0;
		nbblockconnecter = 0;
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock())) {
			nbblockconnecter = (nbblockconnecter + 1);
		}
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock())) {
			nbblockconnecter = (nbblockconnecter + 1);
		}
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock())) {
			nbblockconnecter = (nbblockconnecter + 1);
		}
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock())) {
			nbblockconnecter = (nbblockconnecter + 1);
		}
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
			nbblockconnecter = (nbblockconnecter + 1);
		}
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock())) {
			nbblockconnecter = (nbblockconnecter + 1);
		}
		if (nbblockconnecter > 0) {
			if ((BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
					.contains((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock())
					|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
							.contains((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))
					&& nbblockconnecter == 1 && !((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Energiewiretier32Block.block)) {
				world.setBlockState(new BlockPos(x, y, z), Energiewiretier32Block.block.getDefaultState(), 3);
			}
			if ((BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
					.contains((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock())
					|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
							.contains((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock()))
					&& nbblockconnecter == 1 && !((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Energiewiretier3Block.block)) {
				world.setBlockState(new BlockPos(x, y, z), Energiewiretier3Block.block.getDefaultState(), 3);
			}
			if ((BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
					.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())
					|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
							.contains((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))
					&& !((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Energiewiretier34Block.block)) {
				world.setBlockState(new BlockPos(x, y, z), Energiewiretier34Block.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
					.contains((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock())
					&& BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
							.contains((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock())
					&& nbblockconnecter == 2 && !((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Energiewiretier32Block.block)) {
				world.setBlockState(new BlockPos(x, y, z), Energiewiretier32Block.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
					.contains((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock())
					&& BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
							.contains((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock())
					&& nbblockconnecter == 2 && !((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Energiewiretier3Block.block)) {
				world.setBlockState(new BlockPos(x, y, z), Energiewiretier3Block.block.getDefaultState(), 3);
			}
			if (!(BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
					.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())
					|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
							.contains((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))
					&& nbblockconnecter > 2 && nbblockconnecter < 5
					&& !((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Energiewiretier33Block.block)) {
				world.setBlockState(new BlockPos(x, y, z), Energiewiretier33Block.block.getDefaultState(), 3);
			}
			if ((BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
					.contains((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock())
					&& BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
							.contains((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock())
					|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
							.contains((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock())
							&& BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
									.contains((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock())
					|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
							.contains((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock())
							&& BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
									.contains((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock())
					|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
							.contains((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock())
							&& BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
									.contains((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock()))
					&& nbblockconnecter == 2 && !((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Energiewiretier33Block.block)) {
				world.setBlockState(new BlockPos(x, y, z), Energiewiretier33Block.block.getDefaultState(), 3);
			}
			nbblockconnecter = (nbblockconnecter + new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "Nbenvoie"));
			if (new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "dirrectionD") == 1 || new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "dirrectionU") == 1 || new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "dirrectionW") == 1 || new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "dirrectionE") == 1 || new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "dirrectionN") == 1 || new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "dirrectionS") == 1) {
				if (nbblockconnecter == 1) {
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionD") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y - 1, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock())) {
							down = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							down = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y - 1, z), (int) (down / 1)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (down / 1);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y - 1, z));
								int _amount = (int) (down / 1);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y - 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionU", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y - 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y - 1, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionU") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y + 1, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
							up = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							up = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y + 1, z), (int) (up / 1)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (up / 1);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y + 1, z));
								int _amount = (int) (up / 1);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y + 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionD", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y + 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y + 1, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionW") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x - 1, y, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock())) {
							west = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							west = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x - 1, y, z), (int) (west / 1)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (west / 1);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x - 1, y, z));
								int _amount = (int) (west / 1);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x - 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionE", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x - 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x - 1, y, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionE") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x + 1, y, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock())) {
							east = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							east = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x + 1, y, z), (int) (east / 1)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (east / 1);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x + 1, y, z));
								int _amount = (int) (east / 1);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x + 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionW", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x + 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x + 1, y, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionS") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y, z + 1))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock())) {
							south = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							south = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y, z + 1), (int) (south / 1)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (south / 1);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z + 1));
								int _amount = (int) (south / 1);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionN", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z + 1), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionN") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y, z - 1))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock())) {
							north = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							north = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y, z - 1), (int) (north / 1)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (north / 1);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z - 1));
								int _amount = (int) (north / 1);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionS", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z - 1), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
				}
				if (nbblockconnecter == 2) {
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionD") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y - 1, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock())) {
							down = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							down = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y - 1, z), (int) (down / 2)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (down / 2);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y - 1, z));
								int _amount = (int) (down / 2);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y - 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionU", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y - 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y - 1, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionU") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y + 1, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
							up = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							up = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y + 1, z), (int) (up / 2)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (up / 2);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y + 1, z));
								int _amount = (int) (up / 2);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y + 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionD", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y + 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y + 1, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionW") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x - 1, y, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock())) {
							west = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							west = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x - 1, y, z), (int) (west / 2)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (west / 2);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x - 1, y, z));
								int _amount = (int) (west / 2);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x - 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionE", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x - 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x - 1, y, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionE") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x + 1, y, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock())) {
							east = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							east = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x + 1, y, z), (int) (east / 2)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (east / 2);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x + 1, y, z));
								int _amount = (int) (east / 2);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x + 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionW", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x + 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x + 1, y, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionS") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y, z + 1))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock())) {
							south = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							south = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y, z + 1), (int) (south / 2)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (south / 2);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z + 1));
								int _amount = (int) (south / 2);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionN", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z + 1), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionN") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y, z - 1))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock())) {
							north = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							north = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y, z - 1), (int) (north / 2)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (north / 2);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z - 1));
								int _amount = (int) (north / 2);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionS", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z - 1), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
				}
				if (nbblockconnecter == 3) {
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionD") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y - 1, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock())) {
							down = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							down = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y - 1, z), (int) (down / 3)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (down / 3);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y - 1, z));
								int _amount = (int) (down / 3);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y - 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionU", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y - 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y - 1, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionU") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y + 1, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
							up = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							up = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y + 1, z), (int) (up / 3)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (up / 3);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y + 1, z));
								int _amount = (int) (up / 3);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y + 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionD", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y + 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y + 1, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionW") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x - 1, y, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock())) {
							west = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							west = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x - 1, y, z), (int) (west / 3)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (west / 3);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x - 1, y, z));
								int _amount = (int) (west / 3);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x - 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionE", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x - 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x - 1, y, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionE") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x + 1, y, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock())) {
							east = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							east = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x + 1, y, z), (int) (east / 3)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (east / 3);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x + 1, y, z));
								int _amount = (int) (east / 3);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x + 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionW", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x + 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x + 1, y, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionS") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y, z + 1))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock())) {
							south = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							south = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y, z + 1), (int) (south / 3)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (south / 3);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z + 1));
								int _amount = (int) (south / 3);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionN", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z + 1), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionN") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y, z - 1))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock())) {
							north = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							north = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y, z - 1), (int) (north / 3)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (north / 3);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z - 1));
								int _amount = (int) (north / 3);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionS", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z - 1), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
				}
				if (nbblockconnecter == 4) {
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionD") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y - 1, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock())) {
							down = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							down = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y - 1, z), (int) (down / 4)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (down / 4);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y - 1, z));
								int _amount = (int) (down / 4);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y - 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionU", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y - 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y - 1, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionU") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y + 1, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
							up = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							up = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y + 1, z), (int) (up / 4)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (up / 4);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y + 1, z));
								int _amount = (int) (up / 4);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y + 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionD", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y + 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y + 1, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionW") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x - 1, y, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock())) {
							west = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							west = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x - 1, y, z), (int) (west / 4)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (west / 4);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x - 1, y, z));
								int _amount = (int) (west / 4);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x - 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionE", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x - 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x - 1, y, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionE") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x + 1, y, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock())) {
							east = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							east = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x + 1, y, z), (int) (east / 4)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (east / 4);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x + 1, y, z));
								int _amount = (int) (east / 4);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x + 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionW", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x + 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x + 1, y, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionS") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y, z + 1))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock())) {
							south = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							south = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y, z + 1), (int) (south / 4)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (south / 4);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z + 1));
								int _amount = (int) (south / 4);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionN", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z + 1), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionN") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y, z - 1))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock())) {
							north = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							north = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y, z - 1), (int) (north / 4)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (north / 4);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z - 1));
								int _amount = (int) (north / 4);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionS", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z - 1), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
				}
				if (nbblockconnecter == 5) {
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionD") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y - 1, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock())) {
							down = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							down = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y - 1, z), (int) (down / 5)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (down / 5);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y - 1, z));
								int _amount = (int) (down / 5);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y - 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionU", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y - 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y - 1, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionU") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y + 1, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
							up = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							up = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y + 1, z), (int) (up / 5)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (up / 5);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y + 1, z));
								int _amount = (int) (up / 5);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y + 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionD", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y + 1, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y + 1, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionW") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x - 1, y, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock())) {
							west = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							west = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x - 1, y, z), (int) (west / 5)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (west / 5);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x - 1, y, z));
								int _amount = (int) (west / 5);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x - 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionE", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x - 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x - 1, y, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionE") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x + 1, y, z))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock())) {
							east = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							east = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x + 1, y, z), (int) (east / 5)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (east / 5);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x + 1, y, z));
								int _amount = (int) (east / 5);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x + 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionW", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x + 1, y, z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x + 1, y, z), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionS") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y, z + 1))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock())) {
							south = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							south = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y, z + 1), (int) (south / 5)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (south / 5);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z + 1));
								int _amount = (int) (south / 5);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionN", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z + 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z + 1), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
					if (!(new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "dirrectionN") == 1)) {
						if (new Object() {
							public boolean canReceiveEnergy(IWorld world, BlockPos pos) {
								AtomicBoolean _retval = new AtomicBoolean(false);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> _retval.set(capability.canReceive()));
								return _retval.get();
							}
						}.canReceiveEnergy(world, new BlockPos(x, y, z - 1))
								&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:cannotrecevenergie"))
										.contains((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock())) {
							north = (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, null)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos(x, y, z), (int) 5000));
							north = (new Object() {
								public int receiveEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
												.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
									return _retval.get();
								}
							}.receiveEnergySimulate(world, new BlockPos(x, y, z - 1), (int) (north / 5)));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
								int _amount = (int) (north / 5);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, null)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z - 1));
								int _amount = (int) (north / 5);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("dirrectionS", 1);
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos(x, y, z - 1);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("Nbenvoie", (new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos(x, y, z - 1), "Nbenvoie") + 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
						}
					}
				}
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("dirrectionD", 0);
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("dirrectionU", 0);
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("dirrectionW", 0);
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("dirrectionE", 0);
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("dirrectionN", 0);
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("dirrectionS", 0);
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("Nbenvoie", 0);
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public int getMaxEnergyStored(IWorld world, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getMaxEnergyStored()));
				return _retval.get();
			}
		}.getMaxEnergyStored(world, new BlockPos(x, y, z)) == new Object() {
			public int getEnergyStored(IWorld world, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(world, new BlockPos(x, y, z))) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
				int _amount = (int) 1;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
	}
}
