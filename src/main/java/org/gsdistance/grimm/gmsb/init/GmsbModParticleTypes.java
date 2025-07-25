/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.grimm.gmsb.init;

import org.gsdistance.grimm.gmsb.GmsbMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class GmsbModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, GmsbMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> ERROR_CIRCLE = REGISTRY.register("error_circle", () -> new SimpleParticleType(true));
}