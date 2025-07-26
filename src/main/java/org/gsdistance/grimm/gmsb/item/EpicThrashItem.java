package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EpicThrashItem extends Item {
	public EpicThrashItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(99));
	}
}