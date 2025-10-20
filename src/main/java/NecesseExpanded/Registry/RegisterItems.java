package NecesseExpanded.Registry;

import NecesseExpanded.Items.Ammo.*;
import NecesseExpanded.Items.Consumables.Misc.*;
import NecesseExpanded.Items.Consumables.Potions.*;
import NecesseExpanded.Items.Trinkets.*;
import NecesseExpanded.Items.Weapons.Magic.*;
import NecesseExpanded.Items.Weapons.Melee.*;
import NecesseExpanded.Utils.RaiderWeapons.*;
import necesse.engine.localization.message.LocalMessage;
import necesse.engine.modifiers.ModifierValue;
import necesse.engine.registries.ItemRegistry;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.inventory.item.Item;
import necesse.inventory.item.Item.Rarity;
import necesse.inventory.item.matItem.EssenceMatItem;
import necesse.inventory.item.matItem.FishItem;
import necesse.inventory.item.matItem.MatItem;
import necesse.inventory.item.placeableItem.consumableItem.food.FoodConsumableItem;
import necesse.inventory.item.placeableItem.fishingRodItem.FishingRodItem;
import necesse.inventory.item.trinketItem.SimpleTrinketItem;
import necesse.inventory.lootTable.presets.TrinketsLootTable;
import necesse.level.maps.levelData.settlementData.settler.FoodQuality;
import necesse.level.maps.levelData.settlementData.settler.Settler;

