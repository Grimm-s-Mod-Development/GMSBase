package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ZincHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 216, 6f, 0, 13, TagKey.create(Registries.ITEM, ResourceLocation.parse("gmsb:zinc_hoe_repair_items")));

	public ZincHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0f, -1f, properties);
	}
}