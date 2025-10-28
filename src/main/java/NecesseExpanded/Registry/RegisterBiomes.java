package NecesseExpanded.Registry;

import NecesseExpanded.World.Biomes.FishianDungeonBiome;
import necesse.engine.registries.BiomeRegistry;

public class RegisterBiomes 
{
    public static void Register()
    {
        BiomeRegistry.registerBiome("fishian_dungeon", new FishianDungeonBiome(), true);
    }
}
