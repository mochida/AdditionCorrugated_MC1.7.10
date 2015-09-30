package AdditionCorrugated.ACFood.Item;

import AdditionCorrugated.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.*;
import net.minecraft.potion.*;

public class Items
{
	public static Item Gum;
	
	public static Item MintGum;
	
	public static Item SuperMintGum;
	
	public static Item ChocolateBar;
	
	public static Item Blueberry;
	
	public static Item SolarFragment;
	
	public static Item Plum;
	
	public static Item PickledPlum;
	
	public static Item RiceCake;
	
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
	
	public static Item GreenSoybeans;
	
	@EventHandler
	public void preInit(FMLPostInitializationEvent event)
	{
		Gum = (new ItemFood(2, 0.2F, false))
				.setUnlocalizedName("Gum")
				.setTextureName("additioncorrugated:item_gum")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		MintGum = (new ItemFood(4, 0.2F, false))
				.setPotionEffect(Potion.nightVision.id, 30, 0, 0.75F)
				.setUnlocalizedName("MintGum")
				.setTextureName("additioncorrugated:item_mintgum")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		SuperMintGum = (new ItemFood(6, 0.2F, false))
				.setPotionEffect(Potion.nightVision.id, 60, 0, 0.75F)
				.setUnlocalizedName("SuperMintGum")
				.setTextureName("additioncorrugated:item_supermintgum")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		ChocolateBar = (new ItemFood(3, 0.5F, true))
				.setUnlocalizedName("ChocolateBar")
				.setTextureName("additioncorrugated:item_chocolatebar")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Blueberry = (new ItemFood(3, 0.5F, true))
				.setPotionEffect(Potion.nightVision.id, 60, 0, 0.5F)
				.setUnlocalizedName("Blueberry")
				.setTextureName("additioncorrugated:item_blueberry")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		PickledPlum = (new ItemFood(3, 0.5F, true))
				.setPotionEffect(Potion.jump.id, 60, 0, 0.75F)
				.setUnlocalizedName("PickledPlum")
				.setTextureName("additioncorrugated:item_PickledPlum")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Plum = (new ItemFood(2, 0.2F, false))
				.setUnlocalizedName("Plum")
				.setTextureName("additioncorrugated:item_plum")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		RiceCake = (new ItemFood(2, 0.2F, true))
				.setUnlocalizedName("RiceCake")
				.setTextureName("additioncorrugated:item_ricecake")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		SeaMustard = (new ItemFood(2, 0.5F, true))
				.setPotionEffect(Potion.waterBreathing.id, 60, 0, 1.0F)
				.setUnlocalizedName("SeaMustard")
				.setTextureName("additioncorrugated:item_seamustard")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		SolarFragment = (new Item())
				.setUnlocalizedName("SolarFragment")
				.setTextureName("additioncorrugated:item_solarfragment")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		GlutinousRice = (new Item())
				.setUnlocalizedName("GlutinousRice")
				.setTextureName("additioncorrugated:item_glutinousrice")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Straw = (new Item())
				.setUnlocalizedName("Straw")
				.setTextureName("additioncorrugated:item_straw")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Dumpling = (new ItemFood(4, 0.5F, true))
				.setUnlocalizedName("Dumpling")
				.setTextureName("additioncorrugated:item_dumpling")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		SoySauce = (new ItemFood(1, 0.2F, false))
				.setUnlocalizedName("SoySauce")
				.setTextureName("additioncorrugated:item_soysauce")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		FermentedSoybeans = (new ItemFood(6, 0.5F, true))
				.setUnlocalizedName("FermentedSoybeans")
				.setTextureName("additioncorrugated:item_fermentedsoybeans")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Soybeans = (new ItemFood(2, 0.2F, true))
				.setUnlocalizedName("Soybeans")
				.setTextureName("additioncorrugated:item_soybeans")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		SpongeGourd = (new ItemFood(1, 0.5F, true))
				.setUnlocalizedName("SpongeGourd")
				.setTextureName("additioncorrugated:item_spongegourd")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		DrySpongeGourd = (new Item())
				.setUnlocalizedName("DrySpongeGourd")
				.setTextureName("additioncorrugated:item_dryspongegourd")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Kimchi = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.regeneration.id, 30, 0, 1.0F)
				.setUnlocalizedName("Kimchi")
				.setTextureName("additioncorrugated:item_kimchi")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		JapaneseLeek = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.moveSpeed.id, 30, 0, 1.0F)
				.setUnlocalizedName("JapaneseLeek")
				.setTextureName("additioncorrugated:item_japaneseleek")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Mustard = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.damageBoost.id, 30, 0, 1.0F)
				.setUnlocalizedName("Mustard")
				.setTextureName("additioncorrugated:item_mustard")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Capsicum = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.fireResistance.id, 30, 0, 1.0F)
				.setUnlocalizedName("Capsicum")
				.setTextureName("additioncorrugated:item_capsicum")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		Rice = (new ItemFood(4, 0.5F, true))
				.setUnlocalizedName("Rice")
				.setTextureName("additioncorrugated:item_rice")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		SeaMustardRevision = (new ItemFood(2, 0.2F, true))
				.setPotionEffect(Potion.waterBreathing.id, 300, 0, 1.0F)
				.setUnlocalizedName("SeaMustardRevision")
				.setTextureName("additioncorrugated:item_seamustardrevision")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		GreenSoybeans = (new ItemFood(3, 0.3F, true))
				.setUnlocalizedName("GreenSoybeans")
				.setTextureName("additioncorrugated:greensoybeans")
				.setMaxStackSize(64)
				.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		GameRegistry.registerItem(Gum, "Gum");
		
		GameRegistry.registerItem(MintGum, "MintGum");
		
		GameRegistry.registerItem(SuperMintGum, "SuperMintGum");
		
		GameRegistry.registerItem(ChocolateBar, "ChocolateBar");
		
		GameRegistry.registerItem(Blueberry, "Blueberry");
		
		GameRegistry.registerItem(PickledPlum, "PickledPlum");
		
		GameRegistry.registerItem(Plum, "Plum");
		
		GameRegistry.registerItem(RiceCake, "RiceCake");
		
		GameRegistry.registerItem(SeaMustard, "SeaMustard");
		
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
		
		GameRegistry.registerItem(GreenSoybeans, "GreenSoybeans");
	}
}