package AdditionCorrugated;

import java.awt.Color;
import java.lang.reflect.Method;
import shift.mceconomy2.api.MCEconomyAPI;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.common.*;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.*;
import net.minecraftforge.common.util.EnumHelper;
import AdditionCorrugated.GUI.*;
import AdditionCorrugated.Item.*;
import AdditionCorrugated.Block.*;
import AdditionCorrugated.Entity.*;
import AdditionCorrugated.*;
import AdditionCorrugated.common.*;
import AdditionCorrugated.Entity.Render.*;

@Mod(modid="Addition Corrugated", name="Addition Corrugated", version="1.6.0_alpha4_MC1.7.10")
public class AdditionCorrugatedCore
{
/*********予定*********
	防具?
	ACRecycle(｛強化｝紙→｛強化｝再生紙)
	木?
	植物?
	可燃
	Entity化(Config選択式)
	カッターで早く壊す
	チェストのテクスチャの修正
	ハーフブロックの修正
	mcmod.infoの修正
	ダンボールチェストと強化ダンボールチェストを並べるとテクスチャがラージになる不具合
**********************/
	@Mod.Instance("Addition Corrugated")
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
	
	public static ArmorMaterial CORRUGATED_PG = EnumHelper.addArmorMaterial("CORRUGATED_PG", 0, new int[]{1, 1, 1, 1}, 1);
	
	public static ArmorMaterial STRONGCORRUGATED_PG = EnumHelper.addArmorMaterial("STRONGCORRUGATED_PG", 2, new int[]{2, 2, 2, 2}, 2);
	
	public static ArmorMaterial ADAMANTITE_PG = EnumHelper.addArmorMaterial("ADAMANTITE_PG", 3, new int[]{3, 3, 3, 3}, 3);
	
	public static ArmorMaterial COBALT_PG = EnumHelper.addArmorMaterial("COBALT_PG", 4, new int[]{4, 4, 4, 4}, 4);
	
	public static ArmorMaterial DEMONITE_PG = EnumHelper.addArmorMaterial("DEMONITE_PG", 5, new int[]{5, 5, 5, 5}, 5);
	
	public static ArmorMaterial HELLSTONE_PG = EnumHelper.addArmorMaterial("HELLSTONE_PG", 6, new int[]{6, 6, 6, 6}, 6);
	
	public static ArmorMaterial METEORITE_PG = EnumHelper.addArmorMaterial("METEORITE_PG", 7, new int[]{7, 7, 7, 7}, 7);
	
	public static ArmorMaterial MYTHRIL_PG = EnumHelper.addArmorMaterial("MYTHRIL_PG", 8, new int[]{8, 8, 8, 8}, 8);
	
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
	
//	public static Block Dryer;
	
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
	
	public static Item Spawn_Egg_Test;
	
	public static Item Spawn_Egg_CorrugatedCreeper;
	
	public static Item StrongRecycledPaper;
	
//	public static Item CorrugatedArmor;
	
	public static Item RecycledCorrugatedBoard;
	
	public static Item StrongRecycledCorrugatedBoard;
	
	public static final int ACRecycleGUI = 1;
	
	public static int ACVillagerID;
	
	public static int CorrugatedNewID;
	
	public static int CorrugatedCreeperID;
	
	private ACTrade 取引;
	
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
		
//		Dryer = new BlockDryer()
//		.setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
		
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
		
		Spawn_Egg_Test = (new ItemSpawn_Egg_Test(Color.BLUE.getRGB(), Color.ORANGE.getRGB()))
				.setUnlocalizedName("Spawn_Egg_Test")
				.setTextureName("spawn_egg")
				.setCreativeTab(AdditionCorrugatedMOD_Under_DevelopmentTab);
		
		Spawn_Egg_CorrugatedCreeper = (new ItemSpawn_Egg_CorrugatedCreeper())
				.setUnlocalizedName("Spawn_Egg_CorrugatedCreeper")
				.setTextureName("spawn_egg")
				.setCreativeTab(AdditionCorrugatedMODTab);
		
//		CorrugatedArmor = (new ItemCorrugatedArmor(CORRUGATED_PG))
//				.setUnlocalizedName("CorrugatedArmor")
//				.setCreativeTab(AdditionCorrugatedMODTab);
		
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
		
//		GameRegistry.registerBlock(Dryer, "Dryer");
		
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
		
		GameRegistry.registerItem(Spawn_Egg_Test, "Spawn_Egg_Test");
		
		GameRegistry.registerItem(Spawn_Egg_CorrugatedCreeper, "Spawn_Egg_CorrugatedCreeper");
		
//		GameRegistry.registerItem(CorrugatedArmor, "CorrugatedArmor");
		
