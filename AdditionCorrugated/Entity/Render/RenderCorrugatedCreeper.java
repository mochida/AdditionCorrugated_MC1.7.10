package AdditionCorrugated.Entity.Render;

import AdditionCorrugated.Entity.EntityCorrugatedCreeper;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderCorrugatedCreeper extends RenderLiving
{
	public static final ResourceLocation Icon = new ResourceLocation("additioncorrugated", "textures/entity/mobtest1.png");
	
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