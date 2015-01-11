package AdditionCorrugated.GUI;

import net.minecraft.entity.player.*;
import net.minecraft.world.* ;
import AdditionCorrugated.*;
import cpw.mods.fml.common.network.*;

public class GUIHandler implements IGuiHandler
{
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if (ID == AdditionCorrugatedCore.ACRecycleGUI)
		{
			return new GUIContainar_Server(x, y, z/**, null, null**/);
		}
		return null;
	}
	
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if (ID == AdditionCorrugatedCore.ACRecycleGUI)
		{
			return new GUIContainar_Client(x, y, z);
		}
		return null;
	}
}