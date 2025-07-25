package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TinHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 152, 5f, 0, 10, TagKey.create(Registries.ITEM, ResourceLocation.parse("gmsb:tin_hoe_repair_items")));

	public TinHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0f, -2f, properties);
	}
}