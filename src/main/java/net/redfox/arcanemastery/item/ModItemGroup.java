package net.redfox.arcanemastery.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.redfox.arcanemastery.ArcaneMastery;

public class ModItemGroup {
    public static final ItemGroup ARCANEMASTERY = FabricItemGroupBuilder.build(new Identifier(ArcaneMastery.MOD_ID, "arcane_mastery"), () -> new ItemStack(ModItems.HOLLY_WAND));
}
