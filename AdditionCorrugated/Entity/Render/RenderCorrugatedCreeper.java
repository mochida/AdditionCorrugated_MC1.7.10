package AdditionCorrugated.Entity.Render;

import AdditionCorrugated.Entity.*;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class RenderCorrugatedCreeper extends RenderLiving
{
	public static final ResourceLocation Icon = new ResourceLocation("additioncorrugated", "textures/entity/mob1.png");
	
	public RenderCorrugatedCreeper()
	{
		super(new ModelCreeper(), 0.5F);
	}
	
	protected ResourceLocation func_110829_a(EntityCorrugatedCreeper par1EntityCreeper)
	{
		return Icon;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return this.func_110829_a((EntityCorrugatedCreeper)par1Entity);
	}
}