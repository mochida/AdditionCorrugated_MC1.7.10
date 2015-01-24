package AdditionCorrugated;

import AdditionCorrugated.*;
import net.minecraft.block.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.creativetab.*;
import net.minecraftforge.common.config.*;
import net.minecraftforge.common.util.*;
import AdditionCorrugated.GUI.*;
import AdditionCorrugated.Item.*;
import AdditionCorrugated.Block.*;
import AdditionCorrugated.Entity.*;
import AdditionCorrugated.common.*;
import AdditionCorrugated.Entity.Render.*;

@Mod(modid="Addition Corrugated", name="Addition Corrugated", version="1.6.0_alpha5_MC1.7.10")
public class AdditionCorrugatedCore
{
/*********予定*********
	木
	植物
	防具
	可燃
	AC通販
	MOBのスポーン&Drop
	ハーフブロックの不具合修正
	ACRecycle(｛強化｝紙→｛強化｝再生紙)
	ダンボールチェストと強化ダンボールチェストのテクスチャ&並べるとテクスチャがラージになる不具合修正
**********************/
	@Mod.Instance("Addition Corrugated")
	public static AdditionCorrugatedCore instance;
	
	@SidedProxy(clientSide = "AdditionCorrugated.Client.ClientProxy", serverSide = "AdditionCorrugated.common.CommonProxy")
	public static CommonProxy proxy;
	
	public static final int ACRecycleGUI = 1;
	
	public static final CreativeTabs AdditionCorrugatedMODTab = new CreativeTabAdditionCorrugatedMOD("AdditionCorrugatedMODTab");
	
	public static final CreativeTabs AdditionCorrugatedMOD_Under_DevelopmentTab = new CreativeTabAdditionCorrugatedMOD_Under_Development("AdditionCorrugatedMOD_Under_DevelopmentTab");
	
	public static final Block command_Block = (Blocks.command_block).setCreativeTab(CreativeTabs.tabRedstone);
	
	public static final Item command_block_minecart = (Items.command_block_minecart).setCreativeTab(CreativeTabs.tabTransport);
	
	public static boolean DebugMode = false;
	
	public static int CorrugatedCreeperID;
	
	public static int ACVillagerID;
	
	public static Item.ToolMaterial CORRUGATED = EnumHelper.addToolMaterial("CORRUGATED", 0, 100, 1.0F, 1.0F, 1);
	
	public static Item.ToolMaterial STRONGCORRUGATED = EnumHelper.addToolMaterial("STRONGCORRUGATED", 2, 500, 3.0F, 3.0F, 5);
	
	public static Item.ToolMaterial ADAMANTITE = EnumHelper.addToolMaterial("ADAMANTITE", 0, 1000, 3.0F, 1.0F, 10);
	
	public static Item.ToolMaterial COBALT = EnumHelper.addToolMaterial("COBALT", 0, 1000, 3.0F, 2.0F, 15);
	
	public static Item.ToolMaterial DEMONITE = EnumHelper.addToolMaterial("DEMONITE", 0, 1000, 4.0F, 3.0F, 20);
	
	public static Item.ToolMaterial HELLSTONE = EnumHelper.addToolMaterial("HELLSTONE", 0, 1000, 5.0F, 2.0F, 20);
	
	public static Item.ToolMaterial METEORITE = EnumHelper.addToolMaterial("METEORITE", 0, 1000, 1.0F, 1.0F, 15);
	
	public static Item.ToolMaterial MYTHRIL = EnumHelper.addToolMaterial("MYTHRIL", 0, 1000, 2.0F, 2.0F, 15);
	
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
	
	public static Block RecycledCorrugated;
	
	public static Block StrongRecycledCorrugated;
	
	public static Block RecycledCorrugatedLight;
	
	public static Block StrongRecycledCorrugatedLight;
	
	public static Item RecycledPaper;
	
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
	
	public static Item Spawn_Egg_CorrugatedCreeper;
	
	public static Item StrongRecycledPaper;
		
	public static Item RecycledCorrugatedBoard;
	
	public static Item StrongRecycledCorrugatedBoard;
	
	private ACTrade 取引;
	
