package com.orangeburrito.collectibles.common.blocks;

import com.orangeburrito.collectibles.common.util.VoxelHelper;
import net.minecraft.block.*;

import net.minecraft.block.Block;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.HashMap;
import java.util.Map;

public class ModernTVBlock extends WaterloggedHorizontalBlock {

    public final Map<BlockState, VoxelShape> SHAPES = new HashMap<>();

    public ModernTVBlock(Properties properties) {
        super(properties);
    }

    private VoxelShape getShape(BlockState state) {
        return SHAPES.computeIfAbsent(state, state1 -> {
            final VoxelShape[] BOXES = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(-3, 0, 7, 19, 14, 8.5), Direction.NORTH));
            return BOXES[state.get(DIRECTION).getHorizontalIndex()];
        });
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        return this.getShape(state);
    }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader reader, BlockPos pos) {
        return this.getShape(state);
    }
}
