package NecesseExpanded.Patches.Biomes;

import NecesseExpanded.World.Presets.SurfaceSpiderNestWorldPreset;
import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.registries.BiomeRegistry;
import necesse.engine.util.LevelIdentifier;
import necesse.engine.world.worldPresets.SurfacePresetsWorldPreset;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(arguments = {}, name = "addSwampPresets", target = SurfacePresetsWorldPreset.class)
public class SurfaceSwampPresetPatch 
{
    @OnMethodExit
    public static void onExit(@This SurfacePresetsWorldPreset List) 
    {
        List.addPreset(600, new SurfaceSpiderNestWorldPreset(LevelIdentifier.SURFACE_IDENTIFIER, BiomeRegistry.SWAMP));
    }
}
