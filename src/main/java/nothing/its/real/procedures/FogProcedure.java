package nothing.its.real.procedures;

import nothing.its.real.entity.MazeInvisible2Entity;
import nothing.its.real.entity.MazeEntity;
import nothing.its.real.configuration.ConfiguracionConfiguration;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import com.mojang.blaze3d.shaders.FogShape;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class FogProcedure {
	public static ViewportEvent.RenderFog provider = null;

	public static void setDistance(float start, float end) {
		provider.setNearPlaneDistance(start);
		provider.setFarPlaneDistance(end);
		if (!provider.isCanceled()) {
			provider.setCanceled(true);
		}
	}

	public static void setShape(FogShape shape) {
		provider.setFogShape(shape);
		if (!provider.isCanceled()) {
			provider.setCanceled(true);
		}
	}

	@SubscribeEvent
	public static void renderFog(ViewportEvent.RenderFog event) {
		provider = event;
		if (provider.getMode() == FogRenderer.FogMode.FOG_TERRAIN) {
			ClientLevel level = Minecraft.getInstance().level;
			Entity entity = provider.getCamera().getEntity();
			if (level != null && entity != null) {
				Vec3 pos = entity.getPosition((float) provider.getPartialTick());
				execute(provider, level, pos.x(), pos.y(), pos.z(), level.dimension());
			}
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, ResourceKey<Level> dimension) {
		execute(null, world, x, y, z, dimension);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, ResourceKey<Level> dimension) {
		if (dimension == null)
			return;
		if (ConfiguracionConfiguration.DESHABILITARFOG.get()) {
			if (dimension == Level.OVERWORLD) {
				if (!world.getEntitiesOfClass(MazeEntity.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).isEmpty()) {
					setShape(FogShape.CYLINDER);
					setDistance(1, 2);
				}
				if (!world.getEntitiesOfClass(MazeInvisible2Entity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					setShape(FogShape.CYLINDER);
					setDistance(1, 3);
				}
			}
		}
	}
}
