/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.grimm.gmsb.init;

import org.gsdistance.grimm.gmsb.GmsbMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class GmsbModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GmsbMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BASE_CREATIVE_TAB = REGISTRY.register("base_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gmsb.base_creative_tab")).icon(() -> new ItemStack(GmsbModItems.LOGO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GmsbModItems.DUMMY_SPAWN_EGG.get());
				tabData.accept(GmsbModItems.GRIMMITE_INGOT.get());
				tabData.accept(GmsbModBlocks.GRIMMITE_ORE.get().asItem());
				tabData.accept(GmsbModBlocks.GRIMMITE_BLOCK.get().asItem());
				tabData.accept(GmsbModItems.MORTAR.get());
				tabData.accept(GmsbModItems.MORTAR_AND_PESTLE.get());
				tabData.accept(GmsbModItems.STONE_STICK.get());
				tabData.accept(GmsbModItems.FLOATINGER.get());
				tabData.accept(GmsbModItems.TIN_CAN.get());
				tabData.accept(GmsbModItems.TIN_SODA_CAN.get());
				tabData.accept(GmsbModItems.TIN_CAN_FULL.get());
				tabData.accept(GmsbModItems.PULL_TAB.get());
				tabData.accept(GmsbModItems.TIN_INGOT.get());
				tabData.accept(GmsbModBlocks.TIN_ORE.get().asItem());
				tabData.accept(GmsbModBlocks.TIN_BLOCK.get().asItem());
				tabData.accept(GmsbModItems.TIN_PICKAXE.get());
				tabData.accept(GmsbModItems.TIN_AXE.get());
				tabData.accept(GmsbModItems.TIN_SWORD.get());
				tabData.accept(GmsbModItems.TIN_SHOVEL.get());
				tabData.accept(GmsbModItems.TIN_HOE.get());
				tabData.accept(GmsbModItems.TIN_ARMOR_HELMET.get());
				tabData.accept(GmsbModItems.TIN_ARMOR_CHESTPLATE.get());
				tabData.accept(GmsbModItems.TIN_ARMOR_LEGGINGS.get());
				tabData.accept(GmsbModItems.TIN_ARMOR_BOOTS.get());
				tabData.accept(GmsbModItems.GRIMMITE_NUGGET.get());
				tabData.accept(GmsbModItems.TIN_NUGGET.get());
				tabData.accept(GmsbModItems.COAL_DUST.get());
				tabData.accept(GmsbModItems.IRON_DUST.get());
				tabData.accept(GmsbModItems.DESPAWN_WAND.get());
				tabData.accept(GmsbModItems.STEEL_DUST.get());
				tabData.accept(GmsbModItems.IRON_HAMMER.get());
				tabData.accept(GmsbModItems.TIN_HAMMER.get());
				tabData.accept(GmsbModItems.ZINC_HAMMER.get());
				tabData.accept(GmsbModItems.NETHERITE_HAMMER.get());
				tabData.accept(GmsbModItems.WOODEN_HAMMER.get());
				tabData.accept(GmsbModItems.STONE_HAMMER.get());
				tabData.accept(GmsbModItems.STEEL_HAMMER.get());
				tabData.accept(GmsbModItems.GRIMMITE_HAMMER.get());
				tabData.accept(GmsbModItems.TIER_0_ITEM.get());
				tabData.accept(GmsbModItems.TIER_1_ITEM.get());
				tabData.accept(GmsbModItems.TIER_2_ITEM.get());
				tabData.accept(GmsbModItems.TIER_3_ITEM.get());
				tabData.accept(GmsbModItems.TIER_4_ITEM.get());
				tabData.accept(GmsbModItems.TIER_5_ITEM.get());
				tabData.accept(GmsbModItems.STEEL.get());
				tabData.accept(GmsbModItems.TEMPERED_STEEL.get());
				tabData.accept(GmsbModItems.GALVANIZED_STEEL.get());
				tabData.accept(GmsbModItems.HOT_STEEL.get());
				tabData.accept(GmsbModItems.PRITT.get());
				tabData.accept(GmsbModItems.PRITT_SPECIAL_EDITION.get());
				tabData.accept(GmsbModItems.BASIC_THRASH.get());
				tabData.accept(GmsbModItems.THRASH_PLUS.get());
				tabData.accept(GmsbModItems.THRASH_DELUXE.get());
				tabData.accept(GmsbModItems.UNCOMMON_THRASH.get());
				tabData.accept(GmsbModItems.RARE_THRASH.get());
				tabData.accept(GmsbModItems.EPIC_THRASH.get());
				tabData.accept(GmsbModItems.LEGENDARY_THRASH.get());
				tabData.accept(GmsbModItems.STEEL_MORTAR.get());
				tabData.accept(GmsbModItems.STEEL_MORTAR_AND_PESTLE.get());
				tabData.accept(GmsbModItems.NETHERITE_MORTAR.get());
				tabData.accept(GmsbModItems.NETHERITE_MORTAR_AND_PESTLE.get());
				tabData.accept(GmsbModItems.TUNGSTEN_INGOT.get());
				tabData.accept(GmsbModBlocks.TUNGSTEN_ORE.get().asItem());
				tabData.accept(GmsbModBlocks.TUNGSTEN_BLOCK.get().asItem());
				tabData.accept(GmsbModItems.THORIUM_INGOT.get());
				tabData.accept(GmsbModBlocks.THORIUM_ORE.get().asItem());
				tabData.accept(GmsbModBlocks.THORIUM_BLOCK.get().asItem());
				tabData.accept(GmsbModItems.URANIUM_INGOT.get());
				tabData.accept(GmsbModBlocks.URANIUM_ORE.get().asItem());
				tabData.accept(GmsbModBlocks.URANIUM_BLOCK.get().asItem());
				tabData.accept(GmsbModItems.TUNGSTEN_NUGGET.get());
				tabData.accept(GmsbModItems.THORIUM_NUGGET.get());
				tabData.accept(GmsbModItems.URANIUM_NUGGET.get());
				tabData.accept(GmsbModItems.ZINC_NUGGET.get());
				tabData.accept(GmsbModItems.STEEL_STICK.get());
				tabData.accept(GmsbModItems.GRIMMITE_UPGRADE_TEMPLATE.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(GmsbModItems.ZINC_INGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(GmsbModBlocks.ZINC_ORE.get().asItem());
			tabData.accept(GmsbModBlocks.ZINC_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(GmsbModItems.ZINC_PICKAXE.get());
			tabData.accept(GmsbModItems.ZINC_AXE.get());
			tabData.accept(GmsbModItems.ZINC_SHOVEL.get());
			tabData.accept(GmsbModItems.ZINC_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(GmsbModItems.ZINC_SWORD.get());
			tabData.accept(GmsbModItems.ZINC_ARMOR_HELMET.get());
			tabData.accept(GmsbModItems.ZINC_ARMOR_CHESTPLATE.get());
			tabData.accept(GmsbModItems.ZINC_ARMOR_LEGGINGS.get());
			tabData.accept(GmsbModItems.ZINC_ARMOR_BOOTS.get());
		}
	}
}