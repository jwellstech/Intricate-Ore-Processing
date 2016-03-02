package limestone;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static Limestone blockLimestone;
	
	
	
	public static void preInitCommon() {
		
		blockLimestone = (Limestone)(new Limestone().setUnlocalizedName("limestone"));
		GameRegistry.registerBlock(blockLimestone, "limestone");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
