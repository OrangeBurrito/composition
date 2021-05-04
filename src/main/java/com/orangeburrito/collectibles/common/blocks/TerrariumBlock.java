package com.orangeburrito.collectibles.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class TerrariumBlock extends WaterloggedHorizontalBlock {
    private static final VoxelShape SHAPE = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(4, 0, 4, 13, 9, 13), Block.makeCuboidShape(5, 9, 5, 12, 13, 12), IBooleanFunction.OR);
//    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
//    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public TerrariumBlock(Properties properties) {
        super(properties);
//        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader reader, BlockPos pos) {
        return SHAPE;
    }

//    @Override
//    public IFluidState getFluidState(BlockState state) {
//        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
//    }

}
