package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class ZincHammerItem extends Item {
	public ZincHammerItem(Item.Properties properties) {
		super(properties.durability(30).setNoCombineRepair());
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