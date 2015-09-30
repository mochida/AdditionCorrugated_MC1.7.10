package AdditionCorrugated.Block;

import java.util.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class BlockHalfStrongCorrugatedLight extends Block
{
	@SideOnly(Side.CLIENT)
	private IIcon TopIcon;
	
	@SideOnly(Side.CLIENT)
	private IIcon SideIcon;
	
	public BlockHalfStrongCorrugatedLight()
	{
		super(Material.tnt);
		setBlockName("BlockHalfStrongCorrugatedLight");
		setHardness(10.0F);
		setResistance(500.0F);
		setStepSound(Block.soundTypeStone);
		setLightLevel(1.0F);
	}
	
	@Override
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
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1, int par2, int par3, int par4)
	{
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		this.TopIcon = par1IconRegister.registerIcon("additioncorrugated:block_strongcorrugated");
		this.SideIcon = par1IconRegister.registerIcon("additioncorrugated:block_strongcorrugated_side");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		if(par1 == 0 || par1 == 1)
		{
			return TopIcon;
		}
		else
		{
			return SideIcon;
		}
	}
}