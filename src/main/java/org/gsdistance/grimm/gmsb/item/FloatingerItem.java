package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FloatingerItem extends Item {
	public FloatingerItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}