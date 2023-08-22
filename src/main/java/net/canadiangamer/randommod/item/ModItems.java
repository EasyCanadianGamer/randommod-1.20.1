package net.canadiangamer.randommod.item;

import net.canadiangamer.randommod.RandomMod;
import net.minecraft.world.item.Item;
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






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
