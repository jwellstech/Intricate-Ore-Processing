package richCoalOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static RichCoalOre blockRichCoalOre;
	
	
	
	public static void preInitCommon() {
		
		blockRichCoalOre = (RichCoalOre)(new RichCoalOre().setUnlocalizedName("richCoalOre"));
		GameRegistry.registerBlock(blockRichCoalOre, "richCoalOre");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
