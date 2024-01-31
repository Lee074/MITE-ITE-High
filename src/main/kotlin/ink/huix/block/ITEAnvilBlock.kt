package ink.huix.block

import ink.huix.item.tool.ITEToolMaterial
import net.minecraft.block.AnvilBlock
import net.minecraft.block.BlockState
import net.minecraft.item.ToolMaterials
import net.minecraft.util.math.Direction

class ITEAnvilBlock(settings: Settings, tier: ToolMaterials, initalDamage: Int, maxDamage: Int, repairLevel: Int, val iteMaterial: ITEToolMaterial)
    : AnvilBlock(settings, tier, initalDamage, maxDamage, repairLevel) {

    override fun getBrokeState(currentDamage: Int, iBlockState: BlockState): BlockState? {
        return if (currentDamage >= this.maxDamage) {
            null
        } else if (currentDamage >= this.maxDamage / 3 * 2) {
            this.getDamagedStateForITE().with(FACING, iBlockState.get(FACING) as Direction) as BlockState
        } else if (currentDamage <= this.maxDamage / 3) {
            defaultState.with(FACING, iBlockState.get(FACING) as Direction) as BlockState
        } else {
            if (currentDamage <= this.maxDamage / 3 * 2 && currentDamage >= this.maxDamage / 3)
                this.getChippedStateForITE().with(FACING, iBlockState.get(FACING) as Direction
            ) as BlockState else null
        }
    }
    private fun getDamagedStateForITE(): BlockState {
        return ITEBlock.DAMAGED_VIBRANIUM_ANVIL.defaultState
    }

    private fun getChippedStateForITE(): BlockState {
        return ITEBlock.CHIPPED_VIBRANIUM_ANVIL.defaultState
    }
}