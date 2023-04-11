package dev.lythium.moreswords.Swords;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class DirtSword extends SwordItem {
    public DirtSword(Tier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}
