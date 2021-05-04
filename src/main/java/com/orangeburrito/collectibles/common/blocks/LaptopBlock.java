package com.orangeburrito.collectibles.common.blocks;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.orangeburrito.collectibles.common.util.VoxelHelper;
import net.minecraft.block.*;

import net.minecraft.block.Block;
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

public class LaptopBlock extends WaterloggedHorizontalBlock {

    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public LaptopBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(DIRECTION, Direction.SOUTH));
        SHAPES = this.generateShapes(this.getStateContainer().getValidStates());
    }

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        final VoxelShape[] BLOCK1 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 0.5, 5.5, 14, 1.5, 6), Direction.SOUTH));
        final VoxelShape[] BLOCK2 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 2.5, 4.5, 14, 3.5, 5), Direction.SOUTH));
        final VoxelShape[] BLOCK3 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 4.5, 3.5, 14, 5.5, 4), Direction.SOUTH));
        final VoxelShape[] BLOCK4 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 3.5, 4, 14, 4.5, 4.5), Direction.SOUTH));
        final VoxelShape[] BLOCK5 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 5.5, 3, 14, 6.5, 3.5), Direction.SOUTH));
        final VoxelShape[] BLOCK6 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 6.5, 2.5, 14, 7.5, 3), Direction.SOUTH));
        final VoxelShape[] BLOCK7 = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(2, 0, 6, 14, 0.5, 14), Direction.SOUTH));

        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for(BlockState state : states) {
            Direction direction = state.get(DIRECTION);
            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(BLOCK1[direction.getHorizontalIndex()]);
            shapes.add(BLOCK2[direction.getHorizontalIndex()]);
            shapes.add(BLOCK3[direction.getHorizontalIndex()]);
            shapes.add(BLOCK4[direction.getHorizontalIndex()]);
            shapes.add(BLOCK5[direction.getHorizontalIndex()]);
            shapes.add(BLOCK6[direction.getHorizontalIndex()]);
            shapes.add(BLOCK7[direction.getHorizontalIndex()]);
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