package ink.huix.item.armor

import ink.huix.item.ITEItem
import ink.huix.item.tool.ITEToolMaterial
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorMaterial
import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents
import java.util.function.Supplier

enum class ITEArmorMaterial(
    private val materialName: String, private val acidResistance: Int, private val maxDamageArray: IntArray, private val slotProtections: FloatArray, private val enchantAbility: Int,
    private val soundEvent: SoundEvent, private val toughness: Float, private val material: ToolMaterial, private val repairMaterial: Supplier<Ingredient>) : ArmorMaterial {


    VIBRANIUM("vibranium", 2000, intArrayOf(5120, 8192, 7168, 4096), floatArrayOf(3.1F, 5.0F, 4.4F, 2.5F), 150,
        SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, ITEToolMaterial.VIBRANIUM, {
            Ingredient.ofItems(ITEItem.VIBRANIUM_NUGGET) });


    override fun getDurability(equipmentSlot: EquipmentSlot): Int {
        return this.maxDamageArray[equipmentSlot.entitySlotId]
    }

    override fun getAcidResistance(): Int {
        return this.acidResistance
    }

    override fun getProtectionAmount(equipmentSlot: EquipmentSlot): Int {
        return this.slotProtections[equipmentSlot.entitySlotId].toInt()
    }

    override fun getEnchantability(): Int {
        return this.enchantAbility
    }

    override fun getRepairLevel(): Int {
        return this.material.repairLevel
    }

    override fun getEquipSound(): SoundEvent {
        return this.soundEvent;
    }

    override fun getRepairIngredient(): Ingredient {
        return this.repairMaterial.get()
    }

    override fun getName(): String {
        return this.materialName
    }

    override fun getToughness(): Float {
        return this.toughness
    }

    override fun getKnockbackResistance(): Float {
        return 0.0F
    }
}