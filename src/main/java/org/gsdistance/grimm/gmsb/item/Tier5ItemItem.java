package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Tier5ItemItem extends Item {
	public Tier5ItemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC));
	}
}