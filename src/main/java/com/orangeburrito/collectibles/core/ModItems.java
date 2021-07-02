package com.orangeburrito.collectibles.core;

import com.orangeburrito.collectibles.Collectibles;
import com.orangeburrito.collectibles.common.items.*;
import com.orangeburrito.collectibles.common.util.ModArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Collectibles.MOD_ID);

    // MISC, INGREDIENTS
    public static final RegistryObject<Item> GRAVY = ITEMS.register("gravy", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> FIVE_SPICE = ITEMS.register("five_spice", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));

    // FOODS
    public static final RegistryObject<Item> GARLIC_COIN = ITEMS.register("garlic_coin", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(0.4F).build())));
    public static final RegistryObject<Item> BAGUETTE = ITEMS.register("baguette", () -> new BaguetteItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(0.6F).build())));
    public static final RegistryObject<Item> MEATBUN = ITEMS.register("meatbun", () -> new MeatbunItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.8F).effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, 1, 0), 1).build())));
    public static final RegistryObject<Item> BATTERED_SAUSAGE = ITEMS.register("battered_sausage", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.6F).build())));
    public static final RegistryObject<Item> BANGERS_AND_MASH = ITEMS.register("bangers_and_mash", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(12).saturation(0.6F).build())));
    public static final RegistryObject<Item> TOAD_IN_THE_HOLE = ITEMS.register("toad_in_the_hole", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(0.8F).build())));
    public static final RegistryObject<Item> YORKSHIRE_PUDDING = ITEMS.register("yorkshire_pudding", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.8F).build())));
    public static final RegistryObject<Item> BEANS_ON_TOAST = ITEMS.register("beans_on_toast", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.6F).build())));
    public static final RegistryObject<Item> BAKED_BEANS = ITEMS.register("baked_beans", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.6F).build())));
    public static final RegistryObject<Item> DOCTOR_SAUSAGE = ITEMS.register("doctor_sausage", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(2).saturation(0.2F).build())));
    public static final RegistryObject<Item> COOKED_DOCTOR_SAUSAGE = ITEMS.register("cooked_doctor_sausage", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.6F).build())));
    public static final RegistryObject<Item> RAW_HAM = ITEMS.register("raw_ham", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.6F).meat().build())));
    public static final RegistryObject<Item> BAKED_HAM = ITEMS.register("baked_ham", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(12).saturation(1.0F).meat().build())));
    public static final RegistryObject<Item> PINEAPPLE_HAM = ITEMS.register("pineapple_ham", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(0.9F).meat().build())));
    public static final RegistryObject<Item> RAW_GREEN_EGGS_AND_HAM = ITEMS.register("raw_green_eggs_and_ham", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(0.4F).meat().build())));
    public static final RegistryObject<Item> GREEN_EGGS_AND_HAM = ITEMS.register("green_eggs_and_ham", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(14).saturation(1.0F).meat().build())));
    public static final RegistryObject<Item> EGGS_BENEDICT = ITEMS.register("eggs_benedict", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(1.0F).build())));
    public static final RegistryObject<Item> GRITS = ITEMS.register("grits", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(0.6F).build())));
     public static final RegistryObject<Item> SOUTHERN_STYLE_BREAKFAST = ITEMS.register("southern_style_breakfast", () -> new SouthernStyleBreakfastItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(20).saturation(0.8F).build())));
    public static final RegistryObject<Item> NACHOS = ITEMS.register("nachos", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.8F).build())));
    public static final RegistryObject<Item> POUTINE = ITEMS.register("poutine", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.8F).build())));
    public static final RegistryObject<Item> CHEESE_FRIES = ITEMS.register("cheese_fries", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.6F).build())));
    public static final RegistryObject<Item> CHEESE_DANISH = ITEMS.register("cheese_danish", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.7F).build())));
    public static final RegistryObject<Item> POTATO_SKINS = ITEMS.register("potato_skins", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.7F).build())));
    public static final RegistryObject<Item> HASH = ITEMS.register("hash", () -> new BowlItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(11).saturation(0.9F).build())));
    public static final RegistryObject<Item> HASHBROWNS = ITEMS.register("hashbrowns", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.6F).build())));
    public static final RegistryObject<Item> TATER_TOTS = ITEMS.register("tater_tots", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.7F).build())));
