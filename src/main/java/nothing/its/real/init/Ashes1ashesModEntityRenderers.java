
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nothing.its.real.init;

import nothing.its.real.client.renderer.VillagrrRenderer;
import nothing.its.real.client.renderer.VillagerRenderer;
import nothing.its.real.client.renderer.VRenderer;
import nothing.its.real.client.renderer.SquidRenderer;
import nothing.its.real.client.renderer.Spawn3Renderer;
import nothing.its.real.client.renderer.Spawn2Renderer;
import nothing.its.real.client.renderer.Spawn1Renderer;
import nothing.its.real.client.renderer.Sonido5Renderer;
import nothing.its.real.client.renderer.Sonido4Renderer;
import nothing.its.real.client.renderer.Sonido3Renderer;
import nothing.its.real.client.renderer.Sonido2Renderer;
import nothing.its.real.client.renderer.Sonido1Renderer;
import nothing.its.real.client.renderer.NoFaceVRenderer;
import nothing.its.real.client.renderer.NRenderer;
import nothing.its.real.client.renderer.MazeRenderer;
import nothing.its.real.client.renderer.MazeInvisible2Renderer;
import nothing.its.real.client.renderer.Maze2Renderer;
import nothing.its.real.client.renderer.Maze1Renderer;
import nothing.its.real.client.renderer.JarRenderer;
import nothing.its.real.client.renderer.JarHostileRenderer;
import nothing.its.real.client.renderer.JarCuboRenderer;
import nothing.its.real.client.renderer.JarCubeCloseRenderer;
import nothing.its.real.client.renderer.JarCube2Renderer;
import nothing.its.real.client.renderer.InvisibleRenderer;
import nothing.its.real.client.renderer.InvisibleCruzRenderer;
import nothing.its.real.client.renderer.InvisibleCasaRenderer;
import nothing.its.real.client.renderer.HijitusRenderer;
import nothing.its.real.client.renderer.CowRenderer;
import nothing.its.real.client.renderer.ChickenRenderer;
import nothing.its.real.client.renderer.BalloonRenderer;
import nothing.its.real.client.renderer.AldeanoMladitoRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Ashes1ashesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(Ashes1ashesModEntities.COW.get(), CowRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.VILLAGER.get(), VillagerRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.CHICKEN.get(), ChickenRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.N.get(), NRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.SQUID.get(), SquidRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.V.get(), VRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.VILLAGRR.get(), VillagrrRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.INVISIBLE.get(), InvisibleRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.SONIDO_1.get(), Sonido1Renderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.SONIDO_2.get(), Sonido2Renderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.SONIDO_3.get(), Sonido3Renderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.SONIDO_4.get(), Sonido4Renderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.SONIDO_5.get(), Sonido5Renderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.JAR.get(), JarRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.BALLOON.get(), BalloonRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.INVISIBLE_CRUZ.get(), InvisibleCruzRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.JAR_HOSTILE.get(), JarHostileRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.MAZE.get(), MazeRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.MAZE_1.get(), Maze1Renderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.MAZE_2.get(), Maze2Renderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.MAZE_INVISIBLE_2.get(), MazeInvisible2Renderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.SPAWN_1.get(), Spawn1Renderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.SPAWN_2.get(), Spawn2Renderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.SPAWN_3.get(), Spawn3Renderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.HIJITUS.get(), HijitusRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.ALDEANO_MLADITO.get(), AldeanoMladitoRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.NO_FACE_V.get(), NoFaceVRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.JAR_CUBO.get(), JarCuboRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.INVISIBLE_CASA.get(), InvisibleCasaRenderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.JAR_CUBE_2.get(), JarCube2Renderer::new);
		event.registerEntityRenderer(Ashes1ashesModEntities.JAR_CUBE_CLOSE.get(), JarCubeCloseRenderer::new);
	}
}
