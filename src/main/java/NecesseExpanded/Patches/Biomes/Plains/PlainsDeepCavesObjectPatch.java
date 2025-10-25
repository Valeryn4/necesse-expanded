package NecesseExpanded.Patches.Biomes.Plains;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.registries.TileRegistry;
import necesse.engine.util.GameRandom;
import necesse.engine.world.biomeGenerator.BiomeGeneratorStack;
import necesse.level.maps.biomes.plains.PlainsBiome;
import necesse.level.maps.regionSystem.Region;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(arguments = {Region.class, BiomeGeneratorStack.class, GameRandom.class}, name = "generateRegionDeepCaveTerrain", target = PlainsBiome.class)
public class PlainsDeepCavesObjectPatch 
{
    @OnMethodExit
    public static void onExit(@This PlainsBiome LocalBiome, @Advice.Argument(0) Region LocalRegion, @Advice.Argument(1) BiomeGeneratorStack BiomeStack, @Advice.Argument(2) GameRandom BiomeRandom)
    {
        BiomeStack.startPlace(LocalBiome, LocalRegion, BiomeRandom).chance(0.002).onlyOnTile(TileRegistry.basaltRockID).placeObject("topazclustersmall");
        BiomeStack.startPlace(LocalBiome, LocalRegion, BiomeRandom).chance(0.002).onlyOnTile(TileRegistry.basaltRockID).placeObject("life_quartz_cluster_small");
        BiomeStack.startPlace(LocalBiome, LocalRegion, BiomeRandom).chance(0.0005).onlyOnTile(TileRegistry.basaltRockID).placeObject("life_quartz_cluster");
        BiomeStack.startPlace(LocalBiome, LocalRegion, BiomeRandom).chance(0.0005).onlyOnTile(TileRegistry.basaltRockID).placeObject("topazcluster");
        BiomeStack.startPlace(LocalBiome, LocalRegion, BiomeRandom).chance(0.003).onlyOnTile(TileRegistry.basaltRockID).placeObject("leafpile");
    }
}
