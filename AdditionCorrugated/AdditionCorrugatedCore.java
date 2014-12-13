package AdditionCorrugated;

import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.stats.Achievement;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.common.util.EnumHelper;
import AdditionCorrugated.Item.*;
import AdditionCorrugated.Block.*;
import AdditionCorrugated.Entity.*;
import AdditionCorrugated.*;
import AdditionCorrugated.common.*;

@Mod(modid="Addition Corrugated", name="Addition Corrugated", version="1.6.0_alpha3_MC1.7.10")
public class AdditionCorrugatedCore
{
/*********予定*********/
//	ディメンションを追加(途中)
//	実績(途中)
//	防具
//	ACＲｅｃｙｃｌｅ機能追加
//	木
//	植物
//	MOB
//	可燃
//	落下(Config選択)
//	Entity化(Config選択)
//	カッターで早く壊す
//	チェストのテクスチャの修正
//	ハーフブロックの修正
//	mcmod.infoの修正
/**********************/
	public static AdditionCorrugatedCore instance;
	
	@SidedProxy(clientSide = "AdditionCorrugated.Client.ClientProxy", serverSide = "AdditionCorrugated.common.CommonProxy")
	public static CommonProxy proxy;
	
	public static final CreativeTabs AdditionCorrugatedMODTab = new CreativeTabAdditionCorrugatedMOD("AdditionCorrugatedMODTab");
	
	public static final CreativeTabs AdditionCorrugatedMOD_Under_DevelopmentTab = new CreativeTabAdditionCorrugatedMOD_Under_Development("AdditionCorrugatedMOD_Under_DevelopmentTab");
	
	public static final Block command_Block = (Blocks.command_block).setCreativeTab(CreativeTabs.tabRedstone);
	
	public static final Item command_block_minecart = (Items.command_block_minecart).setCreativeTab(CreativeTabs.tabTransport);
		
	public static Item.ToolMaterial CORRUGATED = EnumHelper.addToolMaterial("CORRUGATED", 0, 100, 1.0F, 1.0F, 1);
		
	public static Item.ToolMaterial STRONGCORRUGATED = EnumHelper.addToolMaterial("STRONGCORRUGATED", 2, 500, 3.0F, 3.0F, 5);
	
	public static Item.ToolMaterial ADAMANTITE = EnumHelper.addToolMaterial("ADAMANTITE", 0, 1000, 3.0F, 1.0F, 10);
	
	public static Item.ToolMaterial COBALT = EnumHelper.addToolMaterial("COBALT", 0, 1000, 3.0F, 2.0F, 15);
	
	public static Item.ToolMaterial DEMONITE = EnumHelper.addToolMaterial("DEMONITE", 0, 1000, 4.0F, 3.0F, 20);
	
	public static Item.ToolMaterial HELLSTONE = EnumHelper.addToolMaterial("HELLSTONE", 0, 1000, 5.0F, 2.0F, 20);
	
	public static Item.ToolMaterial METEORITE = EnumHelper.addToolMaterial("METEORITE", 0, 1000, 1.0F, 1.0F, 15);
	
	public static Item.ToolMaterial MYTHRIL = EnumHelper.addToolMaterial("MYTHRIL", 0, 1000, 2.0F, 2.0F, 15);
	
//	public static Achievement getCorrugated;
	
//	public static Achievement getStrongCorrugated;
	
//	public static String ACHIEVEMENT_PAGE_NAME = "AdditionCorrugated";
	
//	public static int getCorrugatedAchievementID = 19999;
	
//	public static int getStringCorrugatedAchievementID = 20000;
	
	public static Block Corrugated;
	
	public static Block CorrugatedLight;
	
	public static Block StrongCorrugated;
	
	public static Block StrongCorrugatedLight;
	
	public static Block oreFluorite;
	
	public static Block TemperedGlass;
	
	public static Block TStone;
	
	public static Block oreTNT;
	
	public static Block oreAdamantite;
	
	public static Block oreCobalt;
	
	public static Block oreDemonite;
	
	public static Block oreHellstone;
	
	public static Block oreMeteorite;
	
	public static Block oreMythril;
	
	public static Block BlackStone;
	
	public static Block ACrecycle;
	
	public static Block CorrugatedTorch;
	
	public static Block StrongCorrugatedTorch;
	
	public static Block StarGravel;
	
	public static Block SilverGravel;
	
	public static Block GoldGravel;
	
	public static Block oreSilver;
	
	public static Block CorrugatedChest;
	
	public static Block StrongCorrugatedChest;
	
	public static Block HalfCorrugated;
	
	public static Block HalfCorrugatedLight;
	
	public static Block HalfStrongCorrugated;
	
	public static Block HalfStrongCorrugatedLight;
	
	public static Block CorrugatedWorldPortal;
	
	public static Item StrongPaper;
	
	public static Item RustyEdge;

	public static Item Edge;
	
	public static Item PolishngPowder;
	
	public static Item CorrugatedBoard;
	
	public static Item Cutter;
		
	public static Item Fluorite;
	
	public static Item StrongCorrugatedBoard;
	
	public static Item Gum;
	
	public static Item MintGum;
	
	public static Item SuperMintGum;
	
	public static Item ChocolateBar;
	
	public static Item Blueberry;
	
	public static Item PickledPlum;
	
	public static Item Plum;
	
	public static Item RiceCake;
	
	public static Item Adamantite;
	
	public static Item Cobalt;
	
	public static Item Demonite;
	
	public static Item Hellstone;
	
	public static Item Meteorite;
	
	public static Item Mythril;
	
	public static Item SolarFragment;
	
	public static Item GlutinousRice;
	
	public static Item Straw;
	
	public static Item SeaMustard;
	
	public static Item Dumpling;
	
	public static Item SoySauce;
	
	public static Item FermentedSoybeans;
	
	public static Item Soybeans;
	
	public static Item SpongeGourd;
	
	public static Item DrySpongeGourd;
	
	public static Item Kimchi;
	
	public static Item JapaneseLeek;

	public static Item Mustard;
	
	public static Item Capsicum;

	public static Item Rice;
	
	public static Item SeaMustardRevision;
	
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
	
	public static Item Silver;
	
	public static Item Star;
	
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
	
	public static int ACVillagerID;
	