//    public static final RegistryObject<Item> LOADED_BAKED_POTATO = ITEMS.register("loaded_baked_potato", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(0.8F).build())));
    public static final RegistryObject<Item> MASHED_SWEET_POTATOES = ITEMS.register("mashed_sweet_potatoes", () -> new CitrusSaladItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(11).saturation(0.8F).build())));
    public static final RegistryObject<Item> SWEET_POTATO_SOUFFLE = ITEMS.register("sweet_potato_souffle", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.6F).build())));
    public static final RegistryObject<Item> FOOTLONG = ITEMS.register("footlong", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(12).saturation(0.7F).build())));
    public static final RegistryObject<Item> SEMLA = ITEMS.register("semla", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(0.8F).build())));
    public static final RegistryObject<Item> SWEDISH_MEATBALLS = ITEMS.register("swedish_meatballs", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(12).saturation(1.0F).build())));
    public static final RegistryObject<Item> CHEESESTEAK = ITEMS.register("cheesesteak", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(0.8F).build())));
    public static final RegistryObject<Item> DELUXE_CHEESEBURGER = ITEMS.register("deluxe_cheeseburger", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(0.8F).build())));
    public static final RegistryObject<Item> PARADISE_BURGER = ITEMS.register("paradise_burger", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(16).saturation(0.8F).build())));
    public static final RegistryObject<Item> SOFT_PRETZEL_MUSTARD = ITEMS.register("soft_pretzel_mustard", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.8F).build())));
    public static final RegistryObject<Item> PERSONAL_PIZZA = ITEMS.register("personal_pizza", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.8F).build())));
    public static final RegistryObject<Item> HONEY_GLAZED_CARROTS = ITEMS.register("honey_glazed_carrots", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.9F).build())));
    public static final RegistryObject<Item> HONEY_GLAZED_SALMON = ITEMS.register("honey_glazed_salmon", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(1.0F).build())));
    public static final RegistryObject<Item> SAUTEED_FROG_LEGS = ITEMS.register("sauteed_frog_legs", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(1.1F).build())));
    public static final RegistryObject<Item> HOISIN_SAUCE = ITEMS.register("hoisin_sauce", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(0.5F).build())));
    public static final RegistryObject<Item> PEKING_DUCK = ITEMS.register("peking_duck", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(14).saturation(1.2F).build())));
    public static final RegistryObject<Item> CHAR_SIU = ITEMS.register("char_siu", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(14).saturation(1.0F).build())));
    public static final RegistryObject<Item> PAD_THAI = ITEMS.register("pad_thai", () -> new PadThaiItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.9F).build())));
    public static final RegistryObject<Item> PHO = ITEMS.register("pho", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.9F).build())));
    public static final RegistryObject<Item> DIM_SUM = ITEMS.register("dim_sum", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(12).saturation(0.8F).build())));
    public static final RegistryObject<Item> PANEER = ITEMS.register("paneer", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(0.9F).build())));
    public static final RegistryObject<Item> EXTREME_CHILI = ITEMS.register("extreme_chili", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(0.9F).build())));
    public static final RegistryObject<Item> BIRD_JERKY = ITEMS.register("bird_jerky", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.6F).meat().build())));
    public static final RegistryObject<Item> CAMEL_JERKY = ITEMS.register("camel_jerky", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.8F).meat().build())));
    public static final RegistryObject<Item> HORSE_JERKY = ITEMS.register("horse_jerky", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.8F).meat().build())));
    public static final RegistryObject<Item> VENISON_JERKY = ITEMS.register("venison_jerky", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.9F).meat().build())));
    public static final RegistryObject<Item> TOASTED_COCONUT = ITEMS.register("toasted_coconut", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(0.3F).meat().build())));
    public static final RegistryObject<Item> POACHED_PEAR = ITEMS.register("poached_pear", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(0.7F).build())));
    public static final RegistryObject<Item> NOPALES_SALAD = ITEMS.register("nopales_salad", () -> new CitrusSaladItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.9F).build())));
    public static final RegistryObject<Item> CITRUS_SALAD = ITEMS.register("citrus_salad", () -> new CitrusSaladItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.7F).build())));
    public static final RegistryObject<Item> SUMMER_RADISH_SALAD = ITEMS.register("summer_radish_salad", () -> new CitrusSaladItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.7F).build())));
    public static final RegistryObject<Item> CORN_ON_THE_COB = ITEMS.register("corn_on_the_cob", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.8F).build())));
    public static final RegistryObject<Item> CREAMED_CORN = ITEMS.register("creamed_corn", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.6F).build())));
    public static final RegistryObject<Item> OKRA_CREOLE = ITEMS.register("okra_creole", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(0.8F).build())));
    public static final RegistryObject<Item> KALE_CHIPS = ITEMS.register("kale_chips", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(0.6F).build())));
    public static final RegistryObject<Item> ZUCCHINI_SLICES = ITEMS.register("zucchini_slices", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(0.4F).build())));
    public static final RegistryObject<Item> ZUCCHINI_FRIES = ITEMS.register("zucchini_fries", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(0.6F).build())));
    public static final RegistryObject<Item> CUCUMBER_SANDWICH = ITEMS.register("cucumber_sandwich", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.9F).build())));
    public static final RegistryObject<Item> HAM_SWEET_PICKLE_SANDWICH = ITEMS.register("ham_sweet_pickle_sandwich", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(12).saturation(0.9F).build())));
    public static final RegistryObject<Item> TOASTED_WESTERN = ITEMS.register("toasted_western", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(12).saturation(0.9F).build())));
    public static final RegistryObject<Item> BRUSCHETTA = ITEMS.register("bruschetta", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.7F).build())));
    public static final RegistryObject<Item> TOAST_SANDWICH = ITEMS.register("toast_sandwich", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(0.5F).build())));
    public static final RegistryObject<Item> AVOCADO_TOAST = ITEMS.register("avocado_toast", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.8F).build())));
    public static final RegistryObject<Item> CREAM_OF_AVOCADO_SOUP = ITEMS.register("cream_of_avocado_soup", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(0.8F).build())));
    public static final RegistryObject<Item> GUACAMOLE = ITEMS.register("guacamole", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(0.8F).build())));
    public static final RegistryObject<Item> BISCUIT = ITEMS.register("biscuit", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.6F).build())));
    public static final RegistryObject<Item> BISCUITS_AND_GRAVY = ITEMS.register("biscuits_and_gravy", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.8F).build())));
    public static final RegistryObject<Item> LEEK_BACON_SOUP = ITEMS.register("leek_bacon_soup", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.8F).build())));
    public static final RegistryObject<Item> VEGGIE_STRIPS = ITEMS.register("veggie_strips", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.8F).build())));
    public static final RegistryObject<Item> ASPARAGUS_QUICHE = ITEMS.register("asparagus_quiche", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.8F).build())));
    public static final RegistryObject<Item> SWEET_PICKLE = ITEMS.register("sweet_pickle", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.5F).build())));
    public static final RegistryObject<Item> STUFFING = ITEMS.register("stuffing", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.7F).build())));
    public static final RegistryObject<Item> FAIRY_BREAD = ITEMS.register("fairy_bread", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.7F).build())));
    public static final RegistryObject<Item> DATE_NUT_BREAD = ITEMS.register("date_nut_bread", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.7F).build())));
    public static final RegistryObject<Item> BACON_WRAPPED_DATES = ITEMS.register("bacon_wrapped_dates", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.8F).build())));
    public static final RegistryObject<Item> APPLE_SLICES = ITEMS.register("apple_slices", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(1).saturation(1).fastToEat().build())));
    // DRINKS
    public static final RegistryObject<Item> SHOTGA_COLA = ITEMS.register("shotga_cola", () -> new ShotgaColaItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.8F).effect(() -> new EffectInstance(Effects.SPEED, 1200, 1), 1).build())));
    public static final RegistryObject<Item> LEMONADE = ITEMS.register("lemonade", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(1.0F).build())));
    public static final RegistryObject<Item> BANANA_DAIQUIRI = ITEMS.register("banana_daiquiri", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.7F).build())));
    public static final RegistryObject<Item> BLOODY_MOSCATO = ITEMS.register("bloody_moscato", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.7F).build())));
    public static final RegistryObject<Item> PEACH_SANGRIA = ITEMS.register("peach_sangria", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.7F).build())));
    public static final RegistryObject<Item> PINA_COLADA = ITEMS.register("pina_colada", () -> new PinaColadaItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.8F).build())));
    public static final RegistryObject<Item> PRISMATIC_PUNCH = ITEMS.register("prismatic_punch", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(0.8F).build())));
    public static final RegistryObject<Item> DARKNESS_SMOOTHIE = ITEMS.register("darkness_smoothie", () -> new DarknessSmoothieItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.8F).build())));
    public static final RegistryObject<Item> TROPICAL_SMOOTHIE = ITEMS.register("tropical_smoothie", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.8F).build())));
    public static final RegistryObject<Item> KALE_SMOOTHIE = ITEMS.register("kale_smoothie", () -> new KaleSmoothieItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.5F).build())));
    public static final RegistryObject<Item> LYCHEE_TEA = ITEMS.register("lychee_tea", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.8F).effect(() -> new EffectInstance(Effects.LUCK, 600, 0), 1).build())));
    public static final RegistryObject<Item> EGGNOG = ITEMS.register("eggnog", () -> new DrinkItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(7).saturation(0.6F).effect(() -> new EffectInstance(Effects.ABSORPTION, 300, 0), 1).build())));
    public static final RegistryObject<Item> PUMPKIN_SPICE_LATTE = ITEMS.register("pumpkin_spice_latte", () -> new PumpkinSpiceLatteItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.8F).build())));

    // DESSERT
