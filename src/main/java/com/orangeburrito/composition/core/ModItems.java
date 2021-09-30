package com.orangeburrito.composition.core;

import com.orangeburrito.composition.Composition;
import com.orangeburrito.composition.common.items.WitchHatItem;
import com.orangeburrito.composition.common.util.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Composition.MOD_ID);

    // FOODS
    public static final RegistryObject<Item> EGGS_BENEDICT = ITEMS.register("eggs_benedict", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(1.0F).build())));
    public static final RegistryObject<Item> SWEDISH_MEATBALLS = ITEMS.register("swedish_meatballs", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(12).saturation(1.0F).build())));
    public static final RegistryObject<Item> BIRD_JERKY = ITEMS.register("bird_jerky", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.6F).meat().build())));
    public static final RegistryObject<Item> CAMEL_JERKY = ITEMS.register("camel_jerky", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.8F).meat().build())));
    public static final RegistryObject<Item> HORSE_JERKY = ITEMS.register("horse_jerky", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.8F).meat().build())));
    public static final RegistryObject<Item> VENISON_JERKY = ITEMS.register("venison_jerky", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.9F).meat().build())));
    public static final RegistryObject<Item> NOPALES_SALAD = ITEMS.register("nopales_salad", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.9F).build())));

    // DESSERTS
    public static final RegistryObject<Item> BLACKBERRY_COBBLER = ITEMS.register("blackberry_cobbler", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.9F).build())));
    public static final RegistryObject<Item> PEACH_COBBLER = ITEMS.register("peach_cobbler", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.9F).build())));
    public static final RegistryObject<Item> COBBLESTONE_COBBLER = ITEMS.register("cobblestone_cobbler", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.9F).build())));

    // ARMOR
    public static final RegistryObject<Item> FLOWER_CROWN = ITEMS.register("flower_crown", () -> new ArmorItem(ModArmorMaterial.FLOWER_CROWN, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> WITCH_HAT = ITEMS.register("witch_hat", () -> new WitchHatItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
}
