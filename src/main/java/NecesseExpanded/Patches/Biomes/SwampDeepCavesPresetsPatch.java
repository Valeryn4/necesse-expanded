package NecesseExpanded.Patches.Biomes;

import NecesseExpanded.World.WorldPresets.FishianDungeonEntranceWorldPreset;
import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.world.worldPresets.DeepCavePresetsWorldPreset;
import necesse.engine.world.worldPresets.SurfacePresetsWorldPreset;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(arguments = {}, name = "addSwampPresets", target = DeepCavePresetsWorldPreset.class)
public class SwampDeepCavesPresetsPatch 
{
    @OnMethodExit
    public static void onExit(@This SurfacePresetsWorldPreset List) 
    {
        List.addPreset(1200, new FishianDungeonEntranceWorldPreset());
    }
}
