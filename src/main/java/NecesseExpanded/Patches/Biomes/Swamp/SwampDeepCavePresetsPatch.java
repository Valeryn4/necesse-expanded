package NecesseExpanded.Patches.Biomes.Swamp;

import NecesseExpanded.World.WorldPresets.FishianDeepCaveWorldPreset;
import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.world.worldPresets.DeepCavePresetsWorldPreset;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(arguments = {}, name = "addSwampPresets", target = DeepCavePresetsWorldPreset.class)
public class SwampDeepCavePresetsPatch 
{
    @OnMethodExit
    public static void onExit(@This DeepCavePresetsWorldPreset List) 
    {
        List.addPreset(1000, new FishianDeepCaveWorldPreset());
    }
}
