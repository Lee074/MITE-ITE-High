package ink.huix.item.tool

import ink.huix.item.ITEItem
import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient
import java.util.function.Supplier

enum class ITEToolMaterial (
    private val miningLevel: Int, private val miningSpeed: Float, private val attackDamage: Float, private val acidResistance: Int,
    private val enchantAbility: Int, private val repairDurability: Int, private val repairMaterial: Supplier<Ingredient>) : ToolMaterial {


    VIBRANIUM(8, 12.0F, 8.0F, 8000, 150, 102400, {
        Ingredient.ofItems(ITEItem.VIBRANIUM_NUGGET) });

    override fun getRepairDurability(): Int {
        return this.repairDurability
    }

    override fun getAcidResistance(): Int {
        return this.acidResistance
    }

    override fun getMiningSpeedMultiplier(): Float {
        return this.miningSpeed
    }

    override fun getAttackDamage(): Float {
        return this.attackDamage
    }

    override fun getMiningLevel(): Int {
        return this.miningLevel
    }

    override fun getEnchantability(): Int {
        return this.enchantAbility
    }

    override fun getDurability(): Int {
        return this.repairDurability * 4
    }

    override fun getRepairIngredient(): Ingredient {
        return this.repairMaterial.get()
    }
}