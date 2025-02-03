package nothing.its.real.procedures;

import nothing.its.real.network.Ashes1ashesModVariables;
import nothing.its.real.configuration.ConfiguracionConfiguration;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpawnGlobalProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (Ashes1ashesModVariables.MapVariables.get(world).tiempoSpawn == 0) {
			Ashes1ashesModVariables.MapVariables.get(world).tiempoSpawn = Mth.nextInt(RandomSource.create(), (int) (double) ConfiguracionConfiguration.SPAWNGLOBALMIN.get(), (int) (double) ConfiguracionConfiguration.SPAWNGLOBALMAX.get());
			Ashes1ashesModVariables.MapVariables.get(world).syncData(world);
		} else {
			Ashes1ashesModVariables.MapVariables.get(world).tiempoSpawn = Ashes1ashesModVariables.MapVariables.get(world).tiempoSpawn - 1;
			Ashes1ashesModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
