package nothing.its.real.procedures;

import nothing.its.real.entity.ChickenEntity;
import nothing.its.real.configuration.ConfiguracionConfiguration;
import nothing.its.real.Ashes1ashesMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ChickenDespawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ChickenEntity) {
			Ashes1ashesMod.queueServerWork(Mth.nextInt(RandomSource.create(), (int) (double) ConfiguracionConfiguration.CHICKENDESPAWNTIMERMIN.get(), (int) (double) ConfiguracionConfiguration.CHICKENDESPAWNTIMERMAX.get()), () -> {
				if (!entity.level.isClientSide())
					entity.discard();
			});
		}
	}
}
