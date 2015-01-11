package AdditionCorrugated.GUI;

import net.minecraft.client.gui.inventory.*;
import net.minecraft.util.*;

public class GUIContainar_Client extends GuiContainer
{
	private static final ResourceLocation Icon = new ResourceLocation("additioncorrugated", "textures/gui/acrecycle.png");
    
	public GUIContainar_Client(int x, int y, int z)
    {
    	super(new GUIContainar_Server(x, y, z/**, null, null**/));
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseZ)
    {
    	super.drawGuiContainerForegroundLayer(mouseX, mouseZ);
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTick, int mouseX, int mouseZ)
    {
    	this.mc.renderEngine.bindTexture(Icon);
    	this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, xSize, ySize);
    }
    @Override
    public boolean doesGuiPauseGame()
    {
    	return false;
    }
}