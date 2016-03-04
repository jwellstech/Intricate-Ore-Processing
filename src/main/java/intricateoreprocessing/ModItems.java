package intricateoreprocessing;

import copperItems.Amalgam;
import copperItems.AppleSeed;
import copperItems.BeefStew;
import copperItems.Calcine;
import copperItems.Chalcopyrite;
import copperItems.CommonMedicinalHerb;
import copperItems.CopperIngot;
import copperItems.CopperMatte;
import copperItems.Cyanide;
import copperItems.DiamondCuttingTool;
import copperItems.EpicMedicinalHerb;
import copperItems.GroundCopper;
import copperItems.GroundGold;
import copperItems.GroundIron;
import copperItems.Hammer;
import copperItems.IronLump;
import copperItems.IronSlag;
import copperItems.Kush;
import copperItems.LegendaryMedicinalHerb;
import copperItems.LimestoneShard;
import copperItems.ParrafinOil;
import copperItems.RareMedicinalHerb;
import copperItems.RoughDiamond;
import copperItems.Sandpaper;
import copperItems.UncommonMedicinalHerb;
import copperItems.UncutDiamond;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item calcine;
	public static Item limestoneShard;
	public static Item chalcopyrite;
	public static Item groundCopper;
	public static Item groundGold;
	public static Item copperIngot;
	public static Item copperMatte;
	public static Item groundIron;
	public static Item ironLump;
	public static Item ironSlag;
	public static Item sandpaper;
	public static Item roughDiamond;
	public static Item uncutDiamond;
	public static Item hammer;
	public static Item amalgam;
	public static Item appleSeed;
	public static Item cyanide;
	public static Item diamondCuttingTool;
	public static Item parrafinOil;
	public static Item beefStew;
	public static Item commonMedicinalHerb;
	public static Item uncommonMedicinalHerb;
	public static Item rareMedicinalHerb;
	public static Item epicMedicinalHerb;
	public static Item legendaryMedicinalHerb;
	public static Item kush;
	
	public static void createItems() {
		GameRegistry.registerItem(calcine = new Calcine("calcine"), "calcine");
		GameRegistry.registerItem(limestoneShard = new LimestoneShard("limestoneShard"), "limestoneShard");
		GameRegistry.registerItem(chalcopyrite = new Chalcopyrite("chalcopyrite"), "chalcopyrite");
		GameRegistry.registerItem(groundCopper = new GroundCopper("groundCopper"), "groundCopper");
		GameRegistry.registerItem(groundGold = new GroundGold("groundGold"), "groundGold");
		GameRegistry.registerItem(copperIngot = new CopperIngot("copperIngot"), "copperIngot");
		GameRegistry.registerItem(copperMatte = new CopperMatte("copperMatte"), "copperMatte");
		GameRegistry.registerItem(groundIron = new GroundIron("groundIron"), "groundIron");
		GameRegistry.registerItem(sandpaper = new Sandpaper("sandpaper"), "sandpaper");
		GameRegistry.registerItem(ironLump = new IronLump("ironLump"), "ironLump");
		GameRegistry.registerItem(roughDiamond = new RoughDiamond("roughDiamond"), "roughDiamond");
		GameRegistry.registerItem(uncutDiamond = new UncutDiamond("uncutDiamond"), "uncutDiamond");
		GameRegistry.registerItem(ironSlag = new IronSlag("ironSlag"), "ironSlag");
		GameRegistry.registerItem(hammer = new Hammer("hammer"), "hammer");
		GameRegistry.registerItem(amalgam = new Amalgam("amalgam"), "amalgam");
		GameRegistry.registerItem(appleSeed = new AppleSeed("appleSeed"), "appleSeed");
		GameRegistry.registerItem(cyanide = new Cyanide("cyanide"), "cyanide");
		GameRegistry.registerItem(diamondCuttingTool = new DiamondCuttingTool("diamondCuttingTool"), "diamondCuttingTool");
		GameRegistry.registerItem(parrafinOil = new ParrafinOil("parrafinOil"), "parrafinOil");

		//Food Items																				.setAlwaysEdible() would go here.
		GameRegistry.registerItem(beefStew = new BeefStew("beefStew", 12, 1.5f, false).setPotionEffect(Potion.regeneration.id, 8, 0, 0.40F).setPotionEffect(Potion.regeneration.id, 15, 0, 0.30F).setPotionEffect(Potion.regeneration.id, (int) 7.5, 1, 0.20F).setPotionEffect(Potion.regeneration.id, 4, 2, 0.10F), "beefStew");
				// EX .addPotionEffect(new PotionEffect(Potion.<potion>.id, ticks, amplifier, chanceF))
	
		GameRegistry.registerItem(commonMedicinalHerb = new CommonMedicinalHerb("commonMedicinalHerb"), "commonMedicinalHerb");
		GameRegistry.registerItem(uncommonMedicinalHerb = new UncommonMedicinalHerb("uncommonMedicinalHerb"), "uncommonMedicinalHerb");
		GameRegistry.registerItem(rareMedicinalHerb = new RareMedicinalHerb("rareMedicinalHerb"), "rareMedicinalHerb");
		GameRegistry.registerItem(epicMedicinalHerb = new EpicMedicinalHerb("epicMedicinalHerb"), "epicMedicinalHerb");
		GameRegistry.registerItem(legendaryMedicinalHerb = new LegendaryMedicinalHerb("legendaryMedicinalHerb"), "legendaryMedicinalHerb");
		GameRegistry.registerItem(kush = new Kush("kush"), "kush");
	}

}
