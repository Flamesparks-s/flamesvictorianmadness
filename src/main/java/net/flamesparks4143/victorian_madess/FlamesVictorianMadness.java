package net.flamesparks4143.victorian_madess;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlamesVictorianMadness implements ModInitializer {
	public static final String MOD_ID = "flamesvictorianmadness";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
