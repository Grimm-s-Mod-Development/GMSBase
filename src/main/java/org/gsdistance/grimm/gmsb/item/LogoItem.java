package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LogoItem extends Item {
	public LogoItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(1));
	}
}