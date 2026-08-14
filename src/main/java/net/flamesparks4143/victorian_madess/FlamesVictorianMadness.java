package net.flamesparks4143.victorian_madess;

import net.fabricmc.api.ModInitializer;

import net.flamesparks4143.block.ModBlocks;
import net.flamesparks4143.item.ModItemGroups;
import net.flamesparks4143.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlamesVictorianMadness implements ModInitializer {
	public static final String MOD_ID = "flames-victorian-madness";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
