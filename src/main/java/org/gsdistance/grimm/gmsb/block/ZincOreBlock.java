package org.gsdistance.grimm.gmsb.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class ZincOreBlock extends Block {
	public ZincOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(2.7f, 4.5958305942f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}