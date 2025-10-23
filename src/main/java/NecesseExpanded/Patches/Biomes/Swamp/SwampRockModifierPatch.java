package NecesseExpanded.Patches.Biomes.Swamp;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.util.GameRandom;
import necesse.engine.world.biomeGenerator.BiomeGeneratorStack;
import necesse.level.maps.biomes.swamp.SwampBiome;
import necesse.level.maps.regionSystem.Region;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(arguments = {Region.class, BiomeGeneratorStack.class, GameRandom.class}, name = "generateRegionSurfaceTerrain", target = SwampBiome.class)
public class SwampRockModifierPatch 
{
    @OnMethodExit
    public static void onExit(@This SwampBiome LocalBiome, @Advice.Argument(0) Region LocalRegion, @Advice.Argument(1) BiomeGeneratorStack BiomeStack, @Advice.Argument(2) GameRandom BiomeRandom)
    {
        BiomeStack.startPlaceOnVein(LocalBiome, LocalRegion, BiomeRandom, "swampRockObject").notOnWater().chance(100).placeObjectForced("swamprock");
    }
}
