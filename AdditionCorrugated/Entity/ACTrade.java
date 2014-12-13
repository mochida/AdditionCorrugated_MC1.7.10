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
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.SoySauce));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.Blueberry));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.Kimchi));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.JapaneseLeek));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.Rice));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.Mustard));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.Capsicum));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.SeaMustard));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.SeaMustardRevision));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.Plum));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.SpongeGourd));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.Soybeans));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.PolishngPowder));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.RustyEdge));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.SolarFragment));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald), AdditionCorrugatedCore.Star));
	}
}