//    public static final RegistryObject<Item> MILKSHAKE = ITEMS.register("milkshake", () -> new MilkshakeItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.7F).build())));
//    public static final RegistryObject<Item> BANANA_SPLIT = ITEMS.register("banana_split", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(1.0F).build())));
//    public static final RegistryObject<Item> VANILLA_ICE_CREAM = ITEMS.register("vanilla_ice_cream", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(1.0F).build())));
//    public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM = ITEMS.register("strawberry_ice_cream", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(1.0F).build())));
//    public static final RegistryObject<Item> NEAPOLITAN_ICE_CREAM = ITEMS.register("neapolitan_ice_cream", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(1.0F).build())));
    public static final RegistryObject<Item> SPUMONI_ICE_CREAM = ITEMS.register("spumoni_ice_cream", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(1.0F).build())));
    public static final RegistryObject<Item> MINT_CHOCOLATE_CHIP_ICE_CREAM = ITEMS.register("mint_chocolate_chip_ice_cream", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(1.0F).build())));
    public static final RegistryObject<Item> PISTACHIO_ICE_CREAM = ITEMS.register("pistachio_ice_cream", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(1.0F).build())));
//    public static final RegistryObject<Item> CHERRY_ICE_CREAM = ITEMS.register("cherry_ice_cream", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(1.0F).build())));
    public static final RegistryObject<Item> CHERRY_COCONUT_CHOCOLATE_BAR = ITEMS.register("cherry_coconut_chocolate_bar", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(4).saturation(1.2F).build())));
    public static final RegistryObject<Item> HAZELNUT_CHOCOLATE_SANDWICH = ITEMS.register("hazelnut_chocolate_sandwich", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.7F).build())));
    public static final RegistryObject<Item> HAZELNUT_CHOCOLATE_BANANA_SANDWICH = ITEMS.register("hazelnut_chocolate_banana_sandwich", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(9).saturation(0.8F).build())));
