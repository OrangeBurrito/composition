package com.orangeburrito.collectibles.common.blocks;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.orangeburrito.collectibles.common.util.VoxelHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class GamecubeBlock extends WaterloggedHorizontalBlock {

    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public GamecubeBlock(Properties properties) {
        super(properties); // .with(USE_WAVERFRONT_OBJ_MODEL, true)
        this.setDefaultState(this.stateContainer.getBaseState().with(DIRECTION, Direction.NORTH));
        SHAPES = this.generateShapes(this.getStateContainer().getValidStates());
    }

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        final VoxelShape[] BIG_SHAPE = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(4.25, 2.375, 1.375, 11.75, 5.625, 1.875), Direction.NORTH));
        final VoxelShape[] SMALL_SHAPE = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(3, 0, 1.875, 13, 7.5, 14), Direction.NORTH));

        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for(BlockState state : states) {
            Direction direction = state.get(DIRECTION);
            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(BIG_SHAPE[direction.getHorizontalIndex()]);
            shapes.add(SMALL_SHAPE[direction.getHorizontalIndex()]);
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

    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent("\u00A77Model by\u00A79 Ryan Pocock\u00A77\u00A7n autumnpioneer.artstation.com"));
    }
}