package com.orangeburrito.collectibles.core;

import com.orangeburrito.collectibles.Collectibles;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
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

@Mod.EventBusSubscriber(modid = Collectibles.MOD_ID)
public class ModWorldGen {

    @Nullable
    public static BlockClusterFeatureConfig KORU_FEATURE_CONFIG = null;
    @Nullable
    public static ConfiguredFeature<?, ?> KORU_FEATURE = null;

    public static void subscribe(IEventBus bus) {
        bus.addListener(ModWorldGen::setup);
    }

    public static void setup(final FMLCommonSetupEvent event) {
        KORU_FEATURE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.KORU.get().getDefaultState()), new SimpleBlockPlacer())).tries(18).build();
        KORU_FEATURE = Feature.FLOWER.withConfiguration(KORU_FEATURE_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT);
        event.enqueueWork(() -> {
            Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(Collectibles.MOD_ID, "koru"), KORU_FEATURE);
        });
    }

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        if (event.getCategory() == Biome.Category.SWAMP) {
            event.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, KORU_FEATURE);
        }
    }
}
//    @SubscribeEvent(priority = EventPriority.HIGH)
//    public static void modifyBiomes(BiomeLoadingEvent event) {
//        if (event.getName() != null) {
//            RegistryKey<Biome> biomeRegistryKey = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
////            FeatureHelper helper = new FeatureHelper(event);
//
//            if (BiomeDictionary.hasType(biomeRegistryKey, BiomeDictionary.Type.OVERWORLD)) {
//                if (event.getCategory() == Biome.Category.SWAMP) {
////                    biome(ModBiomeFeatures.KORU_PATCH);
//                    event.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModBiomeFeatures.KORU_PATCH);
//                }
//            }
//        }
//    }
//    private ModGeneration() {}
//
//    public static void registerPlacements(RegistryEvent.Register<Placement<?>> event) {}
//
//    public static void addFeaturesToBiomes(BiomeLoadingEvent biome) {
//
//        if (biome.getCategory() == Biome.Category.SWAMP) {
//            biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModBiomeFeatures.KORU_PATCH);
//        }
//    }
