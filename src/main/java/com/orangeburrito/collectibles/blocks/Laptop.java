package com.orangeburrito.collectibles.blocks;

import net.minecraft.block.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class Laptop extends Block {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(2, 0.5, 10, 14, 1.5, 10.5),
            Block.makeCuboidShape(2, 1.5, 10.5, 14, 2.5, 11),
            Block.makeCuboidShape(2, 2.5, 11, 14, 3.5, 11.5),
            Block.makeCuboidShape(2, 4.5, 12, 14, 5.5, 12.5),
            Block.makeCuboidShape(2, 3.5, 11.5, 14, 4.5, 12),
            Block.makeCuboidShape(2, 5.5, 12.5, 14, 6.5, 13),
            Block.makeCuboidShape(2, 6.5, 13, 14, 7.5, 13.5),
            Block.makeCuboidShape(2, 0, 2, 14, 0.5, 10)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(2, 0.5, 5.5, 14, 1.5, 6),
            Block.makeCuboidShape(2, 1.5, 5, 14, 2.5, 5.5),
            Block.makeCuboidShape(2, 2.5, 4.5, 14, 3.5, 5),
            Block.makeCuboidShape(2, 4.5, 3.5, 14, 5.5, 4),
            Block.makeCuboidShape(2, 3.5, 4, 14, 4.5, 4.5),
            Block.makeCuboidShape(2, 5.5, 3, 14, 6.5, 3.5),
            Block.makeCuboidShape(2, 6.5, 2.5, 14, 7.5, 3),
            Block.makeCuboidShape(2, 0, 6, 14, 0.5, 14)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(5.5, 0.5, 2, 6, 1.5, 14),
            Block.makeCuboidShape(5, 1.5, 2, 5.5, 2.5, 14),
            Block.makeCuboidShape(4.5, 2.5, 2, 5, 3.5, 14),
            Block.makeCuboidShape(3.5, 4.5, 2, 4, 5.5, 14),
            Block.makeCuboidShape(4, 3.5, 2, 4.5, 4.5, 14),
            Block.makeCuboidShape(3, 5.5, 2, 3.5, 6.5, 14),
            Block.makeCuboidShape(2.5, 6.5, 2, 3, 7.5, 14),
            Block.makeCuboidShape(6, 0, 2, 14, 0.5, 14)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(10, 0.5, 2, 10.5, 1.5, 14),
            Block.makeCuboidShape(10.5, 1.5, 2, 11, 2.5, 14),
            Block.makeCuboidShape(11, 2.5, 2, 11.5, 3.5, 14),
            Block.makeCuboidShape(12, 4.5, 2, 12.5, 5.5, 14),
            Block.makeCuboidShape(11.5, 3.5, 2, 12, 4.5, 14),
            Block.makeCuboidShape(12.5, 5.5, 2, 13, 6.5, 14),
            Block.makeCuboidShape(13, 6.5, 2, 13.5, 7.5, 14),
            Block.makeCuboidShape(2, 0, 2, 10, 0.5, 14)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public Laptop(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch(state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override // deprecated code
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override // deprecated code
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
