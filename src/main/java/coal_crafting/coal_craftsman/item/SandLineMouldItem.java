
package coal_crafting.coal_craftsman.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import coal_crafting.coal_craftsman.itemgroup.AdditionalMoldItemGroup;
import coal_crafting.coal_craftsman.CoalCraftsmanModElements;

@CoalCraftsmanModElements.ModElement.Tag
public class SandLineMouldItem extends CoalCraftsmanModElements.ModElement {
	@ObjectHolder("coal_craftsman:sand_line_mould")
	public static final Item block = null;
	public SandLineMouldItem(CoalCraftsmanModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AdditionalMoldItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("sand_line_mould");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
