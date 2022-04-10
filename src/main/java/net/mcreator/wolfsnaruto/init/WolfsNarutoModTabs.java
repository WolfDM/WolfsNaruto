
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wolfsnaruto.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class WolfsNarutoModTabs {
	public static CreativeModeTab TAB_BLOCKS;

	public static void load() {
		TAB_BLOCKS = new CreativeModeTab("tabblocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WolfsNarutoModBlocks.EARTH_WALL);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
