package net.canadiangamer.randommod.item;

import net.canadiangamer.randommod.RandomMod;
import net.canadiangamer.randommod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RandomMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RANDOM_TAB = CREATIVE_MODE_TABS.register("random_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RANDOM_INGOT.get()))
                    .title(Component.translatable("creativetab.random_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RANDOM_INGOT.get());

                        pOutput.accept(ModBlocks.RANDOM_BLOCK.get());
                        pOutput.accept(ModBlocks.RANDOM_ORE.get());
                        pOutput.accept(ModBlocks.RANDOM_PLANKS.get());
                        pOutput.accept(ModBlocks.RANDOM_LEAVES.get());
                        pOutput.accept(ModBlocks.RANDOM_LOG.get());
                        pOutput.accept(ModBlocks.RANDOM_SAPLING.get());

                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