		GameRegistry.registerItem(RecycledPaper, "RecycledPaper");
		
		GameRegistry.registerItem(StrongRecycledPaper, "StrongRecycledPaper");
		
		GameRegistry.registerItem(RecycledCorrugatedBoard, "RecycledCorrugatedBoard");
		
		GameRegistry.registerItem(StrongRecycledCorrugatedBoard, "StrongRecycledCorrugatedBoard");
		
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
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		try
		{
			config.load();
			ACVillagerID = config.get(Configuration.CATEGORY_GENERAL, "ACVillagerID", 9).getInt();
			CorrugatedNewID = config.get(Configuration.CATEGORY_GENERAL, "Modding_EntityID", 20).getInt();
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
			
			GameRegistry.addRecipe(new ItemStack(RecycledCorrugated, 1),
					new Object[]{ "X X","X X","XXX",
							'X',RecycledPaper});
			
			GameRegistry.addRecipe(new ItemStack(RecycledCorrugated, 1),
					new Object[]{ "XXX","XXX","XXX",
							'X',RecycledCorrugatedBoard});
			
			GameRegistry.addShapelessRecipe(new ItemStack(RecycledCorrugatedBoard, 9),
					new Object[]{
					new ItemStack(RecycledCorrugated,1)});
		
			GameRegistry.addRecipe(
					new ShapedOreRecipe(
					new ItemStack(RecycledCorrugatedLight, 1, 0),
					new Object[]{"Y Y","YXY","YYY",
						Character.valueOf('X'),"gemFluorite",
						Character.valueOf('Y'), new ItemStack(RecycledPaper, 1, 0)}));
			
			GameRegistry.addRecipe(new ItemStack(StrongRecycledCorrugated, 1),
					new Object[]{ "X X","X X","XXX",
							'X',StrongRecycledPaper});
			
			GameRegistry.addRecipe(new ItemStack(StrongRecycledCorrugated, 1),
					new Object[]{ "XXX","XXX","XXX",
							'X',StrongRecycledCorrugatedBoard});
			
			GameRegistry.addShapelessRecipe(new ItemStack(StrongRecycledCorrugatedBoard, 9),
					new Object[]{
					new ItemStack(StrongRecycledCorrugated,1)});
			
			GameRegistry.addRecipe(
					new ShapedOreRecipe(
					new ItemStack(StrongRecycledCorrugatedLight, 1, 0),
					new Object[]{"Y Y","YXY","YYY",
						Character.valueOf('X'),"gemFluorite",
						Character.valueOf('Y'), new ItemStack(StrongRecycledPaper, 1, 0)}));
			
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
			
			EntityRegistry.registerModEntity(EntityCorrugated.class, "CorrugatedNew", CorrugatedNewID, this, 250, 1, false);
			
			EntityRegistry.addSpawn(EntityCorrugated.class, 20, 1, 4, EnumCreatureType.creature, BiomeGenBase.plains);
			if(FMLCommonHandler.instance().getSide() == Side.CLIENT)
			{
				RenderingRegistry.registerEntityRenderingHandler(EntityCorrugated.class, new RenderCorrugated());
			}
			
			EntityRegistry.registerModEntity(EntityCorrugatedCreeper.class, "CorrugatedCreeper", CorrugatedCreeperID, this, 250, 1, false);
			
			EntityRegistry.addSpawn(EntityCorrugatedCreeper.class, 20, 1, 4, EnumCreatureType.creature, BiomeGenBase.plains);
			if(FMLCommonHandler.instance().getSide() == Side.CLIENT)
			{
				RenderingRegistry.registerEntityRenderingHandler(EntityCorrugatedCreeper.class, new RenderCorrugatedCreeper());
			}
			
			GameRegistry.registerFuelHandler(new IFuelHandler()
			{
				public int getBurnTime(ItemStack fuel)
				{
					if(fuel.getItem() == Item.getItemFromBlock(Corrugated))
					{
						return 500;
					}

					if(fuel.getItem() == Item.getItemFromBlock(CorrugatedLight))
					{
						return 600;
					}

					if(fuel.getItem() == Item.getItemFromBlock(HalfCorrugated))
					{
						return 250;
					}
					
					if(fuel.getItem() == Item.getItemFromBlock(HalfCorrugatedLight))
					{
						return 300;
					}
					
					if(fuel.getItem().equals(CorrugatedBoard))
					{
						return 100;
					}
					
					if(fuel.getItem().equals(CorrugatedAxe))
					{
						return 250;
					}
					
					if(fuel.getItem() == Item.getItemFromBlock(CorrugatedChest))
					{
						return 800;
					}
					
					if(fuel.getItem().equals(CorrugatedHoe))
					{
						return 250;
					}
					
					if(fuel.getItem().equals(CorrugatedPickaxe))
					{
						return 250;
					}
					
					if(fuel.getItem().equals(CorrugatedShovel))
					{
						return 250;
					}
					
					if(fuel.getItem().equals(CorrugatedSword))
					{
						return 250;
					}
					return 0;
				}
			});
			
			NetworkRegistry.INSTANCE.registerGuiHandler(this, new GUIHandler());
			
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Corrugated), 10);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(ACrecycle), 100);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Adamantite), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(AdamantiteAxe), 55);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(AdamantiteHoe), 55);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(AdamantitePickaxe), 55);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(AdamantiteShovel), 55);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(AdamantiteSword), 55);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(BlackStone), 2);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Blueberry), 5);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Capsicum), 2);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(ChocolateBar), 10);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Cobalt), 60);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CobaltAxe), 65);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CobaltHoe), 65);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CobaltPickaxe), 65);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CobaltShovel), 65);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CobaltSword), 65);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CorrugatedAxe), 15);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(TStone), 1);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CorrugatedBoard), 5);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CorrugatedChest), 15);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CorrugatedHoe), 15);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CorrugatedLight),20);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CorrugatedPickaxe), 15);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CorrugatedShovel), 15);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CorrugatedSword), 15);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(CorrugatedTorch), 15);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Cutter), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(TemperedGlass), 100);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Demonite), 100);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(DemoniteAxe), 105);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(DemoniteHoe), 105);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(DemonitePickaxe), 105);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(DemoniteShovel), 105);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(DemoniteSword), 105);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(DrySpongeGourd), 105);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Dumpling), 5);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Edge), 150);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(FermentedSoybeans), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Fluorite), 100);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(GlutinousRice), 10);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(GoldGravel), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Gum), 5);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(JapaneseLeek), 15);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Kimchi), 35);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(HalfCorrugated), 5);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(HalfCorrugatedLight), 5);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(HalfStrongCorrugated), 5);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(HalfStrongCorrugatedLight), 5);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Hellstone), 70);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(HellstoneAxe), 75);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(HellstoneHoe), 75);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(HellstonePickaxe), 75);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(HellstoneShovel), 75);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(HellstoneSword), 75);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Mythril), 80);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(MythrilAxe), 85);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(MythrilHoe), 85);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(MythrilPickaxe), 85);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(MythrilShovel), 85);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(MythrilSword), 85);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Meteorite), 40);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(MeteoriteAxe), 45);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(MeteoriteHoe), 45);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(MeteoritePickaxe), 45);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(MeteoriteShovel), 45);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(MeteoriteSword), 45);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Mustard), 5);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(MintGum), 15);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(PickledPlum), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Plum), 15);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(PolishngPowder), 45);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Rice), 8);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(RiceCake), 100);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(RustyEdge), 0);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(oreAdamantite), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(oreCobalt), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(oreDemonite), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(oreFluorite), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(oreHellstone), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(oreMeteorite), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(oreMythril), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(oreSilver), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(oreTNT), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(SeaMustard), 65);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(SeaMustardRevision), 75);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Silver), 1005);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(SilverGravel), 105);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(SolarFragment), 65);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Spawn_Egg_Test), 0);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Spawn_Egg_CorrugatedCreeper), 0);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Soybeans), 5);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(SoySauce), 5);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(SpongeGourd), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Star), 10);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StarGravel), 15);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(Straw), 25);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(SuperMintGum), 45);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongPaper), 10);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongCorrugated), 20);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongCorrugatedAxe), 25);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongCorrugatedBoard), 2);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongCorrugatedChest), 30);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongCorrugatedHoe), 25);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongCorrugatedLight), 20);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongCorrugatedPickaxe), 25);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongCorrugatedShovel), 25);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongCorrugatedSword), 25);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongCorrugatedTorch), 10);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongRecycledPaper), 15);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(RecycledPaper), 2);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongRecycledCorrugated), 75);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(RecycledCorrugated), 50);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongRecycledCorrugatedBoard), 10);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(RecycledCorrugatedBoard), 5);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(StrongRecycledCorrugatedLight), 200);
			MCEconomyAPI.ShopManager.addPurchaseItem(new ItemStack(RecycledCorrugatedLight), 150);
			MCEconomyAPI.ShopManager.addPurchaseEntity(AdditionCorrugated.Entity.EntityCorrugatedCreeper.class, 10);
			MCEconomyAPI.ShopManager.addPurchaseEntity(AdditionCorrugated.Entity.EntityCorrugated.class, 1);
	}
	
	@Mod.EventHandler
	public void load(FMLInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(Cutter);
	}
}