package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ThrashDeluxeItem extends Item {
	public ThrashDeluxeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(16));
	}
}