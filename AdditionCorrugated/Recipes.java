package AdditionCorrugated;

import AdditionCorrugated.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.oredict.*;
import cpw.mods.fml.common.registry.*;

public class Recipes
{
	public void addRecipe()
	{
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.Corrugated, 1),
				new Object[]{ "X X","X X","XXX",
						'X',Items.paper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.Corrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugatedCore.CorrugatedBoard});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.StrongCorrugated, 1),
				new Object[]{ "X X","X X","XXX",
						'X',AdditionCorrugatedCore.StrongPaper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.Cutter, 1),
				new Object[]{ "XYX","XYX","XYX",
						'X',Items.stick,'Y',AdditionCorrugatedCore.Edge});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.StrongCorrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugatedCore.StrongCorrugatedBoard});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.Gum, 1),
				new Object[]{ "XXX","YYY"," Z ",
						'X',Items.sugar,'Y',Items.wheat,'Z',Items.water_bucket});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.SuperMintGum, 1),
				new Object[]{ " Y ","YXY"," Y ",
						'X',AdditionCorrugatedCore.MintGum,'Y',Items.redstone});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.ChocolateBar, 1),
				new Object[]{ " X ","YZY","ZYZ",
						'X',Items.water_bucket,'Y',Items.sugar,'Z',new ItemStack(Items.blaze_powder, 1, 3)});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.Dumpling, 1),
				new Object[]{ "X Y"," X ","  Z",
						'X',AdditionCorrugatedCore.RiceCake,'Y',AdditionCorrugatedCore.SoySauce,'Z',new ItemStack(Items.stick, 1)});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.FermentedSoybeans, 1),
				new Object[]{ " X "," Y "," Z ",
						'X',AdditionCorrugatedCore.SoySauce,'Y',AdditionCorrugatedCore.Soybeans,'Z',AdditionCorrugatedCore.Straw});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.sponge, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugatedCore.DrySpongeGourd});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedSword, 1),
				new Object[]{ " X "," X "," Y ",
						'X',AdditionCorrugatedCore.Corrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.StrongCorrugatedSword, 1),
				new Object[]{ " X "," X "," Y ",
						'X',AdditionCorrugatedCore.StrongCorrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedAxe, 1),
				new Object[]{ "XX ","XY "," Y ",
						'X',AdditionCorrugatedCore.Corrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.StrongCorrugatedAxe, 1),
				new Object[]{ "XX ","XY "," Y ",
						'X',AdditionCorrugatedCore.StrongCorrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedPickaxe, 1),
				new Object[]{ "XXX"," Y "," Y ",
						'X',AdditionCorrugatedCore.Corrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.StrongCorrugatedPickaxe, 1),
				new Object[]{ "XXX"," Y "," Y ",
						'X',AdditionCorrugatedCore.StrongCorrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedShovel, 1),
				new Object[]{ " X "," Y "," Y ",
						'X',AdditionCorrugatedCore.Corrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.StrongCorrugatedShovel, 1),
				new Object[]{ " X "," Y "," Y ",
						'X',AdditionCorrugatedCore.StrongCorrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedHoe, 1),
				new Object[]{ "XX "," Y "," Y ",
						'X',AdditionCorrugatedCore.Corrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.StrongCorrugatedHoe, 1),
				new Object[]{ "XX "," Y "," Y ",
						'X',AdditionCorrugatedCore.StrongCorrugated,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedTorch, 1),
				new Object[]{ "X","Y",
						'X',AdditionCorrugatedCore.CorrugatedLight,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.StrongCorrugatedTorch, 1),
				new Object[]{ "X","Y",
						'X',AdditionCorrugatedCore.StrongCorrugatedLight,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedChest, 1),
				new Object[]{ "XXX","X X","XXX",
						'X',Items.paper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.StrongCorrugatedChest, 1),
				new Object[]{ "XXX","X X","XXX",
						'X',AdditionCorrugatedCore.StrongPaper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.AdamantiteSword, 1),
				new Object[]{ " X "," X "," Y ",
						'X',AdditionCorrugatedCore.Adamantite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.AdamantiteHoe, 1),
				new Object[]{ "XX "," Y "," Y ",
						'X',AdditionCorrugatedCore.Adamantite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.AdamantiteShovel, 1),
				new Object[]{ " X "," Y "," Y ",
						'X',AdditionCorrugatedCore.Adamantite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.AdamantiteAxe, 1),
				new Object[]{ "XX ","XY "," Y ",
						'X',AdditionCorrugatedCore.Adamantite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.AdamantitePickaxe, 1),
				new Object[]{ "XXX"," Y "," Y ",
						'X',AdditionCorrugatedCore.Adamantite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CobaltSword, 1),
				new Object[]{ " X "," X "," Y ",
						'X',AdditionCorrugatedCore.Cobalt,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CobaltHoe, 1),
				new Object[]{ "XX "," Y "," Y ",
						'X',AdditionCorrugatedCore.Cobalt,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CobaltShovel, 1),
				new Object[]{ " X "," Y "," Y ",
						'X',AdditionCorrugatedCore.Cobalt,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CobaltAxe, 1),
				new Object[]{ "XX ","XY "," Y ",
						'X',AdditionCorrugatedCore.Cobalt,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.CobaltPickaxe, 1),
				new Object[]{ "XXX"," Y "," Y ",
						'X',AdditionCorrugatedCore.Cobalt,'Y',Items.stick});		
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.DemoniteSword, 1),
				new Object[]{ " X "," X "," Y ",
						'X',AdditionCorrugatedCore.Demonite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.DemoniteHoe, 1),
				new Object[]{ "XX "," Y "," Y ",
						'X',AdditionCorrugatedCore.Demonite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.DemoniteShovel, 1),
				new Object[]{ " X "," Y "," Y ",
						'X',AdditionCorrugatedCore.Demonite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.DemoniteAxe, 1),
				new Object[]{ "XX ","XY "," Y ",
						'X',AdditionCorrugatedCore.Demonite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.DemonitePickaxe, 1),
				new Object[]{ "XXX"," Y "," Y ",
						'X',AdditionCorrugatedCore.Demonite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.HellstoneSword, 1),
				new Object[]{ " X "," X "," Y ",
						'X',AdditionCorrugatedCore.Hellstone,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.HellstoneHoe, 1),
				new Object[]{ "XX "," Y "," Y ",
						'X',AdditionCorrugatedCore.Hellstone,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.HellstoneShovel, 1),
				new Object[]{ " X "," Y "," Y ",
						'X',AdditionCorrugatedCore.Hellstone,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.HellstoneAxe, 1),
				new Object[]{ "XX ","XY "," Y ",
						'X',AdditionCorrugatedCore.Hellstone,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.HellstonePickaxe, 1),
				new Object[]{ "XXX"," Y "," Y ",
						'X',AdditionCorrugatedCore.Hellstone,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.MeteoriteSword, 1),
				new Object[]{ " X "," X "," Y ",
						'X',AdditionCorrugatedCore.Meteorite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.MeteoriteHoe, 1),
				new Object[]{ "XX "," Y "," Y ",
						'X',AdditionCorrugatedCore.Meteorite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.MeteoriteShovel, 1),
				new Object[]{ " X "," Y "," Y ",
						'X',AdditionCorrugatedCore.Meteorite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.MeteoriteAxe, 1),
				new Object[]{ "XX ","XY "," Y ",
						'X',AdditionCorrugatedCore.Meteorite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.MeteoritePickaxe, 1),
				new Object[]{ "XXX"," Y "," Y ",
						'X',AdditionCorrugatedCore.Meteorite,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.MythrilSword, 1),
				new Object[]{ " X "," X "," Y ",
						'X',AdditionCorrugatedCore.Mythril,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.MythrilHoe, 1),
				new Object[]{ "XX "," Y "," Y ",
						'X',AdditionCorrugatedCore.Mythril,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.MythrilShovel, 1),
				new Object[]{ " X "," Y "," Y ",
						'X',AdditionCorrugatedCore.Mythril,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.MythrilAxe, 1),
				new Object[]{ "XX ","XY "," Y ",
						'X',AdditionCorrugatedCore.Mythril,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.MythrilPickaxe, 1),
				new Object[]{ "XXX"," Y "," Y ",
						'X',AdditionCorrugatedCore.Mythril,'Y',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.ACrecycle, 1),
				new Object[]{ "XXX","XZX","YQY",
						'X',AdditionCorrugatedCore.Corrugated,'Y',AdditionCorrugatedCore.StrongCorrugated,'Z',Items.flint_and_steel,'Q',Items.water_bucket});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.RecycledCorrugated, 1),
				new Object[]{ "X X","X X","XXX",
						'X',AdditionCorrugatedCore.RecycledPaper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.RecycledCorrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugatedCore.RecycledCorrugatedBoard});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.StrongRecycledCorrugated, 1),
				new Object[]{ "X X","X X","XXX",
						'X',AdditionCorrugatedCore.StrongRecycledPaper});
		
		GameRegistry.addRecipe(new ItemStack(AdditionCorrugatedCore.StrongRecycledCorrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',AdditionCorrugatedCore.StrongRecycledCorrugatedBoard});
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(AdditionCorrugatedCore.StrongRecycledCorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(AdditionCorrugatedCore.StrongRecycledPaper, 1, 0)}));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(AdditionCorrugatedCore.CorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(Items.paper, 1, 0)}));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(AdditionCorrugatedCore.StrongCorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(AdditionCorrugatedCore.StrongPaper, 1, 0)}));
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(AdditionCorrugatedCore.RecycledCorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(AdditionCorrugatedCore.RecycledPaper, 1, 0)}));
	}
	
	public void addSmelting()
	{
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(AdditionCorrugatedCore.Edge, 1), 0.75F);
		
		GameRegistry.addSmelting(AdditionCorrugatedCore.oreFluorite, new ItemStack(AdditionCorrugatedCore.Fluorite, 1), 0.99F);
		
		GameRegistry.addSmelting(AdditionCorrugatedCore.oreAdamantite, new ItemStack(AdditionCorrugatedCore.Adamantite, 1), 0.99F);
		
		GameRegistry.addSmelting(AdditionCorrugatedCore.oreCobalt, new ItemStack(AdditionCorrugatedCore.Cobalt, 1), 0.99F);
		
		GameRegistry.addSmelting(AdditionCorrugatedCore.oreDemonite, new ItemStack(AdditionCorrugatedCore.Demonite, 1), 0.99F);
		
		GameRegistry.addSmelting(AdditionCorrugatedCore.oreHellstone, new ItemStack(AdditionCorrugatedCore.Hellstone, 1), 0.99F);
		
		GameRegistry.addSmelting(AdditionCorrugatedCore.oreMeteorite, new ItemStack(AdditionCorrugatedCore.Meteorite, 1), 0.99F);
		
		GameRegistry.addSmelting(AdditionCorrugatedCore.oreMythril, new ItemStack(AdditionCorrugatedCore.Mythril, 1), 0.99F);
		
		GameRegistry.addSmelting(AdditionCorrugatedCore.oreSilver, new ItemStack(AdditionCorrugatedCore.Silver, 1), 0.99F);
		
		GameRegistry.addSmelting(AdditionCorrugatedCore.oreTNT, new ItemStack(Blocks.tnt, 1), 0.99F);
	}

	public void addShapelessRecipe()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.CorrugatedBoard, 9),
				new Object[]{
				new ItemStack(AdditionCorrugatedCore.Corrugated,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.StrongPaper, 1),
				new Object[]{
				new ItemStack(Items.paper,1),new ItemStack(Blocks.obsidian,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.Edge, 1),
				new Object[]{
					new ItemStack(AdditionCorrugatedCore.PolishngPowder,1),new ItemStack(AdditionCorrugatedCore.RustyEdge,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.StrongCorrugatedBoard, 9),
				new Object[]{
				new ItemStack(AdditionCorrugatedCore.StrongCorrugated,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.TemperedGlass, 1),
				new Object[]{
				new ItemStack(Blocks.glass,1),new ItemStack(Blocks.obsidian,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.MintGum, 6),
				new Object[]{
				new ItemStack(AdditionCorrugatedCore.Gum,1),new ItemStack(Items.gold_ingot,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.TStone, 1),
			new Object[]{
				new ItemStack(Blocks.tnt,1),new ItemStack(Blocks.stone,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.RiceCake, 1),
				new Object[]{
				new ItemStack(AdditionCorrugatedCore.GlutinousRice,1),new ItemStack(Items.water_bucket,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.PickledPlum, 1),
				new Object[]{
				new ItemStack(AdditionCorrugatedCore.SolarFragment,1),new ItemStack(AdditionCorrugatedCore.Plum,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.Straw, 1),
				new Object[]{
				new ItemStack(AdditionCorrugatedCore.SolarFragment,1),new ItemStack(Items.wheat,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.BlackStone, 1),
				new Object[]{
				new ItemStack(Blocks.stone,1),new ItemStack(Items.blaze_powder, 1, 0)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.DrySpongeGourd, 1),
				new Object[]{
				new ItemStack(AdditionCorrugatedCore.SpongeGourd,1),new ItemStack(AdditionCorrugatedCore.SolarFragment, 1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.GoldGravel, 1),
				new Object[]{
				new ItemStack(Blocks.gravel,1),new ItemStack(Items.gold_ingot,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.SilverGravel, 1),
				new Object[]{
				new ItemStack(Blocks.gravel,1),new ItemStack(AdditionCorrugatedCore.Silver,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.StarGravel, 1),
				new Object[]{
				new ItemStack(Blocks.gravel,1),new ItemStack(AdditionCorrugatedCore.Star,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.HalfCorrugated, 2),
				new Object[]{
				new ItemStack(AdditionCorrugatedCore.Corrugated,1),new ItemStack(AdditionCorrugatedCore.Cutter,-1,32767)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.HalfStrongCorrugated, 2),
				new Object[]{
				new ItemStack(AdditionCorrugatedCore.StrongCorrugated,1),new ItemStack(AdditionCorrugatedCore.Cutter,-1,32767)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.HalfCorrugatedLight, 2),
				new Object[]{
				new ItemStack(AdditionCorrugatedCore.CorrugatedLight,1),new ItemStack(AdditionCorrugatedCore.Cutter,-1,32767)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.HalfStrongCorrugatedLight, 2),
				new Object[]{
				new ItemStack(AdditionCorrugatedCore.StrongCorrugatedLight,1),new ItemStack(AdditionCorrugatedCore.Cutter,-1,32767)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.RecycledCorrugatedBoard, 9),
				new Object[]{
				new ItemStack(AdditionCorrugatedCore.RecycledCorrugated,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AdditionCorrugatedCore.StrongRecycledCorrugatedBoard, 9),
				new Object[]{
				new ItemStack(AdditionCorrugatedCore.StrongRecycledCorrugated,1)});
	}
}