package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class MortarAndPestleItem extends Item {
	public MortarAndPestleItem(Item.Properties properties) {
		super(properties.durability(15).setNoCombineRepair());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}
}