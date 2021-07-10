package curseforge.airplane39.randomc.util;

import curseforge.airplane39.randomc.init.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SapphireToolMaterial implements ToolMaterial {

    public static final SapphireToolMaterial INSTANCE = new SapphireToolMaterial();

    @Override
    public int getDurability() {
        return 550;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4.0f;
    }

    @Override
    public float getAttackDamage() {
        return 3.0f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.SAPPHIRE);
    }
}
