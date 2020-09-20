package com.orangeburrito.collectibles.core;

import com.orangeburrito.collectibles.Collectibles;
import com.orangeburrito.collectibles.blocks.CRT;
import com.orangeburrito.collectibles.blocks.Gamecube;
import com.orangeburrito.collectibles.blocks.OldStonecutter;
import com.orangeburrito.collectibles.blocks.Table;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Collectibles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Collectibles.MOD_ID);

    public static final RegistryObject<Block> TABLE = BLOCKS.register("table", () -> new Table(Block.Properties.create(Material.WOOD).hardnessAndResistance(2, 3).harvestLevel(0).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> OLD_STONECUTTER = BLOCKS.register("old_stonecutter", () -> new OldStonecutter(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F, 3.5F).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GAMECUBE = BLOCKS.register("gamecube", () -> new Gamecube(Block.Properties.create(Material.IRON).hardnessAndResistance(4.5F, 4.5F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
    public static final RegistryObject<Block> CRT = BLOCKS.register("crt", () -> new CRT(Block.Properties.from(GAMECUBE.get())));
//    public static final RegistryObject<Block> WELL = BLOCKS.register("well", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2, 6).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
}
