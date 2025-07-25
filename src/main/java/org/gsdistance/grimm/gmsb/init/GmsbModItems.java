/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.grimm.gmsb.init;

import org.gsdistance.grimm.gmsb.item.ZincSwordItem;
import org.gsdistance.grimm.gmsb.item.ZincShovelItem;
import org.gsdistance.grimm.gmsb.item.ZincPickaxeItem;
import org.gsdistance.grimm.gmsb.item.ZincIngotItem;
import org.gsdistance.grimm.gmsb.item.ZincHoeItem;
import org.gsdistance.grimm.gmsb.item.ZincHammerItem;
import org.gsdistance.grimm.gmsb.item.ZincAxeItem;
import org.gsdistance.grimm.gmsb.item.ZincArmorItem;
import org.gsdistance.grimm.gmsb.item.WoodenHammerItem;
import org.gsdistance.grimm.gmsb.item.TinSwordItem;
import org.gsdistance.grimm.gmsb.item.TinSodaCanItem;
import org.gsdistance.grimm.gmsb.item.TinShovelItem;
import org.gsdistance.grimm.gmsb.item.TinPickaxeItem;
import org.gsdistance.grimm.gmsb.item.TinNuggetItem;
import org.gsdistance.grimm.gmsb.item.TinIngotItem;
import org.gsdistance.grimm.gmsb.item.TinHoeItem;
import org.gsdistance.grimm.gmsb.item.TinHammerItem;
import org.gsdistance.grimm.gmsb.item.TinCanItem;
import org.gsdistance.grimm.gmsb.item.TinCanFullItem;
import org.gsdistance.grimm.gmsb.item.TinAxeItem;
import org.gsdistance.grimm.gmsb.item.TinArmorItem;
import org.gsdistance.grimm.gmsb.item.Tier5ItemItem;
import org.gsdistance.grimm.gmsb.item.Tier4ItemItem;
import org.gsdistance.grimm.gmsb.item.Tier3ItemItem;
import org.gsdistance.grimm.gmsb.item.Tier2ItemItem;
import org.gsdistance.grimm.gmsb.item.Tier1ItemItem;
import org.gsdistance.grimm.gmsb.item.Tier0ItemItem;
import org.gsdistance.grimm.gmsb.item.TemperedSteelItem;
import org.gsdistance.grimm.gmsb.item.StoneStickItem;
import org.gsdistance.grimm.gmsb.item.StoneHammerItem;
import org.gsdistance.grimm.gmsb.item.SteelItem;
import org.gsdistance.grimm.gmsb.item.SteelHammerItem;
import org.gsdistance.grimm.gmsb.item.SteelDustItem;
import org.gsdistance.grimm.gmsb.item.PullTabItem;
import org.gsdistance.grimm.gmsb.item.NetheriteHammerItem;
import org.gsdistance.grimm.gmsb.item.MortarItem;
import org.gsdistance.grimm.gmsb.item.MortarAndPestleItem;
import org.gsdistance.grimm.gmsb.item.LogoItem;
import org.gsdistance.grimm.gmsb.item.LeThingItem;
import org.gsdistance.grimm.gmsb.item.IronHammerItem;
import org.gsdistance.grimm.gmsb.item.IronDustItem;
import org.gsdistance.grimm.gmsb.item.HotSteelItem;
import org.gsdistance.grimm.gmsb.item.GrimmiteNuggetItem;
import org.gsdistance.grimm.gmsb.item.GrimmiteIngotItem;
import org.gsdistance.grimm.gmsb.item.GrimmiteHammerItem;
import org.gsdistance.grimm.gmsb.item.GalvanizedSteelItem;
import org.gsdistance.grimm.gmsb.item.FloatingerItem;
import org.gsdistance.grimm.gmsb.item.DespawnWandItem;
import org.gsdistance.grimm.gmsb.item.CoalDustItem;
import org.gsdistance.grimm.gmsb.GmsbMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

