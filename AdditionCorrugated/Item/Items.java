package AdditionCorrugated.Item;

import AdditionCorrugated.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraftforge.common.util.*;

public class Items
{
	public static Item.ToolMaterial CorrugatedTool = EnumHelper.addToolMaterial("CorrugatedTool", 0, 100, 1.0F, 1.0F, 2);
	
	public static Item.ToolMaterial StrongCorrugatedTool = EnumHelper.addToolMaterial("StrongCorrugatedTool", 2, 500, 3.0F, 3.0F, 8);
	
	public static ItemArmor.ArmorMaterial CorrugatedArmorMaterial = EnumHelper.addArmorMaterial("CorrugatedArmor", 100, new int[]{2, 2, 5, 2}, 2);
	
	public static ItemArmor.ArmorMaterial StrongCorrugatedArmorMaterial = EnumHelper.addArmorMaterial("StrongCorrugatedArmor", 500, new int[]{5, 5, 8, 8}, 8);
	
	public static Item RecycledPaper;
	
	public static Item StrongPaper;
	
	public static Item RustyEdge;

	public static Item Edge;
	
	public static Item PolishngPowder;
	
	public static Item CorrugatedBoard;
	
	public static Item Cutter;
	
	public static Item StrongCorrugatedBoard;
	
	public static Item Star;
	
	public static Item CorrugatedSword;
	
	public static Item StrongCorrugatedSword;
	
	public static Item CorrugatedHoe;
	
	public static Item StrongCorrugatedHoe;
	
	public static Item StrongCorrugatedShovel;
	
	public static Item CorrugatedShovel;
	
	public static Item StrongCorrugatedAxe;
	
	public static Item CorrugatedAxe;
	
	public static Item StrongCorrugatedPickaxe;
	
	public static Item CorrugatedPickaxe;
	
	public static Item Spawn_Egg_CorrugatedCreeper;
	
	public static Item StrongRecycledPaper;
		
	public static Item RecycledCorrugatedBoard;
	
	public static Item StrongRecycledCorrugatedBoard;
	
	public static Item Spawn_Egg_CorrugatedZombie;
	
	public static Item CorrugatedArmor;
	
	public static Item StrongCorrugatedArmor;
	
	public static Item Spawn_Egg_CorrugatedSlime;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		StrongPaper = (new Item())
				.setUnlocalizedName("StrongPaper")
				.setTextureName("additioncorrugated:item_strongpaper")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		RustyEdge = (new Item())
				.setUnlocalizedName("RustyEdge")
				.setTextureName("additioncorrugated:item_rustedge")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Edge = (new Item())
				.setUnlocalizedName("Edge")
				.setTextureName("additioncorrugated:item_edge")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		PolishngPowder = (new Item())
				.setUnlocalizedName("PolishngPowder")
				.setTextureName("additioncorrugated:item_polishngpowder")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		CorrugatedBoard = (new Item())
				.setUnlocalizedName("CorrugatedBoard")
				.setTextureName("additioncorrugated:item_corrugatedboard")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Cutter = (new ItemCutter())
				.setUnlocalizedName("Cutter")
				.setTextureName("additioncorrugated:item_cutter")
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StrongCorrugatedBoard = (new Item())
				.setUnlocalizedName("StrongCorrugatedBoard")
				.setTextureName("additioncorrugated:item_strongcorrugatedboard")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		
		
