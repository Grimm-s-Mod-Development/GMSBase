package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GrimmiteUpgradeTemplateItem extends Item {
	public GrimmiteUpgradeTemplateItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}