
package nothing.its.real.client.renderer;

import nothing.its.real.entity.CowEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

public class CowRenderer extends MobRenderer<CowEntity, CowModel<CowEntity>> {
	public CowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CowEntity entity) {
		return new ResourceLocation("ashes1ashes:textures/entities/cow12.png");
	}
}
