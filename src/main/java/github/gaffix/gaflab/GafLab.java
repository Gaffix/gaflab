package github.gaffix.gaflab;

import github.gaffix.gaflab.init.GafLabBlocks;
import github.gaffix.gaflab.init.GafLabCreativeTab;
import github.gaffix.gaflab.init.GafLabEntities;
import github.gaffix.gaflab.init.GafLabItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GafLab.MOD_ID)
public class GafLab {
    public static final String MOD_ID = "gaflab";

    public GafLab() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        GafLabItems.ITEMS.register(bus);
        GafLabBlocks.BLOCKS.register(bus);
        GafLabCreativeTab.TABS.register(bus);
        GafLabEntities.ENTITIES.register(bus);
    }
}
