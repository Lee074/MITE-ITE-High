package ink.huix.item.group

import ink.huix.block.ITEBlock
import ink.huix.item.ITEItem
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier


class ITEItemGroup {
    companion object {
        val MATERIAL_GROUP: ItemGroup = FabricItemGroupBuilder.build(Identifier("ite", "material_group")) {
            ItemStack(ITEItem.VIBRANIUM_INGOT)
        }
        val BLOCK_GROUP: ItemGroup = FabricItemGroupBuilder.build(Identifier("ite", "block_group")) {
            ItemStack(ITEBlock.VIBRANIUM_BLOCK)
        }
        val TOOL_GROUP: ItemGroup = FabricItemGroupBuilder.build(Identifier("ite", "tool_group")) {
            ItemStack(ITEItem.VIBRANIUM_SWORD)
        }
        val ARMOR_GROUP: ItemGroup = FabricItemGroupBuilder.build(Identifier("ite", "armor_group")) {
            ItemStack(ITEItem.VIBRANIUM_HELMET)
        }
    }
}