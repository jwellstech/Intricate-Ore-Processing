package copperItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CommonMedicinalHerb extends Item {

	public CommonMedicinalHerb(String unlocalizedName) {
		super();
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
}
