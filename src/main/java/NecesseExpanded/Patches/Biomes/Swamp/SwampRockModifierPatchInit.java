package NecesseExpanded.Patches.Biomes.Swamp;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.world.biomeGenerator.BiomeGeneratorStack;
import necesse.level.maps.biomes.swamp.SwampBiome;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.Advice.OnMethodExit;

@ModMethodPatch(arguments = {BiomeGeneratorStack.class}, name = "initializeGeneratorStack", target = SwampBiome.class)
public class SwampRockModifierPatchInit 
{
    @OnMethodExit
    public static void onExit( @Advice.Argument(0) BiomeGeneratorStack BiomeStack)
    {
        BiomeStack.addRandomVeinsBranch("swampRockObject", 0.3F, 1, 3, 1F, 3, false);
    }
}
