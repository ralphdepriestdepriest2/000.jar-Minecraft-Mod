
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package nothing.its.real.init;

import nothing.its.real.potion.TPMobEffect;
import nothing.its.real.Ashes1ashesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class Ashes1ashesModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Ashes1ashesMod.MODID);
	public static final RegistryObject<MobEffect> TP = REGISTRY.register("tp", () -> new TPMobEffect());
}
