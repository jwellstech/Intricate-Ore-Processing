package richDiamondOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static RichDiamondOre blockRichDiamondOre;
	
	
	
	public static void preInitCommon() {
		
		blockRichDiamondOre = (RichDiamondOre)(new RichDiamondOre().setUnlocalizedName("richDiamondOre"));
		GameRegistry.registerBlock(blockRichDiamondOre, "richDiamondOre");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
