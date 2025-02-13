package nothing.its.real.procedures;

import nothing.its.real.init.Ashes1ashesModEntities;
import nothing.its.real.entity.NoFaceVEntity;
import nothing.its.real.entity.CowEntity;
import nothing.its.real.entity.ChickenEntity;
import nothing.its.real.configuration.ConfiguracionConfiguration;
import nothing.its.real.Ashes1ashesMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ChickenEntityIsHurtProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (ConfiguracionConfiguration.SPAWNCHICKEN.get()) {
			if (Mth.nextInt(RandomSource.create(), (int) (double) ConfiguracionConfiguration.CHICKENSPAWNMIN.get(), (int) (double) ConfiguracionConfiguration.CHICKENSPAWNMAX.get()) == 1) {
				if (entity instanceof ChickenEntity || entity instanceof CowEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"playsound ashes1ashes:cuevas hostile @a");
					if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
						Ashes1ashesMod.queueServerWork(1, () -> {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NoFaceVEntity(Ashes1ashesModEntities.NO_FACE_V.get(), _level);
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
