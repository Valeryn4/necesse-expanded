package NecesseExpanded.Patches.Biomes.Forest;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.world.biomeGenerator.BiomeGeneratorStack;
import necesse.level.maps.biomes.forest.ForestBiome;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.Advice.OnMethodExit;

@ModMethodPatch(arguments = {BiomeGeneratorStack.class}, name = "initializeGeneratorStack", target = ForestBiome.class)
public class ForestSurfaceRockModifierPatchInit 
{
    @OnMethodExit
    public static void onExit(@Advice.Argument(0) BiomeGeneratorStack BiomeStack)
    {
        BiomeStack.addRandomVeinsBranch("forestRockObject", 0.3F, 1, 3, 1F, 3, false);
    }
}
