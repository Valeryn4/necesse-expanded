package NecesseExpanded.Patches.Biomes;

import NecesseExpanded.World.WorldPresets.DesertHouseWorldPreset;
import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.world.worldPresets.SurfacePresetsWorldPreset;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(arguments = {}, name = "addDesertPresets", target = SurfacePresetsWorldPreset.class)
public class DesertSurfacePresetsPatch 
{
    @OnMethodExit
    public static void onExit(@This SurfacePresetsWorldPreset List) 
    {
        List.addPreset(1200, new DesertHouseWorldPreset());
    }
}
