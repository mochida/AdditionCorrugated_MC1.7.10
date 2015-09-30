package AdditionCorrugated;

import AdditionCorrugated.Block.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;

public class ACWorldGenerator
{
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new BlockBlackStone(), 1);
	}
}