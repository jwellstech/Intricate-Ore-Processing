package init;

import java.util.Iterator;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModDrops{
	private boolean isDiamond = false;
	@SubscribeEvent
	 public void yourPlayerHarvestEvent(HarvestDropsEvent event){
		//needs to know what block is being broken
		//then get rid of drops if its a certain ore
		//drop ore instead
		if (event.harvester != null) {
			for(ItemStack iStack: event.drops){
				System.out.println(iStack.toString());
				int numInStack = iStack.stackSize;
				if(iStack.toString() == new ItemStack(Items.diamond).toString()) {
					event.drops.remove(Items.diamond);
					isDiamond = true;
				}
			}
			if(isDiamond) {
				System.out.println("isDiamond equals true");
				event.drops.add(new ItemStack(Blocks.diamond_ore));
			}
		}
	 }
}
