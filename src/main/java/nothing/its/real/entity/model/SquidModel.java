package nothing.its.real.entity.model;

import software.bernie.geckolib.model.GeoModel;

import nothing.its.real.entity.SquidEntity;

import net.minecraft.resources.ResourceLocation;

public class SquidModel extends GeoModel<SquidEntity> {
	@Override
	public ResourceLocation getAnimationResource(SquidEntity entity) {
		return new ResourceLocation("ashes1ashes", "animations/squid.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SquidEntity entity) {
		return new ResourceLocation("ashes1ashes", "geo/squid.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SquidEntity entity) {
		return new ResourceLocation("ashes1ashes", "textures/entities/" + entity.getTexture() + ".png");
	}

}
