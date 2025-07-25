package org.gsdistance.grimm.gmsb.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class TinOreBlock extends Block {
	public TinOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(2.1f, 3.7587932333f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}