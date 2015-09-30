package AdditionCorrugated.MCEconomy2;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.world.World;
import shift.mceconomy2.api.*;
import shift.mceconomy2.api.shop.*;
import shift.mceconomy2.gui.ContainerShop;

public class Add_MCE2Core extends ProductList
{
	private static ArrayList<IProductItem> ACProduct = new ArrayList<IProductItem>();
	
	public static int ACShopID = -1;
	
	public void register()
	{
		ACShopID = MCEconomyAPI.ShopManager.registerProductList(this);
		this.Product();
	}
	
	public static void Product()
	{
		ACProduct.add(new ProductItem(new ItemStack(AdditionCorrugated.Item.Items.StrongPaper, 1, 0), 30));
	}

	@Override
	public String getProductListName()
	{
		return "AdditionCorrugated Vending";
	}
	
	@Override
	public void addItemProduct(IProductItem item)
	{
		ACProduct.add(item);
	}
	
	@Override
	public int getItemProductSize()
	{
		return ACProduct.size();
	}
	
	@Override
	public ArrayList<IProductItem> getProductList()
	{
		return ACProduct;
	}
}