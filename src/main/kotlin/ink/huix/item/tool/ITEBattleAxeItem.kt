package ink.huix.item.tool

import net.minecraft.block.BlockState
import net.minecraft.item.AxeItem
import net.minecraft.item.ItemStack
import net.minecraft.item.ToolMaterial

class ITEBattleAxeItem(durability: Int, material: ToolMaterial, attackDamage: Float, attackSpeed: Float, settings: Settings) :
    AxeItem(material, attackDamage, attackSpeed, settings.maxDamageIfAbsent(durability)) {

    override fun getMiningSpeedMultiplier(stack: ItemStack?, state: BlockState?): Float {
        return super.getMiningSpeedMultiplier(stack, state) * 0.75F
    }
}