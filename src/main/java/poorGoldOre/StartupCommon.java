package poorGoldOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static PoorGoldOre blockPoorGoldOre;
	
	
	
	public static void preInitCommon() {
		
		blockPoorGoldOre = (PoorGoldOre)(new PoorGoldOre().setUnlocalizedName("poorGoldOre"));
		GameRegistry.registerBlock(blockPoorGoldOre, "poorGoldOre");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
