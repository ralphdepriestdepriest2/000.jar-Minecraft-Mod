
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nothing.its.real.init;

import nothing.its.real.Ashes1ashesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class Ashes1ashesModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Ashes1ashesMod.MODID);
	public static final RegistryObject<SimpleParticleType> PUNTO = REGISTRY.register("punto", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> PUNTO_DOS = REGISTRY.register("punto_dos", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> PUNTO_NEGRO = REGISTRY.register("punto_negro", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> PUNTO_BLANCO = REGISTRY.register("punto_blanco", () -> new SimpleParticleType(false));
}
