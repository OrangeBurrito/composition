package com.orangeburrito.collectibles.common.blocks;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.orangeburrito.collectibles.common.util.VoxelHelper;
import net.minecraft.block.*;

import net.minecraft.block.Block;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.ArrayList;
import java.util.List;

public class ComputerBlock extends WaterloggedHorizontalBlock {

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        final VoxelShape[] SHAPE_1 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 0, 1, 14, 4.8, 12), Direction.SOUTH));
        final VoxelShape[] SHAPE_2 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 4.775, 2, 14, 16, 12), Direction.SOUTH));
        final VoxelShape[] SHAPE_3 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(1, 1.7763568394002505e-15, 12.200000000000003, 15, 1, 15), Direction.SOUTH));

        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for (BlockState state : states) {
            Direction direction = state.get(DIRECTION);
            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(SHAPE_1[direction.getHorizontalIndex()]);
            shapes.add(SHAPE_2[direction.getHorizontalIndex()]);
            shapes.add(SHAPE_3[direction.getHorizontalIndex()]);
            builder.put(state, VoxelHelper.combineAll(shapes));
        }
        return builder.build();
    }
//        public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
//
//    private static final VoxelShape SHAPE_N = Stream.of(
//            Block.makeCuboidShape(2, 0, 1, 14, 4.8, 12),
//            Block.makeCuboidShape(2, 4.775, 2, 14, 16, 12),
//            Block.makeCuboidShape(1, 1.7763568394002505e-15, 12.200000000000003, 15, 1, 15)
//    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
//
//    private static final VoxelShape SHAPE_S = Stream.of(
//            Block.makeCuboidShape(2, 0, 4, 14, 4.8, 15),
//            Block.makeCuboidShape(2, 4.775, 4, 14, 16, 14),
//            Block.makeCuboidShape(1, 0, 1, 15, 1, 3.8)
//    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
//
//    private static final VoxelShape SHAPE_E = Stream.of(
//            Block.makeCuboidShape(4, 0, 2, 15, 4.8, 14),
//            Block.makeCuboidShape(4, 4.775, 2, 14, 16, 14),
//            Block.makeCuboidShape(1, 1.7763568394002505e-15, 1, 3.799999999999997, 1, 15)
//    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
//
//    private static final VoxelShape SHAPE_W = Stream.of(
//            Block.makeCuboidShape(1, 0, 2, 12, 4.8, 14),
//            Block.makeCuboidShape(2, 4.775, 2, 12, 16, 14),
//            Block.makeCuboidShape(12.2, 1.7763568394002505e-15, 1, 15, 1, 15)
//    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public ComputerBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.getStateContainer().getBaseState().with(DIRECTION, Direction.NORTH));
        SHAPES = this.generateShapes(this.getStateContainer().getValidStates());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state);
    }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader reader, BlockPos pos) {
        return SHAPES.get(state);
    }

}

