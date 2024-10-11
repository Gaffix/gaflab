package github.gaffix.gaflab.client.renderer;

import github.gaffix.gaflab.GafLab;
import github.gaffix.gaflab.client.model.SkullyModel;
import github.gaffix.gaflab.entity.Skully;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SkullyRenderer extends MobRenderer<Skully, SkullyModel<Skully>> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(GafLab.MOD_ID, "textures/entity/skully.png");

    public SkullyRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new SkullyModel<>(ctx.bakeLayer(SkullyModel.LAYER_LOCATION)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(Skully entity) {
        return TEXTURE;
    }
}
