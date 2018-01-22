package com.mastercuts20.tutorial.init;


//import com.mastercuts20.tutorial.blocks.BlockCheese;
import com.mastercuts20.tutorial.blocks.BlockKettle;
import com.mastercuts20.tutorial.items.ItemBerryPie;
import com.mastercuts20.tutorial.items.ItemCheese;
import com.sun.org.glassfish.gmbal.GmbalException;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	//public static Block cheese;
	public static Block kettle;
	
	public static void init() {
		//cheese = new BlockCheese();
		
		kettle = new BlockKettle();
	}
	
	public static void register() {
		// registerBlock(cheese);
		registerBlock(kettle);
	};
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		//registerRender(cheese);
		registerRender(kettle);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
