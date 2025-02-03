
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nothing.its.real.init;

import nothing.its.real.Ashes1ashesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class Ashes1ashesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Ashes1ashesMod.MODID);
	public static final RegistryObject<Item> NETHERW_ARTBLOCK = block(Ashes1ashesModBlocks.NETHERW_ARTBLOCK);
	public static final RegistryObject<Item> SMILE = block(Ashes1ashesModBlocks.SMILE);
	public static final RegistryObject<Item> OJO = block(Ashes1ashesModBlocks.OJO);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
