package net.abbe.tutorialmod.item;

import net.abbe.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item sandstorm = registerItem("sandstorm", new Item(new FabricItemSettings()));
    public static final Item COCONUT = registerItem("coconut", new Item(new FabricItemSettings().food(ModFoodComponents.COCONUT)));



    private static Item registerItem(String name, Item item){
              return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);


    }
}
