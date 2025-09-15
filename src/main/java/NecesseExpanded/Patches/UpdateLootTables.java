package NecesseExpanded.Patches;

import necesse.entity.mobs.hostile.SandwormHead;
import necesse.entity.mobs.hostile.bosses.ReaperMob;
import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.LootTable;
import necesse.inventory.lootTable.LootTablePresets;
import necesse.inventory.lootTable.lootItem.ChanceLootItem;
import necesse.inventory.lootTable.lootItem.LootItem;
import necesse.inventory.lootTable.presets.PirateChestLootTable;
import necesse.inventory.lootTable.presets.PirateDisplayStandLootTable;
import necesse.level.maps.incursion.GraveyardIncursionBiome;

public class UpdateLootTables {
    public static void Update() 
    {
        System.out.println("[Necesse Expanded] Updating starter chest loot...");
        LootTablePresets.startChest = new LootTable
        (
            new LootItemInterface[] 
            {
                (LootItemInterface) new LootItem("settlementflag"), 
                (LootItemInterface) new LootItem("coin", 500),
                (LootItemInterface) new LootItem("sprucelog", 250), 
                (LootItemInterface) new LootItem("stone", 150),
                (LootItemInterface) new LootItem("torch", 25), 
                (LootItemInterface) new LootItem("farmland", 20),
                (LootItemInterface) new LootItem("wheatseed", 20), 
                (LootItemInterface) new LootItem("bread", 10),
                (LootItemInterface) new LootItem("ironbomb", 10), 
                (LootItemInterface) new LootItem("storagebox", 3),
                (LootItemInterface) new LootItem("sprucebed", 3), 
                (LootItemInterface) new LootItem("grainmill"),
                (LootItemInterface) new LootItem("ironanvil"), 
                (LootItemInterface) new LootItem("forge")
            }
        );

        System.out.println("[Necesse Expanded] Updating mob loot tables...");

        GraveyardIncursionBiome.graveyardMobDrops.add(new ChanceLootItem(0.05F, "blood_crystal"));

        ReaperMob.uniqueDrops.items.add(new LootItem("shadow_orb"));
        
        SandwormHead.lootTable.items.add(new ChanceLootItem(0.1F, "sandworm_tooth"));

        PirateDisplayStandLootTable.items.items.add(new LootItem("lucky_ring"));
        PirateChestLootTable.mainItems.items.add(new LootItem("lucky_ring"));
    }
}
