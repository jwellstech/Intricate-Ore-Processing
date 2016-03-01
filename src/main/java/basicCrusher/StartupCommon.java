package basicCrusher;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static BasicCrusher blockBasicCrusher;
	public static BasicCrusher blockBasicCrusherLit;
	
	
	
	public static void preInitCommon() {
		
		blockBasicCrusher = (BasicCrusher)(new BasicCrusher(false).setUnlocalizedName("basicCrusher"));
		GameRegistry.registerBlock(blockBasicCrusher, "basicCrusher");
		
		blockBasicCrusherLit = (BasicCrusher)(new BasicCrusher(false).setUnlocalizedName("basicCrusherLit"));
		GameRegistry.registerBlock(blockBasicCrusherLit, "basicCrusherLit");
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
