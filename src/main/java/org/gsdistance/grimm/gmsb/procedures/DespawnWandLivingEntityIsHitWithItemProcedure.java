package org.gsdistance.grimm.gmsb.procedures;

import net.minecraft.world.entity.Entity;

public class DespawnWandLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}