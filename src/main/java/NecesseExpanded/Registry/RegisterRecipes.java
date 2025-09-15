package NecesseExpanded.Registry;

import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;
import necesse.inventory.recipe.Tech;

public class RegisterRecipes 
{
    public static void Register()
    {
        System.out.println("[Necesse Expanded] Registering new recipes...");

        // New techs
        Tech Keg = RecipeTechRegistry.registerTech("keg", "keg");

        // Additional vanilla recipes
        Recipes.registerModRecipe(new Recipe("ironbomb", 3, RecipeTechRegistry.WORKSTATION, new Ingredient[] { new Ingredient("fertilizer", 1), new Ingredient("ironbar", 1) }));
        Recipes.registerModRecipe(new Recipe("dynamitestick", 3, RecipeTechRegistry.WORKSTATION, new Ingredient[] { new Ingredient("fertilizer", 1), new Ingredient("ironbar", 1), new Ingredient("firemone", 1) }));
        Recipes.registerModRecipe(new Recipe("fuzzydice", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] { new Ingredient("wool", 5) }));
        Recipes.registerModRecipe(new Recipe("shinebelt", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] { new Ingredient("leather", 10), new Ingredient("ironbar", 5) }));
        Recipes.registerModRecipe(new Recipe("noblehorseshoe", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] { new Ingredient("ironbar", 5) }));
        Recipes.registerModRecipe(new Recipe("vampiresgift", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] { new Ingredient("leather", 10), new Ingredient("batwing", 5) }));
        Recipes.registerModRecipe(new Recipe("fins", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] { new Ingredient("leather", 5) }));
        Recipes.registerModRecipe(new Recipe("zephyrcharm", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] { new Ingredient("ironbar", 5) }));
        Recipes.registerModRecipe(new Recipe("missionboard", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] { new Ingredient("anylog", 20) }));
        Recipes.registerModRecipe(new Recipe("shippingchest", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] { new Ingredient("anylog", 20), new Ingredient("goldbar", 5) }));
        Recipes.registerModRecipe(new Recipe("handgun", 1, RecipeTechRegistry.IRON_ANVIL, new Ingredient[] { new Ingredient("ironbar", 5) }));
        Recipes.registerModRecipe(new Recipe("machinegun", 1, RecipeTechRegistry.DEMONIC_ANVIL, new Ingredient[] { new Ingredient("ironbar", 10) }));
        Recipes.registerModRecipe(new Recipe("shotgun", 1, RecipeTechRegistry.DEMONIC_ANVIL, new Ingredient[] { new Ingredient("ironbar", 10) }));
        Recipes.registerModRecipe(new Recipe("sniperrifle", 1, RecipeTechRegistry.DEMONIC_ANVIL, new Ingredient[] { new Ingredient("ironbar", 10), new Ingredient("quartz", 5) }));
        Recipes.registerModRecipe(new Recipe("bannerstand", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("ironbar", 5) }));
        Recipes.registerModRecipe(new Recipe("magicmanual", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("voidshard", 5), new Ingredient("book", 1) }));
        Recipes.registerModRecipe(new Recipe("mobilitycloak", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("leather", 5), new Ingredient("voidshard", 5) }));
        Recipes.registerModRecipe(new Recipe("magicfoci", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("demonicbar", 5) }));
        Recipes.registerModRecipe(new Recipe("rangefoci", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("demonicbar", 5) }));
        Recipes.registerModRecipe(new Recipe("meleefoci", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("demonicbar", 5) }));
        Recipes.registerModRecipe(new Recipe("summonfoci", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("demonicbar", 5) }));
        Recipes.registerModRecipe(new Recipe("mesmertablet", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("voidshard", 10) }));
        Recipes.registerModRecipe(new Recipe("miningcharm", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("quartz", 10) }));
        Recipes.registerModRecipe(new Recipe("calmingrose", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("frostshard", 10) }));
        Recipes.registerModRecipe(new Recipe("sparegemstones", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("sapphire", 5) }));
        Recipes.registerModRecipe(new Recipe("vambrace", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("ivybar", 5), new Ingredient("swampsludge", 5) }));
        Recipes.registerModRecipe(new Recipe("ammobox", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("tungstenbar", 5) }));
        Recipes.registerModRecipe(new Recipe("magicalquiver", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("leather", 5), new Ingredient("tungstenbar", 5) }));
        Recipes.registerModRecipe(new Recipe("challengerspauldron", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("tungstenbar", 10) }));
        Recipes.registerModRecipe(new Recipe("firestone", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("obsidian", 10) }));
        Recipes.registerModRecipe(new Recipe("froststone", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("glacialshard", 5) }));
        Recipes.registerModRecipe(new Recipe("spikedboots", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("glacialshard", 5), new Ingredient("leather", 5) }));
        Recipes.registerModRecipe(new Recipe("clockworkheart", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("ancientfossilbar", 10), new Ingredient("lifequartz", 15) }));
        Recipes.registerModRecipe(new Recipe("forbiddenspellbook", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("book", 1), new Ingredient("voidshard", 10), new Ingredient("ancientfossilbar", 10) }));
        Recipes.registerModRecipe(new Recipe("woodarrowtrap", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("anylog", 5), new Ingredient("stonearrow", 25), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("woodsawtrap", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("anylog", 5), new Ingredient("ironbar", 1), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("stonearrowtrap", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("stone", 5), new Ingredient("stonearrow", 25), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("stoneflametrap", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("stone", 5), new Ingredient("firemone", 5), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("stonesawtrap", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("stone", 5), new Ingredient("ironbar", 1), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("sandstonearrowtrap", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("sandstone", 5), new Ingredient("stonearrow", 25), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("sandstoneflametrap", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("sandstone", 5), new Ingredient("firemone", 5), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("sandstonesawtrap", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("sandstone", 5), new Ingredient("ironbar", 1), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("swampstonearrowtrap", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("swampstone", 5), new Ingredient("stonearrow", 25), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("swampstoneflametrap", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("swampstone", 5), new Ingredient("firemone", 5), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("swampstonesawtrap", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("swampstone", 5), new Ingredient("ironbar", 1), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("snowstonearrowtrap", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("snowstone", 5), new Ingredient("stonearrow", 25), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("snowstonesawtrap", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("snowstone", 5), new Ingredient("ironbar", 1), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("deepstonearrowtrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepstone", 5), new Ingredient("stonearrow", 25), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("deepstoneflametrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepstone", 5), new Ingredient("firemone", 5), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("deepstonesawtrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepstone", 5), new Ingredient("ironbar", 1), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("icearrowtrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepsnowstone", 5), new Ingredient("stonearrow", 25), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("icesawtrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepsnowstone", 5), new Ingredient("ironbar", 1), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("deepsnowstonearrowtrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepsnowstone", 5), new Ingredient("stonearrow", 25), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("deepsnowstoneflametrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepsnowstone", 5), new Ingredient("firemone", 5), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("deepsnowstonesawtrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepsnowstone", 5), new Ingredient("ironbar", 1), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("deepswampstonearrowtrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepswampstone", 5), new Ingredient("stonearrow", 25), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("deepswampstoneflametrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepswampstone", 5), new Ingredient("firemone", 5), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("deepswampstonesawtrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepswampstone", 5), new Ingredient("ironbar", 1), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("deepsandstonearrowtrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepsandstone", 5), new Ingredient("stonearrow", 25), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("deepsandstoneflametrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepsandstone", 5), new Ingredient("firemone", 5), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("deepsandstonesawtrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("deepsandstone", 5), new Ingredient("ironbar", 1), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("spidercastlearrowtrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("spiderstone", 5), new Ingredient("stonearrow", 25), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("obsidianarrowtrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("obsidian", 5), new Ingredient("stonearrow", 25), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("obsidianflametrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("obsidian", 5), new Ingredient("firemone", 5), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("obsidiansawtrap", 1, RecipeTechRegistry.TUNGSTEN_WORKSTATION, new Ingredient[] { new Ingredient("obsidian", 5), new Ingredient("ironbar", 1), new Ingredient("wire", 5) }));
        Recipes.registerModRecipe(new Recipe("traptrack", 10, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("ironbar", 1) }));
        Recipes.registerModRecipe(new Recipe("spiketrap", 5, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("ironbar", 1), new Ingredient("wire", 5) }));

        // Objects
        Recipes.registerModRecipe(new Recipe("keg", 1, RecipeTechRegistry.DEMONIC_WORKSTATION, new Ingredient[] { new Ingredient("anylog", 10), new Ingredient("demonicbar", 5) }));

        // Consumables
        Recipes.registerModRecipe(new Recipe("greater_health_elixir", RecipeTechRegistry.FALLEN_ALCHEMY, new Ingredient[] { new Ingredient("glassbottle", 1), new Ingredient("alchemyshard", 5), new Ingredient("upgradeshard", 5), new Ingredient("anytier2essence", 5) }));
        Recipes.registerModRecipe(new Recipe("greater_mana_elixir", RecipeTechRegistry.FALLEN_ALCHEMY, new Ingredient[] { new Ingredient("glassbottle", 1), new Ingredient("alchemyshard", 5), new Ingredient("upgradeshard", 5), new Ingredient("anytier2essence", 5) }));
        Recipes.registerModRecipe(new Recipe("lifeelixir", 1, RecipeTechRegistry.CAVEGLOW_ALCHEMY, new Ingredient[] { new Ingredient("glassbottle", 1), new Ingredient("lifequartz", 10), new Ingredient("sunflower", 10) }));
        Recipes.registerModRecipe(new Recipe("mana_elixir", RecipeTechRegistry.CAVEGLOW_ALCHEMY, new Ingredient[] { new Ingredient("glassbottle", 1), new Ingredient("caveglow", 10), new Ingredient("glacialshard", 3) }));
        
        Recipes.registerModRecipe(new Recipe("mead", Keg, new Ingredient[] { new Ingredient("honey", 2) }));
        Recipes.registerModRecipe(new Recipe("raspberry_wine", Keg, new Ingredient[] { new Ingredient("raspberry", 2) }));
        Recipes.registerModRecipe(new Recipe("blueberry_wine", Keg, new Ingredient[] { new Ingredient("blueberry", 2) }));
        Recipes.registerModRecipe(new Recipe("blackberry_wine", Keg, new Ingredient[] { new Ingredient("blackberry", 2) }));
        Recipes.registerModRecipe(new Recipe("beer", Keg, new Ingredient[] { new Ingredient("wheat", 2) }));
        Recipes.registerModRecipe(new Recipe("cider", Keg, new Ingredient[] { new Ingredient("apple", 2) }));
        Recipes.registerModRecipe(new Recipe("whiskey", Keg, new Ingredient[] { new Ingredient("corn", 2) }));

        Recipes.registerModRecipe(new Recipe("elder_coffee", RecipeTechRegistry.COOKING_POT, new Ingredient[] { new Ingredient("blackcoffee", 1), new Ingredient("whiskey", 1), new Ingredient("sugar", 2), new Ingredient("milk", 1)}));
        Recipes.registerModRecipe(new Recipe("miner_brew", RecipeTechRegistry.COOKING_POT, new Ingredient[] { new Ingredient("whiskey", 1), new Ingredient("sugar", 2), new Ingredient("chilipepper", 2)}));

        Recipes.registerModRecipe(new Recipe("pearlescent_wine", Keg, new Ingredient[] { new Ingredient("anyfruit", 3), new Ingredient("sugar", 3), new Ingredient("pearlescentdiamond", 1)}));

        Recipes.registerModRecipe(new Recipe("fruit_jam", Keg, new Ingredient[] { new Ingredient("anyfruit", 3) }));
        Recipes.registerModRecipe(new Recipe("jam_donut", RecipeTechRegistry.COOKING_POT, new Ingredient[] { new Ingredient("fruit_jam", 1), new Ingredient("donut", 1),  new Ingredient("sugar", 2),}));

        Recipes.registerModRecipe(new Recipe("angler_fish_stew", RecipeTechRegistry.COOKING_POT, new Ingredient[] { new Ingredient("anycommonfish", 1), new Ingredient("potato", 2), new Ingredient("carrot", 1) }));
        Recipes.registerModRecipe(new Recipe("heartfish_stew", RecipeTechRegistry.COOKING_POT, new Ingredient[] { new Ingredient("heartfish", 1), new Ingredient("potato", 2), new Ingredient("carrot", 2), new Ingredient("onion", 1) }));
        Recipes.registerModRecipe(new Recipe("pearlfish_stew", RecipeTechRegistry.COOKING_POT, new Ingredient[] { new Ingredient("pearlfish", 1), new Ingredient("chilipepper", 2), new Ingredient("onion", 2), new Ingredient("carrot", 2), new Ingredient("potato", 2),}));

        // Trinkets
        Recipes.registerModRecipe(new Recipe("blood_crystal", RecipeTechRegistry.FALLEN_ANVIL, new Ingredient[] { new Ingredient("bloodessence", 16), new Ingredient("ruby", 8) }));
        Recipes.registerModRecipe(new Recipe("shadow_orb", RecipeTechRegistry.FALLEN_ANVIL, new Ingredient[] { new Ingredient("shadowessence", 20) }));
        Recipes.registerModRecipe(new Recipe("lucky_ring", RecipeTechRegistry.TUNGSTEN_ANVIL, new Ingredient[] { new Ingredient("goldbar", 8), new Ingredient("tungstenbar", 4)}));
        Recipes.registerModRecipe(new Recipe("necromancer_ring", RecipeTechRegistry.TUNGSTEN_ANVIL, new Ingredient[] { new Ingredient("tungstenbar", 5), new Ingredient("anytier2essence", 10)}));

        // Fish
        Recipes.registerModRecipe(new Recipe("voidshard", 3, RecipeTechRegistry.VOID_ALCHEMY, new Ingredient[] { new Ingredient("demonfish", 1)}));
        Recipes.registerModRecipe(new Recipe("lifequartz", 3, RecipeTechRegistry.VOID_ALCHEMY, new Ingredient[] { new Ingredient("heartfish", 1)}));
        Recipes.registerModRecipe(new Recipe("pearlescentdiamond", 1, RecipeTechRegistry.FALLEN_ALCHEMY, new Ingredient[] { new Ingredient("pearlfish", 1)}));
        
        
    }
}
