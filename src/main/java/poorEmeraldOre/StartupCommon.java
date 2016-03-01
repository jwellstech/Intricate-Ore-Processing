package poorEmeraldOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static PoorEmeraldOre blockPoorEmeraldOre;
	
	
	
	public static void preInitCommon() {
		
		blockPoorEmeraldOre = (PoorEmeraldOre)(new PoorEmeraldOre().setUnlocalizedName("poorEmeraldOre"));
		GameRegistry.registerBlock(blockPoorEmeraldOre, "poorEmeraldOre");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
