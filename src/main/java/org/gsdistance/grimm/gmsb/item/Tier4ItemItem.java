package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Tier4ItemItem extends Item {
	public Tier4ItemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}