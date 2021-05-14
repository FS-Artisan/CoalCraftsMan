
package coal_crafting.coal_craftsman.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import coal_crafting.coal_craftsman.CoalCraftsmanModElements;

@CoalCraftsmanModElements.ModElement.Tag
public class CoalCraftsmanItemGroup extends CoalCraftsmanModElements.ModElement {
	public CoalCraftsmanItemGroup(CoalCraftsmanModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcoal_craftsman") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.SMOOTH_STONE, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
