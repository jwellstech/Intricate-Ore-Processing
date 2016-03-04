package init;

import java.util.Iterator;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEventData;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModDrops{
	private boolean isDiamond = false;
	@SubscribeEvent
	public void BlockDestroyed(HarvestDropsEvent event) {
		
		if (event.harvester != null) {
			
			if (event.state.equals(Blocks.diamond_ore.getDefaultState())) {
//				int iStackSize = event.drops.size();
//				ItemStack diamondStack = new ItemStack(Items.diamond, iStackSize);
//				System.out.println("drops: " + event.drops.toString() + "\n" + "iStack: " + diamondStack.toString());
				event.drops.clear();	
				event.drops.add(new ItemStack(Blocks.diamond_ore));
			}
			
			else if (event.state.equals(Blocks.coal_ore.getDefaultState())) {
				event.drops.clear();	
				event.drops.add(new ItemStack(Blocks.coal_ore));
			}
			
			else if (event.state.equals(Blocks.redstone_ore.getDefaultState())) {
				event.drops.clear();	
				event.drops.add(new ItemStack(Blocks.redstone_ore));
			}
			
			else if (event.state.equals(Blocks.lit_redstone_ore.getDefaultState())) {
				event.drops.clear();	
				event.drops.add(new ItemStack(Blocks.redstone_ore));
			}
			
			else if (event.state.equals(Blocks.emerald_ore.getDefaultState())) {
				event.drops.clear();	
				event.drops.add(new ItemStack(Blocks.emerald_ore));
			}
			
			else if (event.state.equals(Blocks.lapis_ore.getDefaultState())) {
				event.drops.clear();	
				event.drops.add(new ItemStack(Blocks.lapis_ore));
			}
		}
	}
}
