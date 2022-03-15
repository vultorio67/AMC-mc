///*
// * This file ("BlockWallAA.java") is part of the Actually Additions mod for Minecraft.
// * It is created and owned by Ellpeck and distributed
// * under the Actually Additions License to be found at
// * http://ellpeck.de/actaddlicense
// * View the source code at https://github.com/Ellpeck/ActuallyAdditions
// *
// * © 2015-2017 Ellpeck
// */
//
//package de.ellpeck.actuallyadditions.mod.blocks;
//
//import de.ellpeck.actuallyadditions.mod.blocks.base.BlockBase;
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockFenceGate;
//import net.minecraft.block.BlockWall;
//import net.minecraft.block.material.Material;
//import net.minecraft.block.state.BlockStateContainer;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.init.Blocks;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.Direction;
//import net.minecraft.util.NonNullList;
//import net.minecraft.util.math.AxisAlignedBB;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.IBlockAccess;
//import net.minecraftforge.api.distmarker.Dist;
//
//
//public class BlockWallAA extends BlockBase {
//
//    protected static final AxisAlignedBB[] AABB_BY_INDEX = new AxisAlignedBB[]{new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D), new AxisAlignedBB(0.0D, 0.0D, 0.25D, 0.75D, 1.0D, 1.0D), new AxisAlignedBB(0.25D, 0.0D, 0.0D, 0.75D, 1.0D, 0.75D), new AxisAlignedBB(0.3125D, 0.0D, 0.0D, 0.6875D, 0.875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.75D, 1.0D, 0.75D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.75D, 1.0D, 1.0D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 1.0D, 1.0D, 0.75D), new AxisAlignedBB(0.25D, 0.0D, 0.25D, 1.0D, 1.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.3125D, 1.0D, 0.875D, 0.6875D), new AxisAlignedBB(0.0D, 0.0D, 0.25D, 1.0D, 1.0D, 1.0D), new AxisAlignedBB(0.25D, 0.0D, 0.0D, 1.0D, 1.0D, 0.75D), new AxisAlignedBB(0.25D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.75D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};
//    protected static final AxisAlignedBB[] CLIP_AABB_BY_INDEX = new AxisAlignedBB[]{AABB_BY_INDEX[0].setMaxY(1.5D), AABB_BY_INDEX[1].setMaxY(1.5D), AABB_BY_INDEX[2].setMaxY(1.5D), AABB_BY_INDEX[3].setMaxY(1.5D), AABB_BY_INDEX[4].setMaxY(1.5D), AABB_BY_INDEX[5].setMaxY(1.5D), AABB_BY_INDEX[6].setMaxY(1.5D), AABB_BY_INDEX[7].setMaxY(1.5D), AABB_BY_INDEX[8].setMaxY(1.5D), AABB_BY_INDEX[9].setMaxY(1.5D), AABB_BY_INDEX[10].setMaxY(1.5D), AABB_BY_INDEX[11].setMaxY(1.5D), AABB_BY_INDEX[12].setMaxY(1.5D), AABB_BY_INDEX[13].setMaxY(1.5D), AABB_BY_INDEX[14].setMaxY(1.5D), AABB_BY_INDEX[15].setMaxY(1.5D)};
//
//    @SuppressWarnings("deprecation")
//    public BlockWallAA(Block blocc) {
//        super(blocc.getDefaultState().getMaterial(), name);
//        this.setHardness(1.5F);
//        this.setResistance(10F);
//        this.setSoundType(blocc.getSoundType());
//        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockWall.UP, false).withProperty(BlockWall.NORTH, false).withProperty(BlockWall.EAST, false).withProperty(BlockWall.SOUTH, false).withProperty(BlockWall.WEST, false));
//    }
//
//    private static int yesThisIsCopyPastedFromBlockWallAndIHaveNoIdeaWhatThisMethodDoes(BlockState state) {
//        int i = 0;
//
//        if (state.getValue(BlockWall.NORTH)) {
//            i |= 1 << Direction.NORTH.getHorizontalIndex();
//        }
//
//        if (state.getValue(BlockWall.EAST)) {
//            i |= 1 << Direction.EAST.getHorizontalIndex();
//        }
//
//        if (state.getValue(BlockWall.SOUTH)) {
//            i |= 1 << Direction.SOUTH.getHorizontalIndex();
//        }
//
//        if (state.getValue(BlockWall.WEST)) {
//            i |= 1 << Direction.WEST.getHorizontalIndex();
//        }
//
//        return i;
//    }
//
//    @Override
//    public BlockState getActualState(BlockState state, IBlockAccess worldIn, BlockPos pos) {
//        boolean flag = this.canConnectTo(worldIn, pos.north());
//        boolean flag1 = this.canConnectTo(worldIn, pos.east());
//        boolean flag2 = this.canConnectTo(worldIn, pos.south());
//        boolean flag3 = this.canConnectTo(worldIn, pos.west());
//        boolean flag4 = flag && !flag1 && flag2 && !flag3 || !flag && flag1 && !flag2 && flag3;
//        return state.withProperty(BlockWall.UP, !flag4 || !worldIn.isAirBlock(pos.up())).withProperty(BlockWall.NORTH, flag).withProperty(BlockWall.EAST, flag1).withProperty(BlockWall.SOUTH, flag2).withProperty(BlockWall.WEST, flag3);
//    }
//
//    @Override
//    public boolean isFullCube(BlockState state) {
//        return false;
//    }
//
//    @Override
//    public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
//        return false;
//    }
//
//    @Override
//    @OnlyIn(Dist.CLIENT)
//    @Deprecated
//    public boolean shouldSideBeRendered(BlockState blockState, IBlockAccess blockAccess, BlockPos pos, Direction side) {
//        return side != Direction.DOWN || super.shouldSideBeRendered(blockState, blockAccess, pos, side);
//    }
//
//    @Override
//    public AxisAlignedBB getBoundingBox(BlockState state, IBlockAccess source, BlockPos pos) {
//        state = this.getActualState(state, source, pos);
//        return AABB_BY_INDEX[yesThisIsCopyPastedFromBlockWallAndIHaveNoIdeaWhatThisMethodDoes(state)];
//    }
//
//    @Override
//    public AxisAlignedBB getCollisionBoundingBox(BlockState blockState, IBlockAccess worldIn, BlockPos pos) {
//        blockState = this.getActualState(blockState, worldIn, pos);
//        return CLIP_AABB_BY_INDEX[yesThisIsCopyPastedFromBlockWallAndIHaveNoIdeaWhatThisMethodDoes(blockState)];
//    }
//
//    @Override
//    public boolean isOpaqueCube(BlockState state) {
//        return false;
//    }
//
//    @Override
//    @OnlyIn(Dist.CLIENT)
//    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list) {
//        list.add(new ItemStack(this, 1, 0));
//    }
//
//    public boolean canConnectTo(IBlockAccess worldIn, BlockPos pos) {
//        BlockState state = worldIn.getBlockState(pos);
//        Block block = state.getBlock();
//        return block != Blocks.BARRIER && (!(block != this && !(block instanceof BlockFenceGate)) || state.getMaterial().isOpaque() && state.isFullCube() && state.getMaterial() != Material.GOURD);
//    }
//
//    @Override
//    public BlockState getStateFromMeta(int meta) {
//        return this.getDefaultState();
//    }
//
//    @Override
//    public int getMetaFromState(BlockState state) {
//        return 0;
//    }
//
//    @Override
//    protected BlockStateContainer createBlockState() {
//        return new BlockStateContainer(this, BlockWall.UP, BlockWall.NORTH, BlockWall.EAST, BlockWall.WEST, BlockWall.SOUTH);
//    }
//}
