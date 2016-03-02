package intricateoreprocessing;

import net.minecraftforge.fml.common.network.NetworkRegistry;

public abstract class CommonProxy {

	public void preInit() {
		ModItems.createItems();
		poorDiamondOre.StartupCommon.preInitCommon();
		poorCoalOre.StartupCommon.preInitCommon();
		poorEmeraldOre.StartupCommon.preInitCommon();
		poorGoldOre.StartupCommon.preInitCommon();
		poorIronOre.StartupCommon.preInitCommon();
		poorLapisOre.StartupCommon.preInitCommon();
		poorRedstoneOre.StartupCommon.preInitCommon();
		richDiamondOre.StartupCommon.preInitCommon();
		richCoalOre.StartupCommon.preInitCommon();
		richEmeraldOre.StartupCommon.preInitCommon();
		richIronOre.StartupCommon.preInitCommon();
		richLapisOre.StartupCommon.preInitCommon();
		richGoldOre.StartupCommon.preInitCommon();
		richRedstoneOre.StartupCommon.preInitCommon();
	}	
	
	public void init() {
		
		poorDiamondOre.StartupCommon.initCommon();
		poorCoalOre.StartupCommon.initCommon();
		poorEmeraldOre.StartupCommon.initCommon();
		poorGoldOre.StartupCommon.initCommon();
		poorIronOre.StartupCommon.initCommon();
		poorLapisOre.StartupCommon.initCommon();
		poorRedstoneOre.StartupCommon.initCommon();
		richDiamondOre.StartupCommon.initCommon();
		richCoalOre.StartupCommon.initCommon();
		richEmeraldOre.StartupCommon.initCommon();
		richIronOre.StartupCommon.initCommon();
		richLapisOre.StartupCommon.initCommon();
		richGoldOre.StartupCommon.initCommon();
		richRedstoneOre.StartupCommon.initCommon();
		
	}
	
	public void postInit() {
		poorDiamondOre.StartupCommon.postInitCommon();
		poorCoalOre.StartupCommon.postInitCommon();
		poorEmeraldOre.StartupCommon.postInitCommon();
		poorGoldOre.StartupCommon.postInitCommon();
		poorIronOre.StartupCommon.postInitCommon();
		poorLapisOre.StartupCommon.postInitCommon();
		poorRedstoneOre.StartupCommon.postInitCommon();
		richDiamondOre.StartupCommon.postInitCommon();
		richCoalOre.StartupCommon.postInitCommon();
		richIronOre.StartupCommon.postInitCommon();
		richLapisOre.StartupCommon.postInitCommon();
		richEmeraldOre.StartupCommon.postInitCommon();
		richGoldOre.StartupCommon.postInitCommon();
		richRedstoneOre.StartupCommon.postInitCommon();
	}
}
