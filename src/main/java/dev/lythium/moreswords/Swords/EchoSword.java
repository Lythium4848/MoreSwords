package dev.lythium.moreswords.Swords;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class EchoSword extends SwordItem {
    public EchoSword(Tier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}
