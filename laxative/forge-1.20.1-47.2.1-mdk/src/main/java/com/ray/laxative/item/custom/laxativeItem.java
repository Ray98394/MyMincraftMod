package com.ray.laxative.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class laxativeItem extends Item {

    public laxativeItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity) {
        if(!level.isClientSide && livingEntity instanceof Player){
            Player player = (Player) livingEntity;
            player.getFoodData().setFoodLevel(2);
            if (!player.getAbilities().instabuild) {
                itemStack.shrink(1);
                if (itemStack.isEmpty()) {
                    return new ItemStack(Items.GLASS_BOTTLE);
                } else {
                    player.getInventory().add(new ItemStack(Items.GLASS_BOTTLE));
                }
            }
        }
        return itemStack.isEmpty() ? new ItemStack(Items.GLASS_BOTTLE) : itemStack;
    }

    @Override
    public int getUseDuration(ItemStack itemStack) {
        return 32;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemStack) {
        return UseAnim.DRINK;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        return ItemUtils.startUsingInstantly(level, player, interactionHand);
    }
}
