package nothing.its.real.procedures;

import nothing.its.real.init.Ashes1ashesModBlocks;
import nothing.its.real.configuration.ConfiguracionConfiguration;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EstructuraSpawnProcedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (ConfiguracionConfiguration.ENABLEEYETOUCH.get()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Ashes1ashesModBlocks.OJO.get()) {
				if (ConfiguracionConfiguration.ENABLEMAZE.get()) {
					if (ConfiguracionConfiguration.ENABLEBEDROCK.get()) {
						if (Mth.nextInt(RandomSource.create(), 0, (int) (double) ConfiguracionConfiguration.MAXTOUCHPROBABILITY.get()) == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ashes1ashes", "maze"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 5, y - 49, z - 27), BlockPos.containing(x - 5, y - 49, z - 27),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
						if (Mth.nextInt(RandomSource.create(), 0, (int) (double) ConfiguracionConfiguration.MAXTOUCHPROBABILITY.get()) == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ashes1ashes", "maze2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 37, y - 48, z - 18), BlockPos.containing(x - 37, y - 48, z - 18),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
						if (Mth.nextInt(RandomSource.create(), 0, (int) (double) ConfiguracionConfiguration.MAXTOUCHPROBABILITY.get()) == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ashes1ashes", "pasillos"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y - 49, z - 42), BlockPos.containing(x - 2, y - 49, z - 42),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
					if (ConfiguracionConfiguration.ENABLEOBSIDIAN.get()) {
						if (Mth.nextInt(RandomSource.create(), 0, (int) (double) ConfiguracionConfiguration.MAXTOUCHPROBABILITY.get()) == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ashes1ashes", "maze1obsidian"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 5, y - 49, z - 27), BlockPos.containing(x - 5, y - 49, z - 27),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
						if (Mth.nextInt(RandomSource.create(), 0, (int) (double) ConfiguracionConfiguration.MAXTOUCHPROBABILITY.get()) == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ashes1ashes", "maze2obsidian"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 37, y - 48, z - 18), BlockPos.containing(x - 37, y - 48, z - 18),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
						if (Mth.nextInt(RandomSource.create(), 0, (int) (double) ConfiguracionConfiguration.MAXTOUCHPROBABILITY.get()) == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ashes1ashes", "hallwaysobsidian"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y - 49, z - 42), BlockPos.containing(x - 2, y - 49, z - 42),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
				}
			}
		}
	}
}
