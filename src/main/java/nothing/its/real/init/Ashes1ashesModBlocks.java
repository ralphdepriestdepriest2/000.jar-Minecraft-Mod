
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nothing.its.real.init;

import nothing.its.real.block.SmileBlock;
import nothing.its.real.block.OjoBlock;
import nothing.its.real.block.NetherwARTBLOCKBlock;
import nothing.its.real.Ashes1ashesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class Ashes1ashesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Ashes1ashesMod.MODID);
	public static final RegistryObject<Block> NETHERW_ARTBLOCK = REGISTRY.register("netherw_artblock", () -> new NetherwARTBLOCKBlock());
	public static final RegistryObject<Block> SMILE = REGISTRY.register("smile", () -> new SmileBlock());
	public static final RegistryObject<Block> OJO = REGISTRY.register("ojo", () -> new OjoBlock());
}
