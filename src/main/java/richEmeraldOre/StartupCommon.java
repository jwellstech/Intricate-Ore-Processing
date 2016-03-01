package richEmeraldOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {

	public static RichEmeraldOre blockRichEmeraldOre;
	
	
	
	public static void preInitCommon() {
		
		blockRichEmeraldOre = (RichEmeraldOre)(new RichEmeraldOre().setUnlocalizedName("richEmeraldOre"));
		GameRegistry.registerBlock(blockRichEmeraldOre, "richEmeraldOre");
		
		
	}
	
	
	public static void initCommon() {
		
	}
	
	public static void postInitCommon() {
		
	}
	
	
	
	
	
	
}
