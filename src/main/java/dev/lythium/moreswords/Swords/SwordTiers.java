package dev.lythium.moreswords.Swords;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum SwordTiers implements Tier {
    DIRT_SWORD(3, 40, 7.0F, 3, 11, () -> {
        return Ingredient.EMPTY;
    }),
    AMETHYST_SWORD(3, 550, 7.0F, 7, 13, () -> {
        return Ingredient.EMPTY;
    }),
    ECHO_SWORD(3, 4064, 7.0F, 10, 18, () -> {
        return Ingredient.EMPTY;
    });


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    SwordTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return 0;
    }

    @Override
    public float getSpeed() {
        return 0;
    }

    @Override
    public float getAttackDamageBonus() {
        return 0;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}