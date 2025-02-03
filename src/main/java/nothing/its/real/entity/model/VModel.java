package nothing.its.real.entity.model;

import software.bernie.geckolib.model.GeoModel;

import nothing.its.real.entity.VEntity;

import net.minecraft.resources.ResourceLocation;

public class VModel extends GeoModel<VEntity> {
	@Override
	public ResourceLocation getAnimationResource(VEntity entity) {
		return new ResourceLocation("ashes1ashes", "animations/v.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VEntity entity) {
		return new ResourceLocation("ashes1ashes", "geo/v.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VEntity entity) {
		return new ResourceLocation("ashes1ashes", "textures/entities/" + entity.getTexture() + ".png");
	}

}
