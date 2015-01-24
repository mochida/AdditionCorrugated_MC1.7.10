package AdditionCorrugated.Entity;

import net.minecraft.block.Block;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import AdditionCorrugated.AdditionCorrugatedCore;

public class EntityCorrugatedCreeper extends EntityCreeper
{
	public EntityCorrugatedCreeper(World world)
	{
		super(world);
		this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.tasks.addTask(3, new EntityAISwimming(this));
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
	
	public Block getDorpBlock()
	{
		return AdditionCorrugatedCore.Corrugated;
	}
	
	public Item getDorpItem()
	{
		return AdditionCorrugatedCore.CorrugatedAxe;
	}
	
	public void onDeath(DamageSource par1DamageSource)
    {
		this.getDropItem();
		this.getDorpBlock();
    }
}