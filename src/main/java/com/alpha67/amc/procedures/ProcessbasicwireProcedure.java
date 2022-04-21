package com.alpha67.amc.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.BlockState;

import java.util.Map;

import com.alpha67.amc.block.BasicwireflateBlock;
import com.alpha67.amc.block.Basicwireflate3Block;
import com.alpha67.amc.block.Basicwireflate2Block;
import com.alpha67.amc.block.Basicwire5Block;
import com.alpha67.amc.block.Basicwire1Block;
import com.alpha67.amc.AmcMod;

public class ProcessbasicwireProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AmcMod.LOGGER.warn("Failed to load dependency world for procedure Processbasicwire!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AmcMod.LOGGER.warn("Failed to load dependency x for procedure Processbasicwire!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AmcMod.LOGGER.warn("Failed to load dependency y for procedure Processbasicwire!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AmcMod.LOGGER.warn("Failed to load dependency z for procedure Processbasicwire!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())
				|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock())) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Basicwire5Block.block) {
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(_property, Direction.WEST), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.WEST.getAxis()), 3);
					}
				} catch (Exception e) {
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Basicwire5Block.block.getDefaultState(), 3);
			}
		}
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock())
				|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock())) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Basicwire5Block.block) {
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(_property, Direction.NORTH), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.NORTH.getAxis()), 3);
					}
				} catch (Exception e) {
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Basicwire5Block.block.getDefaultState(), 3);
			}
		}
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
				|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock())) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Basicwire5Block.block) {
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(_property, Direction.UP), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.UP.getAxis()), 3);
					}
				} catch (Exception e) {
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Basicwire5Block.block.getDefaultState(), 3);
			}
		}
		if ((BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())
				|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock()))
				&& (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock())
						|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
								.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()))) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BasicwireflateBlock.block) {
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(_property, Direction.NORTH), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.NORTH.getAxis()), 3);
					}
				} catch (Exception e) {
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BasicwireflateBlock.block.getDefaultState(), 3);
			}
		}
		if ((BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())
				|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock()))
				&& (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock())
						|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
								.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()))
				&& BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
				&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock())) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Basicwireflate2Block.block) {
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(_property, Direction.NORTH), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.NORTH.getAxis()), 3);
					}
				} catch (Exception e) {
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Basicwireflate2Block.block.getDefaultState(), 3);
			}
		}
		if ((BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())
				|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock()))
				&& (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock())
						|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
								.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()))
				&& BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock())
				&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Basicwireflate3Block.block) {
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(_property, Direction.NORTH), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.NORTH.getAxis()), 3);
					}
				} catch (Exception e) {
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Basicwireflate3Block.block.getDefaultState(), 3);
			}
		}
		if ((BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())
				|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock())
				|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock())
				|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()))
				&& BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
				&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock())) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Basicwireflate2Block.block) {
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(_property, Direction.NORTH), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.NORTH.getAxis()), 3);
					}
				} catch (Exception e) {
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Basicwireflate2Block.block.getDefaultState(), 3);
			}
		}
		if ((BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())
				|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock())
				|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock())
				|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()))
				&& BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock())
				&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Basicwireflate3Block.block) {
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(_property, Direction.NORTH), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.NORTH.getAxis()), 3);
					}
				} catch (Exception e) {
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Basicwireflate3Block.block.getDefaultState(), 3);
			}
		}
		if ((BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
				.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())
				|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock()))
				&& (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock())
						|| BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
								.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()))
				&& BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock())
				&& BlockTags.getCollection().getTagByID(new ResourceLocation("forge:basicwiretag"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Basicwire1Block.block) {
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(_property, Direction.NORTH), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.NORTH.getAxis()), 3);
					}
				} catch (Exception e) {
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Basicwire1Block.block.getDefaultState(), 3);
			}
		}
	}
}
