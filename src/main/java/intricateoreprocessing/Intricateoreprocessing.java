package intricateoreprocessing;

//import basicCrusher.TileEntityBasicCrusher;
//import basicCrusher.BasicCrusher;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Intricateoreprocessing.MODID, version = Intricateoreprocessing.VERSION)
public class Intricateoreprocessing {

		
		@Instance(Intricateoreprocessing.MODID)
		public static Intricateoreprocessing instance;
	
		public static final String MODID = "intricateoreprocessing";
		public static final String VERSION = "1.8.9a";
	
		
	
		@SidedProxy(clientSide="intricateoreprocessing.ClientOnlyProxy", serverSide="intricateoreprocessing.DedicateServerProxy")
		public static CommonProxy proxy;
	
		
		
		
		public enum GUI_ENUM 
		{
		    BasicCrusher
		}
	
		@EventHandler
		public static void preInit(FMLPreInitializationEvent event)
		{
			proxy.preInit();
//			GameRegistry.registerTileEntity(TileEntityBasicCrusher.class, "tileEntityBasicCrusher");
			GameRegistry.registerWorldGenerator(new WorldGenerator(), 0);
		}
		@EventHandler
		public static void Init(FMLInitializationEvent event)
		{
//			NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

			proxy.init();
		}
		@EventHandler
		public static void postInit(FMLPostInitializationEvent event)
		{
			proxy.postInit();
		}
		
		public static String prependModID(String name) {return MODID + ":" + name;}
		
		
}
