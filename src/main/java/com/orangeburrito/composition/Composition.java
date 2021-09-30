package com.orangeburrito.composition;

import com.orangeburrito.composition.core.*;
import com.orangeburrito.composition.core.proxy.ClientProxy;
import com.orangeburrito.composition.core.proxy.CommonProxy;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Composition.MOD_ID)
public class Composition {
    public static final String MOD_ID = "composition";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static final CommonProxy PROXY = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);

    public Composition() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::onCommonSetup);
        modEventBus.addListener(this::onClientSetup);
        modEventBus.addGenericListener(PaintingType.class, this::registerPaintings);
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModSounds.SOUNDS.register(modEventBus);
        ModWorldGen.subscribe(modEventBus);
        ModLootModifiers.REGISTER.register(modEventBus);
    }
    private void onCommonSetup(FMLCommonSetupEvent event) {
        PROXY.onSetupCommon();
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        PROXY.onSetupClient();
        ClientProxy.registerBlockColors();
        ClientProxy.registerItemColors();

        RenderTypeLookup.setRenderLayer(ModBlocks.GLASS_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.KORU.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.FERN_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.CACTUS_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.FLAX_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWER_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.KORU_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.BAMBOO_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.BEACH_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.SAPLING_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWSHROOM_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.DEAD_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.MYSTIC_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.WASTELAND_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORIGIN_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.NETHER_TERRARIUM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ENDER_TERRARIUM.get(), RenderType.getCutout());
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        if(event.includeServer()){
            generator.addProvider(new LootModifierGen(event.getGenerator()));
        }
    }

    private void registerPaintings(RegistryEvent.Register<PaintingType> event) {

        final IForgeRegistry<PaintingType> registry = event.getRegistry();

        registry.register(this.createPainting("composition", 16, 16));
    }

    private PaintingType createPainting(String id, int width, int height) {

        final PaintingType type = new PaintingType(width, height);
        type.setRegistryName(MOD_ID, id);
        return type;
    }
}