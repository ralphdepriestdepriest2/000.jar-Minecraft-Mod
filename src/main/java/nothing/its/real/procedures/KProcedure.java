package nothing.its.real.procedures;

import nothing.its.real.init.Ashes1ashesModEntities;
import nothing.its.real.entity.Spawn3Entity;
import nothing.its.real.entity.Spawn2Entity;
import nothing.its.real.entity.HijitusEntity;
import nothing.its.real.entity.AldeanoMladitoEntity;
import nothing.its.real.Ashes1ashesMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class KProcedure {
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
		if (entity instanceof Spawn2Entity) {
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).isEmpty()) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
		if (entity instanceof Spawn3Entity) {
			if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
				if (!(!world.getEntitiesOfClass(Spawn2Entity.class, AABB.ofSize(new Vec3(x, y, z), 70, 70, 70), e -> true).isEmpty())
						&& !(!world.getEntitiesOfClass(HijitusEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty())) {
					if (!entity.level.isClientSide())
						entity.discard();
					Ashes1ashesMod.queueServerWork(200, () -> {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new AldeanoMladitoEntity(Ashes1ashesModEntities.ALDEANO_MLADITO.get(), _level);
							entityToSpawn.moveTo(x, y, z, 0, 0);
							entityToSpawn.setYBodyRot(0);
							entityToSpawn.setYHeadRot(0);
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					});
				}
			}
			if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
				if (!(!world.getEntitiesOfClass(Spawn2Entity.class, AABB.ofSize(new Vec3(x, y, z), 70, 70, 70), e -> true).isEmpty())
						&& !(!world.getEntitiesOfClass(AldeanoMladitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty())) {
					if (!entity.level.isClientSide())
						entity.discard();
					Ashes1ashesMod.queueServerWork(200, () -> {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new HijitusEntity(Ashes1ashesModEntities.HIJITUS.get(), _level);
							entityToSpawn.moveTo(x, y, z, 0, 0);
							entityToSpawn.setYBodyRot(0);
							entityToSpawn.setYHeadRot(0);
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					});
				}
			}
		}
		if (entity instanceof AldeanoMladitoEntity) {
			if (!world.getEntitiesOfClass(HijitusEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
		if (entity instanceof HijitusEntity) {
			if (!world.getEntitiesOfClass(AldeanoMladitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
