package NecesseExpanded.World.Presets.FishianDungeon;

import necesse.engine.registries.ObjectRegistry;
import necesse.engine.util.GameRandom;
import necesse.level.maps.Level;
import necesse.level.maps.presets.modularPresets.ModularPreset;

public class FishianDungeonModularPreset extends ModularPreset
{
    public FishianDungeonModularPreset() 
    {
        super(1, 1, 1, 3, 1);
    }

    public void openLevel(Level level, int x, int y, int xOffset, int yOffset, int dir, GameRandom random, int cellRes) {
    super.openLevel(level, x, y, xOffset, yOffset, dir, random, cellRes);
    if (random.getEveryXthChance(10)) {
      int levelX = x * cellRes + xOffset;
      int levelY = y * cellRes + yOffset;
      int farEnd = cellRes - this.openingDepth;
      boolean trapDir = random.nextBoolean();
      int middle = cellRes / 2 + (trapDir ? (this.openingSize + 2) : (-this.openingSize - 2)) / 2;
      int trap = ObjectRegistry.getObjectID((String)random.getOneOf((Object[])new String[] { "fishian_venom_trap"}));
      int pressurePlate = ObjectRegistry.getObjectID("dungeonpressureplate");
      boolean[] plates = new boolean[this.openingSize];
      int chance = 0;
      int chanceInc = 2;
      int indexOffset = random.nextInt(this.openingSize);
      for (int i = 0; i < this.openingSize; i++) {
        int index = (i + indexOffset) % this.openingSize;
        if (chance <= 0 || random.nextInt(chance) == 0) {
          plates[index] = true;
          chance += chanceInc;
        } 
      } 
      int wireID = random.nextInt(4);
      if (dir == 0) {
        int trapX = levelX + middle;
        int trapY = levelY + 1;
        level.setObject(trapX, trapY, trap, trapDir ? 3 : 1);
        level.wireManager.setWire(trapX, trapY, wireID, true);
        for (int j = 0; j < this.openingSize; j++) {
          if (plates[j])
            level.setObject(trapX + (trapDir ? (-j - 1) : (j + 1)), trapY, pressurePlate); 
          level.wireManager.setWire(trapX + (trapDir ? (-j - 1) : (j + 1)), trapY, wireID, true);
        } 
      } else if (dir == 1) {
        int trapX = levelX + farEnd;
        int trapY = levelY + middle;
        level.setObject(trapX, trapY, trap, trapDir ? 0 : 2);
        level.wireManager.setWire(trapX, trapY, wireID, true);
        for (int j = 0; j < this.openingSize; j++) {
          if (plates[j])
            level.setObject(trapX, trapY + (trapDir ? (-j - 1) : (j + 1)), pressurePlate); 
          level.wireManager.setWire(trapX, trapY + (trapDir ? (-j - 1) : (j + 1)), wireID, true);
        } 
      } else if (dir == 2) {
        int trapX = levelX + middle;
        int trapY = levelY + farEnd;
        level.setObject(trapX, trapY, trap, trapDir ? 3 : 1);
        level.wireManager.setWire(trapX, trapY, wireID, true);
        for (int j = 0; j < this.openingSize; j++) {
          if (plates[j])
            level.setObject(trapX + (trapDir ? (-j - 1) : (j + 1)), trapY, pressurePlate); 
          level.wireManager.setWire(trapX + (trapDir ? (-j - 1) : (j + 1)), trapY, wireID, true);
        } 
      } else if (dir == 3) {
        int trapX = levelX + 1;
        int trapY = levelY + middle;
        level.setObject(trapX, trapY, trap, trapDir ? 0 : 2);
        level.wireManager.setWire(trapX, trapY, wireID, true);
        for (int j = 0; j < this.openingSize; j++) {
          if (plates[j])
            level.setObject(trapX, trapY + (trapDir ? (-j - 1) : (j + 1)), pressurePlate); 
          level.wireManager.setWire(trapX, trapY + (trapDir ? (-j - 1) : (j + 1)), wireID, true);
        } 
      } 
    } 
  }
}
