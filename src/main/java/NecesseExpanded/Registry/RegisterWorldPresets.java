package NecesseExpanded.Registry;

import NecesseExpanded.World.WorldPresets.DryadHouseWorldPreset;
import NecesseExpanded.World.WorldPresets.FishianDeepCaveEntranceWorldPreset;
import necesse.engine.registries.WorldPresetRegistry;
import necesse.engine.world.worldPresets.WorldPreset;

public class RegisterWorldPresets 
{
    public static void Register()
    {
        WorldPresetRegistry.registerPreset("dryad_house", (WorldPreset) new DryadHouseWorldPreset());
        WorldPresetRegistry.registerPreset("fishian_biome_entrance", (WorldPreset) new FishianDeepCaveEntranceWorldPreset());
    }
}
