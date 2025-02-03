package nothing.its.real.procedures;

import nothing.its.real.network.Ashes1ashesModVariables;
import nothing.its.real.configuration.ConfiguracionConfiguration;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class SonidosProcedure {
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
		double SelectorSonidos3 = 0;
		double SelectorSonidos2 = 0;
		double SelectorSonidos = 0;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (Ashes1ashesModVariables.MapVariables.get(world).tiempoSonidos == 0) {
				if (entityiterator instanceof Player) {
					if (ConfiguracionConfiguration.ACTIVATESOUNDS.get()) {
						if (Math.random() < (double) ConfiguracionConfiguration.FRECUENCIASONIDOS.get() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
							SelectorSonidos2 = Mth.nextInt(RandomSource.create(), 0, 17);
							if (SelectorSonidos2 == 0) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:caminartierra")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 1) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:caminarpiedra")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 2) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:corriendo")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 3) {
								if (Math.random() < 0.1) {
									if (world instanceof Level)
										((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.AMBIENT, 1, 1);
								}
							}
							if (SelectorSonidos2 == 4) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience01")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 5) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience02")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 6) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience06")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 7) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience07")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 8) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience08")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 9) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience09")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 10) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience10")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 11) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience12")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 12) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience13")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 13) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience14")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 14) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience15")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 15) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience16")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 16) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience17")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos2 == 17) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience18")), SoundSource.AMBIENT, 1, 1);
							}
						}
						if (Math.random() < (double) ConfiguracionConfiguration.FRECUENCIASONIDOS2.get() && (!world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("lush_caves")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("dripstone_caves")))) {
							SelectorSonidos = Mth.nextInt(RandomSource.create(), 0, 23);
							if (SelectorSonidos == 0) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:cave-sound-5")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 1) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:cave-sound-4")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 2) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:cave-sound-14")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 3) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:cave-sound-19")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 4) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:cave-sound-12")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 5) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:cave-sound-11")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 6) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:cave-sound-7")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 7) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:cueva21")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 8) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:caminarpiedra")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 9) {
								if (Math.random() < 0.1) {
									if (world instanceof Level)
										((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.AMBIENT, 1, 1);
								}
							}
							if (SelectorSonidos == 10) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience01")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 11) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience02")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 12) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience06")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 13) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience07")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 14) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience08")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 15) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience09")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 16) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience10")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 17) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience12")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 18) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience13")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 19) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience14")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 20) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience15")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 21) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience16")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 22) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience17")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos == 23) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:ambience18")), SoundSource.AMBIENT, 1, 1);
							}
						}
						if (Math.random() < (double) ConfiguracionConfiguration.FRECUENCIASONIDOS3.get() && (!world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("lush_caves")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("dripstone_caves")))) {
							SelectorSonidos3 = Mth.nextInt(RandomSource.create(), 0, 3);
							if (SelectorSonidos3 == 0) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:caminarpiedra")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos3 == 1) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:caminartierra")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos3 == 2) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ashes1ashes:corriendo")), SoundSource.AMBIENT, 1, 1);
							}
							if (SelectorSonidos3 == 3) {
								if (Math.random() < 0.1) {
									if (world instanceof Level)
										((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.AMBIENT, 1, 1);
								}
							}
						}
					}
				}
			}
		}
	}
}
