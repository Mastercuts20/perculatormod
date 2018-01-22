package com.mastercuts20.tutorial;

import com.mastercuts20.tutorial.init.ModBlocks;
import com.mastercuts20.tutorial.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TutorialTab extends CreativeTabs{

	public TutorialTab(String label) {
		super("Fooditems/blocks");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.cheese;
	}


}
