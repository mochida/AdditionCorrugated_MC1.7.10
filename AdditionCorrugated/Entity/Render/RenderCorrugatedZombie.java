package AdditionCorrugated.Entity.Render;

import AdditionCorrugated.Entity.*;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class RenderCorrugatedZombie extends RenderLiving
{
public static final ResourceLocation Icon = new ResourceLocation("additioncorrugated", "textures/entity/mob2.png");
	
	public RenderCorrugatedZombie()
	{
		super(new ModelZombie(), 0.5F);
	}
	
	protected ResourceLocation func_110829_a(EntityCorrugatedZombie par1EntityZombie)
	{
		return Icon;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return this.func_110829_a((EntityCorrugatedZombie)par1Entity);
	}
}