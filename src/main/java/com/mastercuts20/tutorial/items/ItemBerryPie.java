package com.mastercuts20.tutorial.items;

import com.mastercuts20.tutorial.reference;
import com.mastercuts20.tutorial.tutorial;

import net.minecraft.item.Item;

public class ItemBerryPie extends Item {
	
	public ItemBerryPie() {
	setUnlocalizedName(reference.TutorialItems.BERRYPIE.getUnlocalizedName());
	setRegistryName(reference.TutorialItems.BERRYPIE.getRegistryName());
	setCreativeTab(tutorial.CREATIVE_TAB);
 }
}
