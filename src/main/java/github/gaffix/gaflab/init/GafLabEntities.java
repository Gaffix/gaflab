package github.gaffix.gaflab.init;

import github.gaffix.gaflab.GafLab;
import github.gaffix.gaflab.entity.Skully;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GafLabEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,GafLab.MOD_ID);

    public static final RegistryObject<EntityType<Skully>> SKULLY_ENTITY = ENTITIES.register("skully_entity",
            () -> EntityType.Builder.<Skully>of(Skully::new, MobCategory.MONSTER)
                    .canSpawnFarFromPlayer()
                    .sized(1.0f,1.0f)
                    .build(new ResourceLocation(GafLab.MOD_ID, "skully_entity").toString())
    );
}
