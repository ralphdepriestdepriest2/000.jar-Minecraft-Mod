
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nothing.its.real.init;

import nothing.its.real.client.particle.PuntoParticle;
import nothing.its.real.client.particle.PuntoNegroParticle;
import nothing.its.real.client.particle.PuntoDosParticle;
import nothing.its.real.client.particle.PuntoBlancoParticle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Ashes1ashesModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(Ashes1ashesModParticleTypes.PUNTO.get(), PuntoParticle::provider);
		event.registerSpriteSet(Ashes1ashesModParticleTypes.PUNTO_DOS.get(), PuntoDosParticle::provider);
		event.registerSpriteSet(Ashes1ashesModParticleTypes.PUNTO_NEGRO.get(), PuntoNegroParticle::provider);
		event.registerSpriteSet(Ashes1ashesModParticleTypes.PUNTO_BLANCO.get(), PuntoBlancoParticle::provider);
	}
}
