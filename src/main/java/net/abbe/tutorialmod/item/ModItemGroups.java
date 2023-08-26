package net.abbe.tutorialmod.item;

import net.abbe.tutorialmod.TutorialMod;
import net.abbe.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SANDSTORM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "sandstorm"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sandstorm"))
                    .icon(() -> new ItemStack(ModItems.sandstorm)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.PALM_TREE.asItem());
                        entries.add(ModBlocks.PALM_TREE_WOOD.asItem());
                        entries.add(ModBlocks.STRIPPED_PALM_TREE.asItem());
                        entries.add(ModBlocks.STRIPPED_PALM_TREE_WOOD.asItem());
                        entries.add(ModBlocks.PALM_PLANK.asItem());
                        entries.add(ModBlocks.SEASHELL.asItem());


                        entries.add(ModItems.sandstorm );

                        entries.add(ModItems.COCONUT);

                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " +TutorialMod.MOD_ID);
    }
}