//    public static final RegistryObject<Item> TWINKIE = ITEMS.register("twinkie", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(5).saturation(0.7F).build())));
    public static final RegistryObject<Item> BLACKBERRY_COBBLER = ITEMS.register("blackberry_cobbler", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.9F).build())));
    public static final RegistryObject<Item> PEACH_COBBLER = ITEMS.register("peach_cobbler", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.9F).build())));
    public static final RegistryObject<Item> COBBLESTONE_COBBLER = ITEMS.register("cobblestone_cobbler", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.9F).build())));
    public static final RegistryObject<Item> BLUEBERRY_TART = ITEMS.register("blueberry_tart", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.8F).build())));
    public static final RegistryObject<Item> KEY_LIME_PIE = ITEMS.register("key_lime_pie", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.7F).build())));
    public static final RegistryObject<Item> PECAN_PIE = ITEMS.register("pecan_pie", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.7F).build())));
    public static final RegistryObject<Item> BAKLAVA = ITEMS.register("baklava", () -> new HarvestcraftItem(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(1.0F).build())));
    public static final RegistryObject<Item> FRUITCAKE = ITEMS.register("fruitcake", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(11).saturation(0.6F).build())));
    public static final RegistryObject<Item> HONEY_CAKE = ITEMS.register("honey_cake", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(0.8F).build())));
    public static final RegistryObject<Item> RED_VELVET_CUPCAKE = ITEMS.register("red_velvet_cupcake", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.6F).build())));
    public static final RegistryObject<Item> RASPBERRY_TRIFLE = ITEMS.register("raspberry_trifle", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.8F).build())));

    public static final RegistryObject<Item> FLOWER_CROWN = ITEMS.register("flower_crown", () -> new ArmorItem(ModArmorMaterial.FLOWER_CROWN, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> WITCH_HAT = ITEMS.register("witch_hat", () -> new WitchHatItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> PLATE_HELMET = ITEMS.register("plate_helmet", () -> new PlateArmorItem(ModArmorMaterial.PLATE, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> PLATE_CHESTPLATE = ITEMS.register("plate_chestplate", () -> new PlateArmorItem(ModArmorMaterial.PLATE, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
}
