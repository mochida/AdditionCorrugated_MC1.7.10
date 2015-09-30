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
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.CraftingEX.Block.Blocks.Corrugated2, 1),
				new Object[]{ "X X","X X","XXX",
						'X',Items.paper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.CraftingEX.Block.Blocks.Corrugated2, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugated.Item.Items.CorrugatedBoard});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.CorrugatedSword, 1),
				new Object[]{ " X "," X "," Y ",
						'X',AdditionCorrugated.CraftingEX.Block.Blocks.Corrugated2,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.CorrugatedAxe, 1),
				new Object[]{ "XX ","XY "," Y ",
						'X',AdditionCorrugated.CraftingEX.Block.Blocks.Corrugated2,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.CorrugatedPickaxe, 1),
				new Object[]{ "XXX"," Y "," Y ",
						'X',AdditionCorrugated.CraftingEX.Block.Blocks.Corrugated2,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.CorrugatedShovel, 1),
				new Object[]{ " X "," Y "," Y ",
						'X',AdditionCorrugated.CraftingEX.Block.Blocks.Corrugated2,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.CorrugatedHoe, 1),
				new Object[]{ "XX "," Y "," Y ",
						'X',AdditionCorrugated.CraftingEX.Block.Blocks.Corrugated2,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.CorrugatedTorch, 1),
				new Object[]{ "X","Y",
						'X',AdditionCorrugated.CraftingEX.Block.Blocks.CorrugatedLight2,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.ACrecycle, 1),
				new Object[]{ "XXX","XZX","YQY",
						'X',AdditionCorrugated.CraftingEX.Block.Blocks.Corrugated2,'Y',AdditionCorrugated.Block.Blocks.StrongCorrugated,'Z',Items.flint_and_steel,'Q',Items.water_bucket});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.CraftingEX.Block.Blocks.RecycledCorrugated2, 1),
				new Object[]{ "X X","X X","XXX",
						'X',AdditionCorrugated.Item.Items.RecycledPaper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.CraftingEX.Block.Blocks.RecycledCorrugated2, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugated.Item.Items.RecycledCorrugatedBoard});
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(AdditionCorrugated.CraftingEX.Block.Blocks.CorrugatedLight2, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(Items.paper, 1, 0)}));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(AdditionCorrugated.CraftingEX.Block.Blocks.RecycledCorrugatedLight2, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(AdditionCorrugated.Item.Items.RecycledPaper, 1, 0)}));
	}
	
	public void addShapelessRecipe()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Item.Items.CorrugatedBoard, 9),
				new Object[]{
				new ItemStack(AdditionCorrugated.CraftingEX.Block.Blocks.Corrugated2,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.HalfCorrugated, 2),
				new Object[]{
				new ItemStack(AdditionCorrugated.CraftingEX.Block.Blocks.Corrugated2,1),new ItemStack(AdditionCorrugated.Item.Items.Cutter,-1,32767)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Item.Items.RecycledCorrugatedBoard, 9),
				new Object[]{
				new ItemStack(AdditionCorrugated.CraftingEX.Block.Blocks.RecycledCorrugated2,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.HalfCorrugatedLight, 2),
				new Object[]{
				new ItemStack(AdditionCorrugated.CraftingEX.Block.Blocks.CorrugatedLight2,1),new ItemStack(AdditionCorrugated.Item.Items.Cutter,-1,32767)});
	}
}