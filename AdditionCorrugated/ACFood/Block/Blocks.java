package AdditionCorrugated.ACFood.Block;

import AdditionCorrugated.*;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class Blocks
{
	public static Block BeansPlant;
	
	public static Block JapaneseLeekPlant;
	
	public static Block RicePlant;
	
	public static Block BlueberryPlant;
	
	@EventHandler
	public void preInit(FMLPostInitializationEvent event)
	{
		BeansPlant = new BlockBeansPlant()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		JapaneseLeekPlant = new BlockJapaneseLeekPlant()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		RicePlant = new BlockRicePlant()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		BlueberryPlant = new BlockBlueberryPlant()
		.setCreativeTab(AdditionCorrugatedCore.AdditionCorrugatedMODTab);
		
		GameRegistry.registerBlock(BeansPlant, "BeansPlant");
		
		GameRegistry.registerBlock(JapaneseLeekPlant, "JapaneseLeekPlant");
		
		GameRegistry.registerBlock(RicePlant, "RicePlant");
		
		GameRegistry.registerBlock(BlueberryPlant, "BlueberryPlant");
	}
}