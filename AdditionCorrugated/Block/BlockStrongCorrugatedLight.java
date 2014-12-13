package AdditionCorrugated.Block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockStrongCorrugatedLight extends Block
{
	public BlockStrongCorrugatedLight()
	{
		super(Material.tnt);
		setBlockName("BlockStrongCorrugatedLight");
		setBlockTextureName("additioncorrugated:block_strongcorrugated");
		setHardness(10.0F);
		setResistance(500.0F);
		setStepSound(Block.soundTypeStone);
		setLightLevel(1.0F);
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
}