package org.gsdistance.grimm.gmsb.item;

import org.gsdistance.grimm.gmsb.init.GmsbModItems;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.component.UseRemainder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.core.component.DataComponents;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class TinCanFullItem extends Item {
	public TinCanFullItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(3.5f).alwaysEdible().build()));
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		event.modify(GmsbModItems.TIN_CAN_FULL.get(), builder -> builder.set(DataComponents.USE_REMAINDER, new UseRemainder(new ItemStack(GmsbModItems.PULL_TAB.get()))));
	}
}