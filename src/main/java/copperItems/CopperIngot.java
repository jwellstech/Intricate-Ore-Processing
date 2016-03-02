package copperItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CopperIngot extends Item {

	public CopperIngot(String unlocalizedName) {
		super();
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
}
