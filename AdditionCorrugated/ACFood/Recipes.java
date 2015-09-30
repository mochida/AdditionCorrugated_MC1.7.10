package AdditionCorrugated.ACFood;

import net.minecraft.init.*;
import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;

public class Recipes
{
	public void addRecipe()
	{
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.ACFood.Item.Items.Gum, 1),
				new Object[]{ "XXX","YYY"," Z ",
						'X',Items.sugar,'Y',Items.wheat,'Z',Items.water_bucket});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.ACFood.Item.Items.SuperMintGum, 1),
				new Object[]{ " Y ","YXY"," Y ",
						'X',AdditionCorrugated.ACFood.Item.Items.MintGum,'Y',Items.redstone});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.ACFood.Item.Items.ChocolateBar, 1),
				new Object[]{ " X ","YZY","ZYZ",
						'X',Items.water_bucket,'Y',Items.sugar,'Z',new ItemStack(Items.blaze_powder, 1, 3)});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.ACFood.Item.Items.Dumpling, 1),
				new Object[]{ "X Y"," X ","  Z",
						'X',AdditionCorrugated.ACFood.Item.Items.RiceCake,'Y',AdditionCorrugated.ACFood.Item.Items.SoySauce,'Z',new ItemStack(Items.stick, 1)});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugated.ACFood.Item.Items.FermentedSoybeans, 1),
				new Object[]{ " X "," Y "," Z ",
						'X',AdditionCorrugated.ACFood.Item.Items.SoySauce,'Y',AdditionCorrugated.ACFood.Item.Items.Soybeans,'Z',AdditionCorrugated.ACFood.Item.Items.Straw});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.sponge, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugated.ACFood.Item.Items.DrySpongeGourd});
	}
	
	public void addShapelessRecipe()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.ACFood.Item.Items.MintGum, 6),
				new Object[]{
				new ItemStack(AdditionCorrugated.ACFood.Item.Items.Gum,1),new ItemStack(Items.gold_ingot,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.ACFood.Item.Items.RiceCake, 1),
				new Object[]{
				new ItemStack(AdditionCorrugated.ACFood.Item.Items.GlutinousRice,1),new ItemStack(Items.water_bucket,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.ACFood.Item.Items.PickledPlum, 1),
				new Object[]{
				new ItemStack(AdditionCorrugated.ACFood.Item.Items.SolarFragment,1),new ItemStack(AdditionCorrugated.ACFood.Item.Items.Plum,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.ACFood.Item.Items.Straw, 1),
				new Object[]{
				new ItemStack(AdditionCorrugated.ACFood.Item.Items.SolarFragment,1),new ItemStack(Items.wheat,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.ACFood.Item.Items.DrySpongeGourd, 1),
				new Object[]{
				new ItemStack(AdditionCorrugated.ACFood.Item.Items.SpongeGourd,1),new ItemStack(AdditionCorrugated.ACFood.Item.Items.SolarFragment, 1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.ACFood.Block.Blocks.JapaneseLeekPlant, 2),
				new Object[]{
				new ItemStack(AdditionCorrugated.ACFood.Item.Items.JapaneseLeek,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.ACFood.Block.Blocks.BeansPlant, 2),
				new Object[]{
				new ItemStack(AdditionCorrugated.ACFood.Item.Items.GreenSoybeans,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.ACFood.Block.Blocks.BeansPlant, 3),
				new Object[]{
				new ItemStack(AdditionCorrugated.ACFood.Item.Items.Soybeans,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.ACFood.Block.Blocks.RicePlant, 2),
				new Object[]{
				new ItemStack(AdditionCorrugated.ACFood.Item.Items.Rice,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugated.ACFood.Block.Blocks.BlueberryPlant, 2),
				new Object[]{
				new ItemStack(AdditionCorrugated.ACFood.Item.Items.Blueberry,1)});
	}
}