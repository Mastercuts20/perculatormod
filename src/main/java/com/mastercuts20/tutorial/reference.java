package com.mastercuts20.tutorial;

public class reference {
	
	public static final String MOD_ID = "mtm";
	public static final String NAME = "Mastercuts20's Tutorial Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.9.4]";
	
	public static final String CLIENT_PROXY_CLASS = "com.mastercuts20.tutorial.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.mastercuts20.tutorial.proxy.ServerProxy";
	
	public static enum TutorialItems {
		CHEESE("cheese", "ItemCheese"),
		
		BERRYPIE("berrypie", "ItemBerryPie");
		
		private String unlocalizedName;
		private String registryName;
		
		private TutorialItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
	
	public static enum TutorialBlocks {
		KETTLE("kettle", "BlockKettle"); 
		
	
		private String unlocalizedName;
		private String registryName;
	
		
		private TutorialBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}
