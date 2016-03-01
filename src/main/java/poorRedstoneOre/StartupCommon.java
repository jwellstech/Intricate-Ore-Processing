package poorRedstoneOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static PoorRedstoneOre blockPoorRedstoneOre;
	
	
	
	public static void preInitCommon() {
		
		blockPoorRedstoneOre = (PoorRedstoneOre)(new PoorRedstoneOre().setUnlocalizedName("poorRedstoneOre"));
		GameRegistry.registerBlock(blockPoorRedstoneOre, "poorRedstoneOre");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
