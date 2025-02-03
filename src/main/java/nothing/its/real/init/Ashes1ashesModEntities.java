
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nothing.its.real.init;

import nothing.its.real.entity.VillagrrEntity;
import nothing.its.real.entity.VillagerEntity;
import nothing.its.real.entity.VEntity;
import nothing.its.real.entity.SquidEntity;
import nothing.its.real.entity.Spawn3Entity;
import nothing.its.real.entity.Spawn2Entity;
import nothing.its.real.entity.Spawn1Entity;
import nothing.its.real.entity.Sonido5Entity;
import nothing.its.real.entity.Sonido4Entity;
import nothing.its.real.entity.Sonido3Entity;
import nothing.its.real.entity.Sonido2Entity;
import nothing.its.real.entity.Sonido1Entity;
import nothing.its.real.entity.NoFaceVEntity;
import nothing.its.real.entity.NEntity;
import nothing.its.real.entity.MazeInvisible2Entity;
import nothing.its.real.entity.MazeEntity;
import nothing.its.real.entity.Maze2Entity;
import nothing.its.real.entity.Maze1Entity;
import nothing.its.real.entity.JarHostileEntity;
import nothing.its.real.entity.JarEntity;
import nothing.its.real.entity.JarCuboEntity;
import nothing.its.real.entity.JarCubeCloseEntity;
import nothing.its.real.entity.JarCube2Entity;
import nothing.its.real.entity.InvisibleEntity;
import nothing.its.real.entity.InvisibleCruzEntity;
import nothing.its.real.entity.InvisibleCasaEntity;
import nothing.its.real.entity.HijitusEntity;
import nothing.its.real.entity.CowEntity;
import nothing.its.real.entity.ChickenEntity;
import nothing.its.real.entity.BalloonEntity;
import nothing.its.real.entity.AldeanoMladitoEntity;
import nothing.its.real.Ashes1ashesMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Ashes1ashesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Ashes1ashesMod.MODID);
	public static final RegistryObject<EntityType<CowEntity>> COW = register("cow",
			EntityType.Builder.<CowEntity>of(CowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CowEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<VillagerEntity>> VILLAGER = register("villager",
			EntityType.Builder.<VillagerEntity>of(VillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VillagerEntity::new).fireImmune().sized(2f, 0.1f));
	public static final RegistryObject<EntityType<ChickenEntity>> CHICKEN = register("chicken",
			EntityType.Builder.<ChickenEntity>of(ChickenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChickenEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<NEntity>> N = register("n",
			EntityType.Builder.<NEntity>of(NEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NEntity::new).fireImmune().sized(1.2f, 1.8f));
	public static final RegistryObject<EntityType<SquidEntity>> SQUID = register("squid",
			EntityType.Builder.<SquidEntity>of(SquidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SquidEntity::new).fireImmune().sized(4f, 0.1f));
	public static final RegistryObject<EntityType<VEntity>> V = register("v",
			EntityType.Builder.<VEntity>of(VEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VEntity::new).fireImmune().sized(4f, 0.1f));
	public static final RegistryObject<EntityType<VillagrrEntity>> VILLAGRR = register("villagrr",
			EntityType.Builder.<VillagrrEntity>of(VillagrrEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(VillagrrEntity::new).fireImmune().sized(2f, 0.1f));
	public static final RegistryObject<EntityType<InvisibleEntity>> INVISIBLE = register("invisible", EntityType.Builder.<InvisibleEntity>of(InvisibleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000)
			.setUpdateInterval(3).setCustomClientFactory(InvisibleEntity::new).fireImmune().sized(0f, 0.001f));
	public static final RegistryObject<EntityType<Sonido1Entity>> SONIDO_1 = register("sonido_1",
			EntityType.Builder.<Sonido1Entity>of(Sonido1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(Sonido1Entity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<Sonido2Entity>> SONIDO_2 = register("sonido_2",
			EntityType.Builder.<Sonido2Entity>of(Sonido2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(Sonido2Entity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<Sonido3Entity>> SONIDO_3 = register("sonido_3",
			EntityType.Builder.<Sonido3Entity>of(Sonido3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(Sonido3Entity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<Sonido4Entity>> SONIDO_4 = register("sonido_4",
			EntityType.Builder.<Sonido4Entity>of(Sonido4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(Sonido4Entity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<Sonido5Entity>> SONIDO_5 = register("sonido_5",
			EntityType.Builder.<Sonido5Entity>of(Sonido5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(Sonido5Entity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<JarEntity>> JAR = register("jar",
			EntityType.Builder.<JarEntity>of(JarEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(JarEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BalloonEntity>> BALLOON = register("balloon",
			EntityType.Builder.<BalloonEntity>of(BalloonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2000).setUpdateInterval(3).setCustomClientFactory(BalloonEntity::new).fireImmune().sized(0.6f, 2f));
	public static final RegistryObject<EntityType<InvisibleCruzEntity>> INVISIBLE_CRUZ = register("invisible_cruz", EntityType.Builder.<InvisibleCruzEntity>of(InvisibleCruzEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(InvisibleCruzEntity::new).fireImmune().sized(0f, 0.001f));
	public static final RegistryObject<EntityType<JarHostileEntity>> JAR_HOSTILE = register("jar_hostile", EntityType.Builder.<JarHostileEntity>of(JarHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(JarHostileEntity::new).fireImmune().sized(1f, 1.8f));
	public static final RegistryObject<EntityType<MazeEntity>> MAZE = register("maze",
			EntityType.Builder.<MazeEntity>of(MazeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(MazeEntity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<Maze1Entity>> MAZE_1 = register("maze_1",
			EntityType.Builder.<Maze1Entity>of(Maze1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(Maze1Entity::new).fireImmune().sized(0.6f, 0.1f));
	public static final RegistryObject<EntityType<Maze2Entity>> MAZE_2 = register("maze_2",
			EntityType.Builder.<Maze2Entity>of(Maze2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(Maze2Entity::new).fireImmune().sized(0.6f, 0.1f));
	public static final RegistryObject<EntityType<MazeInvisible2Entity>> MAZE_INVISIBLE_2 = register("maze_invisible_2", EntityType.Builder.<MazeInvisible2Entity>of(MazeInvisible2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(MazeInvisible2Entity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<Spawn1Entity>> SPAWN_1 = register("spawn_1",
			EntityType.Builder.<Spawn1Entity>of(Spawn1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(Spawn1Entity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<Spawn2Entity>> SPAWN_2 = register("spawn_2",
			EntityType.Builder.<Spawn2Entity>of(Spawn2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(Spawn2Entity::new).fireImmune().sized(0f, 0.1f));
	public static final RegistryObject<EntityType<Spawn3Entity>> SPAWN_3 = register("spawn_3",
			EntityType.Builder.<Spawn3Entity>of(Spawn3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(Spawn3Entity::new).fireImmune().sized(0f, 0.1f));
	public static final RegistryObject<EntityType<HijitusEntity>> HIJITUS = register("hijitus",
			EntityType.Builder.<HijitusEntity>of(HijitusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(HijitusEntity::new).fireImmune().sized(1f, 0.1f));
	public static final RegistryObject<EntityType<AldeanoMladitoEntity>> ALDEANO_MLADITO = register("aldeano_mladito", EntityType.Builder.<AldeanoMladitoEntity>of(AldeanoMladitoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(AldeanoMladitoEntity::new).fireImmune().sized(1f, 0.1f));
	public static final RegistryObject<EntityType<NoFaceVEntity>> NO_FACE_V = register("no_face_v",
			EntityType.Builder.<NoFaceVEntity>of(NoFaceVEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(NoFaceVEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JarCuboEntity>> JAR_CUBO = register("jar_cubo",
			EntityType.Builder.<JarCuboEntity>of(JarCuboEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(JarCuboEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InvisibleCasaEntity>> INVISIBLE_CASA = register("invisible_casa", EntityType.Builder.<InvisibleCasaEntity>of(InvisibleCasaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(InvisibleCasaEntity::new).fireImmune().sized(0f, 0.001f));
	public static final RegistryObject<EntityType<JarCube2Entity>> JAR_CUBE_2 = register("jar_cube_2",
			EntityType.Builder.<JarCube2Entity>of(JarCube2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(JarCube2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JarCubeCloseEntity>> JAR_CUBE_CLOSE = register("jar_cube_close", EntityType.Builder.<JarCubeCloseEntity>of(JarCubeCloseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(1000).setUpdateInterval(3).setCustomClientFactory(JarCubeCloseEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CowEntity.init();
			VillagerEntity.init();
			ChickenEntity.init();
			NEntity.init();
			SquidEntity.init();
			VEntity.init();
			VillagrrEntity.init();
			InvisibleEntity.init();
			Sonido1Entity.init();
			Sonido2Entity.init();
			Sonido3Entity.init();
			Sonido4Entity.init();
			Sonido5Entity.init();
			JarEntity.init();
			BalloonEntity.init();
			InvisibleCruzEntity.init();
			JarHostileEntity.init();
			MazeEntity.init();
			Maze1Entity.init();
			Maze2Entity.init();
			MazeInvisible2Entity.init();
			Spawn1Entity.init();
			Spawn2Entity.init();
			Spawn3Entity.init();
			HijitusEntity.init();
			AldeanoMladitoEntity.init();
			NoFaceVEntity.init();
			JarCuboEntity.init();
			InvisibleCasaEntity.init();
			JarCube2Entity.init();
			JarCubeCloseEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(COW.get(), CowEntity.createAttributes().build());
		event.put(VILLAGER.get(), VillagerEntity.createAttributes().build());
		event.put(CHICKEN.get(), ChickenEntity.createAttributes().build());
		event.put(N.get(), NEntity.createAttributes().build());
		event.put(SQUID.get(), SquidEntity.createAttributes().build());
		event.put(V.get(), VEntity.createAttributes().build());
		event.put(VILLAGRR.get(), VillagrrEntity.createAttributes().build());
		event.put(INVISIBLE.get(), InvisibleEntity.createAttributes().build());
		event.put(SONIDO_1.get(), Sonido1Entity.createAttributes().build());
		event.put(SONIDO_2.get(), Sonido2Entity.createAttributes().build());
		event.put(SONIDO_3.get(), Sonido3Entity.createAttributes().build());
		event.put(SONIDO_4.get(), Sonido4Entity.createAttributes().build());
		event.put(SONIDO_5.get(), Sonido5Entity.createAttributes().build());
		event.put(JAR.get(), JarEntity.createAttributes().build());
		event.put(BALLOON.get(), BalloonEntity.createAttributes().build());
		event.put(INVISIBLE_CRUZ.get(), InvisibleCruzEntity.createAttributes().build());
		event.put(JAR_HOSTILE.get(), JarHostileEntity.createAttributes().build());
		event.put(MAZE.get(), MazeEntity.createAttributes().build());
		event.put(MAZE_1.get(), Maze1Entity.createAttributes().build());
		event.put(MAZE_2.get(), Maze2Entity.createAttributes().build());
		event.put(MAZE_INVISIBLE_2.get(), MazeInvisible2Entity.createAttributes().build());
		event.put(SPAWN_1.get(), Spawn1Entity.createAttributes().build());
		event.put(SPAWN_2.get(), Spawn2Entity.createAttributes().build());
		event.put(SPAWN_3.get(), Spawn3Entity.createAttributes().build());
		event.put(HIJITUS.get(), HijitusEntity.createAttributes().build());
		event.put(ALDEANO_MLADITO.get(), AldeanoMladitoEntity.createAttributes().build());
		event.put(NO_FACE_V.get(), NoFaceVEntity.createAttributes().build());
		event.put(JAR_CUBO.get(), JarCuboEntity.createAttributes().build());
		event.put(INVISIBLE_CASA.get(), InvisibleCasaEntity.createAttributes().build());
		event.put(JAR_CUBE_2.get(), JarCube2Entity.createAttributes().build());
		event.put(JAR_CUBE_CLOSE.get(), JarCubeCloseEntity.createAttributes().build());
	}
}
