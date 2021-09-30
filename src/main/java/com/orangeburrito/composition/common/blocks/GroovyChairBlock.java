package com.orangeburrito.composition.common.blocks;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.orangeburrito.composition.common.entity.SeatEntity;
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
import com.orangeburrito.composition.common.util.VoxelHelper;

import java.util.ArrayList;
import java.util.List;

public class GroovyChairBlock extends WaterloggedHorizontalBlock {
    // Code by MrCrayfish (mrcrayfish.com)

        private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
            final VoxelShape[] FRONT_LEFT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 0, 3, 6, 5, 7), Direction.NORTH));
            final VoxelShape[] BACKREST = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(1, 8, 12, 16, 20, 16), Direction.NORTH));
            final VoxelShape[] BASE = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(1, 5, 1, 16, 8, 16), Direction.NORTH));
            final VoxelShape[] FRONT_RIGHT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(11, 0, 3, 15, 5, 7), Direction.NORTH));
            final VoxelShape[] BACK_RIGHT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(11, 0, 12, 15, 5, 16), Direction.NORTH));
            final VoxelShape[] BACK_LEFT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 0, 12, 6, 5, 16), Direction.NORTH));

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

        public final ImmutableMap<BlockState, VoxelShape> SHAPES;

        public GroovyChairBlock(Properties properties) {
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
                return SeatEntity.create(world, pos, 0.32, playerEntity);
            }
        }
}

