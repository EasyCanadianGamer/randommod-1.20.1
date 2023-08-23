package net.canadiangamer.randommod.item;

import net.canadiangamer.randommod.RandomMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RandomMod.MOD_ID);
    public static final RegistryObject<Item> RANDOMITE_INGOT = ITEMS.register("randomite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RANDOM_MEAT_RAW = ITEMS.register("random_meat_raw",
            () -> new Item(new Item.Properties().food(ModFoods.RANDOM_MEAT_RAW)));
    public static final RegistryObject<Item> RANDOM_MEAT_COOKED = ITEMS.register("random_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.RANDOM_MEAT_COOKED)));


    public static final RegistryObject<Item> RANDOMITE_SWORD = ITEMS.register("randomite_sword",
            () -> new SwordItem(ModToolTiers.RANDOMITE, 20, 5, new Item.Properties()));
    public static final RegistryObject<Item> RANDOMITE_PICKAXE = ITEMS.register("randomite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RANDOMITE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> RANDOMITE_AXE = ITEMS.register("randomite_axe",
            () -> new AxeItem(ModToolTiers.RANDOMITE, 25, 10, new Item.Properties()));
    public static final RegistryObject<Item> RANDOMITE_SHOVEL = ITEMS.register("randomite_shovel",
            () -> new ShovelItem(ModToolTiers.RANDOMITE, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> RANDOMITE_HOE = ITEMS.register("randomite_hoe",
            () -> new HoeItem(ModToolTiers.RANDOMITE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> RANDOMITE_HELMET = ITEMS.register("randomite_helmet",
            () -> new ArmorItem(ModArmorMaterials.RANDOMITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RANDOMITE_CHESTPLATE = ITEMS.register("randomite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RANDOMITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RANDOMITE_LEGGINGS = ITEMS.register("randomite_leggings",
            () -> new ArmorItem(ModArmorMaterials.RANDOMITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RANDOMITE_BOOTS = ITEMS.register("randomite_boots",
            () -> new ArmorItem(ModArmorMaterials.RANDOMITE, ArmorItem.Type.BOOTS, new Item.Properties()));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
