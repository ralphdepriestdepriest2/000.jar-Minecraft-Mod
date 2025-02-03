package nothing.its.real.procedures;

import nothing.its.real.init.Ashes1ashesModEntities;
import nothing.its.real.entity.Sonido5Entity;
import nothing.its.real.entity.Sonido4Entity;
import nothing.its.real.entity.Sonido3Entity;
import nothing.its.real.entity.Sonido2Entity;
import nothing.its.real.entity.Sonido1Entity;
import nothing.its.real.entity.NoFaceVEntity;
import nothing.its.real.configuration.ConfiguracionConfiguration;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
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
public class SonidosInvisiblesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (ConfiguracionConfiguration.ACTIVATEDESPAWNSOUNDS.get()) {
			if (!world.getEntitiesOfClass(Sonido1Entity.class, AABB.ofSize(new Vec3(x, y, z), 45, 45, 45), e -> true).isEmpty()) {
				if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
					if (entity.getPersistentData().getDouble("audio") == 0) {
						entity.getPersistentData().putDouble("audio", 1200);
					} else {
						entity.getPersistentData().putDouble("audio", (entity.getPersistentData().getDouble("audio") - 1));
					}
					if (entity.getPersistentData().getDouble("audio") == 0) {
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
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"playsound ashes1ashes:cuevas hostile @a");
					}
				}
			}
			if (!world.getEntitiesOfClass(Sonido2Entity.class, AABB.ofSize(new Vec3(x, y, z), 45, 45, 45), e -> true).isEmpty()) {
				if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
					if (entity.getPersistentData().getDouble("audio2") == 0) {
						entity.getPersistentData().putDouble("audio2", 1200);
					} else {
						entity.getPersistentData().putDouble("audio2", (entity.getPersistentData().getDouble("audio2") - 1));
					}
					if (entity.getPersistentData().getDouble("audio2") == 0) {
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
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"playsound ashes1ashes:cave12 hostile @a");
					}
				}
			}
			if (!world.getEntitiesOfClass(Sonido3Entity.class, AABB.ofSize(new Vec3(x, y, z), 45, 45, 45), e -> true).isEmpty()) {
				if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
					if (entity.getPersistentData().getDouble("audio3") == 0) {
						entity.getPersistentData().putDouble("audio3", 1200);
					} else {
						entity.getPersistentData().putDouble("audio3", (entity.getPersistentData().getDouble("audio3") - 1));
					}
					if (entity.getPersistentData().getDouble("audio3") == 0) {
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
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"playsound ashes1ashes:cave11 hostile @a");
					}
				}
			}
			if (!world.getEntitiesOfClass(Sonido4Entity.class, AABB.ofSize(new Vec3(x, y, z), 45, 45, 45), e -> true).isEmpty()) {
				if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
					if (entity.getPersistentData().getDouble("audio4") == 0) {
						entity.getPersistentData().putDouble("audio4", 1200);
					} else {
						entity.getPersistentData().putDouble("audio4", (entity.getPersistentData().getDouble("audio4") - 1));
					}
					if (entity.getPersistentData().getDouble("audio4") == 0) {
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
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"playsound ashes1ashes:disc13 ambient @a");
					}
				}
			}
			if (!world.getEntitiesOfClass(Sonido5Entity.class, AABB.ofSize(new Vec3(x, y, z), 45, 45, 45), e -> true).isEmpty()) {
				if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
					if (entity.getPersistentData().getDouble("audio5") == 0) {
						entity.getPersistentData().putDouble("audio5", 1200);
					} else {
						entity.getPersistentData().putDouble("audio5", (entity.getPersistentData().getDouble("audio5") - 1));
					}
					if (entity.getPersistentData().getDouble("audio5") == 0) {
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
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"playsound ashes1ashes:cave8sound hostile @a");
					}
				}
			}
		}
	}
}
