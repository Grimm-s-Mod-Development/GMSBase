/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.grimm.gmsb.init;

import org.gsdistance.grimm.gmsb.client.renderer.DummyRenderer;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GmsbModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GmsbModEntities.DUMMY.get(), DummyRenderer::new);
	}
}