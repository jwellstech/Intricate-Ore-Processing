package basicCrusher;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityBasicCrusher extends TileEntityLockable implements ITickable, ISidedInventory {

	private static final int[] slotsTop = new int[] {0};
	private static final int[] slotsBottom = new int[] {2, 1};
	private static final int[] slotsSides = new int[] {2};
	private ItemStack[] basicCrusherItemStacks = new ItemStack[3];
	private int basicCrusherBurnTime;
	private int currentItemBurnTime;
	private int crushTime;
	private int totalCrushTime;
	private String basicCrusherCustomName;

	public int getSizeInventory() {
		return this.basicCrusherItemStacks.length;
	}
	
	public ItemStack getStackInSlot(int index) {
		return this.basicCrusherItemStacks[index];
	}
	
	public ItemStack decrStackSize(int index, int count) {
		if(this.basicCrusherItemStacks[index] != null) {
			if (this.basicCrusherItemStacks[index].stackSize <= count) {
				ItemStack itemstack1 = this.basicCrusherItemStacks[index];
				this.basicCrusherItemStacks[index] = null;
				return itemstack1;
			}
			else {
				ItemStack itemstack = this.basicCrusherItemStacks[index].splitStack(count);
			
				if (this.basicCrusherItemStacks[index].stackSize == 0) {
					this.basicCrusherItemStacks[index] = null;
				}
				return itemstack;
			}
		}
		else { 
			return null;
		}
	}
	
	public ItemStack removeStackFromSlot(int index) {
		if(this.basicCrusherItemStacks[index] != null) {
			ItemStack itemstack = this.basicCrusherItemStacks[index];
			this.basicCrusherItemStacks[index] = null;
			return itemstack;
		}
		else {
			return null;
		}
	} 
	
	public void setInventorySlotContents(int index, ItemStack stack) {
		boolean flag = stack != null && stack.isItemEqual(this.basicCrusherItemStacks[index]) && ItemStack.areItemStackTagsEqual(stack, this.basicCrusherItemStacks[index]);
		this.basicCrusherItemStacks[index] = stack;
		
		if(stack != null && stack.stackSize > this.getInventoryStackLimit()) {
			stack.stackSize = this.getInventoryStackLimit();
		}
		
		if (index == 0 && !flag) {
			this.totalCrushTime = this.getCrushTime(stack);
			this.crushTime = 0;
			this.markDirty();
		}
	}
	
	public String getName() {
		return this.hasCustomName() ? this.basicCrusherCustomName : "container.basicCrusher";
	}
	
	public boolean hasCustomName() {
		return this.basicCrusherCustomName != null && this.basicCrusherCustomName.length() > 0;
	}
	
	public void setCustomInventoryName(String p_145951_1_) {
		this.basicCrusherCustomName = p_145951_1_;
	}
	
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		NBTTagList nbttaglist = compound.getTagList("Items", 10);
		this.basicCrusherItemStacks = new ItemStack[this.getSizeInventory()];
		
		for(int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound.getByte("Slot");
			
			if(j >= 0 && j < this.basicCrusherItemStacks.length) {
				this.basicCrusherItemStacks[j] = ItemStack.loadItemStackFromNBT(nbttagcompound);
			}
		}
		
		this.basicCrusherBurnTime = compound.getShort("BurnTime");
		this.crushTime = compound.getShort("CrushTime");
		this.totalCrushTime = compound.getShort("CrushTimeTotal");
		this.currentItemBurnTime = getItemBurnTime(this.basicCrusherItemStacks[1]);
		
		if(compound.hasKey("CustomName", 8)) { 
			this.basicCrusherCustomName = compound.getString("CustomName");
		}
	}
	
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setShort("BurnTime", (short)this.basicCrusherBurnTime);
		compound.setShort("CookTime", (short)this.crushTime);
		compound.setShort("CrushTimeTotal",  (short)this.totalCrushTime);
		NBTTagList nbttaglist = new NBTTagList();
		
		for (int i = 0; i < this.basicCrusherItemStacks.length; i++) {
			if(this.basicCrusherItemStacks[i] != null) {
				NBTTagCompound nbttagcompound = new NBTTagCompound();
				nbttagcompound.setByte("Slot",  (byte)i);
				this.basicCrusherItemStacks[i].writeToNBT(nbttagcompound);
				nbttaglist.appendTag(nbttagcompound);
			}
		}
		
		compound.setTag("Items",  nbttaglist);
		
		if (this.hasCustomName()) {
			compound.setString("CustomName", this.basicCrusherCustomName);
		}
	}
	
	public int getInventoryStackLimit() {
		return 64;
	}
	
	public boolean isBurning() {
		return this.basicCrusherBurnTime > 0;
	}
	
	@SideOnly(Side.CLIENT) 
	public static boolean isBurning(IInventory p_174903_0_) {
		return p_174903_0_.getField(0) > 0;
	}
	
	public void update() {
		boolean flag = this.isBurning();
		boolean flag1 = false;
		
		if(this.isBurning()) {
			--this.basicCrusherBurnTime;
		}
		
		if(!this.worldObj.isRemote) {
			if (this.isBurning() ||  this.basicCrusherItemStacks[1] != null && this.basicCrusherItemStacks[0] != null) {
				if(!this.isBurning() && this.canCrush()) {
					this.currentItemBurnTime = this.basicCrusherBurnTime = getItemBurnTime(this.basicCrusherItemStacks[1]);
					
					if(this.isBurning()) {
						flag1 = true;
						
						if(this.basicCrusherItemStacks[1] != null) {
							--this.basicCrusherItemStacks[1].stackSize;
							
							if(this.basicCrusherItemStacks[1].stackSize == 0) {
								this.basicCrusherItemStacks[1] = basicCrusherItemStacks[1].getItem().getContainerItem(basicCrusherItemStacks[1]);
							}
						}
					}
				}
				
				if(this.isBurning() && this.canCrush()) {
					this.crushTime++;
					
					if(this.crushTime == this.totalCrushTime) {
						this.crushTime = 0;
						this.totalCrushTime = this.getCrushTime(this.basicCrusherItemStacks[0]);
						this.crushItem();
						flag1 = true;
					}
				}
				else {
					this.crushTime = 0;
				}
			}
			else if(!this.isBurning() && this.crushTime > 0) {
				this.crushTime = MathHelper.clamp_int(this.crushTime - 2, 0, this.totalCrushTime);
			}
			
			if (flag != this.isBurning()) {
				flag1 = true;
				basicCrusher.StartupCommon.blockBasicCrusher.setState(this.isBurning(), this.worldObj, this.pos);
			}
		}
		
		if (flag1) {
			this.markDirty();
		}
	}
	
	public int getCrushTime(ItemStack stack) {
		return 400;
	}
	
	private boolean canCrush() {
		if (this.basicCrusherItemStacks[0] == null) {
			return false;
		}
		else {
			ItemStack itemstack = BasicCrusherRecipes.instance().getCrushingResult(this.basicCrusherItemStacks[0]);
			if (itemstack == null) return false;
			if (this.basicCrusherItemStacks[2] == null) return true;
			if (!this.basicCrusherItemStacks[2].isItemEqual(itemstack)) return false;
			int result = basicCrusherItemStacks[2].stackSize + itemstack.stackSize;
			return result <= getInventoryStackLimit() && result <= this.basicCrusherItemStacks[2].getMaxStackSize();
		}
	}
	
	public void crushItem() {
		if (this.canCrush()) {
			ItemStack itemstack = BasicCrusherRecipes.instance().getCrushingResult(this.basicCrusherItemStacks[0]);
			
			if (this.basicCrusherItemStacks[2] == null) {
				this.basicCrusherItemStacks[2] = itemstack.copy();
			}
			else if (this.basicCrusherItemStacks[2].getItem() == itemstack.getItem()) { 
				this.basicCrusherItemStacks[2].stackSize += itemstack.stackSize;
			}
			
			--this.basicCrusherItemStacks[0].stackSize;
			
			if (this.basicCrusherItemStacks[0].stackSize <= 0) {
				this.basicCrusherItemStacks[0] = null;
			}
		}
	}
	
	public static int getItemBurnTime(ItemStack p_145952_0_) {
		if (p_145952_0_ == null) {
			return 0;
		}
		else {
			Item item = p_145952_0_.getItem();
			
			if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
				Block block = Block.getBlockFromItem(item);
				
				if (block == Blocks.coal_block) {
					return 1600;
				}
			}
			if (item == Items.coal) return 1600;
			if (item == Items.blaze_rod) return 2400;
			return net.minecraftforge.fml.common.registry.GameRegistry.getFuelValue((p_145952_0_));
		}
	}
	
	public static boolean isItemFuel(ItemStack p_145954_0_) {
		return getItemBurnTime(p_145954_0_) > 0;
	}
	
	public boolean isUseableByPlayer(EntityPlayer player) {
		return this.worldObj.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
	}
	
	public void openInventory(EntityPlayer player) {}
	public void closeInventory(EntityPlayer player) {}
	
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		return index == 2 ? false : (index != 1 ? true : isItemFuel(stack) || SlotFurnaceFuel.isBucket(stack));
	}
	
	public int[] getSlotsForFace(EnumFacing side) {
		return side == EnumFacing.DOWN ? slotsBottom : (side == EnumFacing.UP ? slotsTop : slotsSides);
	}
	
	public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) { 
		return this.isItemValidForSlot(index, itemStackIn);
	}
	
	public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
		if (direction == EnumFacing.DOWN && index == 1) { Item item = stack.getItem(); }
		return true;
	}
	
	public String getGuiID() {
		return "intricateoreprocessing:basicCrusher";
	}
	
	public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
		return new ContainerBasicCrusher(playerInventory, this);
	}
	
	public int getField(int id) {
		switch(id) {
			case 0:
				return this.basicCrusherBurnTime;
			case 1:
				return this.currentItemBurnTime;
			case 2:
				return this.crushTime;
			case 3:
				return this.totalCrushTime;
			default:
				return 0;
		}
	}
	
	public void setField(int id, int value) {
		switch (id) {
			case 0:
				this.basicCrusherBurnTime = value;
				break;
			case 1:
				this.currentItemBurnTime = value;
				break;
			case 2:
				this.crushTime = value;
				break;
			case 3:
				this.totalCrushTime = value;
		}
	}
	
	public int getFieldCount() {
		return 4;
	}
	
	public void clear() {
		for (int i = 0; i < this.basicCrusherItemStacks.length; i++) {
			this.basicCrusherItemStacks[i] = null;
		}
	}
	
	net.minecraftforge.items.IItemHandler handlerTop = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.UP);
	net.minecraftforge.items.IItemHandler handlerBottom = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.DOWN);
	net.minecraftforge.items.IItemHandler handlerSide = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.WEST);
	
	@Override
	public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, net.minecraft.util.EnumFacing facing) {
		if (facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) 
			if (facing == EnumFacing.DOWN)
				return (T) handlerBottom;
			else if (facing == EnumFacing.UP)
				return (T) handlerTop;
			else
				return (T) handlerSide;
		return super.getCapability(capability, facing);
	}
}