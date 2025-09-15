package NecesseExpanded.Patches;

import necesse.level.maps.biomes.Biome;
import necesse.level.maps.biomes.desert.DesertBiome;
import necesse.level.maps.biomes.forest.ForestBiome;
import necesse.level.maps.biomes.incursions.CrystalHollowBiome;
import necesse.level.maps.biomes.incursions.GraveyardBiome;
import necesse.level.maps.biomes.incursions.SlimeCaveBiome;
import necesse.level.maps.biomes.incursions.SpiderCastleBiome;
import necesse.level.maps.biomes.plains.PlainsBiome;
import necesse.level.maps.biomes.snow.SnowBiome;
import necesse.level.maps.biomes.swamp.SwampBiome;

public class ConfigureBiomes 
{
    public static void Configure()
    {
        ForestBiome.defaultCaveFish.addWater(15, "demonfish").addWater(15, "heartfish");

        DesertBiome.defaultCaveFish.addWater(15, "demonfish").addWater(15, "heartfish");

        SwampBiome.defaultCaveFish.addWater(15, "demonfish").addWater(15, "heartfish").addWater(50, "swamp_eel");;
        SwampBiome.defaultSurfaceFish.addWater(50, "swamp_eel");

        SnowBiome.defaultCaveFish.addWater(15, "demonfish").addWater(15, "heartfish");

        PlainsBiome.defaultCaveFish.addWater(15, "demonfish").addWater(15, "heartfish");

        Biome.defaultSurfaceFish.addSaltWater(25, "saltwater_shark");

        CrystalHollowBiome.defaultCaveFish.addWater(10, "pearlfish");
        CrystalHollowBiome.defaultDeepCaveMobs.add(5, "crystal_caveling").add(5, "shard_caveling");

        SlimeCaveBiome.defaultCaveCritters.add(5, "shard_caveling");

        GraveyardBiome.defaultCaveCritters.add(5, "shard_caveling");
        
        SpiderCastleBiome.defaultCaveCritters.add(5, "shard_caveling");
    }
}
