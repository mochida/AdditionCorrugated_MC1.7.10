package AdditionCorrugated.Entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import AdditionCorrugated.Entity.Model.*;

public class RenderCorrugated extends RenderLiving
{
	public static final ResourceLocation Icon = new ResourceLocation("additioncorrugated", "textures/entity/mobtest1.png");
	
	public RenderCorrugated()
	{
		super(new ModelCorrugated(), 1.0F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return this.Icon;
	}
}