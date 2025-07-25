package org.gsdistance.grimm.gmsb.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ZincAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 216, 6f, 0, 13, TagKey.create(Registries.ITEM, ResourceLocation.parse("gmsb:zinc_axe_repair_items")));

	public ZincAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 7f, -3f, properties);
	}
}