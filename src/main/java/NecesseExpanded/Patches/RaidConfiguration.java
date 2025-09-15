package NecesseExpanded.Patches;

import NecesseExpanded.Events.*;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.util.GameRandom;
import net.bytebuddy.asm.Advice;

import necesse.level.maps.levelData.settlementData.SettlementLevelData;
import necesse.level.maps.levelData.settlementData.SettlementRaidOptions;
import necesse.entity.levelEvent.settlementRaidEvent.*;

@ModMethodPatch(target = SettlementLevelData.class, name = "getNextRaid", arguments = {SettlementRaidOptions.class})
public class RaidConfiguration
{
    @Advice.OnMethodEnter(skipOn = Advice.OnNonDefaultValue.class)
    static boolean onEnter()
    {
        return true;
    }

    @Advice.OnMethodExit()
    static void onExit(@Advice.This SettlementLevelData LevelData, @Advice.Argument(0) SettlementRaidOptions Options, @Advice.Return(readOnly = false) SettlementRaidLevelEvent Event)
    {
        // Incursion raid options
        if (LevelData.hasCompletedQuestTier("fallenwizard"))
        {
            Event = GameRandom.globalRandom.getOneOf
            (
                new SpiderkinRaid(LevelData, Options),
                new SlimeCaveRaid(LevelData, Options),
                new GraveyardRaid(LevelData, Options)
            );
        }

        // Ancient skeleton raiders
        else if (LevelData.hasCompletedQuestTier("pestwarden"))
        {
            Event = new AncientSkeletonRaid(LevelData, Options);
        }

        // Skeleton raiders
        else if (LevelData.hasCompletedQuestTier("piratecaptain"))
        {
            Event = new SkeletonRaid(LevelData, Options);
        }

        // Pirate raiders
        else if (LevelData.hasCompletedQuestTier("ancientvulture"))
        {
            Event = new PirateRaid(LevelData, Options);
        }

        // Runebound raiders
        else if (LevelData.hasCompletedQuestTier("voidwizard"))
        {
            Event = new RuneboundRaid(LevelData, Options);
        }

        // Basic zombie raid if settlement hasn't completed any quests,
        else
        {
            Event = new ZombieRaid(LevelData, Options);
        }
    }
}