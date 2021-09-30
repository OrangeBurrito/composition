package com.orangeburrito.composition.common.blocks;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.orangeburrito.composition.common.entity.SeatEntity;
import com.orangeburrito.composition.common.util.VoxelHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ModernCouchBlock extends WaterloggedHorizontalBlock {
    public static final EnumProperty<SofaBlock.Type> TYPE = EnumProperty.create("type", SofaBlock.Type.class);

    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public ModernCouchBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.getStateContainer().getBaseState().with(DIRECTION, Direction.NORTH).with(TYPE, SofaBlock.Type.SINGLE));
        SHAPES = this.generateShapes(this.getStateContainer().getValidStates());
    }

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        final VoxelShape[] SEAT = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(0, 3, 1, 16, 9, 15), Direction.NORTH));
        final VoxelShape[] BACKREST = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(0, 9, 11, 16, 19, 15), Direction.NORTH));
        final VoxelShape[] LEFT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(14, 0, 1, 16, 13, 15), Direction.NORTH));
        final VoxelShape[] RIGHT_LEG = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(0, 0, 1, 2, 13, 15), Direction.NORTH));
        final VoxelShape[] LEFT_SUPPORT = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(14, 0, 1, 16, 13, 15), Direction.NORTH));
        final VoxelShape[] RIGHT_SUPPORT = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(0, 3, 1, 14, 9, 14), Direction.NORTH));
//        final VoxelShape[] FRONT_SUPPORT = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(1, 2.5, -2.5, 15, 8, 13), Direction.NORTH));
//        final VoxelShape[] BACK_SUPPORT = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Stream.of(
//                Block.makeCuboidShape(0.9900000000000002, 13.385222610601986, 13.900859472198533, 14.99, 17.7246146238798, 17.134437835988038),
//                Block.makeCuboidShape(0.9900000000000002, 9.385222610601986, 12.275859472198533, 14.99, 13.724614623879798, 15.675859472198534),
//                Block.makeCuboidShape(0.9900000000000002, 7.885222610601986, 10.275859472198533, 14.99, 9.885222610601986, 13.675859472198534)
//        ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get(), Direction.NORTH));

        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for(BlockState state : states) {
            Direction direction = state.get(DIRECTION);
            SofaBlock.Type type = state.get(TYPE);

            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(SEAT[direction.getHorizontalIndex()]);
            shapes.add(BACKREST[direction.getHorizontalIndex()]);
//            shapes.add(FRONT_SUPPORT[direction.getHorizontalIndex()]);
//            shapes.add(BACK_SUPPORT[direction.getHorizontalIndex()]);

            switch(type) {
                case SINGLE:
                    shapes.add(LEFT_LEG[direction.getHorizontalIndex()]);
                    shapes.add(RIGHT_LEG[direction.getHorizontalIndex()]);
                    shapes.add(LEFT_SUPPORT[direction.getHorizontalIndex()]);
                    shapes.add(RIGHT_SUPPORT[direction.getHorizontalIndex()]);
                    break;
                case LEFT:
                    shapes.add(LEFT_LEG[direction.getHorizontalIndex()]);
                    shapes.add(LEFT_SUPPORT[direction.getHorizontalIndex()]);
                    break;
                case RIGHT:
                    shapes.add(RIGHT_LEG[direction.getHorizontalIndex()]);
                    shapes.add(RIGHT_SUPPORT[direction.getHorizontalIndex()]);
                    break;
            }

            builder.put(state, VoxelHelper.combineAll(shapes));
        }
        return builder.build();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state);
    }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader reader, BlockPos pos)
    {
        return SHAPES.get(state);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity playerEntity, Hand hand, BlockRayTraceResult result) {
        if (playerEntity.isCrouching()) {
            return ActionResultType.SUCCESS;
        }else {
            return SeatEntity.create(world, pos, 0.38, playerEntity);
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockState state = super.getStateForPlacement(context);
        return this.getBenchState(state, context.getWorld(), context.getPos(), state.get(DIRECTION));
    }

    @Override
    public BlockState updatePostPlacement(BlockState state, Direction direction, BlockState newState, IWorld world, BlockPos pos, BlockPos newPos) {
        return this.getBenchState(state, world, pos, state.get(DIRECTION));
    }

    private BlockState getBenchState(BlockState state, IWorld world, BlockPos pos, Direction dir) {
        boolean left = isBench(world, pos, dir.rotateYCCW(), dir);
        boolean right = isBench(world, pos, dir.rotateY(), dir);
        if(left && right)
        {
            return state.with(TYPE, SofaBlock.Type.MIDDLE);
        }
        else if(left)
        {
            return state.with(TYPE, SofaBlock.Type.RIGHT);
        }
        else if(right)
        {
            return state.with(TYPE, SofaBlock.Type.LEFT);
        }
        return state.with(TYPE, SofaBlock.Type.SINGLE);
    }

    private boolean isBench(IWorld world, BlockPos source, Direction direction, Direction targetDirection) {
        BlockState state = world.getBlockState(source.offset(direction));
        if(state.getBlock() == this) {
            Direction sofaDirection = state.get(DIRECTION);
            return sofaDirection.equals(targetDirection);
        }
        return false;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(TYPE);
    }

    public enum Type implements IStringSerializable {
        SINGLE("single"),
        LEFT("left"),
        RIGHT("right"),
        MIDDLE("middle");

        private final String id;

        Type(String id)
        {
            this.id = id;
        }

        @Override
        public String getString() {
            return null;
        }
    }
}
