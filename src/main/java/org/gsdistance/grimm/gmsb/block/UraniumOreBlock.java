package org.gsdistance.grimm.gmsb.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class UraniumOreBlock extends Block {
	public UraniumOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(9f, 12.0411234264f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}