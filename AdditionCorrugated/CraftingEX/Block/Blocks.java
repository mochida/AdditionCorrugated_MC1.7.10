package AdditionCorrugated.CraftingEX.Block;

import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.GameRegistry;
import AdditionCorrugated.*;
import AdditionCorrugated.Block.*;
import net.minecraft.block.*;

public class Blocks
{
	public static Block Corrugated2;
	
	public static Block CorrugatedLight2;
	
	public static Block RecycledCorrugated2;
	
	public static Block RecycledCorrugatedLight2;
	
	@EventHandler
	public void preInit(FMLPostInitializationEvent event)
	{
		Corrugated2 = new BlockCorrugated2()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		CorrugatedLight2 = new BlockCorrugatedLight2()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		RecycledCorrugated2 = new BlockRecycledCorrugated2()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		RecycledCorrugatedLight2 = new BlockRecycledCorrugatedLight2()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		GameRegistry.registerBlock(Corrugated2, "Corrugated2");
		
		GameRegistry.registerBlock(CorrugatedLight2, "CorrugatedLight2");
		
		GameRegistry.registerBlock(RecycledCorrugated2, "RecycledCorrugated2");
		
		GameRegistry.registerBlock(RecycledCorrugatedLight2, "RecycledCorrugatedLight2");
	}
}