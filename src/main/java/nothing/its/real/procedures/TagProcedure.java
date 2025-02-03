package nothing.its.real.procedures;

import nothing.its.real.entity.JarHostileEntity;
import nothing.its.real.entity.JarEntity;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TagProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof JarEntity) {
			entity.setCustomName(Component.literal("\u00A7k000"));
		}
		if (entity instanceof JarHostileEntity) {
			entity.setCustomName(Component.literal("\u00A7k000"));
		}
	}
}
