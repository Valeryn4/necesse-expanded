package NecesseExpanded.Events;

import necesse.engine.localization.Localization;
import necesse.engine.localization.message.GameMessage;
import necesse.engine.localization.message.LocalMessage;
import necesse.engine.util.GameRandom;
import necesse.entity.levelEvent.settlementRaidEvent.SettlementRaidLevelEvent;
import necesse.level.maps.levelData.settlementData.SettlementLevelData;
import necesse.level.maps.levelData.settlementData.SettlementRaidLoadout;
import necesse.level.maps.levelData.settlementData.SettlementRaidOptions;

public class SkeletonRaid extends SettlementRaidLevelEvent {
    GameRandom LocalRandom = new GameRandom();

    @Override
    public GameMessage getApproachMessage(GameMessage settlementName, boolean isFirst) {
        return (GameMessage) new LocalMessage("misc", "raidapproaching", new Object[] {
                "settlement", settlementName,
                "direction", this.direction.displayName,
                "raidtype", Localization.translate("misc", "skeleton_raiders")
        });
    }

    @Override
    public GameMessage getPreparingMessage(GameMessage settlementName) {
        return (GameMessage) new LocalMessage("misc", "raidpreparing", new Object[] {
                "settlement", settlementName,
                "raidtype", Localization.translate("misc", "skeleton_raiders")
        });
    }

    @Override
    public GameMessage getStartMessage(GameMessage settlementName) {
        return (GameMessage) new LocalMessage("misc", "raidattacking", new Object[] {
                "settlement", settlementName,
                "raidtype", Localization.translate("misc", "skeleton_raiders")
        });
    }

    @Override
    public GameMessage getDefeatedMessage() {
        return (GameMessage) new LocalMessage("misc", "raiddefeated", "raidtype",
                Localization.translate("misc", "skeleton_raiders"));
    }

    @Override
    public GameMessage getLeavingMessage() {
        return (GameMessage) new LocalMessage("misc", "raidended", "raidtype",
                Localization.translate("misc", "skeleton_raiders"));
    }

    @Override
    public GameMessage getLeavingWithLootMessage() {
        return (GameMessage) new LocalMessage("misc", "raidlooting", "raidtype",
                Localization.translate("misc", "skeleton_raiders"));
    }

    public SkeletonRaid() {
    }

    public SkeletonRaid(SettlementLevelData Data, SettlementRaidOptions Options) 
    {
        float Size = Data.countTotalSettlers() * 3 * Options.difficultyModifier;
        for (int Raiders = 0; Raiders < Size; Raiders++)
        {
            if (Raiders % 8 == 0)
            {
                this.loadouts.add(new SettlementRaidLoadout("skeleton_summoner_raider"));
            }
            else
            {
                this.loadouts.add(new SettlementRaidLoadout("skeleton_raider"));
            }
        }
    }
}
