package net.redfox.arcanemastery.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.redfox.arcanemastery.ArcaneMastery;
import net.redfox.arcanemastery.item.custom.HollyWandItem;

public class ModItems {
    public static final Item HOLLY_WAND = registerItem("holly_wand", new HollyWandItem(new FabricItemSettings().group(ModItemGroup.ARCANEMASTERY)
            .maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ArcaneMastery.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ArcaneMastery.LOGGER.debug("Registering Mod Items for " + ArcaneMastery.MOD_ID);
    }
}
