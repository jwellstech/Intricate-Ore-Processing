package poorLapisOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static PoorLapisOre blockPoorLapisOre;
	
	
	
	public static void preInitCommon() {
		
		blockPoorLapisOre = (PoorLapisOre)(new PoorLapisOre().setUnlocalizedName("poorLapisOre"));
		GameRegistry.registerBlock(blockPoorLapisOre, "poorLapisOre");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
