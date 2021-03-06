package AdditionCorrugated.ACOre.Block;

import java.util.Random;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.common.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;

public class BlockoreAdamantite extends Block implements IWorldGenerator
{
	
	public BlockoreAdamantite()
	{
		super(Material.iron);
		setBlockName("OreAdamantite");
		setBlockTextureName("additioncorrugated:block_oreadamantite");
		setHardness(5.0F);
		setResistance(1.0F);
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
	
	public int quantityDroppedWithBonus(int par1, Random rand)
	{
		int var3 = this.quantityDropped(rand) + rand.nextInt(1 +par1);
		
		if (var3 > 2)
		{
			var3 = 2;
		}
		
		return var3;
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
		for (int i = 0; i < 15; ++i)
		{
			int genX = x + random.nextInt(16);
			int genY = 0 + random.nextInt(16);
			int genZ = z + random.nextInt(16);
			
			(new WorldGenMinable(AdditionCorrugated.ACOre.Block.Blocks.oreAdamantite, 5)).generate(world, random, genX, genY, genZ);
		}
	}
}