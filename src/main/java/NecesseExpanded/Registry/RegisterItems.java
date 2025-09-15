package NecesseExpanded.Registry;

import NecesseExpanded.Items.Consumables.*;
import NecesseExpanded.Items.Trinkets.*;
import NecesseExpanded.Items.Weapons.RaiderSlimeStaff;
import NecesseExpanded.Items.Weapons.RaiderSlimeSword;
import NecesseExpanded.Items.Weapons.RaiderBattleaxe;
import NecesseExpanded.Items.Weapons.RaiderBomb;
import necesse.engine.registries.ItemRegistry;
import necesse.inventory.item.Item;
import necesse.inventory.item.matItem.FishItem;

public class RegisterItems 
{
    public static void Register()
    {
        System.out.println("[Necesse Expanded] Registering new items...");

        ItemRegistry.registerItem("greater_mana_elixir", new GreaterManaElixir(), 100.0F, true);
        ItemRegistry.registerItem("greater_health_elixir", new GreaterHealthElixir(), 100.0F, true);
        ItemRegistry.registerItem("mana_elixir", new ManaElixir(), 25.0F, true);

        ItemRegistry.registerItem("blood_crystal", new BloodCrystalTrinket(), 400F, true);
        ItemRegistry.registerItem("shadow_orb", new ShadowOrbTrinket(), 250F, true);
        ItemRegistry.registerItem("lucky_ring", new LuckyRingTrinket(), 225F, true);
        ItemRegistry.registerItem("necromancer_ring", new NecromancerRingTrinket(), 250F, true);
        ItemRegistry.registerItem("sandworm_tooth", new SandwormToothTrinket(), 200F, true);

        ItemRegistry.registerItem("battleaxe_special", new RaiderBattleaxe(), 0, false);
        ItemRegistry.registerItem("slimestaff_special", new RaiderSlimeStaff(), 0, false);
        ItemRegistry.registerItem("slime_warrior_sword", new RaiderSlimeSword(), 0, false);
        ItemRegistry.registerItem("raider_bomb", new RaiderBomb(), 0, false);
        
        ItemRegistry.registerItem("swamp_eel", new FishItem(99, Item.Rarity.UNCOMMON, new String[0]).setItemCategory(new String[]{"consumable", "commonfish"}), 10, true);
        ItemRegistry.registerItem("saltwater_shark", new FishItem(99, Item.Rarity.UNCOMMON, new String[0]).setItemCategory(new String[]{"consumable", "commonfish"}), 10, true);

        ItemRegistry.registerItem("demonfish", new FishItem(99, Item.Rarity.RARE, new String[0]).setItemCategory(new String[] { "materials", "specialfish" }), 15, true);
        ItemRegistry.registerItem("heartfish", new FishItem(99, Item.Rarity.RARE, new String[0]).setItemCategory(new String[] { "materials", "specialfish" }), 20, true);
        ItemRegistry.registerItem("pearlfish", new FishItem(99, Item.Rarity.LEGENDARY, new String[0]).setItemCategory(new String[] { "materials", "specialfish" }), 50, true);
    }
}
