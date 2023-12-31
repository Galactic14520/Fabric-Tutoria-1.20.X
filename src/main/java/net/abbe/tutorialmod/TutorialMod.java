package net.abbe.tutorialmod;

import net.abbe.tutorialmod.block.ModBlocks;
import net.abbe.tutorialmod.registries.ModRegistries;
import net.fabricmc.api.ModInitializer;
import net.abbe.tutorialmod.item.ModItemGroups;
import net.abbe.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerStrippables();

	}

}