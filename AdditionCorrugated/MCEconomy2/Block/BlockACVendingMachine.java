package AdditionCorrugated.MCEconomy2.Block;

import java.util.Random;
import shift.mceconomy2.ShopManager;
import shift.mceconomy2.api.MCEconomyAPI;
import AdditionCorrugated.AdditionCorrugatedCore;
import AdditionCorrugated.MCEconomy2.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.*;
import AdditionCorrugated.Entity.TileEntity.*;

public class BlockACVendingMachine extends BlockContainer
{
	@SideOnly(Side.CLIENT)
	private IIcon TopIcon;
	
	@SideOnly(Side.CLIENT)
	private IIcon SideIcon;
	
	public BlockACVendingMachine()
	{
		super(Material.tnt);
		setBlockName("BlockACVendingMachine");
		setHardness(5.0F);
		setResistance(5.0F);
		setStepSound(Block.soundTypeStone);
	}
	
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5Entityplayer, int par6, float par7, float par8, float par9)
	{
		ItemStack itemstack = par5Entityplayer.inventory.getCurrentItem();
		ACMCE2BlockRightCrickEvent event = new ACMCE2BlockRightCrickEvent(par1World, par5Entityplayer, itemstack, par2, par3, par4);
		MinecraftForge.EVENT_BUS.post(event);
		
		if (event.isCanceled())
		{
			return true;
		}
		
		if (par1World.isRemote)
		{
			return true;
		}
		else
		{
			if (Loader.isModLoaded("mceconomy2"))
			{
				AdditionCorrugated.MCEconomy2.ShopGUI.openShopGui(par5Entityplayer, par1World, par2, par3, par4);
//				MCEconomyAPI.ShopManager.openShopGui(AdditionCorrugated.MCEconomy2.Add_MCE2Core.ACShopID, par5Entityplayer, par1World, par2, par3, par4);
			}
			else
			{
				
			}
		}
		return true;
	}
	
	@Override
	public void onBlockAdded(World world, int x, int y, int z)
	{
		super.onBlockAdded(world, x, y, z);
	}
	
	public int quantityDropped(int meta, int fortune, Random random)
	{
		return quantityDroppedWithBonus(fortune, random);
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 1;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		this.TopIcon = par1IconRegister.registerIcon("additioncorrugated:acvendingmachine");
		this.SideIcon = par1IconRegister.registerIcon("additioncorrugated:acvendingmachine_side");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		if(par1 == 1)
		{
			return TopIcon;
		}
		if(par1 == 0 || par1 == 2 || par1 == 3 || par1 == 4 || par1 == 5 || par1 == 6)
		{
			return SideIcon;
		}
		else
		{
			return null;
		}
	}

	@Override
	public TileEntity createNewTileEntity(World world, int par1)
	{
		return new TileACVendingMachine();
	}
}