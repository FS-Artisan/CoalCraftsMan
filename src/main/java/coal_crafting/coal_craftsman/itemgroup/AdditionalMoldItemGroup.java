
package coal_crafting.coal_craftsman.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import coal_crafting.coal_craftsman.item.LineMouldItem;
import coal_crafting.coal_craftsman.CoalCraftsmanModElements;

@CoalCraftsmanModElements.ModElement.Tag
public class AdditionalMoldItemGroup extends CoalCraftsmanModElements.ModElement {
	public AdditionalMoldItemGroup(CoalCraftsmanModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabadditional_mold") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LineMouldItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
