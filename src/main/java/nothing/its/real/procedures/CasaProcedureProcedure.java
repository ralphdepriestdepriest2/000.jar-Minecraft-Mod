package nothing.its.real.procedures;

import nothing.its.real.init.Ashes1ashesModEntities;
import nothing.its.real.entity.JarCubeCloseEntity;
import nothing.its.real.entity.JarCube2Entity;
import nothing.its.real.entity.InvisibleCasaEntity;
import nothing.its.real.configuration.ConfiguracionConfiguration;
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
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CasaProcedureProcedure {
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
		double CasaSpawn = 0;
		if (ConfiguracionConfiguration.ENABLEJAR.get()) {
			if (entity instanceof InvisibleCasaEntity) {
				CasaSpawn = Mth.nextInt(RandomSource.create(), 1, 2);
				if (CasaSpawn == 1) {
					if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).isEmpty()) {
						if (!entity.level.isClientSide())
							entity.discard();
						Ashes1ashesMod.queueServerWork(200, () -> {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new JarCube2Entity(Ashes1ashesModEntities.JAR_CUBE_2.get(), _level);
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
				if (CasaSpawn == 2) {
					if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).isEmpty()) {
						if (!entity.level.isClientSide())
							entity.discard();
						Ashes1ashesMod.queueServerWork(200, () -> {
							for (int index0 = 0; index0 < 50; index0++) {
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74\u00A7l\u00A7nGET OUT OF MY GAME"), false);
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new JarCubeCloseEntity(Ashes1ashesModEntities.JAR_CUBE_CLOSE.get(), _level);
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
		}
	}
}
