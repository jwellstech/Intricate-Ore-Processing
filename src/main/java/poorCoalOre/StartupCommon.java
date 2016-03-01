package poorCoalOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static PoorCoalOre blockPoorCoalOre;
	
	
	
	public static void preInitCommon() {
		
		blockPoorCoalOre = (PoorCoalOre)(new PoorCoalOre().setUnlocalizedName("poorCoalOre"));
		GameRegistry.registerBlock(blockPoorCoalOre, "poorCoalOre");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
