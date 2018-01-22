package com.mastercuts20.tutorial.items;

import com.mastercuts20.tutorial.reference;
import com.mastercuts20.tutorial.tutorial;
import com.sun.org.apache.xml.internal.security.encryption.Reference;

import net.minecraft.item.Item;

public class ItemCheese extends Item {
 
	public ItemCheese() {
		setUnlocalizedName(reference.TutorialItems.CHEESE.getUnlocalizedName());
		setRegistryName(reference.TutorialItems.CHEESE.getRegistryName());
		setCreativeTab(tutorial.CREATIVE_TAB);
	}
}
