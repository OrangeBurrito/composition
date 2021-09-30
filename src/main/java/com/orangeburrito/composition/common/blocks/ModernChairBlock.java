package com.orangeburrito.composition.common.blocks;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.orangeburrito.composition.common.blocks.FurnitureBlock;
import com.orangeburrito.composition.common.entity.SeatEntity;
import com.orangeburrito.composition.common.util.VoxelHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class ModernChairBlock extends WaterloggedHorizontalBlock {

    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public ModernChairBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.getStateContainer().getBaseState().with(DIRECTION, Direction.SOUTH));
        SHAPES = this.generateShapes(this.getStateContainer().getValidStates());
    }

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        final VoxelShape[] BLOCK1 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 6.5, 3, 14, 9.5, 14), Direction.SOUTH));
        final VoxelShape[] BLOCK2 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate( Block.makeCuboidShape(2, 9.5, 2.975000000000003, 13.8, 19.5, 4.475000000000003), Direction.SOUTH));
        final VoxelShape[] BLOCK3 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(12.5, 0, 12.5, 14, 6.5, 14), Direction.SOUTH));
        final VoxelShape[] BLOCK4 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 0, 12.5, 3.5, 6.5, 14), Direction.SOUTH));
        final VoxelShape[] BLOCK5 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 0, 2, 14, 1.5, 12.5), Direction.SOUTH));

        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for(BlockState state : states) {
            Direction direction = state.get(DIRECTION);
            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(BLOCK1[direction.getHorizontalIndex()]);
            shapes.add(BLOCK2[direction.getHorizontalIndex()]);
            shapes.add(BLOCK3[direction.getHorizontalIndex()]);
            shapes.add(BLOCK4[direction.getHorizontalIndex()]);
            shapes.add(BLOCK5[direction.getHorizontalIndex()]);
            builder.put(state, VoxelHelper.combineAll(shapes));
        }
        return builder.build();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state);
    }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader reader, BlockPos pos) {
        return SHAPES.get(state);
    }

    // Code by MrCrayfish (mrcrayfish.com)
    @SuppressWarnings("deprecation")
    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity playerEntity, Hand hand, BlockRayTraceResult result) {
        if (playerEntity.isCrouching()) {
            return ActionResultType.SUCCESS;
        } else {
            return SeatEntity.create(world, pos, 0.35, playerEntity);
        }
    }
}
