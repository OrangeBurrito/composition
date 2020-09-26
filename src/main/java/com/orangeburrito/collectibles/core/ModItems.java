package com.orangeburrito.collectibles.core;

import com.orangeburrito.collectibles.Collectibles;
import com.orangeburrito.collectibles.items.*;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Collectibles.MOD_ID);

    // INEDIBLE ITEMS
//    public static final RegistryObject<Item> INKWELL = ITEMS.register("inkwell", () -> new InkwellItem(new Item.Properties().group(Collectibles.CollectiblesItemGroup.instance)));
    public static final RegistryObject<Item> GRAVY = ITEMS.register("gravy", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

    // EDIBLE ITEMS
    public static final RegistryObject<Item> BAGUETTE = ITEMS.register("baguette", () -> new BaguetteItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(6).build())));
//    public static final RegistryObject<Item> CHICKEN_NUGGET = ITEMS.register("chicken_nugget", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(0.8F).effect(() -> new EffectInstance(Effects.POISON, 60, 1), 0.3f).build())));
//    public static final RegistryObject<Item> COOKED_CHICKEN_NUGGET = ITEMS.register("cooked_chicken_nugget", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(1.4F).build())));
    public static final RegistryObject<Item> MEATBUN = ITEMS.register("meatbun", () -> new MeatbunItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(3).effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, 1, 0), 1).build())));
    public static final RegistryObject<Item> SHOTGA_COLA = ITEMS.register("shotga_cola", () -> new ShotgaColaItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(1.5F).effect(() -> new EffectInstance(Effects.SPEED, 1200, 1), 1).build())));
    public static final RegistryObject<Item> HOTDOG = ITEMS.register("hotdog", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(10).build())));
    public static final RegistryObject<Item> BATTERED_SAUSAGE = ITEMS.register("battered_sausage", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(10).build())));
    public static final RegistryObject<Item> BANGERS_AND_MASH = ITEMS.register("bangers_and_mash", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(12).saturation(10).build())));
    public static final RegistryObject<Item> BAKED_HAM = ITEMS.register("baked_ham", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(9).build())));
    public static final RegistryObject<Item> NACHOS = ITEMS.register("nachos", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(9.5F).build())));
    public static final RegistryObject<Item> POUTINE = ITEMS.register("poutine", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(8.5F).build())));
    public static final RegistryObject<Item> CHEESE_FRIES = ITEMS.register("cheese_fries", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(6.5F).build())));
    public static final RegistryObject<Item> POTATO_SKINS = ITEMS.register("potato_skins", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(7.5F).build())));
    public static final RegistryObject<Item> TATER_TOTS = ITEMS.register("tater_tots", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(7.5F).build())));
    public static final RegistryObject<Item> HASHBROWNS = ITEMS.register("hashbrowns", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(7.5F).build())));
    public static final RegistryObject<Item> FOOTLONG = ITEMS.register("footlong", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(12).saturation(10).build())));
    public static final RegistryObject<Item> SOFT_PRETZEL_MUSTARD = ITEMS.register("soft_pretzel_mustard", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(4.5F).build())));
    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(11).saturation(28F).build())));
    public static final RegistryObject<Item> PERSONAL_PIZZA = ITEMS.register("personal_pizza", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(8.5F).build())));
    public static final RegistryObject<Item> SAUTEED_FROG_LEGS = ITEMS.register("sauteed_frog_legs", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(5).build())));
    public static final RegistryObject<Item> PAD_THAI = ITEMS.register("pad_thai", () -> new PadThaiItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(9.6F).build())));
    public static final RegistryObject<Item> PHO = ITEMS.register("pho", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(9.6F).build())));
    public static final RegistryObject<Item> PANEER = ITEMS.register("paneer", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(4.5F).build())));
    public static final RegistryObject<Item> TOASTED_COCONUT = ITEMS.register("toasted_coconut", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(5).build())));
    public static final RegistryObject<Item> FRUIT_SALAD = ITEMS.register("fruit_salad", () -> new BowlItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(8).build())));
    public static final RegistryObject<Item> CUCUMBER_SANDWICH = ITEMS.register("cucumber_sandwich", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(9).build())));
    public static final RegistryObject<Item> TOAST_SANDWICH = ITEMS.register("toast_sandwich", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(6).build())));
    public static final RegistryObject<Item> BRUSCHETTA = ITEMS.register("bruschetta", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(9).build())));
    public static final RegistryObject<Item> STUFFING = ITEMS.register("stuffing", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(9.6F).build())));
    public static final RegistryObject<Item> FAIRY_BREAD = ITEMS.register("fairy_bread", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(6).build())));
    public static final RegistryObject<Item> APPLE_SLICES = ITEMS.register("apple_slices", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(1).fastToEat().build())));
    public static final RegistryObject<Item> LEMONADE = ITEMS.register("lemonade", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(7).effect(() -> new EffectInstance(Effects.SPEED, 600, 0), 1).build())));
    public static final RegistryObject<Item> BANANA_DAIQUIRI = ITEMS.register("banana_daiquiri", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(7).build())));
    public static final RegistryObject<Item> PEACH_SANGRIA = ITEMS.register("peach_sangria", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(7).build())));
    public static final RegistryObject<Item> PINA_COLADA = ITEMS.register("pina_colada", () -> new PinaColadaItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(7.5F).build())));
    public static final RegistryObject<Item> PRISMATIC_PUNCH = ITEMS.register("prismatic_punch", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(12).build())));
    public static final RegistryObject<Item> DARKNESS_SMOOTHIE = ITEMS.register("darkness_smoothie", () -> new DarknessSmoothieItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(7).effect(() -> new EffectInstance(Effects.REGENERATION, 600, 1), 1).build())));
    public static final RegistryObject<Item> TROPICAL_SMOOTHIE = ITEMS.register("tropical_smoothie", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(7).build())));
    public static final RegistryObject<Item> MILKSHAKE = ITEMS.register("milkshake", () -> new MilkshakeItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(7.5F).build())));
    public static final RegistryObject<Item> ICE_CREAM = ITEMS.register("ice_cream", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(10).build())));
    public static final RegistryObject<Item> VANILLA_ICE_CREAM = ITEMS.register("vanilla_ice_cream", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(10).build())));
    public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM = ITEMS.register("strawberry_ice_cream", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(10).build())));
    public static final RegistryObject<Item> NEAPOLITAN_ICE_CREAM = ITEMS.register("neapolitan_ice_cream", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(10).build())));
    public static final RegistryObject<Item> BANANA_SPLIT = ITEMS.register("banana_split", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(10).build())));
    public static final RegistryObject<Item> BLACKBERRY_COBBLER = ITEMS.register("blackberry_cobbler", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(9.5F).build())));
    public static final RegistryObject<Item> PEACH_COBBLER = ITEMS.register("peach_cobbler", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(9.5F).build())));
    public static final RegistryObject<Item> COBBLESTONE_COBBLER = ITEMS.register("cobblestone_cobbler", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(9.5F).build())));

//    public static final RegistryObject<HorseMaskItem> HORSE_MASK = ITEMS.register("horse_mask", () -> new HorseMaskItem(ModArmorMaterial.LEATHER, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
//    public static final RegistryObject<Item> GRILLED_SQUIRREL = ITEMS.register("grilled_squirrel", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(15).saturation(6.0F).build())));
}
