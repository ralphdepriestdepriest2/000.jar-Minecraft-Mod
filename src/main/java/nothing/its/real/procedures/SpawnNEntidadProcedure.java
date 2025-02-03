package nothing.its.real.procedures;

import nothing.its.real.network.Ashes1ashesModVariables;
import nothing.its.real.init.Ashes1ashesModEntities;
import nothing.its.real.entity.NEntity;
import nothing.its.real.configuration.ConfiguracionConfiguration;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpawnNEntidadProcedure {
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
		if (ConfiguracionConfiguration.SPAWNEYE.get()) {
			if (Ashes1ashesModVariables.MapVariables.get(world).spawnNGlobal == 0) {
				if (!(!world.getEntitiesOfClass(NEntity.class, AABB.ofSize(new Vec3(x, y, z), 4000, 4000, 4000), e -> true).isEmpty())) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
						if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NEntity(Ashes1ashesModEntities.N.get(), _level);
								entityToSpawn.moveTo((x + 2), y, z, 0, 0);
								entityToSpawn.setYBodyRot(0);
								entityToSpawn.setYHeadRot(0);
								entityToSpawn.setDeltaMovement(0, 0, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:cueva21")), SoundSource.AMBIENT, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:cueva21")), SoundSource.AMBIENT, 1, 1, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
