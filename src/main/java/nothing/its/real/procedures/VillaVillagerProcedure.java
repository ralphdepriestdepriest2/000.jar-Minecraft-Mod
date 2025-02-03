package nothing.its.real.procedures;

import nothing.its.real.network.Ashes1ashesModVariables;
import nothing.its.real.init.Ashes1ashesModEntities;
import nothing.its.real.entity.VillagrrEntity;
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
public class VillaVillagerProcedure {
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
		if (Ashes1ashesModVariables.MapVariables.get(world).tiempoEntidades == 0) {
			if (ConfiguracionConfiguration.ENABLEVILLAGERSTALKER.get()) {
				if (!(!world.getEntitiesOfClass(VillagrrEntity.class, AABB.ofSize(new Vec3(x, y, z), 4000, 4000, 4000), e -> true).isEmpty())) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
						if (Mth.nextInt(RandomSource.create(), (int) (double) ConfiguracionConfiguration.VILLAGERSTALKERMIN.get(), (int) (double) ConfiguracionConfiguration.VILLAGERSTALKERMAX.get()) == 1) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new VillagrrEntity(Ashes1ashesModEntities.VILLAGRR.get(), _level);
								entityToSpawn.moveTo((x + Mth.nextInt(RandomSource.create(), 5, 8)), (y + Mth.nextInt(RandomSource.create(), 3, 5)), z, 0, 0);
								entityToSpawn.setYBodyRot(0);
								entityToSpawn.setYHeadRot(0);
								entityToSpawn.setDeltaMovement(0, 0, 0);
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
}
