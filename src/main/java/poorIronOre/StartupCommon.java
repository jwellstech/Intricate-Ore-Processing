package poorIronOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static PoorIronOre blockPoorIronOre;
	
	
	
	public static void preInitCommon() {
		
		blockPoorIronOre = (PoorIronOre)(new PoorIronOre().setUnlocalizedName("poorIronOre"));
		GameRegistry.registerBlock(blockPoorIronOre, "poorIronOre");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
