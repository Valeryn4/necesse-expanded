package NecesseExpanded.Events;

import necesse.engine.localization.Localization;
import necesse.engine.localization.message.GameMessage;
import necesse.engine.localization.message.LocalMessage;
import necesse.entity.levelEvent.settlementRaidEvent.SettlementRaidLevelEvent;
import necesse.level.maps.levelData.settlementData.SettlementLevelData;
import necesse.level.maps.levelData.settlementData.SettlementRaidLoadout;
import necesse.level.maps.levelData.settlementData.SettlementRaidOptions;

public class ZombieRaid extends SettlementRaidLevelEvent
{
    @Override
    public GameMessage getApproachMessage(GameMessage settlementName, boolean isFirst) {
        return (GameMessage) new LocalMessage("misc", "raidapproaching", new Object[] {
            "settlement", settlementName,
            "direction", this.direction.displayName,
            "raidtype", Localization.translate("misc", "zombie_raiders")
        });
    }
    
    @Override
    public GameMessage getPreparingMessage(GameMessage settlementName) {
        return (GameMessage) new LocalMessage("misc", "raidpreparing", new Object[] {
            "settlement", settlementName,
            "raidtype", Localization.translate("misc", "zombie_raiders")
        });
    }
    
    @Override
    public GameMessage getStartMessage(GameMessage settlementName) {
        return (GameMessage) new LocalMessage("misc", "raidattacking", new Object[] {
            "settlement", settlementName,
            "raidtype", Localization.translate("misc", "zombie_raiders")
        });
    }
    
    @Override
    public GameMessage getDefeatedMessage() {
        return (GameMessage) new LocalMessage("misc", "raiddefeated", "raidtype",
            Localization.translate("misc", "zombie_raiders"));
    }
    
    @Override
    public GameMessage getLeavingMessage() {
        return (GameMessage) new LocalMessage("misc", "raidended", "raidtype",
            Localization.translate("misc", "zombie_raiders"));
    }
    
    @Override
    public GameMessage getLeavingWithLootMessage() {
        return (GameMessage) new LocalMessage("misc", "raidlooting", "raidtype",
            Localization.translate("misc", "zombie_raiders"));
    }

    public ZombieRaid() {}

    public ZombieRaid(SettlementLevelData Data, SettlementRaidOptions Options)
    {
        float Size = Data.countTotalSettlers() * 3 * Options.difficultyModifier;
        for (int Raiders = 0; Raiders < Size; Raiders++)
        {
            if (Raiders % 2 == 0)
            {
                this.loadouts.add(new SettlementRaidLoadout("zombie_raider"));
            }
            else
            {
                this.loadouts.add(new SettlementRaidLoadout("zombie_archer_raider"));
            }
        }
    }
}
