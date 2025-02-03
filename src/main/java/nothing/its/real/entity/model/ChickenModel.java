package nothing.its.real.entity.model;

import software.bernie.geckolib.model.GeoModel;

import nothing.its.real.entity.ChickenEntity;

import net.minecraft.resources.ResourceLocation;

public class ChickenModel extends GeoModel<ChickenEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChickenEntity entity) {
		return new ResourceLocation("ashes1ashes", "animations/chicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChickenEntity entity) {
		return new ResourceLocation("ashes1ashes", "geo/chicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChickenEntity entity) {
		return new ResourceLocation("ashes1ashes", "textures/entities/" + entity.getTexture() + ".png");
	}

}
