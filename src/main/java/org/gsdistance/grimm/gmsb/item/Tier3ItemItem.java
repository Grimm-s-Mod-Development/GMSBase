package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Tier3ItemItem extends Item {
	public Tier3ItemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}