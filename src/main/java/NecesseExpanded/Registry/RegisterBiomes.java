package NecesseExpanded.Registry;

import NecesseExpanded.World.Biomes.FishianDeepCaveBiome;
import necesse.engine.registries.BiomeRegistry;

public class RegisterBiomes 
{
    public static void Register()
    {
        System.out.println("[Necesse Expanded] Registering new biomes...");

        BiomeRegistry.registerBiome("fishian_cave", new FishianDeepCaveBiome(), true);
    }
}
