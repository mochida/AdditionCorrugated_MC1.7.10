package AdditionCorrugated.Entity;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.*;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import AdditionCorrugated.*;
import AdditionCorrugated.Item.Items;

public class EntityCorrugatedCreeper extends EntityCreeper
{
	public EntityCorrugatedCreeper(World world)
	{
		super(world);
		this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
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
		return "mob.creeper.say";
	}
	
	@Override
	public String getDeathSound()
	{
		return "mob.creeper.death";
	}
	
	@Override
	public void func_145780_a(int x, int y, int z, Block block)
	{
		this.playSound("mob.creeper.step", 0.15F, 1.0F);
	}
	
	@Override
	public void dropFewItems(boolean par1, int par2)
	{
		super.dropFewItems(par1, par2);
		
		if(this.rand.nextInt(20) == 0)
		{
			this.dropItem(AdditionCorrugated.ACFood.Item.Items.SolarFragment, 1);
		}
		if(this.rand.nextInt(45) == 0)
		{
			this.dropItem(AdditionCorrugated.Item.Items.Star, 1);
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
		return 10;
	}
}