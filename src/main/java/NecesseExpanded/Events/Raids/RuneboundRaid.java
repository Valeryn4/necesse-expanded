package NecesseExpanded.Events.Raids;

import necesse.engine.localization.Localization;
import necesse.engine.localization.message.GameMessage;
import necesse.engine.localization.message.LocalMessage;
import necesse.engine.util.GameRandom;
import necesse.entity.levelEvent.settlementRaidEvent.SettlementRaidLevelEvent;
import necesse.level.maps.levelData.settlementData.SettlementLevelData;
import necesse.level.maps.levelData.settlementData.SettlementRaidLoadout;
import necesse.level.maps.levelData.settlementData.SettlementRaidOptions;

public class RuneboundRaid extends SettlementRaidLevelEvent {
    GameRandom LocalRandom = new GameRandom();

    @Override
    public GameMessage getApproachMessage(GameMessage settlementName, boolean isFirst) {
        return (GameMessage) new LocalMessage("misc", "raidapproaching", new Object[] {
                "settlement", settlementName,
                "direction", this.direction.displayName,
                "raidtype", Localization.translate("misc", "runebound_raiders")
        });
    }

    @Override
    public GameMessage getPreparingMessage(GameMessage settlementName) {
        return (GameMessage) new LocalMessage("misc", "raidpreparing", new Object[] {
                "settlement", settlementName,
                "raidtype", Localization.translate("misc", "runebound_raiders")
        });
    }

    @Override
    public GameMessage getStartMessage(GameMessage settlementName) {
        return (GameMessage) new LocalMessage("misc", "raidattacking", new Object[] {
                "settlement", settlementName,
                "raidtype", Localization.translate("misc", "runebound_raiders")
        });
    }

    @Override
    public GameMessage getDefeatedMessage() {
        return (GameMessage) new LocalMessage("misc", "raiddefeated", "raidtype",
                Localization.translate("misc", "runebound_raiders"));
    }

    @Override
    public GameMessage getLeavingMessage() {
        return (GameMessage) new LocalMessage("misc", "raidended", "raidtype",
                Localization.translate("misc", "runebound_raiders"));
    }

    @Override
    public GameMessage getLeavingWithLootMessage() {
        return (GameMessage) new LocalMessage("misc", "raidlooting", "raidtype",
                Localization.translate("misc", "runebound_raiders"));
    }

    public RuneboundRaid() {
    }

    public RuneboundRaid(SettlementLevelData Data, SettlementRaidOptions Options) 
    {
        float Size = Data.countTotalSettlers() * NecesseExpanded.Main.SettingsGetter.getInt("raid_size_multiplier") * Options.difficultyModifier;
        for (int Raiders = 0; Raiders < Size; Raiders++)
        {
            if (Raiders == 0)
            {
                this.loadouts.add(new SettlementRaidLoadout("runebound_boss"));
            }
            else if (Raiders % 10 == 0)
            {
                this.loadouts.add(new SettlementRaidLoadout("runebound_trapper"));
            }
            else if (Raiders % 8 == 0)
            {
                this.loadouts.add(new SettlementRaidLoadout("runebound_berserker"));
            }
            else
            {
                this.loadouts.add(new SettlementRaidLoadout("runebound_warrior"));
            }
        }
    }
}
