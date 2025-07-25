/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.grimm.gmsb.init;

import org.gsdistance.grimm.gmsb.client.particle.ErrorCircleParticle;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GmsbModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(GmsbModParticleTypes.ERROR_CIRCLE.get(), ErrorCircleParticle::provider);
	}
}