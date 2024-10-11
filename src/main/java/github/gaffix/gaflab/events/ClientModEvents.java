package github.gaffix.gaflab.events;

import github.gaffix.gaflab.GafLab;
import github.gaffix.gaflab.client.model.SkullyModel;
import github.gaffix.gaflab.client.renderer.SkullyRenderer;
import github.gaffix.gaflab.init.GafLabEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GafLab.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(GafLabEntities.SKULLY_ENTITY.get(), SkullyRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(SkullyModel.LAYER_LOCATION, SkullyModel::createBodyLayer);
    }
}
