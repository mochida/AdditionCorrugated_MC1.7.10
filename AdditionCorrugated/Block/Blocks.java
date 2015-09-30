package AdditionCorrugated.Block;

import AdditionCorrugated.*;
import net.minecraft.block.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;

public class Blocks
{
	public static Block Corrugated;
	
	public static Block CorrugatedLight;
	
	public static Block CorrugatedTorch;
	
	public static Block CorrugatedChest;
	
	public static Block StrongCorrugated;
	
	public static Block StrongCorrugatedLight;
	
	public static Block StrongCorrugatedTorch;
	
	public static Block StrongCorrugatedChest;
	
	public static Block HalfCorrugated;
	
	public static Block HalfCorrugatedLight;
	
	public static Block HalfStrongCorrugated;
	
	public static Block HalfStrongCorrugatedLight;
	
	public static Block RecycledCorrugated;
	
	public static Block RecycledCorrugatedLight;
	
	public static Block StrongRecycledCorrugated;
	
	public static Block StrongRecycledCorrugatedLight;
	
	public static Block TemperedGlass;
	
	public static Block SilverGravel;
	
	public static Block GoldGravel;
	
	public static Block StarGravel;
	
	public static Block BlackStone;
	
	public static Block ACrecycle;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		GoldGravel = new BlockGoldGravel()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Corrugated = new BlockCorrugated()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		CorrugatedLight = new BlockCorrugatedLight()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StrongCorrugated = new BlockStrongCorrugated()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StrongCorrugatedLight = new BlockStrongCorrugatedLight()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		BlackStone = new BlockBlackStone()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		TemperedGlass = new BlockTemperedGlass()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		ACrecycle = new BlockACrecycle();
		
		CorrugatedTorch = new BlockCorrugatedTorch()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StrongCorrugatedTorch = new BlockStrongCorrugatedTorch()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StarGravel = new BlockStarGravel()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
	
		CorrugatedChest = new BlockCorrugatedChest(0);
		
		StrongCorrugatedChest = new BlockStrongCorrugatedChest(0);
		
		HalfCorrugated = new BlockHalfCorrugated()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		HalfStrongCorrugated = new BlockHalfStrongCorrugated()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		HalfCorrugatedLight = new BlockHalfCorrugatedLight()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		HalfStrongCorrugatedLight = new BlockHalfStrongCorrugatedLight()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StrongRecycledCorrugated = new BlockStrongRecycledCorrugated()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		RecycledCorrugated = new BlockRecycledCorrugated()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StrongRecycledCorrugatedLight = new BlockStrongRecycledCorrugatedLight()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		RecycledCorrugatedLight = new BlockRecycledCorrugatedLight()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		SilverGravel = new BlockSilverGravel()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		GameRegistry.registerBlock(GoldGravel, "GoldGravel");
		
		GameRegistry.registerBlock(Corrugated, "Corrugated");
		
		GameRegistry.registerBlock(CorrugatedLight, "CorrugatedLight");
		
		GameRegistry.registerBlock(StrongCorrugated, "StrongCorrugated");
		
		GameRegistry.registerBlock(StrongCorrugatedLight, "StrongCorrugatedLight");
		
		GameRegistry.registerBlock(BlackStone, "BlackStone");
		
		GameRegistry.registerBlock(TemperedGlass, "TemperedGlass");
	
		GameRegistry.registerBlock(ACrecycle, "ACrecycle");
		
		GameRegistry.registerBlock(CorrugatedTorch, "CorrugatedTorch");
		
		GameRegistry.registerBlock(StrongCorrugatedTorch, "StrongCorrugatedTorch");
		
		GameRegistry.registerBlock(StarGravel, "StarGravel");
		
		GameRegistry.registerBlock(CorrugatedChest, "CorrugatedChest");
		
		GameRegistry.registerBlock(StrongCorrugatedChest, "StrongCorrugatedChest");
		
		GameRegistry.registerBlock(HalfCorrugated, "HalfCorrugated");
		
		GameRegistry.registerBlock(HalfStrongCorrugated, "HalfStrongCorrugated");
		
		GameRegistry.registerBlock(HalfCorrugatedLight, "HalfCorrugatedLight");
		
		GameRegistry.registerBlock(HalfStrongCorrugatedLight, "HalfStrongCorrugatedLight");
		
		GameRegistry.registerBlock(StrongRecycledCorrugated, "StrongRecycledCorrugated");
		
		GameRegistry.registerBlock(RecycledCorrugated, "RecycledCorrugated");
		
		GameRegistry.registerBlock(StrongRecycledCorrugatedLight, "StrongRecycledCorrugatedLight");
		
		GameRegistry.registerBlock(RecycledCorrugatedLight, "RecycledCorrugatedLight");
		
		GameRegistry.registerBlock(SilverGravel, "SilverGravel");
	}
}