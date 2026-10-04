package net.flamesparks4143.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    IRON(0, 251, 1, 6, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    GOLD(0, 33, 1, 4, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    COPPER(0, 191, 1, 5, 13, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    STEEL(0, 201, 1, 6, 15, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    DIAMOND(0, 1561, 1, 7, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    NETHERITE(0, 2031, 1, 8, 15, () -> Ingredient.ofItems(Items.NETHERITE_SCRAP));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDyrability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        itemDurability = itemDyrability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
