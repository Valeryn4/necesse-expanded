package NecesseExpanded.Registry;

import NecesseExpanded.Mobs.Critters.CrystalCaveling;
import NecesseExpanded.Mobs.Critters.ShardCaveling;
import NecesseExpanded.Mobs.Critters.SlimeCaveling;
import NecesseExpanded.Mobs.Hostile.Desert.AncientWarrior;
import NecesseExpanded.Mobs.Hostile.Forest.ZombieMiner;
import NecesseExpanded.Mobs.Hostile.Snow.FrozenDwarf;
import NecesseExpanded.Mobs.Hostile.Snow.FrozenDwarfMage;
import NecesseExpanded.Mobs.Hostile.Snow.IceGolemMob;
import NecesseExpanded.Mobs.Summons.NecromancerMinion;

import necesse.engine.registries.MobRegistry;

// preInit() registration of mobs for inclusion in journal. Must be used to ensure mobs appear in journal.
public class RegisterMobs 
{
    public static void Register()
    {
        System.out.println("[Necesse Expanded] Registering mobs...");

        // Forest
        MobRegistry.registerMob("zombie_miner", ZombieMiner.class, true);

        // Snow
        MobRegistry.registerMob("frozen_dwarf", FrozenDwarf.class, true);
        MobRegistry.registerMob("frozen_dwarf_mage", FrozenDwarfMage.class, true);
        MobRegistry.registerMob("ice_golem", IceGolemMob.class, true);

        // Dungeon

        // Plains

        // Swamp

        // Desert
        MobRegistry.registerMob("ancient_warrior", AncientWarrior.class, true);

        // Summons
        MobRegistry.registerMob("necromancer_minion", NecromancerMinion.class, false);

        // Critters
        MobRegistry.registerMob("crystal_caveling", CrystalCaveling.class, true);
        MobRegistry.registerMob("shard_caveling", ShardCaveling.class, true);
        MobRegistry.registerMob("slime_caveling", SlimeCaveling.class, true);
    }
}
