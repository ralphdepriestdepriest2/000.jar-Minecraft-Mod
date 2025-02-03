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
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceKey;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class FogColorProcedure {
	public static ViewportEvent.ComputeFogColor provider = null;

	public static void setColor(float level, int color) {
		if (level <= 0.0F)
			return;
		if (level >= 1.0F) {
			provider.setRed((color >> 16 & 255) / 255.0F);
			provider.setGreen((color >> 8 & 255) / 255.0F);
			provider.setBlue((color & 255) / 255.0F);
		} else {
			level = Mth.clamp(level, 0.0F, 1.0F);
			provider.setRed(Mth.clamp(Mth.lerp(level, Mth.clamp(provider.getRed(), 0.0F, 1.0F), (color >> 16 & 255) / 255.0F), 0.0F, 1.0F));
			provider.setGreen(Mth.clamp(Mth.lerp(level, Mth.clamp(provider.getGreen(), 0.0F, 1.0F), (color >> 8 & 255) / 255.0F), 0.0F, 1.0F));
			provider.setBlue(Mth.clamp(Mth.lerp(level, Mth.clamp(provider.getBlue(), 0.0F, 1.0F), (color & 255) / 255.0F), 0.0F, 1.0F));
		}
	}

	@SubscribeEvent
	public static void computeFogColor(ViewportEvent.ComputeFogColor event) {
		provider = event;
		ClientLevel level = Minecraft.getInstance().level;
		Entity entity = provider.getCamera().getEntity();
		if (level != null && entity != null) {
			Vec3 entPos = entity.getPosition((float) provider.getPartialTick());
			execute(provider, level, entPos.x(), entPos.y(), entPos.z(), level.dimension());
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
					setColor(1, 255 << 24 | 0 << 16 | 0 << 8 | 0);
				}
				if (!world.getEntitiesOfClass(MazeInvisible2Entity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
					setColor(1, 255 << 24 | 0 << 16 | 0 << 8 | 0);
				}
			}
		}
	}
}
