package richGoldOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static RichGoldOre blockRichGoldOre;
	
	
	
	public static void preInitCommon() {
		
		blockRichGoldOre = (RichGoldOre)(new RichGoldOre().setUnlocalizedName("richGoldOre"));
		GameRegistry.registerBlock(blockRichGoldOre, "richGoldOre");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
