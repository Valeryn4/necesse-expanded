package NecesseExpanded.Patches.Biomes;

import java.util.concurrent.atomic.AtomicInteger;

import necesse.engine.modLoader.annotations.ModConstructorPatch;
import necesse.engine.registries.ObjectRegistry;
import necesse.engine.util.GameRandom;
import necesse.level.maps.presets.FishianHousePreset1;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModConstructorPatch(arguments = {GameRandom.class, AtomicInteger.class}, target = FishianHousePreset1.class)
public class SwampDeepCavesPresetsPatch 
{
    @OnMethodExit
    public static void onExit(@This FishianHousePreset1 Preset) 
    {
        Preset.setObject(6, 3, ObjectRegistry.getObjectID("fishian_dungeon_entrance"));
    }
}
