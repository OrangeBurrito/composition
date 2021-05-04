package com.orangeburrito.collectibles.common.blocks;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CRTBlock extends WaterloggedHorizontalBlock {

    public final Map<BlockState, VoxelShape> SHAPES = new HashMap<>();

    public CRTBlock(Properties properties) {
        super(properties);
    }

    private VoxelShape getShape(BlockState state) {
        return SHAPES.computeIfAbsent(state, state1 -> {
            final VoxelShape[] BOXES = VoxelHelper.getRotatedShapes(VoxelHelper.rotate(Block.makeCuboidShape(0.1457, 0, -0.0249, 15.875, 16.25, 14.125), Direction.SOUTH));
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
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent("\u00A77Model by\u00A79 Ryan Pocock\u00A77\u00A7n autumnpioneer.artstation.com"));
    }
}