package ink.huix.item

import ink.huix.item.armor.ITEArmorMaterial
import ink.huix.item.group.ITEItemGroup
import ink.huix.item.tool.ITEToolMaterial
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.*
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class ITEItem(pSettings: Settings) : Item(pSettings) {
    constructor() : this(FabricItemSettings().group(ITEItemGroup.MATERIAL_GROUP))


    companion object {
        val VIBRANIUM_SWORD: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_sword"), SwordItem(409600, ITEToolMaterial.VIBRANIUM, 6.0F, -2.4F,
                FabricItemSettings().group(ITEItemGroup.TOOL_GROUP))
        )


        val VIBRANIUM_INGOT: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_ingot"), ITEItem()
        )

        val VIBRANIUM_NUGGET: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_nugget"), ITEItem()
        )


        val VIBRANIUM_HELMET: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_helmet"), ArmorItem(ITEArmorMaterial.VIBRANIUM, EquipmentSlot.HEAD,
                FabricItemSettings().group(ITEItemGroup.ARMOR_GROUP))
        )
        val VIBRANIUM_CHESTPLATE: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_chestplate"), ArmorItem(ITEArmorMaterial.VIBRANIUM, EquipmentSlot.CHEST,
                FabricItemSettings().group(ITEItemGroup.ARMOR_GROUP))
        )
        val VIBRANIUM_LEGGINGS: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_leggings"), ArmorItem(ITEArmorMaterial.VIBRANIUM, EquipmentSlot.LEGS,
                FabricItemSettings().group(ITEItemGroup.ARMOR_GROUP))
        )
        val VIBRANIUM_BOOTS: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_boots"), ArmorItem(ITEArmorMaterial.VIBRANIUM, EquipmentSlot.FEET,
                FabricItemSettings().group(ITEItemGroup.ARMOR_GROUP))
        )
    }
}