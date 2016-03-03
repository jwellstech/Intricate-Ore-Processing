package init;

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
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModRecipes {
	public static void RegisterRecipes() {
		addCraftingRecipes();
		addSmeltingRecipes();
	}
	private static void addCraftingRecipes() {
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian),"AAA","AAA","AAA",'A', Blocks.diamond_block);
		//COPPER PROCESS
//		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.groundCopper), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), copperOre);
		//paraffing oil not a block yet.... GameRegistry.addRecipe(new ItemStack(ModItems.chalcopyrite), ModItems.groundCopper, ModItems.parrafinOil);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperMatte), ModItems.calcine, ModItems.limestoneShard);
		//IRON PROCESS
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.groundIron), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Blocks.iron_ore);
		//GOLD PROCESS
		//REDSTONE PROCESS
		GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 4 ), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), poorRedstoneOre.StartupCommon.blockPoorRedstoneOre, poorRedstoneOre.StartupCommon.blockPoorRedstoneOre);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 4), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Blocks.redstone_ore);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 8), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), richRedstoneOre.StartupCommon.blockRichRedstoneOre);
		//DIAMOND PROCESS ------ uncut diamonds  **change when all items are implemented**
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.uncutDiamond), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), poorDiamondOre.StartupCommon.blockPoorDiamondOre, poorDiamondOre.StartupCommon.blockPoorDiamondOre);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.uncutDiamond), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Blocks.diamond_ore);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.uncutDiamond, 2), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), richDiamondOre.StartupCommon.blockRichDiamondOre);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.roughDiamond), new ItemStack(Items.shears, 1, OreDictionary.WILDCARD_VALUE), ModItems.uncutDiamond);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond), new ItemStack(ModItems.sandpaper, 1, OreDictionary.WILDCARD_VALUE), ModItems.roughDiamond);
		
		//LAPIS LAZULI PROCESS
		//TIN PROCESSs
		//ALUMINIUM PROCESS
		
		//crafting items
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.hammer), "AAA", "AAA", " B ", 'A', Blocks.cobblestone, 'B', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.sandpaper), "A", "B", "A", 'A', Blocks.sand, 'B', Items.paper, 'A', Blocks.sand);
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
		//GOLD PROCESS
		//REDSTSONE PROCESS
		//DIAMOND PROCESS
		//LAPIS LAZULI PROCESS
		//TIN PROCESS
		//ALLUMINIUM PROCESS
	}
	public static void removeSmeltingRecipes() {
	//	List<>
	}
}
