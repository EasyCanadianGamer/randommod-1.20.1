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
    public static final RegistryObject<Item> RANDOM_INGOT = ITEMS.register("random_ingot",
            () -> new Item(new Item.Properties()));





    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
