
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nothing.its.real.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Ashes1ashesModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(Ashes1ashesModBlocks.NETHERW_ARTBLOCK.get().asItem());
			tabData.accept(Ashes1ashesModBlocks.SMILE.get().asItem());
			tabData.accept(Ashes1ashesModBlocks.OJO.get().asItem());
		}
	}
}
