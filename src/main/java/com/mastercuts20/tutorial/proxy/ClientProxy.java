package com.mastercuts20.tutorial.proxy;

import com.mastercuts20.tutorial.init.ModBlocks;
import com.mastercuts20.tutorial.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
}
