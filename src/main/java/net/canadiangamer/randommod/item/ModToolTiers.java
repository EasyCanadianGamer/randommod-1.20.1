package net.canadiangamer.randommod.item;

import net.canadiangamer.randommod.RandomMod;
import net.canadiangamer.randommod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier RANDOMITE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_RANDOMITE_TOOL, () -> Ingredient.of(ModItems.RANDOMITE_INGOT.get())),
            new ResourceLocation(RandomMod.MOD_ID, "randomite"), List.of(Tiers.NETHERITE), List.of());

}