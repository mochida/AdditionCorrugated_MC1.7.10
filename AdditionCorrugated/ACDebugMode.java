package AdditionCorrugated;

import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.*;
import net.minecraft.creativetab.*;
import net.minecraft.init.*;
import net.minecraft.item.*;

public class ACDebugMode
{
	public void DebugMode(FMLPostInitializationEvent event)
	{
		final Block command_Block = (Blocks.command_block).setCreativeTab(CreativeTabs.tabRedstone);
		
		final Item command_block_minecart = (Items.command_block_minecart).setCreativeTab(CreativeTabs.tabTransport);
		
		GameRegistry.registerFuelHandler(new AdditionCorrugated.CraftingEX.AC_CraftingEXFuelHandler());
		
		(new AdditionCorrugated.CraftingEX.Block.Blocks()).preInit(event);
		
		(new AdditionCorrugated.CraftingEX.Recipes()).addRecipe();
		
		(new AdditionCorrugated.CraftingEX.Recipes()).addShapelessRecipe();
	}
}