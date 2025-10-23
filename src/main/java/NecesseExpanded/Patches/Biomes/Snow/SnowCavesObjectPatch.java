package NecesseExpanded.Patches.Biomes.Snow;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.registries.TileRegistry;
import necesse.engine.util.GameRandom;
import necesse.engine.world.biomeGenerator.BiomeGeneratorStack;
import necesse.level.maps.biomes.snow.SnowBiome;
import necesse.level.maps.regionSystem.Region;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(arguments = {Region.class, BiomeGeneratorStack.class, GameRandom.class}, name = "generateRegionCaveTerrain", target = SnowBiome.class)
public class SnowCavesObjectPatch 
{
    @OnMethodExit
    public static void onExit(@This SnowBiome LocalBiome, @Advice.Argument(0) Region LocalRegion, @Advice.Argument(1) BiomeGeneratorStack BiomeStack, @Advice.Argument(2) GameRandom BiomeRandom)
    {
        BiomeStack.startPlace(LocalBiome, LocalRegion, BiomeRandom).chance(0.002).onlyOnTile(TileRegistry.snowRockID).placeObject("frostshard_cluster_small");
        BiomeStack.startPlace(LocalBiome, LocalRegion, BiomeRandom).chance(0.001).onlyOnTile(TileRegistry.snowRockID).placeObject("sapphireclustersmall");
        BiomeStack.startPlace(LocalBiome, LocalRegion, BiomeRandom).chance(0.0005).onlyOnTile(TileRegistry.snowRockID).placeObject("snowmantrainingdummy");
    }
}
