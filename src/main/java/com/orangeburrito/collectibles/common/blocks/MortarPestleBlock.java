package com.orangeburrito.collectibles.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class MortarPestleBlock extends WaterloggedHorizontalBlock {

    private static final VoxelShape SHAPE = Block.makeCuboidShape(3.5, 0, 3.5, 12.5, 8.53700546226404, 12.5);

    public MortarPestleBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader reader, BlockPos pos) {
        return SHAPE;
    }
}