package NecesseExpanded.Registry;

import necesse.engine.localization.message.LocalMessage;
import necesse.engine.modifiers.ModifierValue;
import necesse.engine.registries.ItemRegistry;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.inventory.item.Item;
import necesse.inventory.item.Item.Rarity;
import necesse.inventory.item.placeableItem.consumableItem.food.FoodConsumableItem;
import necesse.level.maps.levelData.settlementData.settler.FoodQuality;
import necesse.level.maps.levelData.settlementData.settler.Settler;

public class RegisterFood 
{
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void Register()
    {
        ItemRegistry.registerItem
        (
            "mead", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Item.Rarity.UNCOMMON, 
                    Settler.FOOD_FINE, 
                    10, 
                    240, 
                    new ModifierValue[] 
                    { 
                        new ModifierValue(BuffModifiers.MAX_RESILIENCE_FLAT, 20),
                    }
                )
            )
            .setItemCategory(new String[] {"consumable"}), 
            10, 
            true
        );

        ItemRegistry.registerItem
        (
            "blackberry_wine", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Item.Rarity.UNCOMMON, 
                    Settler.FOOD_FINE, 
                    10, 
                    240, 
                    new ModifierValue[] 
                    { 
                        new ModifierValue(BuffModifiers.ATTACK_SPEED, 0.10F),
                    }
                )
            )
            .setItemCategory(new String[] {"consumable"}), 
            10, 
            true
        );

        ItemRegistry.registerItem
        (
            "blueberry_wine", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Item.Rarity.UNCOMMON, 
                    Settler.FOOD_FINE, 
                    10, 
                    240, 
                    new ModifierValue[] 
                    { 
                        new ModifierValue(BuffModifiers.CRIT_CHANCE, 0.10F),
                    }
                )
            )
            .setItemCategory(new String[] {"consumable"}), 
            10, 
            true
        );

        ItemRegistry.registerItem
        (
            "raspberry_wine", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Item.Rarity.UNCOMMON, 
                    Settler.FOOD_FINE, 
                    10, 
                    240, 
                    new ModifierValue[] 
                    { 
                        new ModifierValue(BuffModifiers.MAX_MANA_FLAT, 20),
                    }
                )
            )
            .setItemCategory(new String[] {"consumable"}), 
            10, 
            true
        );

        ItemRegistry.registerItem
        (
            "beer", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Item.Rarity.UNCOMMON, 
                    Settler.FOOD_FINE, 
                    10, 
                    240, 
                    new ModifierValue[] 
                    { 
                        new ModifierValue(BuffModifiers.MAX_HEALTH_FLAT, 20),
                    }
                )
            )
            .setItemCategory(new String[] {"consumable"}), 
            10, 
            true
        );

        ItemRegistry.registerItem
        (
            "cider", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Item.Rarity.UNCOMMON, 
                    Settler.FOOD_FINE, 
                    10, 
                    240, 
                    new ModifierValue[] 
                    { 
                        new ModifierValue(BuffModifiers.SPEED, 0.10F),
                    }
                )
            )
            .setItemCategory(new String[] {"consumable"}), 
            10, 
            true
        );

        ItemRegistry.registerItem
        (
            "whiskey", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Item.Rarity.UNCOMMON, 
                    Settler.FOOD_FINE, 
                    10, 
                    240, 
                    new ModifierValue[] 
                    { 
                        new ModifierValue(BuffModifiers.MAX_HEALTH_FLAT, 20),
                    }
                )
            )
            .setItemCategory(new String[] {"consumable"}), 
            10, 
            true
        );

        ItemRegistry.registerItem
        (
            "fruit_jam", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Rarity.RARE, 
                    Settler.FOOD_SIMPLE, 
                    25, 
                    480, 
                    new ModifierValue[]
                    {
                        new ModifierValue(BuffModifiers.HEALTH_REGEN, 1.0F)
                    }
                )
            )
            .spoilDuration(180)
            .addGlobalIngredient(new String[]{"anycookedfood"}), 
            12.0F, 
            true
        );

        ItemRegistry.registerItem
        (
            "jam_donut", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Rarity.RARE, 
                    Settler.FOOD_GOURMET, 
                    25, 
                    480, 
                    new ModifierValue[]
                    {
                        new ModifierValue(BuffModifiers.ATTACK_SPEED, 0.25f),
                        new ModifierValue(BuffModifiers.SPEED, 0.15f)
                    }
                )
            )
            .spoilDuration(240)
            .addGlobalIngredient(new String[]{"anycookedfood"}), 
            12.0F, 
            true
        );

        ItemRegistry.registerItem
        (
            "heartfish_stew", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Rarity.RARE, 
                    Settler.FOOD_GOURMET, 
                    25, 
                    480, 
                    new ModifierValue[]
                    {
                        new ModifierValue(BuffModifiers.MAX_HEALTH_FLAT, 30),
                        new ModifierValue(BuffModifiers.HEALTH_REGEN_FLAT, 1.5F)
                    }
                )
            )
            .spoilDuration(180)
            .addGlobalIngredient(new String[]{"anycookedfood"}), 
            12.0F, 
            true
        );

        ItemRegistry.registerItem
        (
            "pearlfish_stew", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Rarity.LEGENDARY, 
                    new FoodQuality(new LocalMessage("settlement", "foodperfect"), 24, "B-C-B", new String[]{"perfect"}), 
                    50, 
                    480, 
                    new ModifierValue[]
                    {
                        new ModifierValue(BuffModifiers.CRIT_CHANCE, 0.25F),
                        new ModifierValue(BuffModifiers.ATTACK_SPEED, 0.30F),
                        new ModifierValue(BuffModifiers.ALL_DAMAGE, 0.1f),
                        new ModifierValue(BuffModifiers.ARMOR_PEN_FLAT, 8),
                    }
                )
            )
            .spoilDuration(180)
            .addGlobalIngredient(new String[]{"anycookedfood"}), 
            50.0F, 
            true
        );

        ItemRegistry.registerItem
        (
            "angler_fish_stew", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Rarity.UNCOMMON, 
                    Settler.FOOD_FINE, 
                    50, 
                    480, 
                    new ModifierValue[]
                    {
                        new ModifierValue(BuffModifiers.FISHING_POWER, 30),
                    }
                )
            )
            .spoilDuration(180)
            .addGlobalIngredient(new String[]{"anycookedfood"}), 
            50.0F, 
            true
        );

        ItemRegistry.registerItem
        (
            "elder_coffee", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Item.Rarity.RARE, 
                    Settler.FOOD_GOURMET, 
                    5, 
                    240, 
                    new ModifierValue[] 
                    { 
                        new ModifierValue(BuffModifiers.MAX_HEALTH_FLAT, 30),
                        new ModifierValue(BuffModifiers.SPEED, 0.30f),
                    }
                )
            )
            .setItemCategory(new String[] {"consumable"}),
            20, 
            true
        );

        ItemRegistry.registerItem
        (
            "miner_brew", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Item.Rarity.RARE, 
                    Settler.FOOD_GOURMET, 
                    5, 
                    240, 
                    new ModifierValue[] 
                    { 
                        new ModifierValue(BuffModifiers.SPEED, 0.15F),
                        new ModifierValue(BuffModifiers.MINING_SPEED, 0.25F),
                        new ModifierValue(BuffModifiers.MINING_RANGE, 1.0f),
                    }
                )
            )
            .setItemCategory(new String[] {"consumable"}),
            20, 
            true
        );

        ItemRegistry.registerItem
        (
            "pearlescent_wine", 
            (
                new FoodConsumableItem
                (
                    250, 
                    Item.Rarity.RARE, 
                    new FoodQuality(new LocalMessage("settlement", "foodperfect"), 24, "B-C-B", new String[]{"perfect"}), 
                    5, 
                    480, 
                    new ModifierValue[] 
                    { 
                        new ModifierValue(BuffModifiers.SPEED, 0.30f),
                        new ModifierValue(BuffModifiers.MINING_SPEED, 0.5f),
                        new ModifierValue(BuffModifiers.MINING_RANGE, 3.0f),
                    }
                )
            )
            .setItemCategory(new String[] {"consumable"}),
            20, 
            true
        );
    }
}
