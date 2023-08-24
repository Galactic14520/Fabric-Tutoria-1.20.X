package net.abbe.tutorialmod.block;

import net.abbe.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.apache.http.client.utils.Idn;

public class ModBlocks {
    public static final Block PALM_TREE = registerBlock("palm_tree",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));
    public static final Block PALM_WOOD_PLANK = registerBlock("palm_plank",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}
