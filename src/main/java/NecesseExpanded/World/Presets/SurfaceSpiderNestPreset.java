package NecesseExpanded.World.Presets;

import necesse.engine.registries.ObjectRegistry;
import necesse.engine.registries.TileRegistry;
import necesse.engine.util.GameRandom;
import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.LootTable;
import necesse.inventory.lootTable.lootItem.LootItem;
import necesse.inventory.lootTable.lootItem.OneOfLootItems;
import necesse.inventory.lootTable.presets.CaveChestLootTable;
import necesse.level.maps.presets.Preset;
import java.awt.Point;

public class SurfaceSpiderNestPreset extends Preset 
{
   public SurfaceSpiderNestPreset(GameRandom random) 
   {
      this(GameRandom.globalRandom.getIntBetween(12, 18), random);
   }

   private SurfaceSpiderNestPreset(int size, GameRandom random) {
      super(size, size);
      int mid = size / 2;
      int maxDistance = size / 2 * 32;
      int floor = TileRegistry.getTileID("spidernesttile");
      int wall = ObjectRegistry.getObjectID("swamprock");

      for(int x = 0; x < this.width; ++x) {
         for(int y = 0; y < this.height; ++y) {
            float distance = (float)(new Point(mid * 32 + 16, mid * 32 + 16)).distance((double)(x * 32 + 16), (double)(y * 32 + 16));
            float distancePerc = distance / (float)maxDistance;
            if (distancePerc < 0.4F) {
               this.setTile(x, y, floor);
               this.setObject(x, y, 0);
            } else if (distancePerc <= 1.0F) {
               float chance = Math.abs((distancePerc - 0.5F) * 2.0F - 1.0F) * 2.0F;
               if (random.getChance(chance)) {
                  this.setTile(x, y, floor);
                  this.setObject(x, y, ObjectRegistry.cobWebID);
               }
            }

            if (distance < (float)maxDistance && distance >= (float)(maxDistance - 40)) {
               this.setObject(x, y, wall);
            }
         }
      }

      int mobOffset = 3;
      this.setObject(mid, mid, ObjectRegistry.getObjectID("willowchest"));
      this.addInventory
      (
        new LootTable
        (
            new LootItemInterface[]
            {
                new OneOfLootItems(new LootItem("spiderstaff"), new LootItem("venomstaff"), new LootItem("spiderboomerang"), new LootItem("spidercharm")),
                CaveChestLootTable.potions,
                CaveChestLootTable.extraItems,
            }
        ),
        random,
        mid,
        mid,
        new Object[0]
      );
      this.addMob("swampcavespider", mid - mobOffset, mid - mobOffset, false);
      this.addMob("swampcavespider", mid + mobOffset, mid - mobOffset, false);
      this.addMob("swampcavespider", mid - mobOffset, mid + mobOffset, false);
      this.addMob("swampcavespider", mid + mobOffset, mid + mobOffset, false);
   }
}
