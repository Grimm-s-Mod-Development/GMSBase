package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TinSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 152, 5f, 0, 10, TagKey.create(Registries.ITEM, ResourceLocation.parse("gmsb:tin_sword_repair_items")));

	public TinSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, -2.4f, properties);
	}
}