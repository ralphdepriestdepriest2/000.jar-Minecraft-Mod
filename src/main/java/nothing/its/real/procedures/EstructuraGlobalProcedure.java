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
public class EstructuraGlobalProcedure {
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
		if (Ashes1ashesModVariables.MapVariables.get(world).tiempoEstructuras == 0) {
			Ashes1ashesModVariables.MapVariables.get(world).tiempoEstructuras = Mth.nextInt(RandomSource.create(), (int) (double) ConfiguracionConfiguration.STUCTUREMIN.get(), (int) (double) ConfiguracionConfiguration.STUCTUREMAX.get());
			Ashes1ashesModVariables.MapVariables.get(world).syncData(world);
		} else {
			Ashes1ashesModVariables.MapVariables.get(world).tiempoEstructuras = Ashes1ashesModVariables.MapVariables.get(world).tiempoEstructuras - 1;
			Ashes1ashesModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
