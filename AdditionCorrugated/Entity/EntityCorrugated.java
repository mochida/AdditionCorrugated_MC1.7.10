package AdditionCorrugated.Entity;

import AdditionCorrugated.*;
import net.minecraft.block.Block;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityCorrugated extends EntityCreeper
{
	public EntityCorrugated(World world)
	{
		super(world);
		this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.tasks.addTask(3, new EntityAISwimming(this));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityCorrugated.class, 0, false));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
	}
		
	@Override
	public String getLivingSound()
	{
		return null;
	}
	
	@Override
	public String getHurtSound()
	{
		return null;
	}
	
	@Override
	public String getDeathSound()
	{
		return null;
	}
	
	@Override
	public void func_145780_a(int x, int y, int z, Block block)
	{
		this.playSound("mob.skeleton.step", 0.15F, 1.0F);
	}
	
	public Item getDorpItem()
	{
		return AdditionCorrugatedCore.CorrugatedAxe;
	}
	
	public Block getDorpBlock()
	{
		return AdditionCorrugatedCore.Corrugated;
	}
}