package AdditionCorrugated.Block;

import java.util.Random;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.*;
import AdditionCorrugated.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class BlockACrecycle extends Block
{
	@SideOnly(Side.CLIENT)
	private IIcon TopIcon;
	
	@SideOnly(Side.CLIENT)
	private IIcon SideIcon;
	
	public BlockACrecycle()
	{
		super(Material.tnt);
		setBlockName("BlockACrecycle");
		setHardness(2.5F);
		setResistance(10.0F);
		setStepSound(Block.soundTypeStone);
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
	
	public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side)
	{
		return true;
	}
	
	@Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
	{
		player.openGui(AdditionCorrugatedCore.instance, AdditionCorrugatedCore.ACRecycleGUI, world, x, y, z);
		return true;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		this.TopIcon = par1IconRegister.registerIcon("additioncorrugated:acrecycle");
		this.SideIcon = par1IconRegister.registerIcon("additioncorrugated:acrecycle_side");
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
}