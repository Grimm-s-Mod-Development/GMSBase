package org.gsdistance.grimm.gmsb.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class GrimmiteOreBlock extends Block {
	public GrimmiteOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(30f, 31.547867224f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}