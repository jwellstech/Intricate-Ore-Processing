package poorDiamondOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static PoorDiamondOre blockPoorDiamondOre;
	
	
	
	public static void preInitCommon() {
		
		blockPoorDiamondOre = (PoorDiamondOre)(new PoorDiamondOre().setUnlocalizedName("poorDiamondOre"));
		GameRegistry.registerBlock(blockPoorDiamondOre, "poorDiamondOre");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
