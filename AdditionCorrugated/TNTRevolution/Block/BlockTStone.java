package AdditionCorrugated.TNTRevolution.Block;

import java.util.Random;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockTStone extends Block
{
	@SideOnly(Side.CLIENT)
	private IIcon TopIcon;
	
	@SideOnly(Side.CLIENT)
	private IIcon SideIcon;
			
	public BlockTStone()
	{
		super(Material.rock);
		setBlockName("TStone");
		setStepSound(Block.soundTypeStone);
		setHardness(2.0F);
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
		this.TopIcon = par1IconRegister.registerIcon("additioncorrugated:tstone");
		this.SideIcon = par1IconRegister.registerIcon("additioncorrugated:tstone_side");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		if(par1 == 0 || par1 == 1)
		{
			return TopIcon;
		}
		if(par1 == 2 || par1 == 3 || par1 == 4 || par1 == 5 || par1 == 6)
		{
			return SideIcon;
		}
		else
		{
			return null;
		}
	}
}