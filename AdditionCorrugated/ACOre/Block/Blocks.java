package AdditionCorrugated.ACOre.Block;

import AdditionCorrugated.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.*;

public class Blocks
{
	public static Block oreFluorite;
	
	public static Block oreAdamantite;
	
	public static Block oreCobalt;
	
	public static Block oreDemonite;
	
	public static Block oreHellstone;
	
	public static Block oreMeteorite;
	
	public static Block oreMythril;
	
	public static Block oreSilver;
	
	@EventHandler
	public void preInit(FMLPostInitializationEvent event)
	{
		oreAdamantite = new BlockoreAdamantite()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		oreCobalt = new BlockoreCobalt()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		oreDemonite = new BlockoreDemonite()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		oreHellstone = new BlockoreHellstone()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		oreMeteorite = new BlockoreMeteorite()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		oreMythril = new BlockoreMythril()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		oreFluorite = new BlockoreFluorite()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		oreSilver = new BlockoreSilver()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		GameRegistry.registerBlock(oreAdamantite, "oreAdamantite");
		
		GameRegistry.registerBlock(oreCobalt, "oreCobalt");
		
		GameRegistry.registerBlock(oreDemonite, "oreDemonite");
		
		GameRegistry.registerBlock(oreHellstone, "oreHellstone");
		
		GameRegistry.registerBlock(oreMeteorite, "oreMeteorite");
		
		GameRegistry.registerBlock(oreMythril, "oreMythril");
		
		GameRegistry.registerBlock(oreFluorite, "OreFruorite");
		
		GameRegistry.registerBlock(oreSilver, "OreSilver");
	}
}