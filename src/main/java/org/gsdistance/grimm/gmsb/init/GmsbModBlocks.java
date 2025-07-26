/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.grimm.gmsb.init;

import org.gsdistance.grimm.gmsb.block.ZincOreBlock;
import org.gsdistance.grimm.gmsb.block.ZincBlockBlock;
import org.gsdistance.grimm.gmsb.block.UraniumOreBlock;
import org.gsdistance.grimm.gmsb.block.UraniumBlockBlock;
import org.gsdistance.grimm.gmsb.block.TungstenOreBlock;
import org.gsdistance.grimm.gmsb.block.TungstenBlockBlock;
import org.gsdistance.grimm.gmsb.block.TinOreBlock;
import org.gsdistance.grimm.gmsb.block.TinBlockBlock;
import org.gsdistance.grimm.gmsb.block.ThoriumOreBlock;
import org.gsdistance.grimm.gmsb.block.ThoriumBlockBlock;
import org.gsdistance.grimm.gmsb.block.GrimmiteOreBlock;
import org.gsdistance.grimm.gmsb.block.GrimmiteBlockBlock;
import org.gsdistance.grimm.gmsb.GmsbMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public class GmsbModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(GmsbMod.MODID);
	public static final DeferredBlock<Block> GRIMMITE_ORE = register("grimmite_ore", GrimmiteOreBlock::new);
	public static final DeferredBlock<Block> GRIMMITE_BLOCK = register("grimmite_block", GrimmiteBlockBlock::new);
	public static final DeferredBlock<Block> TIN_ORE = register("tin_ore", TinOreBlock::new);
	public static final DeferredBlock<Block> TIN_BLOCK = register("tin_block", TinBlockBlock::new);
	public static final DeferredBlock<Block> ZINC_ORE = register("zinc_ore", ZincOreBlock::new);
	public static final DeferredBlock<Block> ZINC_BLOCK = register("zinc_block", ZincBlockBlock::new);
	public static final DeferredBlock<Block> TUNGSTEN_ORE = register("tungsten_ore", TungstenOreBlock::new);
	public static final DeferredBlock<Block> TUNGSTEN_BLOCK = register("tungsten_block", TungstenBlockBlock::new);
	public static final DeferredBlock<Block> THORIUM_ORE = register("thorium_ore", ThoriumOreBlock::new);
	public static final DeferredBlock<Block> THORIUM_BLOCK = register("thorium_block", ThoriumBlockBlock::new);
	public static final DeferredBlock<Block> URANIUM_ORE = register("uranium_ore", UraniumOreBlock::new);
	public static final DeferredBlock<Block> URANIUM_BLOCK = register("uranium_block", UraniumBlockBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}