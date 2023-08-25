package net.abbe.tutorialmod.registries;

import net.abbe.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerStrippables() {
    StrippableBlockRegistry.register(ModBlocks.PALM_TREE, ModBlocks.STRIPPED_PALM_TREE);
    StrippableBlockRegistry.register(ModBlocks.PALM_TREE_WOOD, ModBlocks.STRIPPED_PALM_TREE_WOOD);
    }

}
