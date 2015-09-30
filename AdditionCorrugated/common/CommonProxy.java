package AdditionCorrugated.Common;

import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import cpw.mods.fml.common.network.*;

public class CommonProxy implements IGuiHandler
{
	public void init()
	{
		
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}
}