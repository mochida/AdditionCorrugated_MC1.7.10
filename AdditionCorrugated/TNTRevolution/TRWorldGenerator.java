package AdditionCorrugated.TNTRevolution;

import AdditionCorrugated.TNTRevolution.Block.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;

public class TRWorldGenerator
{
	@EventHandler
	public void init(FMLPostInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new BlockoreTNT(), 1);
	}
}