package net.redfox.arcanemastery.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HollyWandItem extends Item {
    public HollyWandItem(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient() && hand == hand.MAIN_HAND) {
            user.sendMessage(Text.literal("This worked!"));
        }
        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.literal("I need NBT to go after this -->").formatted(Formatting.ITALIC,Formatting.GRAY));
        } else {
            tooltip.add(Text.literal("Press Shift for more info").formatted(Formatting.ITALIC,Formatting.GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
