package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ZincShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 216, 6f, 0, 13, TagKey.create(Registries.ITEM, ResourceLocation.parse("gmsb:zinc_shovel_repair_items")));

	public ZincShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, -3f, properties);
	}
}