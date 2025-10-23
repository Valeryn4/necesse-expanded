package NecesseExpanded.Registry;

import necesse.level.maps.biomes.Biome;
import necesse.level.maps.biomes.MobSpawnTable;
import necesse.level.maps.biomes.snow.SnowBiome;
import necesse.level.maps.biomes.temple.TempleBiome;

public class UpdateSpawnTables 
{
    public static void Update()
    {
        Biome.defaultSurfaceMobs
        .add(10, "stabbybush");

        Biome.defaultCaveMobs.clear();
        Biome.defaultCaveMobs = (new MobSpawnTable())
        .add(70, "zombie")
        .add(25, "zombiearcher")
        .add(5, "zombie_miner");

        SnowBiome.caveMobs.clear();
        SnowBiome.caveMobs = (new MobSpawnTable())
        .add(60, "frozen_dwarf")
        .add(25, "frostsentry")
        .add(10, "trapperzombie")
        .add(5, "frozen_dwarf_mage");

        SnowBiome.deepSnowCaveMobs.add(30, "ice_golem");

        TempleBiome.templeMobs.clear();
        TempleBiome.templeMobs = (new MobSpawnTable())
        .add(50, "ancientskeleton")
        .add(50, "ancientarmoredskeleton")
        .add(40, "ancientskeletonthrower")
        .add(30, "ancientskeletonmage")
        .add(10, "ancient_warrior");
    }
}
