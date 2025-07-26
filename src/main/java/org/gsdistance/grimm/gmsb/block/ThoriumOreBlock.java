package org.gsdistance.grimm.gmsb.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class ThoriumOreBlock extends Block {
	public ThoriumOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(13.5f, 16.6548227619f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}