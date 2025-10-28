package NecesseExpanded.World.Levels;


import java.util.concurrent.atomic.AtomicInteger;

import NecesseExpanded.World.Presets.FishianDungeon.FishianDungeonStartPreset;
import NecesseExpanded.World.Presets.FishianDungeon.FishianDungeonStraightPreset;
import necesse.engine.localization.message.GameMessage;
import necesse.engine.localization.message.LocalMessage;
import necesse.engine.network.server.ServerClient;
import necesse.engine.registries.BiomeRegistry;
import necesse.engine.registries.ObjectRegistry;
import necesse.engine.registries.TileRegistry;
import necesse.engine.util.LevelIdentifier;
import necesse.engine.world.WorldEntity;
import necesse.level.maps.Level;
import necesse.level.maps.generationModules.ModularGeneration;
import necesse.level.maps.presets.modularPresets.ModularPreset;

public class FishianDungeonLevel extends Level {
    public static final int DUNGEON_SIZE = 200;
    
    public static final int ROOM_SIZE = 15;
    
    public FishianDungeonLevel(LevelIdentifier identifier, int width, int height, WorldEntity worldEntity) {
      super(identifier, width, height, worldEntity);
    }
    
    public FishianDungeonLevel(LevelIdentifier identifier, WorldEntity worldEntity) {
      super(identifier, 200, 200, worldEntity);
      this.baseBiome = BiomeRegistry.getBiome("fishian_dungeon");
      this.isCave = true;
      generateLevel();
    }
    
    public void onLoadingComplete() {
      super.onLoadingComplete();
      this.baseBiome = BiomeRegistry.getBiome("fishian_dungeon");
    }
    
    public GameMessage getSetSpawnError(int x, int y, ServerClient client) {
      return (GameMessage)new LocalMessage("misc", "spawndungeon");
    }
    
    public void generateLevel() {
      int cellsWidth = ModularGeneration.getCellsSize(this.tileWidth, 15);
      int cellsHeight = ModularGeneration.getCellsSize(this.tileHeight, 15);
      ModularGeneration mg = new ModularGeneration(this, cellsWidth, cellsHeight, 15, 3, 2);
      mg.setStartPreset((ModularPreset)new FishianDungeonStartPreset());
      mg.addPreset((ModularPreset)new FishianDungeonStraightPreset(), 1);
      int wall = ObjectRegistry.getObjectID("fishian_wall");
      int tile = TileRegistry.getTileID("fishian_tile");
      for (int x = 0; x < this.tileWidth; x++) {
        for (int y = 0; y < this.tileHeight; y++) {
          setTile(x, y, tile);
          setObject(x, y, wall);
        } 
      } 
      this.liquidManager.calculateShores();
      mg.initGeneration(0, 0);
      mg.tickGeneration(0, 0, 20);
      mg.tickGeneration(0, 0, -1);
      mg.endGeneration();
    }
  }
