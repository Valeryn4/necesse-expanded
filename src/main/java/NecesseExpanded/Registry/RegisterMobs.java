package NecesseExpanded.Registry;

import NecesseExpanded.Mobs.Critters.CrystalCaveling;
import NecesseExpanded.Mobs.Critters.ShardCaveling;

import NecesseExpanded.Mobs.Summons.NecromancerMinion;

import NecesseExpanded.Mobs.Raiders.AncientSkeletonRaiders.*;
import NecesseExpanded.Mobs.Raiders.GraveyardRaiders.*;
import NecesseExpanded.Mobs.Raiders.PirateRaiders.*;
import NecesseExpanded.Mobs.Raiders.RuneboundRaiders.*;
import NecesseExpanded.Mobs.Raiders.SkeletonRaiders.*;
import NecesseExpanded.Mobs.Raiders.SlimeRaiders.*;
import NecesseExpanded.Mobs.Raiders.SpiderkinRaiders.*;
import NecesseExpanded.Mobs.Raiders.ZombieRaiders.*;

import necesse.engine.registries.MobRegistry;

public class RegisterMobs 
{
    public static void Register()
    {
        System.out.println("[Necesse Expanded] Registering new mobs...");

        // Necromancer minion
        MobRegistry.registerMob("necromancer_minion", NecromancerMinion.class, false);

        // Cavelings
        MobRegistry.registerMob("crystal_caveling", CrystalCaveling.class, true);
        MobRegistry.registerMob("shard_caveling", ShardCaveling.class, true);

        // Zombie raiders
        MobRegistry.registerMob("zombie_raider", ZombieRaider.class, true);
        MobRegistry.registerMob("zombie_archer_raider", ZombieArcherRaider.class, true);

        // Runebound raiders
        MobRegistry.registerMob("runebound_boss", RuneboundBoss.class, true);
        MobRegistry.registerMob("runebound_berserker", RuneboundBerserker.class, true);
        MobRegistry.registerMob("runebound_trapper", RuneboundTrapper.class, true);
        MobRegistry.registerMob("runebound_warrior", RuneboundWarrior.class, true);

        // Pirate raiders
        MobRegistry.registerMob("pirate_brawler", PirateBrawler.class, true);
        MobRegistry.registerMob("pirate_sharpshooter", PirateSharpshooter.class, true);
        MobRegistry.registerMob("pirate_grenadier", PirateGrenadier.class, true);

        // Skeleton raiders
        MobRegistry.registerMob("skeleton_raider", SkeletonRaider.class, true);
        MobRegistry.registerMob("skeleton_summoner_raider", SkeletonSummonerRaider.class, true);

        // Ancient skeleton raiders
        MobRegistry.registerMob("ancient_skeleton_raider", AncientSkeletonRaider.class, true);
        MobRegistry.registerMob("ancient_skeleton_summoner_raider", AncientSkeletonSummonerRaider.class, true);

        // Spiderkin raiders
        MobRegistry.registerMob("spiderkin_warrior_raider", SpiderkinWarriorRaider.class, true);
        MobRegistry.registerMob("spiderkin_mage_raider", SpiderkinMageRaider.class, true);
        MobRegistry.registerMob("spiderkin_summoner_raider", SpiderkinSummonerRaider.class, true);
        MobRegistry.registerMob("spiderkin_archer_raider", SpiderkinArcherRaider.class, true);
        MobRegistry.registerMob("spiderkin_healer_raider", SpiderkinHealerRaider.class, true);

        // Slime raiders
        MobRegistry.registerMob("mage_slime_raider", SlimeMageRaider.class, true);
        MobRegistry.registerMob("warrior_slime_raider", SlimeWarriorRaider.class, true);

        // Graveyard raiders
        MobRegistry.registerMob("vampire_raider", VampireRaider.class, true);
    }
}
