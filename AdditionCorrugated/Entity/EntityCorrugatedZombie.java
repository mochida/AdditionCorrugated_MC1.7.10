package AdditionCorrugated.Entity;

import net.minecraft.block.Block;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.*;
import net.minecraft.item.Item;
import net.minecraft.world.*;

public class EntityCorrugatedZombie extends EntityZombie
{
	public EntityCorrugatedZombie(World world)
	{
		super(world);
		this.tasks.addTask(1, new EntityAIWander(this, 1.2D));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, false));
		this.tasks.addTask(4, new EntityAISwimming(this));
	}
	
	public boolean isAIEnabled()
    {
        return true;
    }
	
	@Override
	public String getHurtSound()
	{
		return "mob.zombie.say";
	}
	
	@Override
	public String getDeathSound()
	{
		return "mob.zombie.death";
	}
	
	@Override
	public void func_145780_a(int x, int y, int z, Block block)
	{
		this.playSound("mob.zombie.step", 0.15F, 1.0F);
	}
	
	@Override
	public void dropFewItems(boolean par1, int par2)
	{
		super.dropFewItems(par1, par2);
		
		if(this.rand.nextInt(10) == 0)
		{
			this.dropItem(AdditionCorrugated.Item.Items.CorrugatedBoard, 1);
		}
		if(this.rand.nextInt(30) == 0)
		{
			this.dropItem(AdditionCorrugated.Item.Items.CorrugatedBoard, 2);
		}
		if(this.rand.nextInt(50) == 0)
		{
			this.dropItem(Item.getItemFromBlock(AdditionCorrugated.ACFood.Block.Blocks.BeansPlant), 1);
		}
		if(this.rand.nextInt(50) == 0)
		{
			this.dropItem(Item.getItemFromBlock(AdditionCorrugated.ACFood.Block.Blocks.BlueberryPlant), 1);
		}
		if(this.rand.nextInt(50) == 0)
		{
			this.dropItem(Item.getItemFromBlock(AdditionCorrugated.ACFood.Block.Blocks.JapaneseLeekPlant), 1);
		}
		if(this.rand.nextInt(50) == 0)
		{
			this.dropItem(Item.getItemFromBlock(AdditionCorrugated.ACFood.Block.Blocks.RicePlant), 1);
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
		return 50;
	}
}