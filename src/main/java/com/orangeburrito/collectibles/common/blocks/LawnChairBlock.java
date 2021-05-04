package com.orangeburrito.collectibles.common.blocks;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.orangeburrito.collectibles.common.entity.SeatEntity;
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
import com.orangeburrito.collectibles.common.util.VoxelHelper;

import java.util.ArrayList;
import java.util.List;

public class LawnChairBlock extends WaterloggedHorizontalBlock {
    // Code by MrCrayfish (mrcrayfish.com)

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        final VoxelShape[] FRONT_LEFT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(-0.5, 2, 2, 2.5, 12, 13), Direction.SOUTH));
        final VoxelShape[] BACKREST = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(0, 6, 0, 16, 20.5, 2), Direction.SOUTH));
        final VoxelShape[] BASE = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(1, 6, 1, 15, 7, 15), Direction.SOUTH));
        final VoxelShape[] FRONT_RIGHT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(13.5, 2, 2, 16.5, 12, 13), Direction.SOUTH));
        final VoxelShape[] BACK_RIGHT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(0, -0.60896, -0.061469999999999914, 2, 6.89104, 1.93853), Direction.SOUTH));
        final VoxelShape[] BACK_LEFT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(14, -0.60896, -0.061469999999999914, 16, 6.89104, 1.93853), Direction.SOUTH));

        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for (BlockState state : states) {
            Direction direction = state.get(DIRECTION);
            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(FRONT_LEFT_LEG[direction.getHorizontalIndex()]);
            shapes.add(BACKREST[direction.getHorizontalIndex()]);
            shapes.add(BASE[direction.getHorizontalIndex()]);
            shapes.add(FRONT_RIGHT_LEG[direction.getHorizontalIndex()]);
            shapes.add(BACK_RIGHT_LEG[direction.getHorizontalIndex()]);
            shapes.add(BACK_LEFT_LEG[direction.getHorizontalIndex()]);
            builder.put(state, VoxelHelper.combineAll(shapes));
        }
        return builder.build();
    }
    //actual block starts here

    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public LawnChairBlock(Properties properties) {
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

    @SuppressWarnings("deprecation")
    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity playerEntity, Hand hand, BlockRayTraceResult result) {
        if (playerEntity.isCrouching()) {
            return ActionResultType.SUCCESS;
        }else {
            return SeatEntity.create(world, pos, 0.24, playerEntity);
        }
    }
}
