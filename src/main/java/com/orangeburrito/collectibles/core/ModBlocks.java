package com.orangeburrito.collectibles.core;

import com.orangeburrito.collectibles.Collectibles;
import com.orangeburrito.collectibles.common.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Collectibles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Collectibles.MOD_ID);

//    public static final RegistryObject<Block> TABLE = BLOCKS.register("table", () -> new Table(Block.Properties.create(Material.WOOD).hardnessAndResistance(2, 3).harvestLevel(0).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> KORU = BLOCKS.register("koru", () -> new KoruBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0, 0).sound(SoundType.PLANT).harvestLevel(0)));

    public static final RegistryObject<Block> FERN_TERRARIUM = BLOCKS.register("fern_terrarium", () -> new TerrariumBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.8F, 0.8F).sound(SoundType.GLASS).harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static final RegistryObject<Block> MUSHROOM_TERRARIUM = BLOCKS.register("mushroom_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> CACTUS_TERRARIUM = BLOCKS.register("cactus_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> FLAX_TERRARIUM = BLOCKS.register("flax_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> FLOWER_TERRARIUM = BLOCKS.register("flower_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> KORU_TERRARIUM = BLOCKS.register("koru_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> BAMBOO_TERRARIUM = BLOCKS.register("bamboo_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> BEACH_TERRARIUM = BLOCKS.register("beach_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> SAPLING_TERRARIUM = BLOCKS.register("sapling_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> GLOWSHROOM_TERRARIUM = BLOCKS.register("glowshroom_terrarium", () -> new TerrariumBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.8F, 0.8F).harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static final RegistryObject<Block> DEAD_TERRARIUM = BLOCKS.register("dead_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> MYSTIC_TERRARIUM = BLOCKS.register("mystic_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> WASTELAND_TERRARIUM = BLOCKS.register("wasteland_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> ORIGIN_TERRARIUM = BLOCKS.register("origin_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> NETHER_TERRARIUM = BLOCKS.register("nether_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));
    public static final RegistryObject<Block> ENDER_TERRARIUM = BLOCKS.register("ender_terrarium", () -> new TerrariumBlock(Block.Properties.from(FERN_TERRARIUM.get())));

    public static final RegistryObject<Block> OLD_STONECUTTER = BLOCKS.register("old_stonecutter", () -> new OldStonecutterBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F, 3.5F).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GAMECUBE = BLOCKS.register("gamecube", () -> new GamecubeBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(4.5F, 4.5F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
    public static final RegistryObject<Block> CRT = BLOCKS.register("crt", () -> new CRTBlock(Block.Properties.from(GAMECUBE.get())));
    public static final RegistryObject<Block> MODERN_TV = BLOCKS.register("modern_tv", () -> new ModernTVBlock(Block.Properties.from(GAMECUBE.get())));
    public static final RegistryObject<Block> LAPTOP = BLOCKS.register("laptop", () -> new LaptopBlock(Block.Properties.from(GAMECUBE.get())));
    public static final RegistryObject<Block> COMPUTER = BLOCKS.register("computer", () -> new ComputerBlock(Block.Properties.from(GAMECUBE.get())));
    public static final RegistryObject<Block> PLAYSTATION = BLOCKS.register("playstation", () -> new PlaystationBlock(Block.Properties.from(GAMECUBE.get())));
    public static final RegistryObject<Block> BLACK_RETRO_SPEAKER = BLOCKS.register("black_retro_speaker", () -> new MortarPestleBlock(Block.Properties.from(GAMECUBE.get())));
    public static final RegistryObject<Block> WHITE_RETRO_SPEAKER = BLOCKS.register("white_retro_speaker", () -> new MortarPestleBlock(Block.Properties.from(GAMECUBE.get())));
    public static final RegistryObject<Block> JAM_BOTTLES = BLOCKS.register("jam_bottles", () -> new MortarPestleBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> ALLIUM_BOTTLE = BLOCKS.register("allium_bottle", () -> new MortarPestleBlock(Block.Properties.from(JAM_BOTTLES.get())));
    public static final RegistryObject<Block> EIFFEL_FIGURINE = BLOCKS.register("eiffel_figurine", () -> new EiffelFigurineBlock(Block.Properties.from(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> MORTAR_AND_PESTLE = BLOCKS.register("mortar_and_pestle", () -> new MortarPestleBlock(Block.Properties.from(Blocks.COBBLESTONE)));
//    public static final RegistryObject<Block> TOILET_PAPER = BLOCKS.register("toilet_paper", () -> new MortarPestleBlock(Block.Properties.from(Blocks.WHITE_WOOL)));

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

    public static final RegistryObject<Block> WHITE_BEACH_CHAIR = BLOCKS.register("white_beach_chair", () -> new BeachChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_BEACH_CHAIR = BLOCKS.register("light_blue_beach_chair", () -> new BeachChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> YELLOW_BEACH_CHAIR = BLOCKS.register("yellow_beach_chair", () -> new BeachChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> CAMOUFLAGE_BEACH_CHAIR = BLOCKS.register("camouflage_beach_chair", () -> new BeachChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> BLUE_BEACH_CHAIR = BLOCKS.register("blue_beach_chair", () -> new BeachChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> RED_BEACH_CHAIR = BLOCKS.register("red_beach_chair", () -> new BeachChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> VINTAGE_BEACH_CHAIR = BLOCKS.register("vintage_beach_chair", () -> new BeachChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));

    public static final RegistryObject<Block> MODERN_CHAIR = BLOCKS.register("modern_chair", () -> new ModernChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));

    public static final RegistryObject<Block> WHITE_MIDCENTURY_SOFA = BLOCKS.register("white_midcentury_sofa", () -> new SofaBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> ORANGE_MIDCENTURY_SOFA = BLOCKS.register("orange_midcentury_sofa", () -> new SofaBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> GRAY_MIDCENTURY_SOFA = BLOCKS.register("gray_midcentury_sofa", () -> new SofaBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> BLUE_MIDCENTURY_SOFA = BLOCKS.register("blue_midcentury_sofa", () -> new SofaBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> BROWN_MIDCENTURY_SOFA = BLOCKS.register("brown_midcentury_sofa", () -> new SofaBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> DARK_BROWN_MIDCENTURY_SOFA = BLOCKS.register("dark_brown_midcentury_sofa", () -> new SofaBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> GREEN_MIDCENTURY_SOFA = BLOCKS.register("green_midcentury_sofa", () -> new SofaBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> BLACK_MIDCENTURY_SOFA = BLOCKS.register("black_midcentury_sofa", () -> new SofaBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));

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

    public static final RegistryObject<Block> WHITE_OFFICE_CHAIR = BLOCKS.register("white_office_chair", () -> new OfficeChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> BLUE_OFFICE_CHAIR = BLOCKS.register("blue_office_chair", () -> new OfficeChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> GREEN_OFFICE_CHAIR = BLOCKS.register("green_office_chair", () -> new OfficeChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> RED_OFFICE_CHAIR = BLOCKS.register("red_office_chair", () -> new OfficeChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));
    public static final RegistryObject<Block> BLACK_OFFICE_CHAIR = BLOCKS.register("black_office_chair", () -> new OfficeChairBlock(Block.Properties.from(WHITE_LAWN_CHAIR.get())));

    public static final RegistryObject<Block> MODERN_OAK_PLANKS = BLOCKS.register("modern_oak_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MODERN_SPRUCE_PLANKS = BLOCKS.register("modern_spruce_planks", () -> new Block(Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_BIRCH_PLANKS = BLOCKS.register("modern_birch_planks", () -> new Block(Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_JUNGLE_PLANKS = BLOCKS.register("modern_jungle_planks", () -> new Block(Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_ACACIA_PLANKS = BLOCKS.register("modern_acacia_planks", () -> new Block(Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_DARK_OAK_PLANKS = BLOCKS.register("modern_dark_oak_planks", () -> new Block(Block.Properties.from(MODERN_OAK_PLANKS.get())));

    public static final RegistryObject<Block> MODERN_OAK_SLAB = BLOCKS.register("modern_oak_slab", () -> new SlabBlock(Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_SPRUCE_SLAB = BLOCKS.register("modern_spruce_slab", () -> new SlabBlock(Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_BIRCH_SLAB = BLOCKS.register("modern_birch_slab", () -> new SlabBlock(Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_JUNGLE_SLAB = BLOCKS.register("modern_jungle_slab", () -> new SlabBlock(Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_ACACIA_SLAB = BLOCKS.register("modern_acacia_slab", () -> new SlabBlock(Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_DARK_OAK_SLAB = BLOCKS.register("modern_dark_oak_slab", () -> new SlabBlock(Block.Properties.from(MODERN_OAK_PLANKS.get())));

    public static final RegistryObject<Block> MODERN_OAK_STAIRS = BLOCKS.register("modern_oak_stairs", () -> new StairsBlock(() -> ModBlocks.MODERN_OAK_PLANKS.get().getDefaultState(), Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_SPRUCE_STAIRS = BLOCKS.register("modern_spruce_stairs", () -> new StairsBlock(() -> ModBlocks.MODERN_OAK_PLANKS.get().getDefaultState(), Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_BIRCH_STAIRS = BLOCKS.register("modern_birch_stairs", () -> new StairsBlock(() -> ModBlocks.MODERN_OAK_PLANKS.get().getDefaultState(), Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_JUNGLE_STAIRS = BLOCKS.register("modern_jungle_stairs", () -> new StairsBlock(() -> ModBlocks.MODERN_OAK_PLANKS.get().getDefaultState(), Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_ACACIA_STAIRS = BLOCKS.register("modern_acacia_stairs", () -> new StairsBlock(() -> ModBlocks.MODERN_OAK_PLANKS.get().getDefaultState(), Block.Properties.from(MODERN_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MODERN_DARK_OAK_STAIRS = BLOCKS.register("modern_dark_oak_stairs", () -> new StairsBlock(() -> ModBlocks.MODERN_OAK_PLANKS.get().getDefaultState(), Block.Properties.from(MODERN_OAK_PLANKS.get())));

    public static final RegistryObject<Block> WOODEN_DESK = BLOCKS.register("wooden_desk", () -> new DeskBlock(Block.Properties.from(MODERN_OAK_PLANKS.get())));

    public static final RegistryObject<Block> GLASS_DOOR = BLOCKS.register("glass_door", () -> new ModDoorBlock(Block.Properties.from(Blocks.GLASS)));

    public static final RegistryObject<Block> PINEAPPLE_UPSIDE_DOWN_CAKE = BLOCKS.register("pineapple_upside_down_cake", () -> new ModCakeBlock(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> HOLIDAY_CAKE = BLOCKS.register("holiday_cake", () -> new HCCakeBlock(Block.Properties.from(PINEAPPLE_UPSIDE_DOWN_CAKE.get())));
    public static final RegistryObject<Block> RED_VELVET_CAKE = BLOCKS.register("red_velvet_cake", () -> new HCCakeBlock(Block.Properties.from(PINEAPPLE_UPSIDE_DOWN_CAKE.get())));
}