	private ACTrade 取引;
	
/*/	public static int CorrugatedDimesionID = 19;/*/
	
/*/	public static int providerType = 19;/*/
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)	
	{
		Corrugated = new BlockCorrugated();
		
		CorrugatedLight = new BlockCorrugatedLight();
		
		StrongCorrugated = new BlockStrongCorrugated();
		
		StrongCorrugatedLight = new BlockStrongCorrugatedLight();
		
		BlackStone = new BlockBlackStone();
		
		TStone = new BlockTStone();
		
		oreTNT = new BlockoreTNT();
		
		oreAdamantite = new BlockoreAdamantite();
		
		oreCobalt = new BlockoreCobalt();
		
		oreDemonite = new BlockoreDemonite();
		
		oreHellstone = new BlockoreHellstone();
		
		oreMeteorite = new BlockoreMeteorite();
		
		oreMythril = new BlockoreMythril();
		
		oreFluorite = new BlockoreFluorite();
		
		TemperedGlass = new BlockTemperedGlass();
		
		ACrecycle = new BlockACrecycle();
		
		CorrugatedTorch = new BlockCorrugatedTorch();
		
		StrongCorrugatedTorch = new BlockStrongCorrugatedTorch();
		
		StarGravel = new BlockStarGravel();
	
		SilverGravel = new BlockSilverGravel();
	
		GoldGravel = new BlockGoldGravel();
		
		oreSilver = new BlockoreSilver();
		
		CorrugatedChest = new BlockCorrugatedChest(0);
		
		StrongCorrugatedChest = new BlockStrongCorrugatedChest(0);
		
		HalfCorrugated = new BlockHalfCorrugated(true, null);
		
		HalfStrongCorrugated = new BlockHalfStrongCorrugated(true, null);
		
		HalfCorrugatedLight = new BlockHalfCorrugatedLight(true, null);
		
		HalfStrongCorrugatedLight = new BlockHalfStrongCorrugatedLight(true, null);
		
		CorrugatedWorldPortal = new BlockCorrugatedWorldPortal(Material.portal);
		
		StrongPaper = (new Item())
				.setUnlocalizedName("StrongPaper")
				.setTextureName("additioncorrugated:item_strongpaper")
				.setMaxStackSize(64);
		
		RustyEdge = (new Item())
				.setUnlocalizedName("RustyEdge")
				.setTextureName("additioncorrugated:item_rustedge")
				.setMaxStackSize(64);
		
		Edge = (new Item())
				.setUnlocalizedName("Edge")
				.setTextureName("additioncorrugated:item_edge")
				.setMaxStackSize(64);
		
		PolishngPowder = (new Item())
				.setUnlocalizedName("PolishngPowder")
				.setTextureName("additioncorrugated:item_polishngpowder")
				.setMaxStackSize(64);
		
		CorrugatedBoard = (new Item())
				.setUnlocalizedName("CorrugatedBoard")
				.setTextureName("additioncorrugated:item_corrugatedboard")
				.setMaxStackSize(64);
		
		Cutter = (new ItemCutter())
				.setUnlocalizedName("Cutter")
				.setTextureName("additioncorrugated:item_cutter");
		
		Fluorite = (new Item())
				.setUnlocalizedName("Fluorite")
				.setTextureName("additioncorrugated:item_fluorite")
				.setMaxStackSize(64);
		
		StrongCorrugatedBoard = (new Item())
				.setUnlocalizedName("StrongCorrugatedBoard")
				.setTextureName("additioncorrugated:item_strongcorrugatedboard")
				.setMaxStackSize(64);
		
		Gum = (new ItemFood(4, 0.2F, false))
				.setUnlocalizedName("Gum")
				.setTextureName("additioncorrugated:item_gum")
				.setMaxStackSize(64);
		
		MintGum = (new ItemFood(5, 0.2F, false))
				.setPotionEffect(Potion.nightVision.id, 60, 0, 0.75F)
				.setUnlocalizedName("MintGum")
				.setTextureName("additioncorrugated:item_mintgum")
				.setMaxStackSize(64);
		
		SuperMintGum = (new ItemFood(6, 0.2F, false))
				.setPotionEffect(Potion.nightVision.id, 300, 0, 0.75F)
				.setUnlocalizedName("SuperMintGum")
				.setTextureName("additioncorrugated:item_supermintgum")
				.setMaxStackSize(64);
		
		ChocolateBar = (new ItemFood(5, 0.5F, true))
				.setUnlocalizedName("ChocolateBar")
				.setTextureName("additioncorrugated:item_chocolatebar")
				.setMaxStackSize(64);
		
		Blueberry = (new ItemFood(2, 0.5F, true))
				.setPotionEffect(Potion.nightVision.id, 300, 0, 0.5F)
				.setUnlocalizedName("Blueberry")
				.setTextureName("additioncorrugated:item_blueberry")
				.setMaxStackSize(64);
		
		PickledPlum = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.jump.id, 60, 0, 0.75F)
				.setUnlocalizedName("PickledPlum")
				.setTextureName("additioncorrugated:item_PickledPlum")
				.setMaxStackSize(64);
		
		Plum = (new ItemFood(2, 0.2F, false))
				.setUnlocalizedName("Plum")
				.setTextureName("additioncorrugated:item_plum")
				.setMaxStackSize(64);
		
		RiceCake = (new ItemFood(2, 0.2F, true))
				.setUnlocalizedName("RiceCake")
				.setTextureName("additioncorrugated:item_ricecake")
				.setMaxStackSize(64);
		
		SeaMustard = (new ItemFood(2, 0.5F, true))
				.setPotionEffect(Potion.waterBreathing.id, 60, 0, 1.0F)
				.setUnlocalizedName("SeaMustard")
				.setTextureName("additioncorrugated:item_seamustard")
				.setMaxStackSize(64);
		
		Adamantite = (new Item())
				.setUnlocalizedName("Adamantite")
				.setTextureName("additioncorrugated:item_ingotadamantite")
				.setMaxStackSize(64);
		
		Cobalt = (new Item())
				.setUnlocalizedName("Cobalt")
				.setTextureName("additioncorrugated:item_ingotcobalt")
				.setMaxStackSize(64);
		
		Demonite = (new Item())
				.setUnlocalizedName("Demonite")
				.setTextureName("additioncorrugated:item_ingotdemonite")
				.setMaxStackSize(64);
		
		Hellstone = (new Item())
				.setUnlocalizedName("Hellstone")
				.setTextureName("additioncorrugated:item_ingothellstone")
				.setMaxStackSize(64);
		
		Meteorite = (new Item())
				.setUnlocalizedName("Meteorite")
				.setTextureName("additioncorrugated:item_ingotmeteorite")
				.setMaxStackSize(64);
		
		Mythril = (new Item())
				.setUnlocalizedName("Mythril")
				.setTextureName("additioncorrugated:item_ingotmythril")
				.setMaxStackSize(64);
		
		SolarFragment = (new Item())
				.setUnlocalizedName("SolarFragment")
				.setTextureName("additioncorrugated:item_solarfragment")
				.setMaxStackSize(64);
		
		GlutinousRice = (new Item())
				.setUnlocalizedName("GlutinousRice")
				.setTextureName("additioncorrugated:item_glutinousrice")
				.setMaxStackSize(64);
		
		Straw = (new Item())
				.setUnlocalizedName("Straw")
				.setTextureName("additioncorrugated:item_straw")
				.setMaxStackSize(64);
		
		Dumpling = (new ItemFood(4, 0.5F, true))
				.setUnlocalizedName("Dumpling")
				.setTextureName("additioncorrugated:item_dumpling")
				.setMaxStackSize(64);
		
		SoySauce = (new ItemFood(1, 0.2F, false))
				.setUnlocalizedName("SoySauce")
				.setTextureName("additioncorrugated:item_soysauce")
				.setMaxStackSize(64);
		
		FermentedSoybeans = (new ItemFood(6, 0.5F, true))
				.setUnlocalizedName("FermentedSoybeans")
				.setTextureName("additioncorrugated:item_fermentedsoybeans")
				.setMaxStackSize(64);
		
		Soybeans = (new ItemFood(2, 0.2F, true))
				.setUnlocalizedName("Soybeans")
				.setTextureName("additioncorrugated:item_soybeans")
				.setMaxStackSize(64);
		
		SpongeGourd = (new Item())
				.setUnlocalizedName("SpongeGourd")
				.setTextureName("additioncorrugated:item_spongegourd")
				.setMaxStackSize(64);
		
		DrySpongeGourd = (new Item())
				.setUnlocalizedName("DrySpongeGourd")
				.setTextureName("additioncorrugated:item_dryspongegourd")
				.setMaxStackSize(64);
		
		Kimchi = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.regeneration.id, 30, 0, 1.0F)
				.setUnlocalizedName("Kimchi")
				.setTextureName("additioncorrugated:item_kimchi")
				.setMaxStackSize(64);
		
		JapaneseLeek = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.moveSpeed.id, 30, 0, 1.0F)
				.setUnlocalizedName("JapaneseLeek")
				.setTextureName("additioncorrugated:item_japaneseleek")
				.setMaxStackSize(64);
		
		Mustard = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.damageBoost.id, 30, 0, 1.0F)
				.setUnlocalizedName("Mustard")
				.setTextureName("additioncorrugated:item_mustard")
				.setMaxStackSize(64);
		
		Capsicum = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.fireResistance.id, 30, 0, 1.0F)
				.setUnlocalizedName("Capsicum")
				.setTextureName("additioncorrugated:item_capsicum")
				.setMaxStackSize(64);
		
		Rice = (new ItemFood(4, 0.5F, true))
				.setUnlocalizedName("Rice")
				.setTextureName("additioncorrugated:item_rice")
				.setMaxStackSize(64);
		
		SeaMustardRevision = (new ItemFood(2, 0.2F, true))
				.setPotionEffect(Potion.waterBreathing.id, 300, 0, 1.0F)
				.setUnlocalizedName("SeaMustardRevision")
				.setTextureName("additioncorrugated:item_seamustardrevision")
				.setMaxStackSize(64);
		
		CorrugatedSword = (new ItemSword(CORRUGATED))
				.setUnlocalizedName("CorrugatedSword")
				.setTextureName("additioncorrugated:item_corrugatedsword")
				.setMaxStackSize(1);
		
		StrongCorrugatedSword = (new ItemSword(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedSword")
				.setTextureName("additioncorrugated:item_strongcorrugatedsword")
				.setMaxStackSize(1);
		
		CorrugatedHoe = (new ItemHoe(CORRUGATED))
				.setUnlocalizedName("CorrugatedHoe")
				.setTextureName("additioncorrugated:item_corrugatedhoe")
				.setMaxStackSize(1);
		
		StrongCorrugatedHoe = (new ItemHoe(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedHoe")
				.setTextureName("additioncorrugated:item_strongcorrugatedhoe")
				.setMaxStackSize(1);
		
		StrongCorrugatedShovel = (new ItemSpade(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedShovel")
				.setTextureName("additioncorrugated:item_strongcorrugatedshovel")
				.setMaxStackSize(1);
		
		CorrugatedShovel = (new ItemSpade(CORRUGATED))
				.setUnlocalizedName("CorrugatedShovel")
				.setTextureName("additioncorrugated:item_corrugatedshovel")
				.setMaxStackSize(1);
		
		StrongCorrugatedAxe = (new ItemStrongCorrugatedAxe(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedAxe")
				.setTextureName("additioncorrugated:item_strongcorrugatedaxe")
				.setMaxStackSize(1);
		
		CorrugatedAxe = (new ItemCorrugatedAxe(CORRUGATED))
				.setUnlocalizedName("CorrugatedAxe")
				.setTextureName("additioncorrugated:item_corrugatedaxe")
				.setMaxStackSize(1);
		
		StrongCorrugatedPickaxe = (new ItemStrongCorrugatedPickaxe(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedPickaxe")
				.setTextureName("additioncorrugated:item_strongcorrugatedpickaxe")
				.setMaxStackSize(1);
		
		CorrugatedPickaxe = (new ItemCorrugatedPickaxe(CORRUGATED))
				.setUnlocalizedName("CorrugatedPickaxe")
				.setTextureName("additioncorrugated:item_corrugatedpickaxe")
				.setMaxStackSize(1);
		
		Silver = (new Item())
				.setUnlocalizedName("Silver")
				.setTextureName("additioncorrugated:item_ingotsilver")
				.setMaxStackSize(64);
		
		Star = (new Item())
				.setUnlocalizedName("Star")
				.setTextureName("additioncorrugated:item_star")
				.setMaxStackSize(64);
		
		AdamantiteSword = (new ItemSword(ADAMANTITE))
				.setUnlocalizedName("AdamantiteSword")
				.setTextureName("additioncorrugated:adamantitesword")
				.setMaxStackSize(1);
		
		AdamantiteHoe = (new ItemHoe(ADAMANTITE))
				.setUnlocalizedName("AdamantiteHoe")
				.setTextureName("additioncorrugated:adamantitehoe")
				.setMaxStackSize(1);
		
		AdamantiteShovel = (new ItemSpade(ADAMANTITE))
				.setUnlocalizedName("AdamantiteShovel")
				.setTextureName("additioncorrugated:adamantiteshovel")
				.setMaxStackSize(1);
		
		AdamantiteAxe = (new ItemAdamantiteAxe(ADAMANTITE))
				.setUnlocalizedName("AdamantiteAxe")
				.setTextureName("additioncorrugated:adamantiteaxe")
				.setMaxStackSize(1);
		
		AdamantitePickaxe = (new ItemAdamantitePickaxe(ADAMANTITE))
				.setUnlocalizedName("AdamantitePickaxe")
				.setTextureName("additioncorrugated:adamantitepickaxe")
				.setMaxStackSize(1);
		
		CobaltSword = (new ItemSword(COBALT))
				.setUnlocalizedName("CobaltSword")
				.setTextureName("additioncorrugated:cobaltsword")
				.setMaxStackSize(1);
		
		CobaltHoe = (new ItemHoe(COBALT))
				.setUnlocalizedName("CobaltHoe")
				.setTextureName("additioncorrugated:cobalthoe")
				.setMaxStackSize(1);
		
		CobaltShovel = (new ItemSpade(COBALT))
				.setUnlocalizedName("CobaltShovel")
				.setTextureName("additioncorrugated:cobaltshovel")
				.setMaxStackSize(1);
		
		CobaltAxe = (new ItemCobaltAxe(COBALT))
				.setUnlocalizedName("CobaltAxe")
				.setTextureName("additioncorrugated:cobaltaxe")
				.setMaxStackSize(1);
		
		CobaltPickaxe = (new ItemCobaltPickaxe(COBALT))
				.setUnlocalizedName("CobaltPickaxe")
				.setTextureName("additioncorrugated:cobaltpickaxe")
				.setMaxStackSize(1);
				
		DemoniteSword = (new ItemSword(DEMONITE))
				.setUnlocalizedName("DemoniteSword")
				.setTextureName("additioncorrugated:demonitesword")
				.setMaxStackSize(1);
		
		DemoniteHoe = (new ItemHoe(DEMONITE))
				.setUnlocalizedName("DemoniteHoe")
				.setTextureName("additioncorrugated:demonitehoe")
				.setMaxStackSize(1);
		
		DemoniteShovel = (new ItemSpade(DEMONITE))
				.setUnlocalizedName("DemoniteShovel")
				.setTextureName("additioncorrugated:demoniteshovel")
				.setMaxStackSize(1);
		
		DemoniteAxe = (new ItemDemoniteAxe(DEMONITE))
				.setUnlocalizedName("DemoniteAxe")
				.setTextureName("additioncorrugated:demoniteaxe")
				.setMaxStackSize(1);
		
		DemonitePickaxe = (new ItemDemonitePickaxe(DEMONITE))
				.setUnlocalizedName("DemonitePickaxe")
				.setTextureName("additioncorrugated:demonitepickaxe")
				.setMaxStackSize(1);
		
		HellstoneSword = (new ItemSword(HELLSTONE))
				.setUnlocalizedName("HellstoneSword")
				.setTextureName("additioncorrugated:hellstonesword")
				.setMaxStackSize(1);
		
		HellstoneHoe = (new ItemHoe(HELLSTONE))
				.setUnlocalizedName("HellstoneHoe")
				.setTextureName("additioncorrugated:hellstonehoe")
				.setMaxStackSize(1);
		
		HellstoneShovel = (new ItemSpade(HELLSTONE))
				.setUnlocalizedName("HellstoneShovel")
				.setTextureName("additioncorrugated:hellstoneshovel")
				.setMaxStackSize(1);
		
		HellstoneAxe = (new ItemHellstoneAxe(HELLSTONE))
				.setUnlocalizedName("HellstoneAxe")
				.setTextureName("additioncorrugated:hellstoneaxe")
				.setMaxStackSize(1);
		
		HellstonePickaxe = (new ItemHellstonePickaxe(HELLSTONE))
				.setUnlocalizedName("HellstonePickaxe")
				.setTextureName("additioncorrugated:hellstonepickaxe")
				.setMaxStackSize(1);
				
		MeteoriteSword = (new ItemSword(METEORITE))
				.setUnlocalizedName("MeteoriteSword")
				.setTextureName("additioncorrugated:meteoritesword")
				.setMaxStackSize(1);
		
		MeteoriteHoe = (new ItemHoe(METEORITE))
				.setUnlocalizedName("MeteoriteHoe")
				.setTextureName("additioncorrugated:meteoritehoe")
				.setMaxStackSize(1);
		
		MeteoriteShovel = (new ItemSpade(METEORITE))
				.setUnlocalizedName("MeteoriteShovel")
				.setTextureName("additioncorrugated:meteoriteshovel")
				.setMaxStackSize(1);
		
		MeteoriteAxe = (new ItemMeteoriteAxe(METEORITE))
				.setUnlocalizedName("MeteoriteAxe")
				.setTextureName("additioncorrugated:meteoriteaxe")
				.setMaxStackSize(1);
		
		MeteoritePickaxe = (new ItemMeteoritePickaxe(MYTHRIL))
				.setUnlocalizedName("MeteoritePickaxe")
				.setTextureName("additioncorrugated:meteoritepickaxe")
				.setMaxStackSize(1);
		MythrilSword = (new ItemSword(MYTHRIL))
				.setUnlocalizedName("MythrilSword")
				.setTextureName("additioncorrugated:mythrilsword")
				.setMaxStackSize(1);

		MythrilHoe = (new ItemHoe(MYTHRIL))
				.setUnlocalizedName("MythrilHoe")
				.setTextureName("additioncorrugated:mythrilhoe")
				.setMaxStackSize(1);
		
		MythrilShovel = (new ItemSpade(MYTHRIL))
				.setUnlocalizedName("MythrilShovel")
				.setTextureName("additioncorrugated:mythrilshovel")
				.setMaxStackSize(1);

		MythrilAxe = (new ItemMythrilAxe(MYTHRIL))
				.setUnlocalizedName("MythrilAxe")
				.setTextureName("additioncorrugated:mythrilaxe")
				.setMaxStackSize(1);

		MythrilPickaxe = (new ItemMythrilPickaxe(MYTHRIL))
				.setUnlocalizedName("MythrilPickaxe")
				.setTextureName("additioncorrugated:mythrilpickaxe")
				.setMaxStackSize(1);
		
		GameRegistry.registerBlock(Corrugated, "Corrugated");
		
		GameRegistry.registerBlock(CorrugatedLight, "CorrugatedLight");
		
		GameRegistry.registerBlock(StrongCorrugated, "StrongCorrugated");
		
		GameRegistry.registerBlock(StrongCorrugatedLight, "StrongCorrugatedLight");
		
		GameRegistry.registerBlock(BlackStone, "BlackStone");
		
		GameRegistry.registerBlock(TStone, "TStone");
		
		GameRegistry.registerBlock(oreTNT, "oreTNT");
		
		GameRegistry.registerBlock(oreAdamantite, "oreAdamantite");
		
		GameRegistry.registerBlock(oreCobalt, "oreCobalt");
		
		GameRegistry.registerBlock(oreDemonite, "oreDemonite");
		
		GameRegistry.registerBlock(oreHellstone, "oreHellstone");
		
		GameRegistry.registerBlock(oreMeteorite, "oreMeteorite");
		
		GameRegistry.registerBlock(oreMythril, "oreMythril");
		
		GameRegistry.registerBlock(oreFluorite, "OreFruorite");
		
		GameRegistry.registerBlock(TemperedGlass, "TemperedGlass");
	
		GameRegistry.registerBlock(ACrecycle, "ACrecycle");
		
		GameRegistry.registerBlock(CorrugatedTorch, "CorrugatedTorch");
		
		GameRegistry.registerBlock(StrongCorrugatedTorch, "StrongCorrugatedTorch");
		
		GameRegistry.registerBlock(StarGravel, "StarGravel");
	
		GameRegistry.registerBlock(SilverGravel, "SilverGravel");
	
		GameRegistry.registerBlock(GoldGravel, "GoldGravel");
		
		GameRegistry.registerBlock(CorrugatedChest, "CorrugatedChest");
		
		GameRegistry.registerBlock(StrongCorrugatedChest, "StrongCorrugatedChest");
		
		GameRegistry.registerBlock(oreSilver, "OreSilver");
		
		GameRegistry.registerBlock(HalfCorrugated, "HalfCorrugated");
		
		GameRegistry.registerBlock(HalfStrongCorrugated, "HalfStrongCorrugated");
		
		GameRegistry.registerBlock(HalfCorrugatedLight, "HalfCorrugatedLight");
		
		GameRegistry.registerBlock(HalfStrongCorrugatedLight, "HalfStrongCorrugatedLight");
		
		GameRegistry.registerBlock(CorrugatedWorldPortal, "CorrugatedWorldPortal");
		
		GameRegistry.registerItem(StrongPaper, "itemStrongPaper");
		
		GameRegistry.registerItem(RustyEdge, "itemRustyEdge");
		
		GameRegistry.registerItem(Edge, "itemEdge");
		
		GameRegistry.registerItem(PolishngPowder, "itempolishngpowder");
		
		GameRegistry.registerItem(CorrugatedBoard, "itemCorrugatedBoard");
		
		GameRegistry.registerItem(Cutter, "itemCutter");
		
		GameRegistry.registerItem(Fluorite, "itemFluorite");
		
		GameRegistry.registerItem(StrongCorrugatedBoard, "itemStrongCorrugatedBoard");
		
		GameRegistry.registerItem(Gum, "Gum");
		
		GameRegistry.registerItem(MintGum, "MintGum");
		
		GameRegistry.registerItem(SuperMintGum, "SuperMintGum");
		
		GameRegistry.registerItem(ChocolateBar, "ChocolateBar");
		
		GameRegistry.registerItem(Blueberry, "Blueberry");
		
		GameRegistry.registerItem(PickledPlum, "PickledPlum");
		
		GameRegistry.registerItem(Plum, "Plum");
		
		GameRegistry.registerItem(RiceCake, "RiceCake");
		
		GameRegistry.registerItem(SeaMustard, "SeaMustard");
		
		GameRegistry.registerItem(Adamantite, "Adamantite");
		
		GameRegistry.registerItem(Cobalt, "Cobalt");
		
		GameRegistry.registerItem(Demonite, "Demonite");
		
		GameRegistry.registerItem(Hellstone, "Hellstone");
		
		GameRegistry.registerItem(Meteorite, "Meteorite");
		
		GameRegistry.registerItem(Mythril, "Mythril");
		
		GameRegistry.registerItem(SolarFragment, "SolarFragment");
		
		GameRegistry.registerItem(GlutinousRice, "GlutinousRice");
		
		GameRegistry.registerItem(Straw, "Straw");
		
		GameRegistry.registerItem(Dumpling, "Dumpling");
		
		GameRegistry.registerItem(SoySauce, "SoySauce");
		
		GameRegistry.registerItem(FermentedSoybeans, "FermentedSoybeans");
		
		GameRegistry.registerItem(Soybeans, "Soybeans");
		
		GameRegistry.registerItem(SpongeGourd, "SpongeGourd");
		
		GameRegistry.registerItem(DrySpongeGourd, "DrySpongeGourd");
		
		GameRegistry.registerItem(Kimchi, "Kimchi");
		
		GameRegistry.registerItem(JapaneseLeek, "JapaneseLeek");
		
		GameRegistry.registerItem(Mustard, "Mustard");
		
		GameRegistry.registerItem(Capsicum, "Capsicum");
		
		GameRegistry.registerItem(Rice, "Rice");
		
		GameRegistry.registerItem(SeaMustardRevision, "SeaMustardRevision");
		
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
		
		GameRegistry.registerItem(Silver, "Silver");
		
		GameRegistry.registerItem(Star, "Star");
		
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
		
		OreDictionary.registerOre("oreFluorite", new ItemStack(this.oreFluorite, 1, 0));
		
		OreDictionary.registerOre("gemFluorite", new ItemStack(this.Fluorite, 1, 0));
		
		OreDictionary.registerOre("oreTNT", new ItemStack(this.oreTNT, 1, 0));
		
		OreDictionary.registerOre("natto", new ItemStack(this.FermentedSoybeans, 1, 0));
		
		OreDictionary.registerOre("soybeans", new ItemStack(this.Soybeans, 1, 0));
		
		OreDictionary.registerOre("bottlesoysauce", new ItemStack(this.SoySauce, 1, 0));
		
		OreDictionary.registerOre("oreAdamantite", new ItemStack(this.oreAdamantite, 1, 0));
		
		OreDictionary.registerOre("oreCobalt", new ItemStack(this.oreCobalt, 1, 0));
		
		OreDictionary.registerOre("oreDemonite", new ItemStack(this.oreDemonite, 1, 0));
		
		OreDictionary.registerOre("oreHellstone", new ItemStack(this.oreHellstone, 1, 0));
		
		OreDictionary.registerOre("oreMeteorite", new ItemStack(this.oreMeteorite, 1, 0));
		
		OreDictionary.registerOre("oreMythril", new ItemStack(this.oreMythril, 1, 0));
		
		OreDictionary.registerOre("Adamantite", new ItemStack(this.Adamantite, 1, 0));
		
		OreDictionary.registerOre("Cobalt", new ItemStack(this.Cobalt, 1, 0));
		
		OreDictionary.registerOre("Demonite", new ItemStack(this.Demonite, 1, 0));
		
		OreDictionary.registerOre("Hellstone", new ItemStack(this.Hellstone, 1, 0));
		
		OreDictionary.registerOre("Meteorite", new ItemStack(this.Meteorite, 1, 0));
		
		OreDictionary.registerOre("Mythril", new ItemStack(this.Mythril, 1, 0));
		
		OreDictionary.registerOre("Rice", new ItemStack(this.Rice, 1, 0));
		
		OreDictionary.registerOre("JapaneseLeek", new ItemStack(this.JapaneseLeek, 1, 0));
		
		OreDictionary.registerOre("GlutinousRice", new ItemStack(this.GlutinousRice, 1, 0));
		
		OreDictionary.registerOre("RiceCake", new ItemStack(this.RiceCake, 1, 0));
		
		OreDictionary.registerOre("oreSilver", new ItemStack(this.oreSilver, 1, 0));
		
		OreDictionary.registerOre("ingotSilver", new ItemStack(this.Silver, 1, 0));
		
/*/		DimensionManager.registerProviderType(providerType, WorldProviderCorrugated.class, false);/*/
		
/*/		DimensionManager.registerDimension(CorrugatedDimesionID, providerType);/*/
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		try
		{
			config.load();
			ACVillagerID = config.get(Configuration.CATEGORY_GENERAL, "ACVillagerID", 9).getInt();
		}
		catch (Exception e)
		{
			FMLLog.severe("Error Message(Addition Corrugated)");
		}
		finally
		{
			config.save();
		}
		}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.addRecipe(new ItemStack(Corrugated, 1),
		new Object[]{ "X X","X X","XXX",
				'X',Items.paper});
		
		GameRegistry.addRecipe(new ItemStack(Corrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',CorrugatedBoard});
		
		GameRegistry.addShapelessRecipe(new ItemStack(CorrugatedBoard, 9),
				new Object[]{
				new ItemStack(Corrugated,1)});
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(CorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(Items.paper, 1, 0)}));
		
		GameRegistry.addRecipe(new ItemStack(StrongCorrugated, 1),
				new Object[]{ "X X","X X","XXX",
						'X',StrongPaper});
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(StrongCorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(StrongPaper, 1, 0)}));
		
		GameRegistry.addRecipe(new ItemStack(Cutter, 1),
				new Object[]{ "XYX","XYX","XYX",
						'X',Items.stick,'Y',Edge});
		
		GameRegistry.addShapelessRecipe(new ItemStack(StrongPaper, 1),
				new Object[]{
				new ItemStack(Items.paper,1),new ItemStack(Blocks.obsidian,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Edge, 1),
				new Object[]{
					new ItemStack(PolishngPowder,1),new ItemStack(RustyEdge,1)});
		
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(Edge, 1), 0.75F);
		
		GameRegistry.addSmelting(oreFluorite, new ItemStack(Fluorite, 1), 0.99F);
		
		GameRegistry.addSmelting(oreAdamantite, new ItemStack(Adamantite, 1), 0.99F);
		
		GameRegistry.addSmelting(oreCobalt, new ItemStack(Cobalt, 1), 0.99F);
		
		GameRegistry.addSmelting(oreDemonite, new ItemStack(Demonite, 1), 0.99F);
		
		GameRegistry.addSmelting(oreHellstone, new ItemStack(Hellstone, 1), 0.99F);
		
		GameRegistry.addSmelting(oreMeteorite, new ItemStack(Meteorite, 1), 0.99F);
		
		GameRegistry.addSmelting(oreMythril, new ItemStack(Mythril, 1), 0.99F);
		
		GameRegistry.addSmelting(oreSilver, new ItemStack(Silver, 1), 0.99F);
		
		GameRegistry.addRecipe(new ItemStack(StrongCorrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',StrongCorrugatedBoard});
		
		GameRegistry.addShapelessRecipe(new ItemStack(StrongCorrugatedBoard, 9),
				new Object[]{
				new ItemStack(StrongCorrugated,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(TemperedGlass, 1),
				new Object[]{
				new ItemStack(Blocks.glass,1),new ItemStack(Blocks.obsidian,1)});
		
		GameRegistry.addRecipe(new ItemStack(Gum, 1),
				new Object[]{ "XXX","YYY"," Z ",
						'X',Items.sugar,'Y',Items.wheat,'Z',Items.water_bucket});
		
		GameRegistry.addShapelessRecipe(new ItemStack(MintGum, 6),
				new Object[]{
				new ItemStack(Gum,1),new ItemStack(Items.gold_ingot,1)});
		
		GameRegistry.addRecipe(new ItemStack(SuperMintGum, 1),
				new Object[]{ " Y ","YXY"," Y ",
						'X',MintGum,'Y',Items.redstone});
		
		GameRegistry.addRecipe(new ItemStack(ChocolateBar, 1),
				new Object[]{ " X ","YZY","ZYZ",
						'X',Items.water_bucket,'Y',Items.sugar,'Z',new ItemStack(Items.blaze_powder, 1, 3)});
		
			GameRegistry.addShapelessRecipe(new ItemStack(TStone, 1),
			new Object[]{
				new ItemStack(Blocks.tnt,1),new ItemStack(Blocks.stone,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(RiceCake, 1),
					new Object[]{
					new ItemStack(GlutinousRice,1),new ItemStack(Items.water_bucket,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(PickledPlum, 1),
					new Object[]{
					new ItemStack(SolarFragment,1),new ItemStack(Items.water_bucket,1),new ItemStack(Plum,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(Straw, 1),
					new Object[]{
					new ItemStack(SolarFragment,1),new ItemStack(Items.wheat,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(BlackStone, 1),
					new Object[]{
					new ItemStack(Blocks.stone,1),new ItemStack(Items.blaze_powder, 1, 0)});
			
			GameRegistry.addRecipe(new ItemStack(Dumpling, 1),
					new Object[]{ "X Y"," X ","  Z",
							'X',RiceCake,'Y',SoySauce,'Z',new ItemStack(Items.stick, 1)});
			
			GameRegistry.addRecipe(new ItemStack(FermentedSoybeans, 1),
					new Object[]{ " X "," Y "," Z ",
							'X',SoySauce,'Y',Soybeans,'Z',Straw});
			
			GameRegistry.addRecipe(new ItemStack(Blocks.sponge, 1),
					new Object[]{ "XXX","XXX","XXX",
							'X',DrySpongeGourd});
			
			GameRegistry.addShapelessRecipe(new ItemStack(DrySpongeGourd, 1),
					new Object[]{
					new ItemStack(SpongeGourd,1),new ItemStack(SolarFragment, 1)});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedSword, 1),
					new Object[]{ " X "," X "," Y ",
							'X',Corrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(StrongCorrugatedSword, 1),
					new Object[]{ " X "," X "," Y ",
							'X',StrongCorrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedAxe, 1),
					new Object[]{ "XX ","XY "," Y ",
							'X',Corrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(StrongCorrugatedAxe, 1),
					new Object[]{ "XX ","XY "," Y ",
							'X',StrongCorrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedPickaxe, 1),
					new Object[]{ "XXX"," Y "," Y ",
							'X',Corrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(StrongCorrugatedPickaxe, 1),
					new Object[]{ "XXX"," Y "," Y ",
							'X',StrongCorrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedShovel, 1),
					new Object[]{ " X "," Y "," Y ",
							'X',Corrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(StrongCorrugatedShovel, 1),
					new Object[]{ " X "," Y "," Y ",
							'X',StrongCorrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedHoe, 1),
					new Object[]{ "XX "," Y "," Y ",
							'X',Corrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(StrongCorrugatedHoe, 1),
					new Object[]{ "XX "," Y "," Y ",
							'X',StrongCorrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedTorch, 1),
					new Object[]{ "X","Y",
							'X',CorrugatedLight,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(StrongCorrugatedTorch, 1),
					new Object[]{ "X","Y",
							'X',StrongCorrugatedLight,'Y',Items.stick});
			
			GameRegistry.addShapelessRecipe(new ItemStack(GoldGravel, 1),
					new Object[]{
					new ItemStack(Blocks.gravel,1),new ItemStack(Items.gold_ingot,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(SilverGravel, 1),
					new Object[]{
					new ItemStack(Blocks.gravel,1),new ItemStack(Silver,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(StarGravel, 1),
					new Object[]{
					new ItemStack(Blocks.gravel,1),new ItemStack(Star,1)});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedChest, 1),
					new Object[]{ "XXX","X X","XXX",
							'X',Items.paper});
			
			GameRegistry.addRecipe(new ItemStack(StrongCorrugatedChest, 1),
					new Object[]{ "XXX","X X","XXX",
							'X',StrongPaper});
			
			GameRegistry.addRecipe(new ItemStack(AdamantiteSword, 1),
					new Object[]{ " X "," X "," Y ",
							'X',Adamantite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(AdamantiteHoe, 1),
					new Object[]{ "XX "," Y "," Y ",
							'X',Adamantite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(AdamantiteShovel, 1),
					new Object[]{ " X "," Y "," Y ",
							'X',Adamantite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(AdamantiteAxe, 1),
					new Object[]{ "XX ","XY "," Y ",
							'X',Adamantite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(AdamantitePickaxe, 1),
					new Object[]{ "XXX"," Y "," Y ",
							'X',Adamantite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CobaltSword, 1),
					new Object[]{ " X "," X "," Y ",
							'X',Cobalt,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CobaltHoe, 1),
					new Object[]{ "XX "," Y "," Y ",
							'X',Cobalt,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CobaltShovel, 1),
					new Object[]{ " X "," Y "," Y ",
							'X',Cobalt,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CobaltAxe, 1),
					new Object[]{ "XX ","XY "," Y ",
							'X',Cobalt,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CobaltPickaxe, 1),
					new Object[]{ "XXX"," Y "," Y ",
							'X',Cobalt,'Y',Items.stick});		
			
			GameRegistry.addRecipe(new ItemStack(DemoniteSword, 1),
					new Object[]{ " X "," X "," Y ",
							'X',Demonite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(DemoniteHoe, 1),
					new Object[]{ "XX "," Y "," Y ",
							'X',Demonite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(DemoniteShovel, 1),
					new Object[]{ " X "," Y "," Y ",
							'X',Demonite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(DemoniteAxe, 1),
					new Object[]{ "XX ","XY "," Y ",
							'X',Demonite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(DemonitePickaxe, 1),
					new Object[]{ "XXX"," Y "," Y ",
							'X',Demonite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(HellstoneSword, 1),
					new Object[]{ " X "," X "," Y ",
							'X',Hellstone,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(HellstoneHoe, 1),
					new Object[]{ "XX "," Y "," Y ",
							'X',Hellstone,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(HellstoneShovel, 1),
					new Object[]{ " X "," Y "," Y ",
							'X',Hellstone,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(HellstoneAxe, 1),
					new Object[]{ "XX ","XY "," Y ",
							'X',Hellstone,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(HellstonePickaxe, 1),
					new Object[]{ "XXX"," Y "," Y ",
							'X',Hellstone,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(MeteoriteSword, 1),
					new Object[]{ " X "," X "," Y ",
							'X',Meteorite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(MeteoriteHoe, 1),
					new Object[]{ "XX "," Y "," Y ",
							'X',Meteorite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(MeteoriteShovel, 1),
					new Object[]{ " X "," Y "," Y ",
							'X',Meteorite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(MeteoriteAxe, 1),
					new Object[]{ "XX ","XY "," Y ",
							'X',Meteorite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(MeteoritePickaxe, 1),
					new Object[]{ "XXX"," Y "," Y ",
							'X',Meteorite,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(MythrilSword, 1),
					new Object[]{ " X "," X "," Y ",
							'X',Mythril,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(MythrilHoe, 1),
					new Object[]{ "XX "," Y "," Y ",
							'X',Mythril,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(MythrilShovel, 1),
					new Object[]{ " X "," Y "," Y ",
							'X',Mythril,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(MythrilAxe, 1),
					new Object[]{ "XX ","XY "," Y ",
							'X',Mythril,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(MythrilPickaxe, 1),
					new Object[]{ "XXX"," Y "," Y ",
							'X',Mythril,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(ACrecycle, 1),
					new Object[]{ "XXX","XZX","YQY",
							'X',Corrugated,'Y',StrongCorrugated,'Z',Items.flint_and_steel,'Q',Items.water_bucket});
			
			GameRegistry.addShapelessRecipe(new ItemStack(HalfCorrugated, 2),
					new Object[]{
					new ItemStack(Corrugated,1),new ItemStack(Cutter,-1,32767)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(HalfStrongCorrugated, 2),
					new Object[]{
					new ItemStack(StrongCorrugated,1),new ItemStack(Cutter,-1,32767)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(HalfCorrugatedLight, 2),
					new Object[]{
					new ItemStack(CorrugatedLight,1),new ItemStack(Cutter,-1,32767)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(HalfStrongCorrugatedLight, 2),
					new Object[]{
					new ItemStack(StrongCorrugatedLight,1),new ItemStack(Cutter,-1,32767)});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedWorldPortal, 1),
					new Object[]{ "XYX","YZY","XYX",
							'X',Corrugated,'Y',Fluorite,'Z',Items.diamond});
			
			GameRegistry.registerFuelHandler(new IFuelHandler()
			{
				public int getBurnTime(ItemStack fuel)
				{
					if(fuel.equals(Corrugated))
					{
						return 500;
					}
					return 0;
				}
			});
			
			GameRegistry.registerFuelHandler(new IFuelHandler()
			{
				public int getBurnTime(ItemStack fuel)
				{
					if(fuel.equals(CorrugatedLight))
					{
						return 600;
					}
					return 0;
				}
			});
			
			GameRegistry.registerFuelHandler(new IFuelHandler()
			{
				public int getBurnTime(ItemStack fuel)
				{
					if(equals(HalfCorrugated))
					{
						return 250;
					}
					return 0;
				}
			});

			GameRegistry.registerFuelHandler(new IFuelHandler()
			{
				public int getBurnTime(ItemStack fuel)
				{
					if(equals(HalfCorrugatedLight))
					{
						return 300;
					}
					return 0;
				}
			});
			
			GameRegistry.registerFuelHandler(new IFuelHandler()
			{
				public int getBurnTime(ItemStack fuel)
				{
					if(fuel.getItem().equals(CorrugatedBoard))
					{
						return 100;
					}
					return 0;
				}
			});
			
			GameRegistry.registerFuelHandler(new IFuelHandler()
			{
				public int getBurnTime(ItemStack fuel)
				{
					if(fuel.getItem().equals(CorrugatedAxe))
					{
						return 250;
					}
					return 0;
				}
			});
			
			GameRegistry.registerFuelHandler(new IFuelHandler()
			{
				public int getBurnTime(ItemStack fuel)
				{
					if(fuel.equals(CorrugatedChest))
					{
						return 800;
					}
					return 0;
				}
			});
			
			GameRegistry.registerFuelHandler(new IFuelHandler()
			{
				public int getBurnTime(ItemStack fuel)
				{
					if(fuel.getItem().equals(CorrugatedHoe))
					{
						return 250;
					}
					return 0;
				}
			});
			
			GameRegistry.registerFuelHandler(new IFuelHandler()
			{
				public int getBurnTime(ItemStack fuel)
				{
					if(fuel.getItem().equals(CorrugatedPickaxe))
					{
						return 250;
					}
					return 0;
				}
			});
			
			GameRegistry.registerFuelHandler(new IFuelHandler()
			{
				public int getBurnTime(ItemStack fuel)
				{
					if(fuel.getItem().equals(CorrugatedShovel))
					{
						return 250;
					}
					return 0;
				}
			});
			
			GameRegistry.registerFuelHandler(new IFuelHandler()
			{
				public int getBurnTime(ItemStack fuel)
				{
					if(fuel.getItem().equals(CorrugatedSword))
					{
						return 250;
					}
					return 0;
				}
			});
			
			CorrugatedBoard = (CorrugatedBoard).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedBoard = (StrongCorrugatedBoard).setCreativeTab(AdditionCorrugatedMODTab);
			
			Cutter = (Cutter).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongPaper = (StrongPaper).setCreativeTab(AdditionCorrugatedMODTab);
			
			RustyEdge = (RustyEdge).setCreativeTab(AdditionCorrugatedMODTab);
			
			PolishngPowder = (PolishngPowder).setCreativeTab(AdditionCorrugatedMODTab);
			
			Edge = (Edge).setCreativeTab(AdditionCorrugatedMODTab);
			
			Fluorite = (Fluorite).setCreativeTab(AdditionCorrugatedMODTab);
			
			Corrugated = (Corrugated).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreFluorite = (oreFluorite).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedLight = (CorrugatedLight).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugated = (StrongCorrugated).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedLight = (StrongCorrugatedLight).setCreativeTab(AdditionCorrugatedMODTab);
			
			TemperedGlass = (TemperedGlass).setCreativeTab(AdditionCorrugatedMODTab);
			
			Gum = (Gum).setCreativeTab(AdditionCorrugatedMODTab);
			
			MintGum = (MintGum).setCreativeTab(AdditionCorrugatedMODTab);
			
			SuperMintGum = (SuperMintGum).setCreativeTab(AdditionCorrugatedMODTab);
			
			ChocolateBar = (ChocolateBar).setCreativeTab(AdditionCorrugatedMODTab);
			
			TStone = (TStone).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreTNT = (oreTNT).setCreativeTab(AdditionCorrugatedMODTab);
			
			Blueberry = (Blueberry).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreAdamantite = (oreAdamantite).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreCobalt = (oreCobalt).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreDemonite = (oreDemonite).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreHellstone = (oreHellstone).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreMeteorite = (oreMeteorite).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreMythril = (oreMythril).setCreativeTab(AdditionCorrugatedMODTab);
			
			PickledPlum = (PickledPlum).setCreativeTab(AdditionCorrugatedMODTab);
			
			Plum = (Plum).setCreativeTab(AdditionCorrugatedMODTab);
			
			RiceCake = (RiceCake).setCreativeTab(AdditionCorrugatedMODTab);
			
			Adamantite = (Adamantite).setCreativeTab(AdditionCorrugatedMODTab);
			
			Cobalt = (Cobalt).setCreativeTab(AdditionCorrugatedMODTab);
			
			Demonite = (Demonite).setCreativeTab(AdditionCorrugatedMODTab);
			
			Hellstone = (Hellstone).setCreativeTab(AdditionCorrugatedMODTab);
			
			Meteorite = (Meteorite).setCreativeTab(AdditionCorrugatedMODTab);
			
			Mythril = (Mythril).setCreativeTab(AdditionCorrugatedMODTab);
			
			SolarFragment = (SolarFragment).setCreativeTab(AdditionCorrugatedMODTab);
			
			GlutinousRice = (GlutinousRice).setCreativeTab(AdditionCorrugatedMODTab);
			
			Straw = (Straw).setCreativeTab(AdditionCorrugatedMODTab);
			
			BlackStone = (BlackStone).setCreativeTab(AdditionCorrugatedMODTab);
			
			SeaMustard = (SeaMustard).setCreativeTab(AdditionCorrugatedMODTab);
			
			Dumpling = (Dumpling).setCreativeTab(AdditionCorrugatedMODTab);
			
			SoySauce = (SoySauce).setCreativeTab(AdditionCorrugatedMODTab);
			
			FermentedSoybeans = (FermentedSoybeans).setCreativeTab(AdditionCorrugatedMODTab);
			
			Soybeans = (Soybeans).setCreativeTab(AdditionCorrugatedMODTab);
			
			SpongeGourd = (SpongeGourd).setCreativeTab(AdditionCorrugatedMODTab);
			
			DrySpongeGourd = (DrySpongeGourd).setCreativeTab(AdditionCorrugatedMODTab);
			
			Kimchi = (Kimchi).setCreativeTab(AdditionCorrugatedMODTab);
			
			JapaneseLeek = (JapaneseLeek).setCreativeTab(AdditionCorrugatedMODTab);
			
			Mustard = (Mustard).setCreativeTab(AdditionCorrugatedMODTab);
			
			Capsicum = (Capsicum).setCreativeTab(AdditionCorrugatedMODTab);
			
			Rice = (Rice).setCreativeTab(AdditionCorrugatedMODTab);
			
			SeaMustardRevision = (SeaMustardRevision).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedSword = (CorrugatedSword).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedSword = (StrongCorrugatedSword).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedHoe = (StrongCorrugatedHoe).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedHoe = (CorrugatedHoe).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedShovel = (StrongCorrugatedShovel).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedShovel = (CorrugatedShovel).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedAxe = (StrongCorrugatedAxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedAxe = (CorrugatedAxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedPickaxe = (StrongCorrugatedPickaxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedPickaxe = (CorrugatedPickaxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			ACrecycle = (ACrecycle).setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
			
			CorrugatedTorch = (CorrugatedTorch).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedTorch = (StrongCorrugatedTorch).setCreativeTab(AdditionCorrugatedMODTab);
			
			StarGravel = (StarGravel).setCreativeTab(AdditionCorrugatedMODTab);
	
			SilverGravel = (SilverGravel).setCreativeTab(AdditionCorrugatedMODTab);
	
			GoldGravel = (GoldGravel).setCreativeTab(AdditionCorrugatedMODTab);
			
			Silver = (Silver).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreSilver = (oreSilver).setCreativeTab(AdditionCorrugatedMODTab);
			
			Star = (Star).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedChest = (CorrugatedChest).setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
			
			StrongCorrugatedChest = (StrongCorrugatedChest).setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
			
			AdamantiteSword = (AdamantiteSword).setCreativeTab(AdditionCorrugatedMODTab);
			
			AdamantiteHoe = (AdamantiteHoe).setCreativeTab(AdditionCorrugatedMODTab);
			
			AdamantiteShovel = (AdamantiteShovel).setCreativeTab(AdditionCorrugatedMODTab);
			
			AdamantiteAxe = (AdamantiteAxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			AdamantitePickaxe = (AdamantitePickaxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			CobaltSword = (CobaltSword).setCreativeTab(AdditionCorrugatedMODTab);
			
			CobaltHoe = (CobaltHoe).setCreativeTab(AdditionCorrugatedMODTab);
			
			CobaltShovel = (CobaltShovel).setCreativeTab(AdditionCorrugatedMODTab);
			
			CobaltAxe = (CobaltAxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			CobaltPickaxe = (CobaltPickaxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			DemoniteSword = (DemoniteSword).setCreativeTab(AdditionCorrugatedMODTab);
			
			DemoniteHoe = (DemoniteHoe).setCreativeTab(AdditionCorrugatedMODTab);
			
			DemoniteShovel = (DemoniteShovel).setCreativeTab(AdditionCorrugatedMODTab);
			
			DemoniteAxe = (DemoniteAxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			DemonitePickaxe = (DemonitePickaxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			HellstoneSword = (HellstoneSword).setCreativeTab(AdditionCorrugatedMODTab);
			
			HellstoneHoe = (HellstoneHoe).setCreativeTab(AdditionCorrugatedMODTab);
			
			HellstoneShovel = (HellstoneShovel).setCreativeTab(AdditionCorrugatedMODTab);
			
			HellstoneAxe = (HellstoneAxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			HellstonePickaxe = (HellstonePickaxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			MeteoriteSword = (MeteoriteSword).setCreativeTab(AdditionCorrugatedMODTab);
			
			MeteoriteHoe = (MeteoriteHoe).setCreativeTab(AdditionCorrugatedMODTab);
			
			MeteoriteShovel = (MeteoriteShovel).setCreativeTab(AdditionCorrugatedMODTab);
			
			MeteoriteAxe = (MeteoriteAxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			MeteoritePickaxe = (MeteoritePickaxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			MythrilSword = (MythrilSword).setCreativeTab(AdditionCorrugatedMODTab);
			
			MythrilHoe = (MythrilHoe).setCreativeTab(AdditionCorrugatedMODTab);
			
			MythrilShovel = (MythrilShovel).setCreativeTab(AdditionCorrugatedMODTab);
			
			MythrilAxe = (MythrilAxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			MythrilPickaxe = (MythrilPickaxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			HalfCorrugated = (HalfCorrugated).setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
			
			HalfStrongCorrugated = (HalfStrongCorrugated).setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
			
			HalfCorrugatedLight = (HalfCorrugatedLight).setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
			
			HalfStrongCorrugatedLight = (HalfStrongCorrugatedLight).setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
			
			CorrugatedWorldPortal = (CorrugatedWorldPortal).setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
			
			GameRegistry.registerWorldGenerator(new BlockoreFluorite(), 7);
			
			GameRegistry.registerWorldGenerator(new BlockoreTNT(), 8);
			
			GameRegistry.registerWorldGenerator(new BlockBlackStone(), 9);
			
			GameRegistry.registerWorldGenerator(new BlockoreAdamantite(), 6);
			
			GameRegistry.registerWorldGenerator(new BlockoreCobalt(), 5);
			
			GameRegistry.registerWorldGenerator(new BlockoreMythril(), 4);
			
			GameRegistry.registerWorldGenerator(new BlockoreDemonite(), 3);
			
			GameRegistry.registerWorldGenerator(new BlockoreHellstone(), 2);
			
			GameRegistry.registerWorldGenerator(new BlockoreMeteorite(), 1);
			
			GameRegistry.registerWorldGenerator(new BlockoreSilver(), 10);
			
			取引 = new ACTrade();
						
			VillagerRegistry.instance().registerVillagerId(ACVillagerID);
			
			VillagerRegistry.instance().registerVillageTradeHandler(ACVillagerID, 取引);
			
			proxy.init();
	}
	
	@Mod.EventHandler
	public void load(FMLInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(Cutter);
	}
}