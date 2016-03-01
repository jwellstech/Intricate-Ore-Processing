package basicCrusher;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static BasicCrusher blockBasicCrusher;
	
	
	
	public static void preInitCommon() {
		
		blockBasicCrusher = (BasicCrusher)(new BasicCrusher().setUnlocalizedName("basicCrusher"));
		GameRegistry.registerBlock(blockBasicCrusher, "basicCrusher");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
