package com.orangeburrito.composition.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class TerrariumBlock extends WaterloggedHorizontalBlock {
    private static final VoxelShape SHAPE = VoxelShapes.combineAndSimplify(Block.makeCuboidShape(4.5, 13, 4.5, 11.5, 15, 11.5), Block.makeCuboidShape(3, 0, 3, 13, 13, 13), IBooleanFunction.OR);

    public TerrariumBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) { return SHAPE; }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader reader, BlockPos pos) {
        return SHAPE;
    }

}
