package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class PrittItem extends Item {
	public PrittItem(Item.Properties properties) {
		super(properties.durability(25).setNoCombineRepair());
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