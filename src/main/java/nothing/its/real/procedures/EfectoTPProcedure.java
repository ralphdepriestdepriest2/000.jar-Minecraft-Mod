package nothing.its.real.procedures;

import nothing.its.real.network.Ashes1ashesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class EfectoTPProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(Ashes1ashesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ashes1ashesModVariables.PlayerVariables())).playerPosicionX == 0
				&& (entity.getCapability(Ashes1ashesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ashes1ashesModVariables.PlayerVariables())).playerPosicionY == 0
				&& (entity.getCapability(Ashes1ashesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ashes1ashesModVariables.PlayerVariables())).playerPosicionZ == 0) {
			{
				Entity _ent = entity;
				_ent.teleportTo((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn()), _ent.getYRot(), _ent.getXRot());
			}
		} else {
			{
				Entity _ent = entity;
				_ent.teleportTo(((entity.getCapability(Ashes1ashesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ashes1ashesModVariables.PlayerVariables())).playerPosicionX),
						((entity.getCapability(Ashes1ashesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ashes1ashesModVariables.PlayerVariables())).playerPosicionY),
						((entity.getCapability(Ashes1ashesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ashes1ashesModVariables.PlayerVariables())).playerPosicionZ));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(((entity.getCapability(Ashes1ashesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ashes1ashesModVariables.PlayerVariables())).playerPosicionX),
							((entity.getCapability(Ashes1ashesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ashes1ashesModVariables.PlayerVariables())).playerPosicionY),
							((entity.getCapability(Ashes1ashesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Ashes1ashesModVariables.PlayerVariables())).playerPosicionZ), _ent.getYRot(), _ent.getXRot());
			}
		}
	}
}
