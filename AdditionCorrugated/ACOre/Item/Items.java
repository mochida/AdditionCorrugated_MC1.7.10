package AdditionCorrugated.ACOre.Item;

import AdditionCorrugated.*;
import AdditionCorrugated.ACOre.Item.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.*;
import net.minecraftforge.common.util.*;

public class Items
{
	public static Item.ToolMaterial ADAMANTITE = EnumHelper.addToolMaterial("ADAMANTITE", 0, 1000, 3.0F, 1.0F, 10);
	
	public static Item.ToolMaterial COBALT = EnumHelper.addToolMaterial("COBALT", 0, 1000, 3.0F, 2.0F, 15);
	
	public static Item.ToolMaterial DEMONITE = EnumHelper.addToolMaterial("DEMONITE", 0, 1000, 4.0F, 3.0F, 20);
	
	public static Item.ToolMaterial HELLSTONE = EnumHelper.addToolMaterial("HELLSTONE", 0, 1000, 5.0F, 2.0F, 20);
	
	public static Item.ToolMaterial METEORITE = EnumHelper.addToolMaterial("METEORITE", 0, 1000, 1.0F, 1.0F, 15);
	
	public static Item.ToolMaterial MYTHRIL = EnumHelper.addToolMaterial("MYTHRIL", 0, 1000, 2.0F, 2.0F, 15);
	
	public static Item Fluorite;
	
	public static Item Adamantite;
	
	public static Item Cobalt;
	
	public static Item Demonite;
	
	public static Item Hellstone;
	
	public static Item Meteorite;
	
	public static Item Mythril;
	
	public static Item Silver;
	
	public static Item AdamantiteSword;
	
	public static Item AdamantiteHoe;
	
	public static Item AdamantiteShovel;
	
	public static Item AdamantiteAxe;
	
	public static Item AdamantitePickaxe;
	
	public static Item CobaltSword;
	
	public static Item CobaltHoe;
	
	public static Item CobaltShovel;
	
	public static Item CobaltAxe;
	
	public static Item CobaltPickaxe;
	
	public static Item DemoniteSword;
	
	public static Item DemoniteHoe;
	
	public static Item DemoniteShovel;
	
	public static Item DemoniteAxe;
	
	public static Item DemonitePickaxe;
	
	public static Item HellstoneSword;
	
	public static Item HellstoneHoe;
	
	public static Item HellstoneShovel;
	
	public static Item HellstoneAxe;
	
	public static Item HellstonePickaxe;
	
	public static Item MeteoriteSword;
	
	public static Item MeteoriteHoe;
	
	public static Item MeteoriteShovel;
	
	public static Item MeteoriteAxe;
	
	public static Item MeteoritePickaxe;
	
	public static Item MythrilSword;
	
	public static Item MythrilHoe;
	
	public static Item MythrilShovel;
	
	public static Item MythrilAxe;
	
	public static Item MythrilPickaxe;
	
