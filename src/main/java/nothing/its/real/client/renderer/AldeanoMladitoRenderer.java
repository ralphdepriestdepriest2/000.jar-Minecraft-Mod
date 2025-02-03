
package nothing.its.real.client.renderer;

import nothing.its.real.entity.AldeanoMladitoEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import com.mojang.blaze3d.vertex.PoseStack;

public class AldeanoMladitoRenderer extends MobRenderer<AldeanoMladitoEntity, VillagerModel<AldeanoMladitoEntity>> {
	public AldeanoMladitoRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0f);
	}

	@Override
	protected void scale(AldeanoMladitoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(AldeanoMladitoEntity entity) {
		return new ResourceLocation("ashes1ashes:textures/entities/villager.png");
	}
}
