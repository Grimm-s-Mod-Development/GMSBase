package org.gsdistance.grimm.gmsb.procedures;

import org.gsdistance.grimm.gmsb.GmsbMod;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import javax.annotation.Nullable;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class StartupEventProcedure {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		GmsbMod.LOGGER.info("Grimm's Mod Base Loaded!");
	}
}