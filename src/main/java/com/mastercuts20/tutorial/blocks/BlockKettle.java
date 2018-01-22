package com.mastercuts20.tutorial.blocks;

import com.mastercuts20.tutorial.reference;
import com.mastercuts20.tutorial.tutorial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockKettle extends Block{
	
	//private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(x1, y1, z1, x2, y2, z2)

	public BlockKettle() {
		super(Material.GLASS);
		setUnlocalizedName(reference.TutorialBlocks.KETTLE.getUnlocalizedName());
		setRegistryName(reference.TutorialBlocks.KETTLE.getRegistryName());
		setCreativeTab(tutorial.CREATIVE_TAB);
	
	}
	
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	//@Override
	//public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
	//	return super.getBoundingBox(state, source, pos);
	//}
		
}

	


