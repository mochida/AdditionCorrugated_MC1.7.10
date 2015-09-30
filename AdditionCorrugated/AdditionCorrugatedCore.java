/*******************
可燃
村人の家
MOBの修正
防具の修正
実績(修正)
MODIDの修正
AC販売機の修正
AC再生機の修正
ServerErrorの修正
チェスト系のテクスチャ修正
木(Plum,SpongeGourd)
*******************/
package AdditionCorrugated;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.creativetab.*;
import net.minecraft.init.*;
import net.minecraftforge.common.config.*;
import AdditionCorrugated.GUI.*;
import AdditionCorrugated.Common.*;

@Mod(modid="Addition Corrugated", name="AdditionCorrugated", version="1.6.0_MC1.7.10")
public class AdditionCorrugatedCore
{
	@Mod.Instance("Addition Corrugated")
	public static AdditionCorrugatedCore instance;
	
	@SidedProxy(clientSide = "AdditionCorrugated.Client.ClientProxy", serverSide = "AdditionCorrugated.common.CommonProxy")
	public static CommonProxy proxy;
	
	public static boolean ACOre;
	
	public static boolean ACFood;
	
	public static boolean DebugMode = false;
	
	public static boolean TNTRevolution;
	
	public static final CreativeTabs AdditionCorrugatedMODTab = new CreativeTabAdditionCorrugatedMOD("AdditionCorrugatedMODTab");
	
	public static final int ACRecycleGUI = 1;
	
	@Mod.EventHandler
	public void load(FMLInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(AdditionCorrugated.Item.Items.Cutter);
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		(new AdditionCorrugated.Block.Blocks()).preInit(event);
		
		(new AdditionCorrugated.Item.Items()).preInit(event);
		
		(new AdditionCorrugated.Achievements()).register();
		
		(new AdditionCorrugated.Entity.Entitys()).register(this);
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		(new ACConfig()).Config(config);
		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.registerFuelHandler(new ACFuelHandler());
		
		(new AdditionCorrugated.ACWorldGenerator()).init(event);
		
		(new AdditionCorrugated.Recipes()).addRecipe();
		
		(new AdditionCorrugated.Recipes()).addShapelessRecipe();
		
		(new AdditionCorrugated.Recipes()).addSmelting();
		
		(new AdditionCorrugated.Entity.Entitys()).init(event);
		
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GUIHandler());
		
		proxy.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		if (DebugMode)
		{
			try
			{
				(new ACDebugMode()).DebugMode(event);
			}
			catch (Exception e)
			{
				e.printStackTrace(System.err);
			}
		}
		
		if (ACFood)
		{
			try
			{
				(new AdditionCorrugated.ACFood.Item.Items()).preInit(event);
				
				(new AdditionCorrugated.ACFood.Block.Blocks()).preInit(event);
				
				(new AdditionCorrugated.ACFood.ACFOreDictionary()).init();
				
				(new AdditionCorrugated.ACFood.Recipes()).addRecipe();
				
				(new AdditionCorrugated.ACFood.Recipes()).addShapelessRecipe();
			}
			catch (Exception e)
			{
				e.printStackTrace(System.err);
			}
		}
		
		if (TNTRevolution)
		{
			try
			{
				(new AdditionCorrugated.TNTRevolution.Block.Blocks()).preInit(event);
				
				(new AdditionCorrugated.TNTRevolution.TROreDictionary()).init();
				
				(new AdditionCorrugated.TNTRevolution.TRWorldGenerator()).init(event);
				
				(new AdditionCorrugated.TNTRevolution.Recipes()).addSmelting();
				
				(new AdditionCorrugated.TNTRevolution.Recipes()).addShapelessRecipe();
			}
			catch (Exception e)
			{
				e.printStackTrace(System.err);
			}
		}
		
		if (ACOre)
		{
			try
			{
				(new AdditionCorrugated.ACOre.Block.Blocks()).preInit(event);
				
				(new AdditionCorrugated.ACOre.Item.Items()).preInit(event);
				
				(new AdditionCorrugated.ACOre.ACOOreDictionary()).init();
				
				(new AdditionCorrugated.ACOre.ACOWorldGenerator()).init(event);
				
				(new AdditionCorrugated.ACOre.Recipes()).addRecipe();
				
				(new AdditionCorrugated.ACOre.Recipes()).addSmelting();
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
				(new AdditionCorrugated.CraftingEX.Block.Blocks()).preInit(event);
				
				(new AdditionCorrugated.CraftingEX.Recipes()).addRecipe();
				
				(new AdditionCorrugated.CraftingEX.Recipes()).addShapelessRecipe();
				
				GameRegistry.registerFuelHandler(new AdditionCorrugated.CraftingEX.AC_CraftingEXFuelHandler());
			}
			catch (Exception e)
			{
				e.printStackTrace(System.err);
			}
		}
		
		if (Loader.isModLoaded("mceconomy2"))
		{
			try
			{
				(new AdditionCorrugated.MCEconomy2.Block.Blocks()).preInit(event);
				
				(new AdditionCorrugated.MCEconomy2.Recipes()).addRecipe();
				
				(new AdditionCorrugated.MCEconomy2.Price()).init(event);
			}
			catch (Exception e)
			{
				e.printStackTrace(System.err);
			}
		}
	}
}