		CorrugatedSword = (new ItemSword(CorrugatedTool))
				.setUnlocalizedName("CorrugatedSword")
				.setTextureName("additioncorrugated:item_corrugatedsword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StrongCorrugatedSword = (new ItemSword(StrongCorrugatedTool))
				.setUnlocalizedName("StrongCorrugatedSword")
				.setTextureName("additioncorrugated:item_strongcorrugatedsword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		CorrugatedHoe = (new ItemHoe(CorrugatedTool))
				.setUnlocalizedName("CorrugatedHoe")
				.setTextureName("additioncorrugated:item_corrugatedhoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StrongCorrugatedHoe = (new ItemHoe(StrongCorrugatedTool))
				.setUnlocalizedName("StrongCorrugatedHoe")
				.setTextureName("additioncorrugated:item_strongcorrugatedhoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StrongCorrugatedShovel = (new ItemSpade(StrongCorrugatedTool))
				.setUnlocalizedName("StrongCorrugatedShovel")
				.setTextureName("additioncorrugated:item_strongcorrugatedshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		CorrugatedShovel = (new ItemSpade(CorrugatedTool))
				.setUnlocalizedName("CorrugatedShovel")
				.setTextureName("additioncorrugated:item_corrugatedshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StrongCorrugatedAxe = (new ItemStrongCorrugatedAxe(StrongCorrugatedTool))
				.setUnlocalizedName("StrongCorrugatedAxe")
				.setTextureName("additioncorrugated:item_strongcorrugatedaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		CorrugatedAxe = (new ItemCorrugatedAxe(CorrugatedTool))
				.setUnlocalizedName("CorrugatedAxe")
				.setTextureName("additioncorrugated:item_corrugatedaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StrongCorrugatedPickaxe = (new ItemStrongCorrugatedPickaxe(StrongCorrugatedTool))
				.setUnlocalizedName("StrongCorrugatedPickaxe")
				.setTextureName("additioncorrugated:item_strongcorrugatedpickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		CorrugatedPickaxe = (new ItemCorrugatedPickaxe(CorrugatedTool))
				.setUnlocalizedName("CorrugatedPickaxe")
				.setTextureName("additioncorrugated:item_corrugatedpickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Star = (new Item())
				.setUnlocalizedName("Star")
				.setTextureName("additioncorrugated:item_star")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Spawn_Egg_CorrugatedCreeper = (new ItemSpawn_Egg_CorrugatedCreeper())
				.setUnlocalizedName("Spawn_Egg_CorrugatedCreeper")
				.setTextureName("spawn_egg")
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		RecycledPaper = (new Item())
				.setUnlocalizedName("RecycledPaper")
				.setTextureName("additioncorrugated:recycledpaper")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StrongRecycledPaper = (new Item())
				.setUnlocalizedName("StrongRecycledPaper")
				.setTextureName("additioncorrugated:strongrecycledpaper")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		RecycledCorrugatedBoard = (new Item())
				.setUnlocalizedName("RecycledCorrugatedBoard")
				.setTextureName("additioncorrugated:recycledcorrugatedboard")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		StrongRecycledCorrugatedBoard = (new Item())
				.setUnlocalizedName("StrongRecycledCorrugatedBoard")
				.setTextureName("additioncorrugated:strongrecycledcorrugatedboard")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Spawn_Egg_CorrugatedZombie = (new ItemSpawn_Egg_CorrugatedZombie())
				.setUnlocalizedName("Spawn_Egg_CorrugatedZombie")
				.setTextureName("spawn_egg")
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		CorrugatedArmor = new ItemCorrugatedArmor(CorrugatedArmorMaterial, 0, 0)
				.setUnlocalizedName("CorrugatedArmor")
				.setMaxStackSize(1);
		
		StrongCorrugatedArmor = new ItemStrongCorrugatedArmor(StrongCorrugatedArmorMaterial, 0, 1)
				.setUnlocalizedName("StrongCorrugatedArmor")
				.setMaxStackSize(1);
		
		Spawn_Egg_CorrugatedSlime = (new ItemSpawn_Egg_CorrugatedSlime())
				.setUnlocalizedName("Spawn_Egg_CorrugatedSlime")
				.setTextureName("spawn_egg")
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		GameRegistry.registerItem(StrongPaper, "itemStrongPaper");
		
		GameRegistry.registerItem(RustyEdge, "itemRustyEdge");
		
		GameRegistry.registerItem(Edge, "itemEdge");
		
		GameRegistry.registerItem(PolishngPowder, "itempolishngpowder");
		
		GameRegistry.registerItem(CorrugatedBoard, "itemCorrugatedBoard");
		
		GameRegistry.registerItem(Cutter, "itemCutter");
		
		GameRegistry.registerItem(StrongCorrugatedBoard, "itemStrongCorrugatedBoard");
		
		GameRegistry.registerItem(CorrugatedSword, "CorrugatedSword");
		
		GameRegistry.registerItem(StrongCorrugatedSword, "StrongCorrugatedSword");
		
		GameRegistry.registerItem(CorrugatedHoe, "CorrugatedHoe");
		
		GameRegistry.registerItem(StrongCorrugatedHoe, "StrongCorrugatedHoe");
		
		GameRegistry.registerItem(StrongCorrugatedShovel, "StrongCorrugatedShovel");
		
		GameRegistry.registerItem(CorrugatedShovel, "CorrugatedShovel");
		
		GameRegistry.registerItem(CorrugatedAxe, "CorrugatedAxe");
		
		GameRegistry.registerItem(StrongCorrugatedAxe, "StrongCorrugatedAxe");
		
		GameRegistry.registerItem(StrongCorrugatedPickaxe, "StrongCorrugatedPickaxe");
		
		GameRegistry.registerItem(CorrugatedPickaxe, "CorrugatedPickaxe");
		
		GameRegistry.registerItem(Star, "Star");
		
		GameRegistry.registerItem(Spawn_Egg_CorrugatedCreeper, "Spawn_Egg_CorrugatedCreeper");
				
		GameRegistry.registerItem(RecycledPaper, "RecycledPaper");
		
		GameRegistry.registerItem(StrongRecycledPaper, "StrongRecycledPaper");
		
		GameRegistry.registerItem(RecycledCorrugatedBoard, "RecycledCorrugatedBoard");
		
		GameRegistry.registerItem(StrongRecycledCorrugatedBoard, "StrongRecycledCorrugatedBoard");
		
		GameRegistry.registerItem(Spawn_Egg_CorrugatedZombie, "Spawn_Egg_CorrugatedZombie");
		
		GameRegistry.registerItem(CorrugatedArmor, "CorrugatedArmor");
		
		GameRegistry.registerItem(StrongCorrugatedArmor, "StrongCorrugatedArmor");
		
		GameRegistry.registerItem(Spawn_Egg_CorrugatedSlime, "Spawn_Egg_CorrugatedSlime");
	}
}