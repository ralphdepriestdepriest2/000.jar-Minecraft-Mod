
package nothing.its.real.client.renderer;

import nothing.its.real.entity.JarCubeCloseEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class JarCubeCloseRenderer extends HumanoidMobRenderer<JarCubeCloseEntity, HumanoidModel<JarCubeCloseEntity>> {
	public JarCubeCloseRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(JarCubeCloseEntity entity) {
		return new ResourceLocation("ashes1ashes:textures/entities/smileskin.png");
	}
}
