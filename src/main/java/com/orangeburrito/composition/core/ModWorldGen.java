package com.orangeburrito.composition.core;

import com.orangeburrito.composition.Composition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.DoublePlantBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(modid = Composition.MOD_ID)
public class ModWorldGen {

    @Nullable
    public static BlockClusterFeatureConfig KORU_FEATURE_CONFIG = null;

    @Nullable
    public static ConfiguredFeature<?, ?> KORU_FEATURE = null;

    @Nullable
    public static BlockClusterFeatureConfig SEA_OATS_FEATURE_CONFIG = null;

    @Nullable
    public static ConfiguredFeature<?, ?> SEA_OATS_FEATURE = null;

    public static void subscribe(IEventBus bus) {
        bus.addListener(ModWorldGen::setup);
    }

    public static void setup(final FMLCommonSetupEvent event) {
        KORU_FEATURE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.KORU.get().getDefaultState()), new SimpleBlockPlacer())).tries(25).build();
        KORU_FEATURE = Feature.FLOWER.withConfiguration(KORU_FEATURE_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT);

        SEA_OATS_FEATURE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.SEA_OATS.get().getDefaultState()), new DoublePlantBlockPlacer())).tries(20).build();
        SEA_OATS_FEATURE = Feature.FLOWER.withConfiguration(SEA_OATS_FEATURE_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT);

        event.enqueueWork(() -> {
            Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(Composition.MOD_ID, "koru"), KORU_FEATURE);
            Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(Composition.MOD_ID, "sea_oats"), SEA_OATS_FEATURE);
        });
    }

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        if (event.getCategory() == Biome.Category.SWAMP) {
            event.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, KORU_FEATURE);
        }
        if (event.getCategory() == Biome.Category.BEACH) {
            event.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, SEA_OATS_FEATURE);
        }
    }
}
