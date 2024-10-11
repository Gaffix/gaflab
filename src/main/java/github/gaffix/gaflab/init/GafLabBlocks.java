package github.gaffix.gaflab.init;

import github.gaffix.gaflab.GafLab;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GafLabBlocks {
    public static final  DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GafLab.MOD_ID);

    public static final RegistryObject<Block> ASSEMBLING_TABLE = BLOCKS.register("assembling_table",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5.0f, 17f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHEESE_BLOCK = BLOCKS.register("cheese_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.0f)));

    public static final RegistryObject<DropExperienceBlock> SHADOWRITE_ORE = BLOCKS.register("shadowrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(4.0f, 4.0f)
                    .destroyTime(10f),
                    UniformInt.of(8, 10)
            ));
}
