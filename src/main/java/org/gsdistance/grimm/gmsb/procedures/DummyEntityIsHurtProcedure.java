package org.gsdistance.grimm.gmsb.procedures;

import org.gsdistance.grimm.gmsb.GmsbMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class DummyEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		GmsbMod.queueServerWork(1, () -> {
			if (sourceentity instanceof Player) {
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("DMG:" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) - (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)))), true);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
		});
	}
}