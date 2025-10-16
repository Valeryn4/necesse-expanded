package NecesseExpanded.Registry;

import necesse.level.maps.biomes.Biome;
import necesse.level.maps.biomes.swamp.SwampBiome;

public class UpdateFishingTables 
{
    public static void Update()
    {
        SwampBiome.swampSurfaceFish.addWater(50, "swamp_eel");
        Biome.defaultSurfaceFish.addSaltWater(30, "saltwater_shark").addSaltWater(20, "seaweed").addWater(10, "surface_treasure_chest").addSaltWater(1, "pearl_oyster");
        Biome.defaultCaveFish.addWater(15, "cave_treasure_chest").addWater(20, "demonfish").addWater(20, "seaweed").addWater(20, "oyster").addWater(1, "pearl_oyster");
    }
}
