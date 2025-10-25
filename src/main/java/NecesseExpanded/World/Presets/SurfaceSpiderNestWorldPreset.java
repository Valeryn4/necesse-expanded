package NecesseExpanded.World.Presets;

import necesse.engine.util.GameRandom;
import necesse.engine.util.LevelIdentifier;
import necesse.engine.world.biomeGenerator.BiomeGeneratorStack;
import necesse.engine.world.worldPresets.LevelPresetsRegion;
import necesse.engine.world.worldPresets.SimpleGenerationPreset;
import necesse.engine.world.worldPresets.WorldApplyAreaPredicate;
import necesse.engine.world.worldPresets.WorldPreset;
import necesse.engine.world.worldPresets.WorldPresetTester;
import necesse.level.maps.biomes.Biome;
import necesse.level.maps.presets.Preset;

public class SurfaceSpiderNestWorldPreset extends SimpleGenerationPreset
{
    public SurfaceSpiderNestWorldPreset(LevelIdentifier levelIdentifier, Biome biome) 
    {
        super(20, true, true, false, false, new Biome[] { biome });
    }
  
  public void setupTester(WorldPresetTester tester) 
  {
    tester.addApplyPredicate(new WorldApplyAreaPredicate(0, 0, tester.width - 1, tester.height - 1, 0, new WorldApplyAreaPredicate.WorldApplyCornerTest() {
            public boolean isValidTile(WorldPreset preset, LevelPresetsRegion presetsRegion, BiomeGeneratorStack generatorStack, int tileX, int tileY) {
              if (presetsRegion.identifier.equals(LevelIdentifier.SURFACE_IDENTIFIER))
                return !generatorStack.isSurfaceOceanOrRiver(tileX, tileY); 
              if (presetsRegion.identifier.equals(LevelIdentifier.CAVE_IDENTIFIER))
                return !generatorStack.isCaveRiverOrLava(tileX, tileY); 
              if (presetsRegion.identifier.equals(LevelIdentifier.DEEP_CAVE_IDENTIFIER))
                return !generatorStack.isDeepCaveLava(tileX, tileY); 
              return false;
            }
          }));
  }
  
    public Preset getPreset(GameRandom random) 
    {
        return (Preset)new SurfaceSpiderNestPreset(random);
    }
}
