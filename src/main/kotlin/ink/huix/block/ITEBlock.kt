package ink.huix.block

import ink.huix.item.group.ITEItemGroup
import ink.huix.item.tool.ITEToolMaterial
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.*
import net.minecraft.item.BlockItem
import net.minecraft.item.ToolMaterials
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry


class ITEBlock {
    companion object {
        val VIBRANIUM_BLOCK: MaterialBlock = MaterialBlock(8, FabricBlockSettings.of(Material.METAL).requiresTool()
            .strength(614.4F, 7200000.0F))

        val VIBRANIUM_ANVIL: ITEAnvilBlock = ITEAnvilBlock(FabricBlockSettings.of(Material.REPAIR_STATION, MapColor.BLUE).portable().sounds(BlockSoundGroup.ANVIL)
            .strength(2.5F, 1200.0F), ToolMaterials.ADAMANTIUM, 0, 25395200, 8, ITEToolMaterial.VIBRANIUM)
        val CHIPPED_VIBRANIUM_ANVIL: ITEAnvilBlock = ITEAnvilBlock(FabricBlockSettings.of(Material.REPAIR_STATION, MapColor.BLUE).portable().sounds(BlockSoundGroup.ANVIL)
            .strength(2.4F, 1200.0F), ToolMaterials.ADAMANTIUM, 12697200,  25395200, 8, ITEToolMaterial.VIBRANIUM)
        val DAMAGED_VIBRANIUM_ANVIL: ITEAnvilBlock = ITEAnvilBlock(FabricBlockSettings.of(Material.REPAIR_STATION, MapColor.BLUE).portable().sounds(BlockSoundGroup.ANVIL)
            .strength(2.3F, 1200.0F), ToolMaterials.ADAMANTIUM, 5079041,  25395200, 8, ITEToolMaterial.VIBRANIUM)


        fun init() {
            this.registerBlock("vibranium_block", VIBRANIUM_BLOCK)
            this.registerBlock("vibranium_anvil", VIBRANIUM_ANVIL)
            this.registerBlock("chipped_vibranium_anvil", CHIPPED_VIBRANIUM_ANVIL)
            this.registerBlock("damaged_vibranium_anvil", DAMAGED_VIBRANIUM_ANVIL)
        }

        private fun registerBlock(path: String, block: Block) {
            Registry.register(Registry.BLOCK, Identifier("ite", path), block)
            Registry.register(Registry.ITEM, Identifier("ite", path), BlockItem(block, FabricItemSettings().group(ITEItemGroup.BLOCK_GROUP)))
        }
    }
}