public class GmsbModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(GmsbMod.MODID);
	public static final DeferredItem<Item> DUMMY_SPAWN_EGG = register("dummy_spawn_egg", properties -> new SpawnEggItem(GmsbModEntities.DUMMY.get(), properties));
	public static final DeferredItem<Item> LE_THING = register("le_thing", LeThingItem::new);
	public static final DeferredItem<Item> GRIMMITE_INGOT = register("grimmite_ingot", GrimmiteIngotItem::new);
	public static final DeferredItem<Item> GRIMMITE_ORE = block(GmsbModBlocks.GRIMMITE_ORE);
	public static final DeferredItem<Item> GRIMMITE_BLOCK = block(GmsbModBlocks.GRIMMITE_BLOCK);
	public static final DeferredItem<Item> MORTAR = register("mortar", MortarItem::new);
	public static final DeferredItem<Item> MORTAR_AND_PESTLE = register("mortar_and_pestle", MortarAndPestleItem::new);
	public static final DeferredItem<Item> STONE_STICK = register("stone_stick", StoneStickItem::new);
	public static final DeferredItem<Item> FLOATINGER = register("floatinger", FloatingerItem::new);
	public static final DeferredItem<Item> TIN_CAN = register("tin_can", TinCanItem::new);
	public static final DeferredItem<Item> TIN_SODA_CAN = register("tin_soda_can", TinSodaCanItem::new);
	public static final DeferredItem<Item> TIN_CAN_FULL = register("tin_can_full", TinCanFullItem::new);
	public static final DeferredItem<Item> PULL_TAB = register("pull_tab", PullTabItem::new);
	public static final DeferredItem<Item> TIN_INGOT = register("tin_ingot", TinIngotItem::new);
	public static final DeferredItem<Item> TIN_ORE = block(GmsbModBlocks.TIN_ORE);
	public static final DeferredItem<Item> TIN_BLOCK = block(GmsbModBlocks.TIN_BLOCK);
	public static final DeferredItem<Item> TIN_PICKAXE = register("tin_pickaxe", TinPickaxeItem::new);
	public static final DeferredItem<Item> TIN_AXE = register("tin_axe", TinAxeItem::new);
	public static final DeferredItem<Item> TIN_SWORD = register("tin_sword", TinSwordItem::new);
	public static final DeferredItem<Item> TIN_SHOVEL = register("tin_shovel", TinShovelItem::new);
	public static final DeferredItem<Item> TIN_HOE = register("tin_hoe", TinHoeItem::new);
	public static final DeferredItem<Item> TIN_ARMOR_HELMET = register("tin_armor_helmet", TinArmorItem.Helmet::new);
	public static final DeferredItem<Item> TIN_ARMOR_CHESTPLATE = register("tin_armor_chestplate", TinArmorItem.Chestplate::new);
	public static final DeferredItem<Item> TIN_ARMOR_LEGGINGS = register("tin_armor_leggings", TinArmorItem.Leggings::new);
	public static final DeferredItem<Item> TIN_ARMOR_BOOTS = register("tin_armor_boots", TinArmorItem.Boots::new);
	public static final DeferredItem<Item> LOGO = register("logo", LogoItem::new);
	public static final DeferredItem<Item> GRIMMITE_NUGGET = register("grimmite_nugget", GrimmiteNuggetItem::new);
	public static final DeferredItem<Item> TIN_NUGGET = register("tin_nugget", TinNuggetItem::new);
	public static final DeferredItem<Item> COAL_DUST = register("coal_dust", CoalDustItem::new);
	public static final DeferredItem<Item> IRON_DUST = register("iron_dust", IronDustItem::new);
	public static final DeferredItem<Item> ZINC_INGOT = register("zinc_ingot", ZincIngotItem::new);
	public static final DeferredItem<Item> ZINC_ORE = block(GmsbModBlocks.ZINC_ORE);
	public static final DeferredItem<Item> ZINC_BLOCK = block(GmsbModBlocks.ZINC_BLOCK);
	public static final DeferredItem<Item> ZINC_PICKAXE = register("zinc_pickaxe", ZincPickaxeItem::new);
	public static final DeferredItem<Item> ZINC_AXE = register("zinc_axe", ZincAxeItem::new);
	public static final DeferredItem<Item> ZINC_SWORD = register("zinc_sword", ZincSwordItem::new);
	public static final DeferredItem<Item> ZINC_SHOVEL = register("zinc_shovel", ZincShovelItem::new);
	public static final DeferredItem<Item> ZINC_HOE = register("zinc_hoe", ZincHoeItem::new);
	public static final DeferredItem<Item> ZINC_ARMOR_HELMET = register("zinc_armor_helmet", ZincArmorItem.Helmet::new);
	public static final DeferredItem<Item> ZINC_ARMOR_CHESTPLATE = register("zinc_armor_chestplate", ZincArmorItem.Chestplate::new);
	public static final DeferredItem<Item> ZINC_ARMOR_LEGGINGS = register("zinc_armor_leggings", ZincArmorItem.Leggings::new);
	public static final DeferredItem<Item> ZINC_ARMOR_BOOTS = register("zinc_armor_boots", ZincArmorItem.Boots::new);
	public static final DeferredItem<Item> DESPAWN_WAND = register("despawn_wand", DespawnWandItem::new);
	public static final DeferredItem<Item> STEEL_DUST = register("steel_dust", SteelDustItem::new);
	public static final DeferredItem<Item> IRON_HAMMER = register("iron_hammer", IronHammerItem::new);
	public static final DeferredItem<Item> TIN_HAMMER = register("tin_hammer", TinHammerItem::new);
	public static final DeferredItem<Item> ZINC_HAMMER = register("zinc_hammer", ZincHammerItem::new);
	public static final DeferredItem<Item> NETHERITE_HAMMER = register("netherite_hammer", NetheriteHammerItem::new);
	public static final DeferredItem<Item> WOODEN_HAMMER = register("wooden_hammer", WoodenHammerItem::new);
	public static final DeferredItem<Item> STONE_HAMMER = register("stone_hammer", StoneHammerItem::new);
	public static final DeferredItem<Item> STEEL_HAMMER = register("steel_hammer", SteelHammerItem::new);
	public static final DeferredItem<Item> GRIMMITE_HAMMER = register("grimmite_hammer", GrimmiteHammerItem::new);
	public static final DeferredItem<Item> TIER_0_ITEM = register("tier_0_item", Tier0ItemItem::new);
	public static final DeferredItem<Item> TIER_1_ITEM = register("tier_1_item", Tier1ItemItem::new);
	public static final DeferredItem<Item> TIER_2_ITEM = register("tier_2_item", Tier2ItemItem::new);
	public static final DeferredItem<Item> TIER_3_ITEM = register("tier_3_item", Tier3ItemItem::new);
	public static final DeferredItem<Item> TIER_4_ITEM = register("tier_4_item", Tier4ItemItem::new);
	public static final DeferredItem<Item> TIER_5_ITEM = register("tier_5_item", Tier5ItemItem::new);
	public static final DeferredItem<Item> STEEL = register("steel", SteelItem::new);
	public static final DeferredItem<Item> TEMPERED_STEEL = register("tempered_steel", TemperedSteelItem::new);
	public static final DeferredItem<Item> GALVANIZED_STEEL = register("galvanized_steel", GalvanizedSteelItem::new);
	public static final DeferredItem<Item> HOT_STEEL = register("hot_steel", HotSteelItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}