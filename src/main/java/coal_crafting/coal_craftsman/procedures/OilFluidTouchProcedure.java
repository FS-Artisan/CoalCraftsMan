package coal_crafting.coal_craftsman.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import coal_crafting.coal_craftsman.CoalCraftsmanModElements;
import coal_crafting.coal_craftsman.CoalCraftsmanMod;

@CoalCraftsmanModElements.ModElement.Tag
public class OilFluidTouchProcedure extends CoalCraftsmanModElements.ModElement {
	public OilFluidTouchProcedure(CoalCraftsmanModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CoalCraftsmanMod.LOGGER.warn("Failed to load dependency entity for procedure OilFluidTouch!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 60, (int) 5, (false), (true)));
	}
}