	@Mod.EventHandler
	public void load(FMLInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(Cutter);
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Corrugated = new BlockCorrugated()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		CorrugatedLight = new BlockCorrugatedLight()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		StrongCorrugated = new BlockStrongCorrugated()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		StrongCorrugatedLight = new BlockStrongCorrugatedLight()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		BlackStone = new BlockBlackStone()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		TStone = new BlockTStone()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		oreTNT = new BlockoreTNT()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		oreAdamantite = new BlockoreAdamantite()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		oreCobalt = new BlockoreCobalt()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		oreDemonite = new BlockoreDemonite()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		oreHellstone = new BlockoreHellstone()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		oreMeteorite = new BlockoreMeteorite()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		oreMythril = new BlockoreMythril()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		oreFluorite = new BlockoreFluorite()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		TemperedGlass = new BlockTemperedGlass()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		ACrecycle = new BlockACrecycle()
		.setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
		
		CorrugatedTorch = new BlockCorrugatedTorch()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		StrongCorrugatedTorch = new BlockStrongCorrugatedTorch()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		StarGravel = new BlockStarGravel()
		.setCreativeTab(AdditionCorrugatedMODTab);
	
		SilverGravel = new BlockSilverGravel()
		.setCreativeTab(AdditionCorrugatedMODTab);
	
		GoldGravel = new BlockGoldGravel()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		oreSilver = new BlockoreSilver()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		CorrugatedChest = new BlockCorrugatedChest(0)
		.setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
		
		StrongCorrugatedChest = new BlockStrongCorrugatedChest(0)
		.setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
		
		HalfCorrugated = new BlockHalfCorrugated(true, null)
		.setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
		
		HalfStrongCorrugated = new BlockHalfStrongCorrugated(true, null)
		.setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
		
		HalfCorrugatedLight = new BlockHalfCorrugatedLight(true, null)
		.setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
		
		HalfStrongCorrugatedLight = new BlockHalfStrongCorrugatedLight(true, null)
		.setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
		
		StrongRecycledCorrugated = new BlockStrongRecycledCorrugated()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		RecycledCorrugated = new BlockRecycledCorrugated()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		StrongRecycledCorrugatedLight = new BlockStrongRecycledCorrugatedLight()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		RecycledCorrugatedLight = new BlockRecycledCorrugatedLight()
		.setCreativeTab(AdditionCorrugatedMODTab);
		
		StrongPaper = (new Item())
				.setUnlocalizedName("StrongPaper")
				.setTextureName("additioncorrugated:item_strongpaper")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		RustyEdge = (new Item())
				.setUnlocalizedName("RustyEdge")
				.setTextureName("additioncorrugated:item_rustedge")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Edge = (new Item())
				.setUnlocalizedName("Edge")
				.setTextureName("additioncorrugated:item_edge")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		PolishngPowder = (new Item())
				.setUnlocalizedName("PolishngPowder")
				.setTextureName("additioncorrugated:item_polishngpowder")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		CorrugatedBoard = (new Item())
				.setUnlocalizedName("CorrugatedBoard")
				.setTextureName("additioncorrugated:item_corrugatedboard")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Cutter = (new ItemCutter())
				.setUnlocalizedName("Cutter")
				.setTextureName("additioncorrugated:item_cutter")
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Fluorite = (new Item())
				.setUnlocalizedName("Fluorite")
				.setTextureName("additioncorrugated:item_fluorite")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		StrongCorrugatedBoard = (new Item())
				.setUnlocalizedName("StrongCorrugatedBoard")
				.setTextureName("additioncorrugated:item_strongcorrugatedboard")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Gum = (new ItemFood(4, 0.2F, false))
				.setUnlocalizedName("Gum")
				.setTextureName("additioncorrugated:item_gum")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		MintGum = (new ItemFood(5, 0.2F, false))
				.setPotionEffect(Potion.nightVision.id, 60, 0, 0.75F)
				.setUnlocalizedName("MintGum")
				.setTextureName("additioncorrugated:item_mintgum")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		SuperMintGum = (new ItemFood(6, 0.2F, false))
				.setPotionEffect(Potion.nightVision.id, 300, 0, 0.75F)
				.setUnlocalizedName("SuperMintGum")
				.setTextureName("additioncorrugated:item_supermintgum")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		ChocolateBar = (new ItemFood(5, 0.5F, true))
				.setUnlocalizedName("ChocolateBar")
				.setTextureName("additioncorrugated:item_chocolatebar")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Blueberry = (new ItemFood(2, 0.5F, true))
				.setPotionEffect(Potion.nightVision.id, 300, 0, 0.5F)
				.setUnlocalizedName("Blueberry")
				.setTextureName("additioncorrugated:item_blueberry")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		PickledPlum = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.jump.id, 60, 0, 0.75F)
				.setUnlocalizedName("PickledPlum")
				.setTextureName("additioncorrugated:item_PickledPlum")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Plum = (new ItemFood(2, 0.2F, false))
				.setUnlocalizedName("Plum")
				.setTextureName("additioncorrugated:item_plum")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		RiceCake = (new ItemFood(2, 0.2F, true))
				.setUnlocalizedName("RiceCake")
				.setTextureName("additioncorrugated:item_ricecake")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		SeaMustard = (new ItemFood(2, 0.5F, true))
				.setPotionEffect(Potion.waterBreathing.id, 60, 0, 1.0F)
				.setUnlocalizedName("SeaMustard")
				.setTextureName("additioncorrugated:item_seamustard")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Adamantite = (new Item())
				.setUnlocalizedName("Adamantite")
				.setTextureName("additioncorrugated:item_ingotadamantite")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Cobalt = (new Item())
				.setUnlocalizedName("Cobalt")
				.setTextureName("additioncorrugated:item_ingotcobalt")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Demonite = (new Item())
				.setUnlocalizedName("Demonite")
				.setTextureName("additioncorrugated:item_ingotdemonite")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Hellstone = (new Item())
				.setUnlocalizedName("Hellstone")
				.setTextureName("additioncorrugated:item_ingothellstone")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Meteorite = (new Item())
				.setUnlocalizedName("Meteorite")
				.setTextureName("additioncorrugated:item_ingotmeteorite")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Mythril = (new Item())
				.setUnlocalizedName("Mythril")
				.setTextureName("additioncorrugated:item_ingotmythril")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		SolarFragment = (new Item())
				.setUnlocalizedName("SolarFragment")
				.setTextureName("additioncorrugated:item_solarfragment")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		GlutinousRice = (new Item())
				.setUnlocalizedName("GlutinousRice")
				.setTextureName("additioncorrugated:item_glutinousrice")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Straw = (new Item())
				.setUnlocalizedName("Straw")
				.setTextureName("additioncorrugated:item_straw")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Dumpling = (new ItemFood(4, 0.5F, true))
				.setUnlocalizedName("Dumpling")
				.setTextureName("additioncorrugated:item_dumpling")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		SoySauce = (new ItemFood(1, 0.2F, false))
				.setUnlocalizedName("SoySauce")
				.setTextureName("additioncorrugated:item_soysauce")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		FermentedSoybeans = (new ItemFood(6, 0.5F, true))
				.setUnlocalizedName("FermentedSoybeans")
				.setTextureName("additioncorrugated:item_fermentedsoybeans")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Soybeans = (new ItemFood(2, 0.2F, true))
				.setUnlocalizedName("Soybeans")
				.setTextureName("additioncorrugated:item_soybeans")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		SpongeGourd = (new Item())
				.setUnlocalizedName("SpongeGourd")
				.setTextureName("additioncorrugated:item_spongegourd")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		DrySpongeGourd = (new Item())
				.setUnlocalizedName("DrySpongeGourd")
				.setTextureName("additioncorrugated:item_dryspongegourd")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Kimchi = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.regeneration.id, 30, 0, 1.0F)
				.setUnlocalizedName("Kimchi")
				.setTextureName("additioncorrugated:item_kimchi")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		JapaneseLeek = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.moveSpeed.id, 30, 0, 1.0F)
				.setUnlocalizedName("JapaneseLeek")
				.setTextureName("additioncorrugated:item_japaneseleek")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Mustard = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.damageBoost.id, 30, 0, 1.0F)
				.setUnlocalizedName("Mustard")
				.setTextureName("additioncorrugated:item_mustard")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Capsicum = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.fireResistance.id, 30, 0, 1.0F)
				.setUnlocalizedName("Capsicum")
				.setTextureName("additioncorrugated:item_capsicum")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Rice = (new ItemFood(4, 0.5F, true))
				.setUnlocalizedName("Rice")
				.setTextureName("additioncorrugated:item_rice")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		SeaMustardRevision = (new ItemFood(2, 0.2F, true))
				.setPotionEffect(Potion.waterBreathing.id, 300, 0, 1.0F)
				.setUnlocalizedName("SeaMustardRevision")
				.setTextureName("additioncorrugated:item_seamustardrevision")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		CorrugatedSword = (new ItemSword(CORRUGATED))
				.setUnlocalizedName("CorrugatedSword")
				.setTextureName("additioncorrugated:item_corrugatedsword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		StrongCorrugatedSword = (new ItemSword(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedSword")
				.setTextureName("additioncorrugated:item_strongcorrugatedsword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		CorrugatedHoe = (new ItemHoe(CORRUGATED))
				.setUnlocalizedName("CorrugatedHoe")
				.setTextureName("additioncorrugated:item_corrugatedhoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		StrongCorrugatedHoe = (new ItemHoe(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedHoe")
				.setTextureName("additioncorrugated:item_strongcorrugatedhoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		StrongCorrugatedShovel = (new ItemSpade(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedShovel")
				.setTextureName("additioncorrugated:item_strongcorrugatedshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		CorrugatedShovel = (new ItemSpade(CORRUGATED))
				.setUnlocalizedName("CorrugatedShovel")
				.setTextureName("additioncorrugated:item_corrugatedshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		StrongCorrugatedAxe = (new ItemStrongCorrugatedAxe(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedAxe")
				.setTextureName("additioncorrugated:item_strongcorrugatedaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		CorrugatedAxe = (new ItemCorrugatedAxe(CORRUGATED))
				.setUnlocalizedName("CorrugatedAxe")
				.setTextureName("additioncorrugated:item_corrugatedaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		StrongCorrugatedPickaxe = (new ItemStrongCorrugatedPickaxe(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedPickaxe")
				.setTextureName("additioncorrugated:item_strongcorrugatedpickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		CorrugatedPickaxe = (new ItemCorrugatedPickaxe(CORRUGATED))
				.setUnlocalizedName("CorrugatedPickaxe")
				.setTextureName("additioncorrugated:item_corrugatedpickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Silver = (new Item())
				.setUnlocalizedName("Silver")
				.setTextureName("additioncorrugated:item_ingotsilver")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Star = (new Item())
				.setUnlocalizedName("Star")
				.setTextureName("additioncorrugated:item_star")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		AdamantiteSword = (new ItemSword(ADAMANTITE))
				.setUnlocalizedName("AdamantiteSword")
				.setTextureName("additioncorrugated:adamantitesword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		AdamantiteHoe = (new ItemHoe(ADAMANTITE))
				.setUnlocalizedName("AdamantiteHoe")
				.setTextureName("additioncorrugated:adamantitehoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		AdamantiteShovel = (new ItemSpade(ADAMANTITE))
				.setUnlocalizedName("AdamantiteShovel")
				.setTextureName("additioncorrugated:adamantiteshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		AdamantiteAxe = (new ItemAdamantiteAxe(ADAMANTITE))
				.setUnlocalizedName("AdamantiteAxe")
				.setTextureName("additioncorrugated:adamantiteaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		AdamantitePickaxe = (new ItemAdamantitePickaxe(ADAMANTITE))
				.setUnlocalizedName("AdamantitePickaxe")
				.setTextureName("additioncorrugated:adamantitepickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		CobaltSword = (new ItemSword(COBALT))
				.setUnlocalizedName("CobaltSword")
				.setTextureName("additioncorrugated:cobaltsword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		CobaltHoe = (new ItemHoe(COBALT))
				.setUnlocalizedName("CobaltHoe")
				.setTextureName("additioncorrugated:cobalthoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		CobaltShovel = (new ItemSpade(COBALT))
				.setUnlocalizedName("CobaltShovel")
				.setTextureName("additioncorrugated:cobaltshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		CobaltAxe = (new ItemCobaltAxe(COBALT))
				.setUnlocalizedName("CobaltAxe")
				.setTextureName("additioncorrugated:cobaltaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		CobaltPickaxe = (new ItemCobaltPickaxe(COBALT))
				.setUnlocalizedName("CobaltPickaxe")
				.setTextureName("additioncorrugated:cobaltpickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
				
		DemoniteSword = (new ItemSword(DEMONITE))
				.setUnlocalizedName("DemoniteSword")
				.setTextureName("additioncorrugated:demonitesword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		DemoniteHoe = (new ItemHoe(DEMONITE))
				.setUnlocalizedName("DemoniteHoe")
				.setTextureName("additioncorrugated:demonitehoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		DemoniteShovel = (new ItemSpade(DEMONITE))
				.setUnlocalizedName("DemoniteShovel")
				.setTextureName("additioncorrugated:demoniteshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		DemoniteAxe = (new ItemDemoniteAxe(DEMONITE))
				.setUnlocalizedName("DemoniteAxe")
				.setTextureName("additioncorrugated:demoniteaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		DemonitePickaxe = (new ItemDemonitePickaxe(DEMONITE))
				.setUnlocalizedName("DemonitePickaxe")
				.setTextureName("additioncorrugated:demonitepickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		HellstoneSword = (new ItemSword(HELLSTONE))
				.setUnlocalizedName("HellstoneSword")
				.setTextureName("additioncorrugated:hellstonesword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		HellstoneHoe = (new ItemHoe(HELLSTONE))
				.setUnlocalizedName("HellstoneHoe")
				.setTextureName("additioncorrugated:hellstonehoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		HellstoneShovel = (new ItemSpade(HELLSTONE))
				.setUnlocalizedName("HellstoneShovel")
				.setTextureName("additioncorrugated:hellstoneshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		HellstoneAxe = (new ItemHellstoneAxe(HELLSTONE))
				.setUnlocalizedName("HellstoneAxe")
				.setTextureName("additioncorrugated:hellstoneaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		HellstonePickaxe = (new ItemHellstonePickaxe(HELLSTONE))
				.setUnlocalizedName("HellstonePickaxe")
				.setTextureName("additioncorrugated:hellstonepickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
				
		MeteoriteSword = (new ItemSword(METEORITE))
				.setUnlocalizedName("MeteoriteSword")
				.setTextureName("additioncorrugated:meteoritesword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		MeteoriteHoe = (new ItemHoe(METEORITE))
				.setUnlocalizedName("MeteoriteHoe")
				.setTextureName("additioncorrugated:meteoritehoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		MeteoriteShovel = (new ItemSpade(METEORITE))
				.setUnlocalizedName("MeteoriteShovel")
				.setTextureName("additioncorrugated:meteoriteshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		MeteoriteAxe = (new ItemMeteoriteAxe(METEORITE))
				.setUnlocalizedName("MeteoriteAxe")
				.setTextureName("additioncorrugated:meteoriteaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		MeteoritePickaxe = (new ItemMeteoritePickaxe(MYTHRIL))
				.setUnlocalizedName("MeteoritePickaxe")
				.setTextureName("additioncorrugated:meteoritepickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		MythrilSword = (new ItemSword(MYTHRIL))
				.setUnlocalizedName("MythrilSword")
				.setTextureName("additioncorrugated:mythrilsword")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);

		MythrilHoe = (new ItemHoe(MYTHRIL))
				.setUnlocalizedName("MythrilHoe")
				.setTextureName("additioncorrugated:mythrilhoe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		MythrilShovel = (new ItemSpade(MYTHRIL))
				.setUnlocalizedName("MythrilShovel")
				.setTextureName("additioncorrugated:mythrilshovel")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);

		MythrilAxe = (new ItemMythrilAxe(MYTHRIL))
				.setUnlocalizedName("MythrilAxe")
				.setTextureName("additioncorrugated:mythrilaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);

		MythrilPickaxe = (new ItemMythrilPickaxe(MYTHRIL))
				.setUnlocalizedName("MythrilPickaxe")
				.setTextureName("additioncorrugated:mythrilpickaxe")
				.setMaxStackSize(1)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		Spawn_Egg_CorrugatedCreeper = (new ItemSpawn_Egg_CorrugatedCreeper())
				.setUnlocalizedName("Spawn_Egg_CorrugatedCreeper")
				.setTextureName("spawn_egg")
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		RecycledPaper = (new Item())
				.setUnlocalizedName("RecycledPaper")
				.setTextureName("additioncorrugated:recycledpaper")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		StrongRecycledPaper = (new Item())
				.setUnlocalizedName("StrongRecycledPaper")
				.setTextureName("additioncorrugated:strongrecycledpaper")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		RecycledCorrugatedBoard = (new Item())
				.setUnlocalizedName("RecycledCorrugatedBoard")
				.setTextureName("additioncorrugated:recycledcorrugatedboard")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
		StrongRecycledCorrugatedBoard = (new Item())
				.setUnlocalizedName("StrongRecycledCorrugatedBoard")
				.setTextureName("additioncorrugated:strongrecycledcorrugatedboard")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedMODTab);
		
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
		
		GameRegistry.registerBlock(StrongRecycledCorrugated, "StrongRecycledCorrugated");
		
		GameRegistry.registerBlock(RecycledCorrugated, "RecycledCorrugated");
		
		GameRegistry.registerBlock(StrongRecycledCorrugatedLight, "StrongRecycledCorrugatedLight");
		
		GameRegistry.registerBlock(RecycledCorrugatedLight, "RecycledCorrugatedLight");
		
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
		
		GameRegistry.registerItem(Spawn_Egg_CorrugatedCreeper, "Spawn_Egg_CorrugatedCreeper");
				
		GameRegistry.registerItem(RecycledPaper, "RecycledPaper");
		
		GameRegistry.registerItem(StrongRecycledPaper, "StrongRecycledPaper");
		
		GameRegistry.registerItem(RecycledCorrugatedBoard, "RecycledCorrugatedBoard");
		
		GameRegistry.registerItem(StrongRecycledCorrugatedBoard, "StrongRecycledCorrugatedBoard");
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		try
		{
			config.load();
			ACVillagerID = config.get(Configuration.CATEGORY_GENERAL, "ACVillagerID", 9).getInt();
			CorrugatedCreeperID = config.get(Configuration.CATEGORY_GENERAL, "CorrugatedCreeperID", 25).getInt();
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
		GameRegistry.registerWorldGenerator(new BlockoreMeteorite(), 1);
		
		GameRegistry.registerWorldGenerator(new BlockoreHellstone(), 2);
		
		GameRegistry.registerWorldGenerator(new BlockoreDemonite(), 3);
		
		GameRegistry.registerWorldGenerator(new BlockoreMythril(), 4);
		
		GameRegistry.registerWorldGenerator(new BlockoreCobalt(), 5);
		
		GameRegistry.registerWorldGenerator(new BlockoreAdamantite(), 6);
		
		GameRegistry.registerWorldGenerator(new BlockoreFluorite(), 7);
		
		GameRegistry.registerWorldGenerator(new BlockoreTNT(), 8);
		
		GameRegistry.registerWorldGenerator(new BlockBlackStone(), 9);
		
		GameRegistry.registerWorldGenerator(new BlockoreSilver(), 10);
		
		GameRegistry.registerFuelHandler(new ACFuelHandler());
		
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GUIHandler());
		
		(new AdditionCorrugated.Recipes()).addRecipe();
		
		(new AdditionCorrugated.Recipes()).addShapelessRecipe();
		
		(new AdditionCorrugated.Recipes()).addSmelting();
		
		(new AdditionCorrugated.ACOreDictionary()).init();
		
		proxy.init();
		
		取引 = new ACTrade();
		
		VillagerRegistry.instance().registerVillagerId(ACVillagerID);
		
		VillagerRegistry.instance().registerVillageTradeHandler(ACVillagerID, 取引);
		
		EntityRegistry.registerModEntity(EntityCorrugatedCreeper.class, "CorrugatedCreeper", CorrugatedCreeperID, this, 250, 1, true);
		if(FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			RenderingRegistry.registerEntityRenderingHandler(EntityCorrugatedCreeper.class, new RenderCorrugatedCreeper());
		}
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		if (Loader.isModLoaded("mceconomy2"))
		{
			try
			{
				(new AdditionCorrugated.MCEconomy2.Price()).init(event);
			}
			catch (Exception e)
			{
				e.printStackTrace(System.err);
			}
		}
		
		if (Loader.isModLoaded("kegare.craftingex"))
		{
			try
			{
				(new AdditionCorrugated.CraftingEX.Blocks()).preInit(event);
				
				(new AdditionCorrugated.CraftingEX.Recipes()).addRecipe();
				
				(new AdditionCorrugated.CraftingEX.Recipes()).addShapelessRecipe();
			}
			catch (Exception e)
			{
				e.printStackTrace(System.err);
			}
		}
		
		if (DebugMode)
		{
			try
			{
				(new AdditionCorrugated.CraftingEX.Blocks()).preInit(event);
				
				(new AdditionCorrugated.CraftingEX.Recipes()).addRecipe();
				
				(new AdditionCorrugated.CraftingEX.Recipes()).addShapelessRecipe();
			}
			catch (Exception e)
			{
				e.printStackTrace(System.err);
			}
		}
//		EntityRegistry.addSpawn(EntityCorrugatedCreeper.class, 1, 1, 1, EnumCreatureType.monster, BiomeGenBase.getBiomeGenArray());
	}
}