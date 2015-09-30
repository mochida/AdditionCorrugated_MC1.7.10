package AdditionCorrugated.MCEconomy2;

import cpw.mods.fml.common.Loader;
import shift.mceconomy2.api.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;

public class ShopGUI
{
	public static void openShopGui(EntityPlayer player, World world, int x, int y, int z)
	{
		if (Loader.isModLoaded("mceconomy2") && AdditionCorrugated.MCEconomy2.Add_MCE2Core.ACShopID > 0)
		{
			MCEconomyAPI.openShopGui(AdditionCorrugated.MCEconomy2.Add_MCE2Core.ACShopID, player, world, x, y, z);
		}
	}
	
	public static void addMP(EntityPlayer player, int amount)
	{
		if (Loader.isModLoaded("mceconomy2") && amount > 0)
		{
			MCEconomyAPI.addPlayerMP(player, amount, true);
		}
	}
	
	public static void reduceMP(EntityPlayer player, int amount)
	{
		if (Loader.isModLoaded("mceconomy2") && amount > 0)
		{
			MCEconomyAPI.reducePlayerMP(player, amount, true);
		}
	}
}