package AdditionCorrugated.CraftingEX;

import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.oredict.ShapedOreRecipe;
import AdditionCorrugated.*;
import cpw.mods.fml.common.registry.*;

public class Recipes
{
	public void addRecipe()
	{
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.CraftingEX.Blocks.Corrugated2, 1),
				new Object[]{ "X X","X X","XXX",
						'X',Items.paper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.CraftingEX.Blocks.Corrugated2, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugatedCore.CorrugatedBoard});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedSword, 1),
				new Object[]{ " X "," X "," Y ",
						'X',AdditionCorrugated.CraftingEX.Blocks.Corrugated2,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedAxe, 1),
				new Object[]{ "XX ","XY "," Y ",
						'X',AdditionCorrugated.CraftingEX.Blocks.Corrugated2,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedPickaxe, 1),
				new Object[]{ "XXX"," Y "," Y ",
						'X',AdditionCorrugated.CraftingEX.Blocks.Corrugated2,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedShovel, 1),
				new Object[]{ " X "," Y "," Y ",
						'X',AdditionCorrugated.CraftingEX.Blocks.Corrugated2,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedHoe, 1),
				new Object[]{ "XX "," Y "," Y ",
						'X',AdditionCorrugated.CraftingEX.Blocks.Corrugated2,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedTorch, 1),
				new Object[]{ "X","Y",
						'X',AdditionCorrugated.CraftingEX.Blocks.CorrugatedLight2,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.ACrecycle, 1),
				new Object[]{ "XXX","XZX","YQY",
						'X',AdditionCorrugated.CraftingEX.Blocks.Corrugated2,'Y',AdditionCorrugatedCore.StrongCorrugated,'Z',Items.flint_and_steel,'Q',Items.water_bucket});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.CraftingEX.Blocks.RecycledCorrugated2, 1),
				new Object[]{ "X X","X X","XXX",
						'X',AdditionCorrugatedCore.RecycledPaper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.CraftingEX.Blocks.RecycledCorrugated2, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugatedCore.RecycledCorrugatedBoard});
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(AdditionCorrugated.CraftingEX.Blocks.CorrugatedLight2, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(Items.paper, 1, 0)}));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(AdditionCorrugated.CraftingEX.Blocks.RecycledCorrugatedLight2, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(AdditionCorrugatedCore.RecycledPaper, 1, 0)}));
	}
	
	public void addShapelessRecipe()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedBoard, 9),
				new Object[]{
				new ItemStack(AdditionCorrugated.CraftingEX.Blocks.Corrugated2,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.HalfCorrugated, 2),
				new Object[]{
				new ItemStack(AdditionCorrugated.CraftingEX.Blocks.Corrugated2,1),new ItemStack(AdditionCorrugatedCore.Cutter,-1,32767)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.RecycledCorrugatedBoard, 9),
				new Object[]{
				new ItemStack(AdditionCorrugated.CraftingEX.Blocks.RecycledCorrugated2,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.HalfCorrugatedLight, 2),
				new Object[]{
				new ItemStack(AdditionCorrugated.CraftingEX.Blocks.CorrugatedLight2,1),new ItemStack(AdditionCorrugatedCore.Cutter,-1,32767)});
	}
}