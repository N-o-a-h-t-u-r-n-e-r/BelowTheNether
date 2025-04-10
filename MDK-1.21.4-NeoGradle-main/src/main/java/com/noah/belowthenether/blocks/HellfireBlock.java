package com.noah.belowthenether.blocks;

import com.mojang.serialization.MapCodec;
import com.noah.belowthenether.Main;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.state.BlockState;

public class HellfireBlock extends BaseFireBlock{
	public static final MapCodec<HellfireBlock> CODEC = simpleCodec(HellfireBlock::new);

	public HellfireBlock(Properties props) {
		super(props, 5.0f);
		
	}

	@Override
	protected MapCodec<HellfireBlock> codec() {
		
		return CODEC;
	}

	@Override
	protected boolean canBurn(BlockState state) {
	
		return true;
	}

	
	@Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return Main.HELLFIRE_BLOCK.get().defaultBlockState();
    }
	

}
