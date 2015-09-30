package AdditionCorrugated;

import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.oredict.*;
import cpw.mods.fml.common.registry.*;

public class Recipes
{
	public void addRecipe()
	{
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.Corrugated, 1),
				new Object[]{ "X X","X X","XXX",
						'X',Items.paper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.Corrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugated.Item.Items.CorrugatedBoard});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.StrongCorrugated, 1),
				new Object[]{ "X X","X X","XXX",
						'X',AdditionCorrugated.Item.Items.StrongPaper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.Cutter, 1),
				new Object[]{ "XYX","XYX","XYX",
						'X',Items.stick,'Y',AdditionCorrugated.Item.Items.Edge});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.StrongCorrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugated.Item.Items.StrongCorrugatedBoard});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.CorrugatedSword, 1),
				new Object[]{ " X "," X "," Y ",
						'X',AdditionCorrugated.Block.Blocks.Corrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.StrongCorrugatedSword, 1),
				new Object[]{ " X "," X "," Y ",
						'X',AdditionCorrugated.Block.Blocks.StrongCorrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.CorrugatedAxe, 1),
				new Object[]{ "XX ","XY "," Y ",
						'X',AdditionCorrugated.Block.Blocks.Corrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.StrongCorrugatedAxe, 1),
				new Object[]{ "XX ","XY "," Y ",
						'X',AdditionCorrugated.Block.Blocks.StrongCorrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.CorrugatedPickaxe, 1),
				new Object[]{ "XXX"," Y "," Y ",
						'X',AdditionCorrugated.Block.Blocks.Corrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.StrongCorrugatedPickaxe, 1),
				new Object[]{ "XXX"," Y "," Y ",
						'X',AdditionCorrugated.Block.Blocks.StrongCorrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.CorrugatedShovel, 1),
				new Object[]{ " X "," Y "," Y ",
						'X',AdditionCorrugated.Block.Blocks.Corrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.StrongCorrugatedShovel, 1),
				new Object[]{ " X "," Y "," Y ",
						'X',AdditionCorrugated.Block.Blocks.StrongCorrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.CorrugatedHoe, 1),
				new Object[]{ "XX "," Y "," Y ",
						'X',AdditionCorrugated.Block.Blocks.Corrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.StrongCorrugatedHoe, 1),
				new Object[]{ "XX "," Y "," Y ",
						'X',AdditionCorrugated.Block.Blocks.StrongCorrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.CorrugatedTorch, 8),
				new Object[]{ "X","Y",
						'X',AdditionCorrugated.Block.Blocks.CorrugatedLight,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.StrongCorrugatedTorch, 8),
				new Object[]{ "X","Y",
						'X',AdditionCorrugated.Block.Blocks.StrongCorrugatedLight,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.CorrugatedChest, 1),
				new Object[]{ "XXX","X X","XXX",
						'X',Items.paper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.StrongCorrugatedChest, 1),
				new Object[]{ "XXX","X X","XXX",
						'X',AdditionCorrugated.Item.Items.StrongPaper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.ACrecycle, 1),
				new Object[]{ "XXX","XZX","YQY",
						'X',AdditionCorrugated.Block.Blocks.Corrugated,'Y',AdditionCorrugated.Block.Blocks.StrongCorrugated,'Z',Items.flint_and_steel,'Q',Items.water_bucket});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.RecycledCorrugated, 1),
				new Object[]{ "X X","X X","XXX",
						'X',AdditionCorrugated.Item.Items.RecycledPaper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.RecycledCorrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugated.Item.Items.RecycledCorrugatedBoard});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.StrongRecycledCorrugated, 1),
				new Object[]{ "X X","X X","XXX",
						'X',AdditionCorrugated.Item.Items.StrongRecycledPaper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.StrongRecycledCorrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugated.Item.Items.StrongRecycledCorrugatedBoard});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.StrongPaper, 8),
				new Object[]{ "XXX","XYX","XXX",
						'X',Items.paper,'Y',Blocks.obsidian});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.TemperedGlass, 8),
				new Object[]{ "XXX","XYX","XXX",
						'X',Blocks.glass,'Y',Blocks.obsidian});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Item.Items.Spawn_Egg_CorrugatedCreeper, 4),
				new Object[]{ "XYX","YXY","XYX",
			'X',AdditionCorrugated.Block.Blocks.Corrugated,'Y',Blocks.tnt});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.StrongCorrugated, 1),
				new Object[]{ " Y ","YXY"," Y ",
			'X',AdditionCorrugated.Block.Blocks.Corrugated,'Y',AdditionCorrugated.Item.Items.StrongPaper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.StrongCorrugatedLight, 1),
				new Object[]{ "XXX","XYX","XXX",
			'X',AdditionCorrugated.Block.Blocks.CorrugatedLight,'Y',AdditionCorrugated.Item.Items.StrongPaper});
		
		GameRegistry.addRecipe(
				new ItemStack(AdditionCorrugated.Block.Blocks.Corrugated, 1, 0),
				new Object[]{"X","X",
					Character.valueOf('X'), new ItemStack(AdditionCorrugated.Block.Blocks.HalfCorrugated, 1, 0)});
		
		GameRegistry.addRecipe(
				new ItemStack(AdditionCorrugated.Block.Blocks.CorrugatedLight, 1, 0),
				new Object[]{"X","X",
					Character.valueOf('X'), new ItemStack(AdditionCorrugated.Block.Blocks.HalfCorrugatedLight, 1, 0)});
		
		GameRegistry.addRecipe(
				new ItemStack(AdditionCorrugated.Block.Blocks.StrongCorrugated, 1, 0),
				new Object[]{"X","X",
					Character.valueOf('X'), new ItemStack(AdditionCorrugated.Block.Blocks.HalfStrongCorrugated, 1, 0)});
		
		GameRegistry.addRecipe(
				new ItemStack(AdditionCorrugated.Block.Blocks.StrongCorrugatedLight, 1, 0),
				new Object[]{"X","X",
					Character.valueOf('X'), new ItemStack(AdditionCorrugated.Block.Blocks.HalfStrongCorrugatedLight, 1, 0)});
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(AdditionCorrugated.Block.Blocks.StrongRecycledCorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(AdditionCorrugated.Item.Items.StrongRecycledPaper, 1, 0)}));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(AdditionCorrugated.Block.Blocks.CorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(Items.paper, 1, 0)}));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(AdditionCorrugated.Block.Blocks.StrongCorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(AdditionCorrugated.Item.Items.StrongPaper, 1, 0)}));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(AdditionCorrugated.Block.Blocks.RecycledCorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(AdditionCorrugated.Item.Items.RecycledPaper, 1, 0)}));
		
		GameRegistry.addRecipe(
				new ShapelessOreRecipe(
				new ItemStack(AdditionCorrugated.Block.Blocks.SilverGravel, 1, 0),
				new Object[]{
				"ingotSilver",
				new ItemStack(Blocks.gravel, 1, 0)}));
	}
	
	public void addSmelting()
	{
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(AdditionCorrugated.Item.Items.Edge, 1), 0.75F);
	}

	public void addShapelessRecipe()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Item.Items.CorrugatedBoard, 9),
				new Object[]{
				new ItemStack(AdditionCorrugated.Block.Blocks.Corrugated,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Item.Items.Edge, 1),
				new Object[]{
					new ItemStack(AdditionCorrugated.Item.Items.PolishngPowder,1),new ItemStack(AdditionCorrugated.Item.Items.RustyEdge,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Item.Items.StrongCorrugatedBoard, 9),
				new Object[]{
				new ItemStack(AdditionCorrugated.Block.Blocks.StrongCorrugated,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.BlackStone, 1),
				new Object[]{
				new ItemStack(Blocks.stone,1),new ItemStack(Items.blaze_powder, 1, 0)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.GoldGravel, 1),
				new Object[]{
				new ItemStack(Blocks.gravel,1),new ItemStack(Items.gold_ingot,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.StarGravel, 1),
				new Object[]{
				new ItemStack(Blocks.gravel,1),new ItemStack(AdditionCorrugated.Item.Items.Star,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.HalfCorrugated, 2),
				new Object[]{
				new ItemStack(AdditionCorrugated.Block.Blocks.Corrugated,1),new ItemStack(AdditionCorrugated.Item.Items.Cutter,-1,32767)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.HalfStrongCorrugated, 2),
				new Object[]{
				new ItemStack(AdditionCorrugated.Block.Blocks.StrongCorrugated,1),new ItemStack(AdditionCorrugated.Item.Items.Cutter,-1,32767)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.HalfCorrugatedLight, 2),
				new Object[]{
				new ItemStack(AdditionCorrugated.Block.Blocks.CorrugatedLight,1),new ItemStack(AdditionCorrugated.Item.Items.Cutter,-1,32767)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Block.Blocks.HalfStrongCorrugatedLight, 2),
				new Object[]{
				new ItemStack(AdditionCorrugated.Block.Blocks.StrongCorrugatedLight,1),new ItemStack(AdditionCorrugated.Item.Items.Cutter,-1,32767)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Item.Items.RecycledCorrugatedBoard, 9),
				new Object[]{
				new ItemStack(AdditionCorrugated.Block.Blocks.RecycledCorrugated,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Item.Items.StrongRecycledCorrugatedBoard, 9),
				new Object[]{
				new ItemStack(AdditionCorrugated.Block.Blocks.StrongRecycledCorrugated,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.Item.Items.StrongRecycledCorrugatedBoard, 9),
				new Object[]{
				new ItemStack(AdditionCorrugated.Block.Blocks.StrongRecycledCorrugated,1)});
	}
}