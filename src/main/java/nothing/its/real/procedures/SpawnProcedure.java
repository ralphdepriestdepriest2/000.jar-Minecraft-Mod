package nothing.its.real.procedures;

import nothing.its.real.network.Ashes1ashesModVariables;
import nothing.its.real.init.Ashes1ashesModEntities;
import nothing.its.real.entity.CowEntity;
import nothing.its.real.entity.ChickenEntity;
import nothing.its.real.configuration.ConfiguracionConfiguration;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpawnProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (Ashes1ashesModVariables.MapVariables.get(world).tiempoSpawn == 0) {
			if (ConfiguracionConfiguration.COWCHICKENSTALKERSPAWN.get()) {
				if (Mth.nextInt(RandomSource.create(), (int) (double) ConfiguracionConfiguration.STALKERCOWMIN.get(), (int) (double) ConfiguracionConfiguration.STALKERCOWMAX.get()) == 1) {
					if ((!(!world.getEntitiesOfClass(CowEntity.class, AABB.ofSize(new Vec3(x, y, z), 4000, 4000, 4000), e -> true).isEmpty())
							|| !(!world.getEntitiesOfClass(ChickenEntity.class, AABB.ofSize(new Vec3(x, y, z), 4000, 4000, 4000), e -> true).isEmpty())) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new CowEntity(Ashes1ashesModEntities.COW.get(), _level);
							entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 3, 6)), y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
				if (Mth.nextInt(RandomSource.create(), (int) (double) ConfiguracionConfiguration.STALKERCHICKENMIN.get(), (int) (double) ConfiguracionConfiguration.STALKERCHICKENMAX.get()) == 1) {
					if ((!(!world.getEntitiesOfClass(CowEntity.class, AABB.ofSize(new Vec3(x, y, z), 4000, 4000, 4000), e -> true).isEmpty())
							|| !(!world.getEntitiesOfClass(ChickenEntity.class, AABB.ofSize(new Vec3(x, y, z), 4000, 4000, 4000), e -> true).isEmpty())) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new ChickenEntity(Ashes1ashesModEntities.CHICKEN.get(), _level);
							entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 3, 6)), y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}
