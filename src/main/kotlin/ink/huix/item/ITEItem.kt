package ink.huix.item

import ink.huix.item.armor.ITEArmorMaterial
import ink.huix.item.group.ITEItemGroup
import ink.huix.item.tool.ITEBattleAxeItem
import ink.huix.item.tool.ITEDaggerItem
import ink.huix.item.tool.ITEToolMaterial
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.*
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class ITEItem(pSettings: Settings) : Item(pSettings) {

    companion object {
        val VIBRANIUM_INGOT: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_ingot"), Item(FabricItemSettings()
                .group(ITEItemGroup.MATERIAL_GROUP).craftingDifficulty(51200.0F).maxCount(8))
        )

        val VIBRANIUM_NUGGET: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_nugget"), Item(FabricItemSettings()
                .group(ITEItemGroup.MATERIAL_GROUP).craftingDifficulty(5688.8887F).maxCount(64))
        )

        val VIBRANIUM_SWORD: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_sword"),
            SwordItem(409600, ITEToolMaterial.VIBRANIUM, 6.0F, -2.4F, FabricItemSettings().group(ITEItemGroup.TOOL_GROUP))
        )
        val VIBRANIUM_DAGGER: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_dagger"),
            ITEDaggerItem(204800, ITEToolMaterial.VIBRANIUM, 6.0F, -1.5F, FabricItemSettings().group(ITEItemGroup.TOOL_GROUP))
        )
        val VIBRANIUM_PICKAXE: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_pickaxe"),
            PickaxeItem(614400, ITEToolMaterial.VIBRANIUM, 4, -2.7F, FabricItemSettings().group(ITEItemGroup.TOOL_GROUP))
        )
        val VIBRANIUM_WAR_HAMMER: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_war_hammer"),
            WarHammerItem(1024000, ITEToolMaterial.VIBRANIUM, 6, -2.8F, FabricItemSettings().group(ITEItemGroup.TOOL_GROUP))
        )
        val VIBRANIUM_AXE: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_axe"),
            AxeItem(614400, ITEToolMaterial.VIBRANIUM, 5.0F, -3.0F, FabricItemSettings().group(ITEItemGroup.TOOL_GROUP))
        )
        val VIBRANIUM_BATTLE_AXE: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_battle_axe"),
            ITEBattleAxeItem(819200, ITEToolMaterial.VIBRANIUM, 6.0F, -2.8F, FabricItemSettings().group(ITEItemGroup.TOOL_GROUP))
        )
        val VIBRANIUM_SHOVEL: Item = Registry.register(
            Registry.ITEM, Identifier("ite", "vibranium_shovel"),
            ShovelItem(204800, ITEToolMaterial.VIBRANIUM, 5.0F, -3.0F, FabricItemSettings().group(ITEItemGroup.TOOL_GROUP))
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