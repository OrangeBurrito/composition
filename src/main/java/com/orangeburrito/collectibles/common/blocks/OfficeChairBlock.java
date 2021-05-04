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
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import com.orangeburrito.collectibles.common.util.VoxelHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OfficeChairBlock extends WaterloggedHorizontalBlock {
    // Code by MrCrayfish (mrcrayfish.com)

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        final VoxelShape[] FRONT_LEFT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(0.5, 9, 3, 2.5, 15, 14), Direction.NORTH));
        final VoxelShape[] BACKREST = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Stream.of(
                Block.makeCuboidShape(2, 8, 13, 14, 18, 14),
                Block.makeCuboidShape(2, 17.965075632657484, 12.689246397241465, 14, 21.43223236023649, 15.368030423797094),
                Block.makeCuboidShape(2, 21.41686549550631, 15.368030423797094, 14, 24.43223236023649, 17.215789488819667)
        ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get(), Direction.NORTH));
        final VoxelShape[] BASE = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 8, 3, 14, 10, 13), Direction.NORTH));
        final VoxelShape[] FRONT_RIGHT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(13.5, 9, 3, 15.5, 15, 14), Direction.NORTH));
        final VoxelShape[] BACK_RIGHT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2.357229828220177, 0, 4.3327348916085135, 12.857229828220177, 3, 13.457734891608514), Direction.NORTH));
        final VoxelShape[] BACK_LEFT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(6.357229828220177, 3, 7.3327348916085135, 8.857229828220177, 8, 9.457734891608514), Direction.NORTH));

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

    public OfficeChairBlock(Properties properties) {
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
            return SeatEntity.create(world, pos, 0.44, playerEntity);
        }
    }
}
