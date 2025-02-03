package nothing.its.real.procedures;

import nothing.its.real.entity.Sonido5Entity;
import nothing.its.real.entity.Sonido4Entity;
import nothing.its.real.entity.Sonido3Entity;
import nothing.its.real.entity.Sonido2Entity;
import nothing.its.real.entity.Sonido1Entity;
import nothing.its.real.entity.NoFaceVEntity;
import nothing.its.real.Ashes1ashesMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DespawnSonidosProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Sonido1Entity) {
			if (!world.getEntitiesOfClass(NoFaceVEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
				Ashes1ashesMod.queueServerWork(1, () -> {
					if (!entity.level.isClientSide())
						entity.discard();
				});
			}
		}
		if (entity instanceof Sonido2Entity) {
			if (!world.getEntitiesOfClass(NoFaceVEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
				Ashes1ashesMod.queueServerWork(1, () -> {
					if (!entity.level.isClientSide())
						entity.discard();
				});
			}
		}
		if (entity instanceof Sonido3Entity) {
			if (!world.getEntitiesOfClass(NoFaceVEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
				Ashes1ashesMod.queueServerWork(1, () -> {
					if (!entity.level.isClientSide())
						entity.discard();
				});
			}
		}
		if (entity instanceof Sonido4Entity) {
			if (!world.getEntitiesOfClass(NoFaceVEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
				Ashes1ashesMod.queueServerWork(1, () -> {
					if (!entity.level.isClientSide())
						entity.discard();
				});
			}
		}
		if (entity instanceof Sonido5Entity) {
			if (!world.getEntitiesOfClass(NoFaceVEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
				Ashes1ashesMod.queueServerWork(1, () -> {
					if (!entity.level.isClientSide())
						entity.discard();
				});
			}
		}
	}
}
