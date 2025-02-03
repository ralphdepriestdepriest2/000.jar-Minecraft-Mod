package nothing.its.real.procedures;

import nothing.its.real.network.Ashes1ashesModVariables;
import nothing.its.real.init.Ashes1ashesModBlocks;
import nothing.its.real.configuration.ConfiguracionConfiguration;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpawnBloqueInicioProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (ConfiguracionConfiguration.SMILESPAWN.get()) {
			if ((entity.getCapability(Ashes1ashesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ashes1ashesModVariables.PlayerVariables())).PlayerEntraBloque == 0) {
				{
					double _setval = (entity.getCapability(Ashes1ashesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ashes1ashesModVariables.PlayerVariables())).PlayerEntraBloque + 1;
					entity.getCapability(Ashes1ashesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerEntraBloque = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (Mth.nextInt(RandomSource.create(), 1, 5) == 1) {
					world.setBlock(BlockPos.containing(x + 1, y, z), Ashes1ashesModBlocks.SMILE.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
