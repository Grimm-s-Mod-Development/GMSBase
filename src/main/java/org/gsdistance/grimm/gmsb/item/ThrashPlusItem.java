package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ThrashPlusItem extends Item {
	public ThrashPlusItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(32));
	}
}