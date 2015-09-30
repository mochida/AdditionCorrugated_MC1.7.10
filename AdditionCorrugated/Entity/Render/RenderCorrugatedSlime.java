package AdditionCorrugated.Entity.Render;

import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import AdditionCorrugated.Entity.*;

public class RenderCorrugatedSlime extends RenderLiving
{
public static final ResourceLocation Icon = new ResourceLocation("additioncorrugated", "textures/entity/mob3.png");
	
	public RenderCorrugatedSlime()
	{
		super(new ModelSlime(0), 0.5F);
	}
	
	protected ResourceLocation func_110829_a(EntityCorrugatedSlime par1EntitySlime)
	{
		return Icon;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return this.func_110829_a((EntityCorrugatedSlime)par1Entity);
	}
}