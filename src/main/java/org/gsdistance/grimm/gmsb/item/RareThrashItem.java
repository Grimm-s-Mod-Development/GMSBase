package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RareThrashItem extends Item {
	public RareThrashItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(99));
	}
}