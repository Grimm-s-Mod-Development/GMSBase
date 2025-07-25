package org.gsdistance.grimm.gmsb.item;

import org.gsdistance.grimm.gmsb.init.GmsbModItems;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import java.util.Map;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class TinArmorItem extends ArmorItem {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(11, Map.of(ArmorType.BOOTS, 1, ArmorType.LEGGINGS, 4, ArmorType.CHESTPLATE, 4, ArmorType.HELMET, 1, ArmorType.BODY, 4), 6,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 0f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("gmsb:tin_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("gmsb:tin_armor")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("gmsb:textures/models/armor/tin_layer_1.png");
			}
		}, GmsbModItems.TIN_ARMOR_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("gmsb:textures/models/armor/tin_layer_1.png");
			}
		}, GmsbModItems.TIN_ARMOR_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("gmsb:textures/models/armor/tin_layer_2.png");
			}
		}, GmsbModItems.TIN_ARMOR_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("gmsb:textures/models/armor/tin_layer_1.png");
			}
		}, GmsbModItems.TIN_ARMOR_BOOTS.get());
	}

	private TinArmorItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends TinArmorItem {
		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties);
		}
	}

	public static class Chestplate extends TinArmorItem {
		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties);
		}
	}

	public static class Leggings extends TinArmorItem {
		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties);
		}
	}

	public static class Boots extends TinArmorItem {
		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties);
		}
	}
}