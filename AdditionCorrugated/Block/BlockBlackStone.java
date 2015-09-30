package AdditionCorrugated.Block;

import java.util.Random;
import AdditionCorrugated.*;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BlockBlackStone extends Block implements IWorldGenerator
{
	public BlockBlackStone()
    {
        super(Material.rock);
		setBlockName("BlackStone");
    	setHardness(5.0F);
        setResistance(50.0F);
        setStepSound(soundTypeStone);
		setBlockTextureName("additioncorrugated:block_blackstone");
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
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		if(world.provider instanceof WorldProviderSurface)
		{
			this.generateOre(world, random, chunkX << 4, chunkZ << 4);
		}
	}

	private void generateOre(World world, Random random, int x, int z)
	{
		for (int i = 0; i < 100; ++i)
		{
			int genX = x + random.nextInt(16);
			int genY = 0 + random.nextInt(256);
			int genZ = z + random.nextInt(16);
			
			(new WorldGenMinable(AdditionCorrugated.Block.Blocks.BlackStone, 10)).generate(world, random, genX, genY, genZ);
		}
	}
	
	public boolean isBlockNormalCube(World world, int x, int y, int z)
	{
		return true;
	}
	
	public boolean canCreatureSpawn(World world, int x, int y, int z)
	{
		return false;
	}
	
	public boolean isBlockFoliage(World world, int x, int y, int z)
	{
		return true;
	}
	
	public boolean canDragonDestroy(EnumCreatureType type, World world, int x, int y, int z)
	{
		return true;
	}
}