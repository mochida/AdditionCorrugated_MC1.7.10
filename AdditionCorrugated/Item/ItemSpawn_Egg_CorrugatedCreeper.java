package AdditionCorrugated.Item;

import java.lang.reflect.*;
import java.util.*;
import net.minecraft.block.*;
import net.minecraft.creativetab.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.World;
import AdditionCorrugated.Entity.*;
import cpw.mods.fml.relauncher.*;

public class ItemSpawn_Egg_CorrugatedCreeper extends ItemMonsterPlacer
{	
	public static Class[] spawnableEntities = {EntityCorrugatedCreeper.class,};
	
	public ItemSpawn_Egg_CorrugatedCreeper()
	{
		
	}
	
    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par3World.isRemote)
        {
            return true;
        }
        else
        {
            Block block = par3World.getBlock(par4, par5, par6);
            par4 += Facing.offsetsXForSide[par7];
            par5 += Facing.offsetsYForSide[par7];
            par6 += Facing.offsetsZForSide[par7];
            double d0 = 0.0D;
 
            if (par7 == 1 && block.getRenderType() == 11)
            {
                d0 = 0.5D;
            }
 
            Entity entity = spawnCreature(par3World, par1ItemStack.getItemDamage(), (double)par4 + 0.5D, (double)par5 + d0, (double)par6 + 0.5D);
 
            if (entity != null)
            {
                if (entity instanceof EntityLivingBase && par1ItemStack.hasDisplayName())
                {
                    ((EntityLiving)entity).setCustomNameTag(par1ItemStack.getDisplayName());
                }
 
                if (!par2EntityPlayer.capabilities.isCreativeMode)
                {
                    --par1ItemStack.stackSize;
                }
            }
            return true;
        }
    }
    
    public static Entity spawnCreature(World par0World, int par1, double par2, double par4, double par6)
    {
        Class c = spawnableEntities[par1];
        Entity entity = null;
        try {
            entity = (Entity)c.getConstructor(new Class[] {World.class}).newInstance(new Object[] {par0World});

            EntityLiving entityliving = (EntityLiving)entity;
            entity.setLocationAndAngles(par2, par4, par6, MathHelper.wrapAngleTo180_float(par0World.rand.nextFloat() * 360.0F), 0.0F);
            entityliving.rotationYawHead = entityliving.rotationYaw;
            entityliving.renderYawOffset = entityliving.rotationYaw;
            entityliving.onSpawnWithEgg((IEntityLivingData)null);
            par0World.spawnEntityInWorld(entity);
            entityliving.playLivingSound();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return entity;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void getSubItems(Item par1, CreativeTabs par2, List par3)
    {
        for(int i = 0; i < spawnableEntities.length; ++i) {
            par3.add(new ItemStack(par1, 1, i));
        }
    }
}