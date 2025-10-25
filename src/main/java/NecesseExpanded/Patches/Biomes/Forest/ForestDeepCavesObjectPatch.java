package NecesseExpanded.Patches.Biomes.Forest;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.registries.TileRegistry;
import necesse.engine.util.GameRandom;
import necesse.engine.world.biomeGenerator.BiomeGeneratorStack;
import necesse.level.maps.biomes.forest.ForestBiome;
import necesse.level.maps.regionSystem.Region;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(arguments = {Region.class, BiomeGeneratorStack.class, GameRandom.class}, name = "generateRegionDeepCaveTerrain", target = ForestBiome.class)
public class ForestDeepCavesObjectPatch 
{
    @OnMethodExit
    public static void onExit(@This ForestBiome LocalBiome, @Advice.Argument(0) Region LocalRegion, @Advice.Argument(1) BiomeGeneratorStack BiomeStack, @Advice.Argument(2) GameRandom BiomeRandom)
    {
        BiomeStack.startPlace(LocalBiome, LocalRegion, BiomeRandom).chance(0.002).onlyOnTile(TileRegistry.deepRockID).placeObject("life_quartz_cluster_small");
        BiomeStack.startPlace(LocalBiome, LocalRegion, BiomeRandom).chance(0.002).onlyOnTile(TileRegistry.deepRockID).placeObject("rubyclustersmall");
        BiomeStack.startPlace(LocalBiome, LocalRegion, BiomeRandom).chance(0.0005).onlyOnTile(TileRegistry.deepRockID).placeObject("life_quartz_cluster");
        BiomeStack.startPlace(LocalBiome, LocalRegion, BiomeRandom).chance(0.0005).onlyOnTile(TileRegistry.deepRockID).placeObject("rubycluster");
    }
}
