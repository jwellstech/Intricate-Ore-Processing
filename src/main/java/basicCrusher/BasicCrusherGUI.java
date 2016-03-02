//package basicCrusher;
//
//import net.minecraft.client.gui.inventory.GuiContainer;
//import net.minecraft.client.renderer.GlStateManager;
//import net.minecraft.entity.player.InventoryPlayer;
//import net.minecraft.inventory.ContainerFurnace;
//import net.minecraft.inventory.IInventory;
//import net.minecraft.tileentity.TileEntityFurnace;
//import net.minecraft.util.ResourceLocation;
//
//public class BasicCrusherGUI extends GuiContainer {
//
//	
//    private static final ResourceLocation furnaceGuiTextures = new ResourceLocation("textures/gui/basicCrusherGui.png");
//    private final InventoryPlayer playerInventory;
//    private IInventory tileBasicCrusher;
//	
//	
//    public BasicCrusherGUI(InventoryPlayer playerInv, IInventory basicCrusherInv)
//    {
//        super(new ContainerBasicCrusher(playerInv, basicCrusherInv));
//        this.playerInventory = playerInv;
//        this.tileBasicCrusher = basicCrusherInv;
//    }
//    
//    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
//    {
//        String s = this.tileBasicCrusher.getDisplayName().getUnformattedText();
//        this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
//        this.fontRendererObj.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
//    }
//    
//    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
//    {
//        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
//        this.mc.getTextureManager().bindTexture(furnaceGuiTextures);
//        int i = (this.width - this.xSize) / 2;
//        int j = (this.height - this.ySize) / 2;
//        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
//
//        if (TileEntityFurnace.isBurning(this.tileBasicCrusher))
//        {
//            int k = this.getBurnLeftScaled(13);
//            this.drawTexturedModalRect(i + 56, j + 36 + 12 - k, 176, 12 - k, 14, k + 1);
//        }
//
//        int l = this.getCookProgressScaled(24);
//        this.drawTexturedModalRect(i + 79, j + 34, 176, 14, l + 1, 16);
//    }
//
//    private int getCookProgressScaled(int pixels)
//    {
//        int i = this.tileBasicCrusher.getField(2);
//        int j = this.tileBasicCrusher.getField(3);
//        return j != 0 && i != 0 ? i * pixels / j : 0;
//    }
//
//    private int getBurnLeftScaled(int pixels)
//    {
//        int i = this.tileBasicCrusher.getField(1);
//
//        if (i == 0)
//        {
//            i = 200;
//        }
//
//        return this.tileBasicCrusher.getField(0) * pixels / i;
//    }
//	
//	
//}
