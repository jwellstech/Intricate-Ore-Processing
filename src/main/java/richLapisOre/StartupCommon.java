package richLapisOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static RichLapisOre blockRichLapisOre;
	
	
	
	public static void preInitCommon() {
		
		blockRichLapisOre = (RichLapisOre)(new RichLapisOre().setUnlocalizedName("richLapisOre"));
		GameRegistry.registerBlock(blockRichLapisOre, "richLapisOre");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
