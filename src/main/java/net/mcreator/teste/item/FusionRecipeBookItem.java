
package net.mcreator.teste.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class FusionRecipeBookItem extends Item {

	public FusionRecipeBookItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
