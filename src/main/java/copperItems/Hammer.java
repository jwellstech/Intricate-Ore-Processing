package copperItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Hammer extends Item {

	public Hammer(String unlocalizedName) {
		super();
		
		this.setMaxStackSize(1);
		this.setMaxDamage(32);
//		this.onItemRightClick(itemStackIn, worldIn, playerIn){itemStackIn.damageItem(1,playerIn);}
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
}
