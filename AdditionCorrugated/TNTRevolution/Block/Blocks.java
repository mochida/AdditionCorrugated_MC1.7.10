package AdditionCorrugated.TNTRevolution.Block;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import AdditionCorrugated.AdditionCorrugatedCore;
import net.minecraft.block.*;

public class Blocks
{
	public static Block TStone;
	
	public static Block oreTNT;
	
	@EventHandler
	public void preInit(FMLPostInitializationEvent event)
	{
		TStone = new BlockTStone()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		oreTNT = new BlockoreTNT()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		GameRegistry.registerBlock(TStone, "TStone");
		
		GameRegistry.registerBlock(oreTNT, "oreTNT");
	}
}