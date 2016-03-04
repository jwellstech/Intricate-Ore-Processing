package init;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import intricateoreprocessing.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModRecipes {
	public static void RegisterRecipes() {
		addCraftingRecipes();
		addSmeltingRecipes();
	}
	private static void addCraftingRecipes() {
		//COPPER PROCESS
//		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.groundCopper), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), copperOre);
//		GameRegistry.addRecipe(new ItemStack(ModItems.chalcopyrite), ModItems.groundCopper, ModItems.parrafinOil);
//		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperMatte), ModItems.calcine, ModItems.limestoneShard);
		//Coal Process
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), poorCoalOre.StartupCommon.blockPoorCoalOre, poorCoalOre.StartupCommon.blockPoorCoalOre);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Blocks.coal_ore);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 2), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), richCoalOre.StartupCommon.blockRichCoalOre);
		
		//IRON PROCESS
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.groundIron), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Blocks.iron_ore);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironLump), ModItems.groundIron, Items.coal);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot), ModItems.ironSlag, ModItems.ironSlag);
		//GOLD PROCESS  need ground gold
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.groundGold), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Blocks.gold_ore);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.amalgam), ModItems.groundGold, Items.flint);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot), ModItems.amalgam, ModItems.cyanide);
		//REDSTONE PROCESS
		GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 4 ), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), poorRedstoneOre.StartupCommon.blockPoorRedstoneOre, poorRedstoneOre.StartupCommon.blockPoorRedstoneOre);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 4), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Blocks.redstone_ore);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 8), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), richRedstoneOre.StartupCommon.blockRichRedstoneOre);
		//DIAMOND PROCESS 
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.uncutDiamond), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), poorDiamondOre.StartupCommon.blockPoorDiamondOre, poorDiamondOre.StartupCommon.blockPoorDiamondOre);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.uncutDiamond), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Blocks.diamond_ore);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.uncutDiamond, 2), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), richDiamondOre.StartupCommon.blockRichDiamondOre);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.roughDiamond), new ItemStack(Items.shears, 1, OreDictionary.WILDCARD_VALUE), ModItems.uncutDiamond);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond), new ItemStack(ModItems.sandpaper, 1, OreDictionary.WILDCARD_VALUE), ModItems.roughDiamond);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.roughDiamond, 1), new ItemStack(ModItems.diamondCuttingTool, 1, OreDictionary.WILDCARD_VALUE), ModItems.uncutDiamond);
		//LAPIS LAZULI PROCESS
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 6, 4), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), poorLapisOre.StartupCommon.blockPoorLapisOre, poorLapisOre.StartupCommon.blockPoorLapisOre);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 6, 4), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Blocks.lapis_ore);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 12, 4), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), richLapisOre.StartupCommon.blockRichLapisOre);
		//EMERALD PROCESS
		GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), poorEmeraldOre.StartupCommon.blockPoorEmeraldOre, poorEmeraldOre.StartupCommon.blockPoorEmeraldOre);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Blocks.emerald_ore);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 2), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), richEmeraldOre.StartupCommon.blockRichEmeraldOre);
		
		//TIN PROCESS
		
		//ALUMINIUM PROCESS
		
		//crafting items
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.hammer), "AAA", "AAA", " B ", 'A', Blocks.cobblestone, 'B', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.sandpaper), "A", "B", "A", 'A', Blocks.sand, 'B', Items.paper, 'A', Blocks.sand);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.diamondCuttingTool), " A", "B ", 'A', Items.stick, 'B', Items.diamond);
		
		//other recipes
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.roughDiamond), ModItems.uncutDiamond, ModItems.uncutDiamond);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.appleSeed, 4), Items.apple);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cyanide), ModItems.appleSeed, ModItems.appleSeed);
		GameRegistry.addRecipe(new ItemStack(limestone.StartupCommon.blockLimestone), "AA", "AA", 'A', ModItems.limestoneShard);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.limestoneShard, 4), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), limestone.StartupCommon.blockLimestone);
	}
	public static void removeCraftingRecipes() {
		
	}
	private static void removeRecipe(Block output) {
		removeRecipe(Item.getItemFromBlock(output));
	}
	private static void removeRecipe(Item output) {
		int recipesRemoved = 0;
		
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		Iterator<IRecipe> remover = recipes.iterator();
		
		while(remover.hasNext()) {
			ItemStack itemstack = remover.next().getRecipeOutput();
			
			if (itemstack != null && itemstack.getItem() == output) {
				remover.remove();
				recipesRemoved++;
			}
		}
	}
	private static void addSmeltingRecipes() {
//		GameRegistry.addSmelting(inputBlock/Item/ItemStack, new ItemStack(outputBlock/Item/ItemStack, amountOutputted), XPEarned)
		//COPPER PROCESS
		//IRON PROCESS
		GameRegistry.addSmelting(ModItems.ironLump, new ItemStack(ModItems.ironSlag), 0.5F);
		//GOLD PROCESS
		GameRegistry.addSmelting(ModItems.groundGold, new ItemStack(ModItems.amalgam), 0.5F);
		//REDSTSONE PROCESS
		//DIAMOND PROCESS
		//LAPIS LAZULI PROCESS
		//TIN PROCESS
		//ALLUMINIUM PROCESS
	}
	public static void removeSmeltingRecipes() {
		removeSmelting(Blocks.coal_ore);
		removeSmelting(Blocks.iron_ore);
		removeSmelting(Blocks.redstone_ore);
		removeSmelting(Blocks.diamond_ore);
		removeSmelting(Blocks.emerald_ore);
		removeSmelting(Blocks.lapis_block);
	}
	private static void removeSmelting(Block sOutput) {
		removeSmelting(Item.getItemFromBlock(sOutput));
	}
	private static void removeSmelting(Item sOutput) {
		Collection<Item> removeSet = new HashSet();
		Collections.addAll(removeSet,
		new Item[] {
		        sOutput
		}
		);
		Iterator<ItemStack> iterator1 = FurnaceRecipes.instance().getSmeltingList().keySet().iterator();

		while (iterator1.hasNext())
		{
		ItemStack recipe = iterator1.next();
		if (recipe == null)
		        continue;
		ItemStack output = recipe;
		if (output != null && output.getItem() != null && removeSet.contains(output.getItem()))
		        iterator1.remove();
		}}
}
