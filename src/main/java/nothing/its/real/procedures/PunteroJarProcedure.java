package nothing.its.real.procedures;

import nothing.its.real.init.Ashes1ashesModParticleTypes;
import nothing.its.real.entity.JarEntity;
import nothing.its.real.entity.JarCubeCloseEntity;
import nothing.its.real.entity.BalloonEntity;
import nothing.its.real.Ashes1ashesMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PunteroJarProcedure {
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
		double jar = 0;
		double jar2 = 0;
		if (entity instanceof LivingEntity && !(entity instanceof JarEntity) && !(entity instanceof BalloonEntity) && !(entity instanceof Player)) {
			if (!world.getEntitiesOfClass(JarEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty()) {
				jar = 0.5;
				world.addParticle((SimpleParticleType) (Ashes1ashesModParticleTypes.PUNTO.get()), (entity.getX() + entity.getLookAngle().x * jar), (entity.getY() + 2.5 + entity.getLookAngle().y * jar), (entity.getZ() + entity.getLookAngle().z * jar),
						0, 0, 0);
			}
		}
		if (entity instanceof Player && !(entity instanceof JarCubeCloseEntity) && !(entity instanceof BalloonEntity)) {
			if (!world.getEntitiesOfClass(JarCubeCloseEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty()) {
				jar2 = 0.5;
				world.addParticle((SimpleParticleType) (Ashes1ashesModParticleTypes.PUNTO_DOS.get()), (entity.getX() + entity.getLookAngle().x * jar2), (entity.getY() + 2.5 + entity.getLookAngle().y * jar2),
						(entity.getZ() + entity.getLookAngle().z * jar2), 0, 0, 0);
			}
		}
		if (entity instanceof JarEntity) {
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 1000, 1000, 1000), e -> true).isEmpty()) {
				Ashes1ashesMod.queueServerWork(200, () -> {
					if (!entity.level.isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute as @e[type=!minecraft:item,type=!minecraft:player] at @s run data merge entity @s {NoAI:0,NoGravity:0}");
				});
			}
		}
	}
}
