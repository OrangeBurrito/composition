package com.orangeburrito.composition.core;

import com.orangeburrito.composition.Composition;
import com.orangeburrito.composition.common.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Composition.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Composition.MOD_ID);

//    public static final RegistryObject<Block> TABLE = BLOCKS.register("table", () -> new Table(Block.Properties.create(Material.WOOD).hardnessAndResistance(2, 3).harvestLevel(0).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> KORU = BLOCKS.register("koru", () -> new KoruBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0, 0).sound(SoundType.PLANT).harvestLevel(0)));

    public static final RegistryObject<Block> FERN_TERRARIUM = BLOCKS.register("terrarium_fern", () -> new TerrariumBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.8F, 0.8F).sound(SoundType.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static final RegistryObject<Block> MUSHROOM_TERRARIUM = BLOCKS.register("terrarium_mushroom", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> CACTUS_TERRARIUM = BLOCKS.register("terrarium_cactus", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> FLAX_TERRARIUM = BLOCKS.register("terrarium_flax", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> FLOWER_TERRARIUM = BLOCKS.register("terrarium_flower", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> KORU_TERRARIUM = BLOCKS.register("terrarium_koru", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> BAMBOO_TERRARIUM = BLOCKS.register("terrarium_bamboo", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> BEACH_TERRARIUM = BLOCKS.register("terrarium_beach", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> SAPLING_TERRARIUM = BLOCKS.register("terrarium_sapling", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> GLOWSHROOM_TERRARIUM = BLOCKS.register("terrarium_glowshroom", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> DEAD_TERRARIUM = BLOCKS.register("terrarium_dead", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> MYSTIC_TERRARIUM = BLOCKS.register("terrarium_mystic", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> WASTELAND_TERRARIUM = BLOCKS.register("terrarium_wasteland", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> ORIGIN_TERRARIUM = BLOCKS.register("terrarium_origin", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> NETHER_TERRARIUM = BLOCKS.register("terrarium_nether", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> ENDER_TERRARIUM = BLOCKS.register("terrarium_ender", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));

    public static final RegistryObject<Block> TOILET = BLOCKS.register("toilet", () -> new ToiletBlock(Block.Properties.from(Blocks.QUARTZ_BLOCK)));
    public static final RegistryObject<Block> GROOVY_CHAIR = BLOCKS.register("groovy_chair", () -> new GroovyChairBlock(Block.Properties.from(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> WHITE_LAWN_CHAIR = BLOCKS.register("white_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_LAWN_CHAIR = BLOCKS.register("orange_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> MAGENTA_LAWN_CHAIR = BLOCKS.register("magenta_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_LAWN_CHAIR = BLOCKS.register("light_blue_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> YELLOW_LAWN_CHAIR = BLOCKS.register("yellow_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> LIME_LAWN_CHAIR = BLOCKS.register("lime_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> PINK_LAWN_CHAIR = BLOCKS.register("pink_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> GRAY_LAWN_CHAIR = BLOCKS.register("gray_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_LAWN_CHAIR = BLOCKS.register("light_gray_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> CYAN_LAWN_CHAIR = BLOCKS.register("cyan_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> PURPLE_LAWN_CHAIR = BLOCKS.register("purple_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> BLUE_LAWN_CHAIR = BLOCKS.register("blue_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> BROWN_LAWN_CHAIR = BLOCKS.register("brown_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> GREEN_LAWN_CHAIR = BLOCKS.register("green_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> RED_LAWN_CHAIR = BLOCKS.register("red_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> BLACK_LAWN_CHAIR = BLOCKS.register("black_lawn_chair", () -> new LawnChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));

    public static final RegistryObject<Block> MODERN_CHAIR = BLOCKS.register("modern_chair", () -> new ModernChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));

    public static final RegistryObject<Block> WHITE_MODERN_COUCH = BLOCKS.register("white_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> ORANGE_MODERN_COUCH = BLOCKS.register("orange_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> MAGENTA_MODERN_COUCH = BLOCKS.register("magenta_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_MODERN_COUCH = BLOCKS.register("light_blue_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> YELLOW_MODERN_COUCH = BLOCKS.register("yellow_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> LIME_MODERN_COUCH = BLOCKS.register("lime_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> PINK_MODERN_COUCH = BLOCKS.register("pink_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> GRAY_MODERN_COUCH = BLOCKS.register("gray_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_MODERN_COUCH = BLOCKS.register("light_gray_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> CYAN_MODERN_COUCH = BLOCKS.register("cyan_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> PURPLE_MODERN_COUCH = BLOCKS.register("purple_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> BLUE_MODERN_COUCH = BLOCKS.register("blue_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> BROWN_MODERN_COUCH = BLOCKS.register("brown_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> GREEN_MODERN_COUCH = BLOCKS.register("green_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> RED_MODERN_COUCH = BLOCKS.register("red_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> BLACK_MODERN_COUCH = BLOCKS.register("black_modern_couch", () -> new ModernCouchBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));

    public static final RegistryObject<Block> GLASS_DOOR = BLOCKS.register("glass_door", () -> new ModDoorBlock(Block.Properties.from(Blocks.GLASS)));
}
