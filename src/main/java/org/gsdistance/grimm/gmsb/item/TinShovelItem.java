package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TinShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 152, 5f, 0, 10, TagKey.create(Registries.ITEM, ResourceLocation.parse("gmsb:tin_shovel_repair_items")));

	public TinShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2f, -3f, properties);
	}
}