public class RegisterItems 
{
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void Register()
    {
        System.out.println("[Necesse Expanded] Registering new items...");

        // Unobtainable items used by raiders
        ItemRegistry.registerItem("battleaxe_special", new RaiderBattleaxe(), 0, false);
        ItemRegistry.registerItem("slime_mage_staff", new RaiderSlimeStaff(), 0, false);
        ItemRegistry.registerItem("slime_warrior_sword", new RaiderSlimeSword(), 0, false);
        ItemRegistry.registerItem("raider_bomb", new RaiderBomb(), 0, false);
        ItemRegistry.registerItem("raider_bomb_2", new RaiderBomb2(), 0, false);
        ItemRegistry.registerItem("raider_fake_sword", new RaiderFakeSword(), 0, false);

        // Consumables
        ItemRegistry.registerItem("greater_mana_elixir", new GreaterManaElixir(), 100.0F, true);
        ItemRegistry.registerItem("mana_elixir", new ManaElixir(), 25.0F, true);
        ItemRegistry.registerItem("stamina_potion", new StaminaPotion(), 10f, true);
        ItemRegistry.registerItem("mead", new FoodConsumableItem(250, Item.Rarity.UNCOMMON, Settler.FOOD_FINE, 10, 240, new ModifierValue[]{ new ModifierValue(BuffModifiers.MAX_RESILIENCE_FLAT, 20) }).setItemCategory(new String[] {"consumable"}), 10, true);
        ItemRegistry.registerItem("blackberry_wine", new FoodConsumableItem(250, Item.Rarity.UNCOMMON, Settler.FOOD_FINE, 10, 240, new ModifierValue[]{ new ModifierValue(BuffModifiers.ATTACK_SPEED, 0.10F) }).setItemCategory(new String[] {"consumable"}), 10, true);
        ItemRegistry.registerItem("blueberry_wine", new FoodConsumableItem(250, Item.Rarity.UNCOMMON, Settler.FOOD_FINE, 10, 240, new ModifierValue[]{ new ModifierValue(BuffModifiers.CRIT_CHANCE, 0.10F) }).setItemCategory(new String[] {"consumable"}), 10, true);
        ItemRegistry.registerItem("raspberry_wine", new FoodConsumableItem(250, Item.Rarity.UNCOMMON, Settler.FOOD_FINE, 10, 240, new ModifierValue[]{ new ModifierValue(BuffModifiers.MAX_MANA_FLAT, 20) }).setItemCategory(new String[] {"consumable"}), 10, true);
        ItemRegistry.registerItem("beer", new FoodConsumableItem(250, Item.Rarity.UNCOMMON, Settler.FOOD_FINE, 10, 240, new ModifierValue[]{ new ModifierValue(BuffModifiers.MAX_HEALTH_FLAT, 20) }).setItemCategory(new String[] {"consumable"}), 10, true);
        ItemRegistry.registerItem("cider", new FoodConsumableItem(250, Item.Rarity.UNCOMMON, Settler.FOOD_FINE, 10, 240, new ModifierValue[]{ new ModifierValue(BuffModifiers.SPEED, 0.10F) }).setItemCategory(new String[] {"consumable"}), 10, true);
        ItemRegistry.registerItem("whiskey", new FoodConsumableItem(250, Item.Rarity.UNCOMMON, Settler.FOOD_FINE, 10, 240, new ModifierValue[]{ new ModifierValue(BuffModifiers.MAX_HEALTH_FLAT, 20) }).setItemCategory(new String[] {"consumable"}), 10, true);
        ItemRegistry.registerItem("rum", new FoodConsumableItem(250, Item.Rarity.UNCOMMON, Settler.FOOD_FINE, 10, 240, new ModifierValue[]{ new ModifierValue(BuffModifiers.COMBAT_HEALTH_REGEN_FLAT, 0.5F) }).setItemCategory(new String[] {"consumable"}), 10, true);
        ItemRegistry.registerItem("angler_fish_stew", new FoodConsumableItem(250, Rarity.UNCOMMON, Settler.FOOD_FINE, 30, 480, new ModifierValue[]{ new ModifierValue(BuffModifiers.FISHING_POWER, 30) }).spoilDuration(180).addGlobalIngredient(new String[]{"anycookedfood"}), 12.0F, true);
        ItemRegistry.registerItem("mushroom_stew", new FoodConsumableItem(250, Rarity.UNCOMMON, Settler.FOOD_SIMPLE, 30, 480, new ModifierValue[]{ new ModifierValue(BuffModifiers.CRIT_CHANCE, 0.05f) }).spoilDuration(180).addGlobalIngredient(new String[]{"anycookedfood"}), 12.0F, true);
        ItemRegistry.registerItem("fruit_jam", new FoodConsumableItem(250, Rarity.UNCOMMON, Settler.FOOD_SIMPLE, 15, 480, new ModifierValue[]{ new ModifierValue(BuffModifiers.COMBAT_HEALTH_REGEN_FLAT, 0.5F) }).spoilDuration(180).addGlobalIngredient(new String[]{"anycookedfood"}), 12.0F, true);
        ItemRegistry.registerItem("jam_donut", new FoodConsumableItem(250, Rarity.RARE, Settler.FOOD_GOURMET, 25, 480, new ModifierValue[]{ new ModifierValue(BuffModifiers.ATTACK_SPEED, 0.25f), new ModifierValue(BuffModifiers.SPEED, 0.15f) }).spoilDuration(240).addGlobalIngredient(new String[]{"anycookedfood"}), 12.0F, true);
        ItemRegistry.registerItem("heartfish_stew", new FoodConsumableItem(250, Rarity.RARE, Settler.FOOD_GOURMET, 25, 480, new ModifierValue[]{ new ModifierValue(BuffModifiers.MAX_HEALTH_FLAT, 30), new ModifierValue(BuffModifiers.COMBAT_HEALTH_REGEN_FLAT, 1.5F) }).spoilDuration(180).addGlobalIngredient(new String[]{"anycookedfood"}), 12.0F, true);
        ItemRegistry.registerItem("elder_coffee", new FoodConsumableItem(250, Item.Rarity.RARE, Settler.FOOD_GOURMET, 10, 480, new ModifierValue[]{ new ModifierValue(BuffModifiers.MAX_HEALTH_FLAT, 30), new ModifierValue(BuffModifiers.SPEED, 0.30f) }).setItemCategory(new String[] {"consumable"}), 20, true);
        ItemRegistry.registerItem("miner_brew", new FoodConsumableItem(250, Item.Rarity.RARE, Settler.FOOD_GOURMET, 10, 360, new ModifierValue[]{ new ModifierValue(BuffModifiers.SPEED, 0.15F), new ModifierValue(BuffModifiers.MINING_SPEED, 0.25F), new ModifierValue(BuffModifiers.MINING_RANGE, 1.0f) }).setItemCategory(new String[] {"consumable"}), 20, true);
        ItemRegistry.registerItem("pearlescent_wine", new FoodConsumableItem(250, Item.Rarity.LEGENDARY, new FoodQuality(new LocalMessage("settlement", "foodperfect"), 50, "C-C-C", new String[]{"perfect"}), 5, 960, new ModifierValue[]{ new ModifierValue(BuffModifiers.SPEED, 0.30f), new ModifierValue(BuffModifiers.MINING_SPEED, 0.5f), new ModifierValue(BuffModifiers.MINING_RANGE, 3.0f) }).setItemCategory(new String[] {"consumable"}), 50f, true);
        ItemRegistry.registerItem("pearlfish_stew", new FoodConsumableItem(250, Rarity.LEGENDARY, new FoodQuality(new LocalMessage("settlement", "foodperfect"), 50, "C-C-C", new String[]{"perfect"}), 50, 960, new ModifierValue[]{ new ModifierValue(BuffModifiers.CRIT_CHANCE, 0.25F), new ModifierValue(BuffModifiers.ATTACK_SPEED, 0.30F), new ModifierValue(BuffModifiers.ALL_DAMAGE, 0.1f), new ModifierValue(BuffModifiers.ARMOR_PEN_FLAT, 8) }).spoilDuration(180).addGlobalIngredient(new String[]{"anycookedfood"}), 50.0F, true);

        // Melee weapons
        ItemRegistry.registerItem("juggernaut_axe", new JuggernautAxeToolItem(), 150F, true);
        ItemRegistry.registerItem("glacial_spear", new GlacialSpearToolItem(), 200F, true);
        ItemRegistry.registerItem("murasama", new MurasamaToolItem(), 300F, true);

        // Ranged weapons
        

        // Magic weapons
        ItemRegistry.registerItem("frostbolt", new FrostBoltMagicToolItem(), 70F, true);
        ItemRegistry.registerItem("inferno", new InfernoMagicToolItem(), 150F, true);
        ItemRegistry.registerItem("winterwrath", new WinterWrathMagicToolItem(), 300f, true);
        ItemRegistry.registerItem("brimstone", new BrimstoneMagicToolItem(), 500f, true);


        // Summon weapons

        // Ammo
        ItemRegistry.registerItem("venom_bullet", new VenomBullet(), 0.1F, true);
        ItemRegistry.registerItem("vampire_bullet", new VampireBullet(), 0.1F, true);

        // Tools
        ItemRegistry.registerItem("crystal_fishing_rod", new FishingRodItem(50, 34, 28, 90, 200, 3, 30, 45, Rarity.RARE), 800F, true);

        // Trinkets
        ItemRegistry.registerItem("blood_crystal", new BloodCrystalTrinket(), 400F, true);
        ItemRegistry.registerItem("necromancer_ring", new NecromancerRingTrinket(), 400F, true);
        ItemRegistry.registerItem("shadow_crystal", new ShadowCrystalTrinket(), 250F, true);
        ItemRegistry.registerItem("lucky_ring", new LuckyRingTrinket(), 200F, true);
        ItemRegistry.registerItem("sandworm_tooth", new SandwormToothTrinket(), 250F, true);
        ItemRegistry.registerItem("lensmaker_glasses", new SimpleTrinketItem(Item.Rarity.UNCOMMON, "lensmaker_buff", 125, TrinketsLootTable.trinkets), 125F, true);
        ItemRegistry.registerItem("ancient_tablet", new SimpleTrinketItem(Item.Rarity.UNCOMMON, "ancient_tablet_buff", 125, TrinketsLootTable.trinkets), 125F, true);
        ItemRegistry.registerItem("warrior_ring", new SimpleTrinketItem(Item.Rarity.UNCOMMON, "warrior_ring_buff", 125, TrinketsLootTable.trinkets), 125F, true);
        ItemRegistry.registerItem("summoner_grimoire", new SimpleTrinketItem(Item.Rarity.UNCOMMON, "summoner_book_buff", 125, TrinketsLootTable.trinkets), 125F, true);
        ItemRegistry.registerItem("forgotten_relic", new ForgottenRelicTrinket(), 275F, true);
        ItemRegistry.registerItem("berserker_ring", new BerserkerRingTrinket(), 200F, true);
        ItemRegistry.registerItem("leather_scabbard", new SimpleTrinketItem(Item.Rarity.COMMON, "leather_scabbard_buff", 50, TrinketsLootTable.trinkets), 50f, true);

        // Materials
        ItemRegistry.registerItem("lunar_essence", new EssenceMatItem(250, Rarity.LEGENDARY, 3), 35.0F, true);
        ItemRegistry.registerItem("solar_essence", new EssenceMatItem(250, Rarity.LEGENDARY, 3), 35.0F, true);

        // Fishing consumables
        ItemRegistry.registerItem("surface_treasure_chest", new SurfaceTreasureChest(), 25.0F, true);
        ItemRegistry.registerItem("cave_treasure_chest", new CaveTreasureChest(), 50.0F, true);
        ItemRegistry.registerItem("deep_treasure_chest", new DeepTreasureChest(), 75.0F, true);
        ItemRegistry.registerItem("incursion_treasure_chest", new IncursionTreasureChest(), 100.0F, true);
        ItemRegistry.registerItem("pearl_oyster", new PearlOyster(), 50f, true);

        // Crafting materials
        ItemRegistry.registerItem("swamp_eel", (new FishItem(250, Rarity.COMMON, new String[]{"anycommonfish"})).spoilDuration(240).setItemCategory(new String[]{"consumable", "commonfish"}), 12.0F, true);
        ItemRegistry.registerItem("saltwater_shark", (new FishItem(250, Rarity.COMMON, new String[]{"anycommonfish"})).spoilDuration(240).setItemCategory(new String[]{"consumable", "commonfish"}), 12.0F, true);
        ItemRegistry.registerItem("oyster", (new FishItem(250, Rarity.COMMON, new String[]{"anycommonfish"})).spoilDuration(240).setItemCategory(new String[]{"consumable", "commonfish"}), 12.0F, true);
        ItemRegistry.registerItem("demonfish", new FishItem(99, Item.Rarity.RARE, new String[0]).setItemCategory(new String[] { "materials", "specialfish" }), 15, true);
        ItemRegistry.registerItem("heartfish", new FishItem(99, Item.Rarity.RARE, new String[0]).setItemCategory(new String[] { "materials", "specialfish" }), 20, true);
        ItemRegistry.registerItem("glacierfish", new FishItem(99, Item.Rarity.RARE, new String[0]).setItemCategory(new String[] { "materials", "specialfish" }), 20, true);
        ItemRegistry.registerItem("slimefish", new FishItem(99, Item.Rarity.RARE, new String[0]).setItemCategory(new String[] { "materials", "specialfish" }), 40, true);
        ItemRegistry.registerItem("pearlfish", new FishItem(99, Item.Rarity.LEGENDARY, new String[0]).setItemCategory(new String[] { "materials", "specialfish" }), 50, true);
        ItemRegistry.registerItem("seaweed", (new MatItem(1000, Rarity.NORMAL, "compostabletip", new String[]{"anycompostable"})).setItemCategory(new String[]{"materials"}), 2F, true);
        ItemRegistry.registerItem("slime", (new MatItem(1000, Rarity.NORMAL, "compostabletip", new String[]{"anycompostable"})).setItemCategory(new String[]{"materials"}), 2F, true);
        ItemRegistry.registerItem("pearl", (new MatItem(250, Rarity.RARE, new String[0])).setItemCategory(new String[]{"materials", "minerals"}), 400.0F, true);
    }
}
