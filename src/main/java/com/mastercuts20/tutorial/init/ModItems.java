package com.mastercuts20.tutorial.init;

import com.mastercuts20.tutorial.reference;
import com.mastercuts20.tutorial.items.ItemBerryPie;
import com.mastercuts20.tutorial.items.ItemCheese;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item berrypie;
	
	public static Item cheese;
	
	public static void init() {
		cheese = new ItemCheese();
		berrypie = new ItemBerryPie();
	}
	
	public static void register() {
		GameRegistry.register(cheese);
		
		GameRegistry.register(berrypie);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
		registerRender(berrypie);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
