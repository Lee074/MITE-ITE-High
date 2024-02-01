package ink.huix.item.tool

import net.minecraft.item.ItemStack
import net.minecraft.item.SwordItem
import net.minecraft.item.ToolMaterial

class ITEDaggerItem(
    maxUses: Int,
    materials: ToolMaterial,
    attackDamage: Float,
    attackSpeed: Float,
    settings: Settings?
) : SwordItem(maxUses, materials, attackDamage - 2.0F, attackSpeed, settings) {

    override fun getReachBonus(selectedItem: ItemStack?): Float {
        return 0.5F
    }
}