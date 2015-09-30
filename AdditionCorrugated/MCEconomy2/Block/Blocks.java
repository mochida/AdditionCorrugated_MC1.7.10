package AdditionCorrugated.MCEconomy2.Block;

import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.GameRegistry;
import AdditionCorrugated.*;
import AdditionCorrugated.Block.*;
import net.minecraft.block.*;

public class Blocks
{
	public static Block ACVendingMachine;
	
	@EventHandler
	public void preInit(FMLPostInitializationEvent event)
	{
		ACVendingMachine = new BlockACVendingMachine();
		
		GameRegistry.registerBlock(ACVendingMachine, "ACVendingMachine");
	}
}