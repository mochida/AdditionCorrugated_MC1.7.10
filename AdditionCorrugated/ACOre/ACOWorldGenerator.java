package AdditionCorrugated.ACOre;

import AdditionCorrugated.ACOre.Block.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;

public class ACOWorldGenerator
{
	@EventHandler
	public void init(FMLPostInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new BlockoreMeteorite(), 1);
		
		GameRegistry.registerWorldGenerator(new BlockoreHellstone(), 2);
		
		GameRegistry.registerWorldGenerator(new BlockoreDemonite(), 3);
		
		GameRegistry.registerWorldGenerator(new BlockoreMythril(), 4);
		
		GameRegistry.registerWorldGenerator(new BlockoreCobalt(), 5);
		
		GameRegistry.registerWorldGenerator(new BlockoreAdamantite(), 6);
		
		GameRegistry.registerWorldGenerator(new BlockoreFluorite(), 7);
		
		GameRegistry.registerWorldGenerator(new BlockoreSilver(), 8);
	}
}