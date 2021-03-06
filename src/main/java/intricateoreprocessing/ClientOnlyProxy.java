package intricateoreprocessing;

public class ClientOnlyProxy extends CommonProxy{

	public void preInit(){
		
		super.preInit();
		
		poorDiamondOre.StartupClientOnly.preInitClientOnly();
		poorCoalOre.StartupClientOnly.preInitClientOnly();
		poorEmeraldOre.StartupClientOnly.preInitClientOnly();
		poorGoldOre.StartupClientOnly.preInitClientOnly();
		poorIronOre.StartupClientOnly.preInitClientOnly();
		poorLapisOre.StartupClientOnly.preInitClientOnly();
		poorRedstoneOre.StartupClientOnly.preInitClientOnly();
		richDiamondOre.StartupClientOnly.preInitClientOnly();
		richCoalOre.StartupClientOnly.preInitClientOnly();
		richEmeraldOre.StartupClientOnly.preInitClientOnly();
		richIronOre.StartupClientOnly.preInitClientOnly();
		richLapisOre.StartupClientOnly.preInitClientOnly();
		richGoldOre.StartupClientOnly.preInitClientOnly();
		richRedstoneOre.StartupClientOnly.preInitClientOnly();
		limestone.StartupClientOnly.preInitClientOnly();
		mountainLily.StartupClientOnly.preInitClientOnly();
	}
	
	
	public void init() {
		
		super.init();
		
	    ItemRenderRegister.registerItemRenderer();
		
		poorDiamondOre.StartupClientOnly.initClientOnly();
		poorCoalOre.StartupClientOnly.initClientOnly();
		poorEmeraldOre.StartupClientOnly.initClientOnly();
		poorGoldOre.StartupClientOnly.initClientOnly();
		poorIronOre.StartupClientOnly.initClientOnly();
		poorLapisOre.StartupClientOnly.initClientOnly();
		poorRedstoneOre.StartupClientOnly.initClientOnly();
		richDiamondOre.StartupClientOnly.initClientOnly();
		richCoalOre.StartupClientOnly.initClientOnly();
		richEmeraldOre.StartupClientOnly.initClientOnly();
		richIronOre.StartupClientOnly.initClientOnly();
		richLapisOre.StartupClientOnly.initClientOnly();
		richGoldOre.StartupClientOnly.initClientOnly();
		richRedstoneOre.StartupClientOnly.initClientOnly();
		limestone.StartupClientOnly.initClientOnly();
		mountainLily.StartupClientOnly.initClientOnly();
	}
	
	public void postInit() {
		
		super.postInit();
		poorDiamondOre.StartupClientOnly.postInitClientOnly();
		poorCoalOre.StartupClientOnly.postInitClientOnly();
		poorEmeraldOre.StartupClientOnly.postInitClientOnly();
		poorGoldOre.StartupClientOnly.postInitClientOnly();
		poorIronOre.StartupClientOnly.postInitClientOnly();
		poorLapisOre.StartupClientOnly.postInitClientOnly();
		poorRedstoneOre.StartupClientOnly.postInitClientOnly();
		richDiamondOre.StartupClientOnly.postInitClientOnly();
		richCoalOre.StartupClientOnly.postInitClientOnly();
		richEmeraldOre.StartupClientOnly.postInitClientOnly();
		richIronOre.StartupClientOnly.postInitClientOnly();
		richLapisOre.StartupClientOnly.postInitClientOnly();
		richGoldOre.StartupClientOnly.postInitClientOnly();
		richRedstoneOre.StartupClientOnly.postInitClientOnly();
		limestone.StartupClientOnly.postInitClientOnly();
		mountainLily.StartupClientOnly.postInitClientOnly();
	}
	
	
	
}