package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UncommonThrashItem extends Item {
	public UncommonThrashItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(99));
	}
}