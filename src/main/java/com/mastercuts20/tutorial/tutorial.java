package com.mastercuts20.tutorial;

import com.mastercuts20.tutorial.init.ModBlocks;
import com.mastercuts20.tutorial.init.ModItems;
import com.mastercuts20.tutorial.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.MOD_ID, name = reference.NAME, version = reference.VERSION, acceptedMinecraftVersions = reference.ACCEPTED_VERSIONS)
public class tutorial {
	
	//tutorial Instance for main class
	@Instance
	public static tutorial instence;
	
	//proxy side organizer
	@SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	//Creative tabs maker
	public static final CreativeTabs CREATIVE_TAB = new TutorialTab(null);
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(); // Initialize proxy init
	}

	//preInit init and postInit sayings
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init(); // Initialize init for items
		ModItems.register(); // Initialize register for items
		
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
