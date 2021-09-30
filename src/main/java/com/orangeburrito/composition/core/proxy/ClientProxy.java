package com.orangeburrito.composition.core.proxy;

import com.orangeburrito.composition.client.renderer.SeatRenderer;
import com.orangeburrito.composition.core.ModBlocks;
import com.orangeburrito.composition.core.ModEntities;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import java.awt.*;

public class ClientProxy extends CommonProxy {

    @Override
    public void onSetupClient() {
        super.onSetupClient();

        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SEAT, SeatRenderer::new);
    }
        public static void registerBlockColors() {
            BlockColors blockColors = Minecraft.getInstance().getBlockColors();

            blockColors.register((state, world, pos, tint) ->
                            world != null && pos != null ? BiomeColors.getWaterColor(world, pos) : new Color(91, 117, 91).getRGB(),
                    ModBlocks.TOILET.get()
            );

            blockColors.register((state, world, pos, tintIndex) -> {
                if (world != null && pos != null) {
                    return BiomeColors.getGrassColor(world, pos);
                }
                return getDefaultGrassColour();
            }, ModBlocks.KORU.get());

        }

        public static void registerItemColors() {
            BlockColors blockColors = Minecraft.getInstance().getBlockColors();
            ItemColors itemColors = Minecraft.getInstance().getItemColors();

            itemColors.register((stack, tintIndex) -> blockColors.getColor(((BlockItem) stack.getItem()).getBlock().getDefaultState(), null, null, tintIndex),
                    ModBlocks.TOILET.get(),
                    ModBlocks.KORU.get()
            );
        }

    private static int getDefaultGrassColour() {
        return GrassColors.get(0.5d, 1.0d);
    }
}
