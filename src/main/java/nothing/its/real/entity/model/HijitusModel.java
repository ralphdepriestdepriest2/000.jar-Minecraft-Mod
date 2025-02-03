package nothing.its.real.entity.model;

import software.bernie.geckolib.model.GeoModel;

import nothing.its.real.entity.HijitusEntity;

import net.minecraft.resources.ResourceLocation;

public class HijitusModel extends GeoModel<HijitusEntity> {
	@Override
	public ResourceLocation getAnimationResource(HijitusEntity entity) {
		return new ResourceLocation("ashes1ashes", "animations/hijitus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HijitusEntity entity) {
		return new ResourceLocation("ashes1ashes", "geo/hijitus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HijitusEntity entity) {
		return new ResourceLocation("ashes1ashes", "textures/entities/" + entity.getTexture() + ".png");
	}

}
