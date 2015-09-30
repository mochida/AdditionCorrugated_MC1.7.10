package AdditionCorrugated.Entity;

import java.util.Random;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import AdditionCorrugated.*;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class ACTrade implements IVillageTradeHandler
{
	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
	{	
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 2), AdditionCorrugated.Item.Items.PolishngPowder));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 2), AdditionCorrugated.Item.Items.RustyEdge));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 10), AdditionCorrugated.Item.Items.Star));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 5), AdditionCorrugated.ACFood.Item.Items.SoySauce));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 3), AdditionCorrugated.ACFood.Item.Items.Blueberry));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 4), AdditionCorrugated.ACFood.Item.Items.Kimchi));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 2), AdditionCorrugated.ACFood.Item.Items.JapaneseLeek));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 3), AdditionCorrugated.ACFood.Item.Items.Rice));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 2), AdditionCorrugated.ACFood.Item.Items.Mustard));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 5), AdditionCorrugated.ACFood.Item.Items.Capsicum));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 2), AdditionCorrugated.ACFood.Item.Items.SeaMustard));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 9), AdditionCorrugated.ACFood.Item.Items.SeaMustardRevision));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 4), AdditionCorrugated.ACFood.Item.Items.Plum));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 3), AdditionCorrugated.ACFood.Item.Items.SpongeGourd));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 3), AdditionCorrugated.ACFood.Item.Items.Soybeans));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 8), AdditionCorrugated.ACFood.Item.Items.SolarFragment));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 3), AdditionCorrugated.ACFood.Item.Items.GlutinousRice));
		recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 2), AdditionCorrugated.ACFood.Item.Items.GreenSoybeans));
	}
}