	@EventHandler
	public void preInit(FMLPostInitializationEvent event)
	{
		Fluorite = (new Item())
				.setUnlocalizedName("Fluorite")
				.setTextureName("additioncorrugated:item_fluorite")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Adamantite = (new Item())
				.setUnlocalizedName("Adamantite")
				.setTextureName("additioncorrugated:item_ingotadamantite")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Cobalt = (new Item())
				.setUnlocalizedName("Cobalt")
				.setTextureName("additioncorrugated:item_ingotcobalt")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Demonite = (new Item())
				.setUnlocalizedName("Demonite")
				.setTextureName("additioncorrugated:item_ingotdemonite")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Hellstone = (new Item())
				.setUnlocalizedName("Hellstone")
				.setTextureName("additioncorrugated:item_ingothellstone")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Meteorite = (new Item())
				.setUnlocalizedName("Meteorite")
				.setTextureName("additioncorrugated:item_ingotmeteorite")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Mythril = (new Item())
				.setUnlocalizedName("Mythril")
				.setTextureName("additioncorrugated:item_ingotmythril")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Silver = (new Item())
				.setUnlocalizedName("Silver")
				.setTextureName("additioncorrugated:item_ingotsilver")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		AdamantiteSword = (new ItemSword(ADAMANTITE))
				.setUnlocalizedName("AdamantiteSword")
				.setTextureName("additioncorrugated:adamantitesword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		AdamantiteHoe = (new ItemHoe(ADAMANTITE))
				.setUnlocalizedName("AdamantiteHoe")
				.setTextureName("additioncorrugated:adamantitehoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		AdamantiteShovel = (new ItemSpade(ADAMANTITE))
				.setUnlocalizedName("AdamantiteShovel")
				.setTextureName("additioncorrugated:adamantiteshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		AdamantiteAxe = (new ItemAdamantiteAxe(ADAMANTITE))
				.setUnlocalizedName("AdamantiteAxe")
				.setTextureName("additioncorrugated:adamantiteaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		AdamantitePickaxe = (new ItemAdamantitePickaxe(ADAMANTITE))
				.setUnlocalizedName("AdamantitePickaxe")
				.setTextureName("additioncorrugated:adamantitepickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		CobaltSword = (new ItemSword(COBALT))
				.setUnlocalizedName("CobaltSword")
				.setTextureName("additioncorrugated:cobaltsword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		CobaltHoe = (new ItemHoe(COBALT))
				.setUnlocalizedName("CobaltHoe")
				.setTextureName("additioncorrugated:cobalthoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		CobaltShovel = (new ItemSpade(COBALT))
				.setUnlocalizedName("CobaltShovel")
				.setTextureName("additioncorrugated:cobaltshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		CobaltAxe = (new ItemCobaltAxe(COBALT))
				.setUnlocalizedName("CobaltAxe")
				.setTextureName("additioncorrugated:cobaltaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		CobaltPickaxe = (new ItemCobaltPickaxe(COBALT))
				.setUnlocalizedName("CobaltPickaxe")
				.setTextureName("additioncorrugated:cobaltpickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
				
		DemoniteSword = (new ItemSword(DEMONITE))
				.setUnlocalizedName("DemoniteSword")
				.setTextureName("additioncorrugated:demonitesword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		DemoniteHoe = (new ItemHoe(DEMONITE))
				.setUnlocalizedName("DemoniteHoe")
				.setTextureName("additioncorrugated:demonitehoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		DemoniteShovel = (new ItemSpade(DEMONITE))
				.setUnlocalizedName("DemoniteShovel")
				.setTextureName("additioncorrugated:demoniteshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		DemoniteAxe = (new ItemDemoniteAxe(DEMONITE))
				.setUnlocalizedName("DemoniteAxe")
				.setTextureName("additioncorrugated:demoniteaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		DemonitePickaxe = (new ItemDemonitePickaxe(DEMONITE))
				.setUnlocalizedName("DemonitePickaxe")
				.setTextureName("additioncorrugated:demonitepickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		HellstoneSword = (new ItemSword(HELLSTONE))
				.setUnlocalizedName("HellstoneSword")
				.setTextureName("additioncorrugated:hellstonesword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		HellstoneHoe = (new ItemHoe(HELLSTONE))
				.setUnlocalizedName("HellstoneHoe")
				.setTextureName("additioncorrugated:hellstonehoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		HellstoneShovel = (new ItemSpade(HELLSTONE))
				.setUnlocalizedName("HellstoneShovel")
				.setTextureName("additioncorrugated:hellstoneshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		HellstoneAxe = (new ItemHellstoneAxe(HELLSTONE))
				.setUnlocalizedName("HellstoneAxe")
				.setTextureName("additioncorrugated:hellstoneaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		HellstonePickaxe = (new ItemHellstonePickaxe(HELLSTONE))
				.setUnlocalizedName("HellstonePickaxe")
				.setTextureName("additioncorrugated:hellstonepickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
				
		MeteoriteSword = (new ItemSword(METEORITE))
				.setUnlocalizedName("MeteoriteSword")
				.setTextureName("additioncorrugated:meteoritesword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		MeteoriteHoe = (new ItemHoe(METEORITE))
				.setUnlocalizedName("MeteoriteHoe")
				.setTextureName("additioncorrugated:meteoritehoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		MeteoriteShovel = (new ItemSpade(METEORITE))
				.setUnlocalizedName("MeteoriteShovel")
				.setTextureName("additioncorrugated:meteoriteshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		MeteoriteAxe = (new ItemMeteoriteAxe(METEORITE))
				.setUnlocalizedName("MeteoriteAxe")
				.setTextureName("additioncorrugated:meteoriteaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		MeteoritePickaxe = (new ItemMeteoritePickaxe(MYTHRIL))
				.setUnlocalizedName("MeteoritePickaxe")
				.setTextureName("additioncorrugated:meteoritepickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		MythrilSword = (new ItemSword(MYTHRIL))
				.setUnlocalizedName("MythrilSword")
				.setTextureName("additioncorrugated:mythrilsword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);

		MythrilHoe = (new ItemHoe(MYTHRIL))
				.setUnlocalizedName("MythrilHoe")
				.setTextureName("additioncorrugated:mythrilhoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		MythrilShovel = (new ItemSpade(MYTHRIL))
				.setUnlocalizedName("MythrilShovel")
				.setTextureName("additioncorrugated:mythrilshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);

		MythrilAxe = (new ItemMythrilAxe(MYTHRIL))
				.setUnlocalizedName("MythrilAxe")
				.setTextureName("additioncorrugated:mythrilaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);

		MythrilPickaxe = (new ItemMythrilPickaxe(MYTHRIL))
				.setUnlocalizedName("MythrilPickaxe")
				.setTextureName("additioncorrugated:mythrilpickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		GameRegistry.registerItem(Fluorite, "itemFluorite");
		
		GameRegistry.registerItem(Adamantite, "Adamantite");
		
		GameRegistry.registerItem(Cobalt, "Cobalt");
		
		GameRegistry.registerItem(Demonite, "Demonite");
		
		GameRegistry.registerItem(Hellstone, "Hellstone");
		
		GameRegistry.registerItem(Meteorite, "Meteorite");
		
		GameRegistry.registerItem(Mythril, "Mythril");
		
		GameRegistry.registerItem(Silver, "Silver");
		
		GameRegistry.registerItem(AdamantiteSword, "AdamantiteSword");
		
		GameRegistry.registerItem(AdamantiteHoe, "AdamantiteHoe");
		
		GameRegistry.registerItem(AdamantiteShovel, "AdamantiteShovel");
		
		GameRegistry.registerItem(AdamantiteAxe, "AdamantiteAxe");
		
		GameRegistry.registerItem(AdamantitePickaxe, "AdamantitePickaxe");
		
		GameRegistry.registerItem(CobaltSword, "CobaltSword");
		
		GameRegistry.registerItem(CobaltHoe, "CobaltHoe");
		
		GameRegistry.registerItem(CobaltShovel, "CobaltShovel");
		
		GameRegistry.registerItem(CobaltAxe, "CobaltAxe");
		
		GameRegistry.registerItem(CobaltPickaxe, "CobaltPickaxe");
		
		GameRegistry.registerItem(DemoniteSword, "DemoniteSword");
		
		GameRegistry.registerItem(DemoniteHoe, "DemoniteHoe");
		
		GameRegistry.registerItem(DemoniteShovel, "DemoniteShovel");
		
		GameRegistry.registerItem(DemoniteAxe, "DemoniteAxe");
		
		GameRegistry.registerItem(DemonitePickaxe, "DemonitePickaxe");
		
		GameRegistry.registerItem(HellstoneSword, "HellstoneSword");
		
		GameRegistry.registerItem(HellstoneHoe, "HellstoneHoe");
		
		GameRegistry.registerItem(HellstoneShovel, "HellstoneShovel");
		
		GameRegistry.registerItem(HellstoneAxe, "HellstoneAxe");
		
		GameRegistry.registerItem(HellstonePickaxe, "HellstonePickaxe");
		
		GameRegistry.registerItem(MeteoriteSword, "MeteoriteSword");
		
		GameRegistry.registerItem(MeteoriteHoe, "MeteoriteHoe");
		
		GameRegistry.registerItem(MeteoriteShovel, "MeteoriteShovel");
		
		GameRegistry.registerItem(MeteoriteAxe, "MeteoriteAxe");
		
		GameRegistry.registerItem(MeteoritePickaxe, "MeteoritePickaxe");
		
		GameRegistry.registerItem(MythrilSword, "MythrilSword");
		
		GameRegistry.registerItem(MythrilHoe, "MythrilHoe");
		
		GameRegistry.registerItem(MythrilShovel, "MythrilShovel");
		
		GameRegistry.registerItem(MythrilAxe, "MythrilAxe");
		
		GameRegistry.registerItem(MythrilPickaxe, "MythrilPickaxe");
	}
}