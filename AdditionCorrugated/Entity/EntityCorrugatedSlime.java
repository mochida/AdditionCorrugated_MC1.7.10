package AdditionCorrugated.Entity;

import net.minecraft.block.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.*;
import net.minecraft.item.*;
import net.minecraft.world.*;

public class EntityCorrugatedSlime extends EntitySlime
{
	public EntityCorrugatedSlime(World world)
	{
		super(world);
		this.tasks.addTask(1, new EntityAILookIdle(this));
		this.tasks.addTask(2, new EntityAISwimming(this));
	}
	
	public boolean isAIEnabled()
    {
        return true;
    }
	
	@Override
	public String getHurtSound()
	{
		return "mob.slime.say";
	}
	
	@Override
	public String getDeathSound()
	{
		return "mob.slime.death";
	}
	
	@Override
	public void func_145780_a(int x, int y, int z, Block block)
	{
		this.playSound("mob.slime.step", 0.15F, 1.0F);
	}
	
	@Override
	public void dropFewItems(boolean par1, int par2)
	{
		super.dropFewItems(par1, par2);
		
		if(this.rand.nextInt(10) == 0)
		{
			this.dropItem(AdditionCorrugated.Item.Items.CorrugatedBoard, 1);
		}
	}
	
	@Override
	public boolean getCanSpawnHere()
	{
		return super.getCanSpawnHere();
	}
	
	@Override
	public int getMaxSpawnedInChunk()
	{
		return 4;
	}
}