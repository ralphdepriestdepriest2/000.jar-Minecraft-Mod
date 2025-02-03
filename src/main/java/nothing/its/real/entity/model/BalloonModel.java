package nothing.its.real.entity.model;

import software.bernie.geckolib.model.GeoModel;

import nothing.its.real.entity.BalloonEntity;

import net.minecraft.resources.ResourceLocation;

public class BalloonModel extends GeoModel<BalloonEntity> {
	@Override
	public ResourceLocation getAnimationResource(BalloonEntity entity) {
		return new ResourceLocation("ashes1ashes", "animations/balloon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonEntity entity) {
		return new ResourceLocation("ashes1ashes", "geo/balloon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonEntity entity) {
		return new ResourceLocation("ashes1ashes", "textures/entities/" + entity.getTexture() + ".png");
	}

}
