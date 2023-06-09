package net.redfox.arcanemastery;

import net.fabricmc.api.ModInitializer;
import net.redfox.arcanemastery.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArcaneMastery implements ModInitializer {
	public static final String MOD_ID = "arcanemastery";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
