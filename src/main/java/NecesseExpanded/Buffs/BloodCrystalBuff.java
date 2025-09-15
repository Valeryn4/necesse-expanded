package NecesseExpanded.Buffs;

import necesse.engine.localization.Localization;
import necesse.entity.levelEvent.LevelEvent;
import necesse.entity.levelEvent.mobAbilityLevelEvent.MobHealthChangeEvent;
import necesse.entity.mobs.MobWasKilledEvent;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffEventSubscriber;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

// Restores 10% of your maximum health upon killing an enemy.
public class BloodCrystalBuff extends TrinketBuff
{
    public void init(ActiveBuff buff, BuffEventSubscriber eventSubscriber) 
    {}

    public void onHasKilledTarget(ActiveBuff buff, MobWasKilledEvent event) 
    {
        int TargetHealthChange = buff.owner.getMaxHealth() / 10;
        buff.owner.getLevel().entityManager.addLevelEvent((LevelEvent) new MobHealthChangeEvent(buff.owner, TargetHealthChange));
    }

    public ListGameTooltips getTrinketTooltip(TrinketItem trinketItem, InventoryItem item, PlayerMob perspective) {
    ListGameTooltips tooltips = super.getTrinketTooltip(trinketItem, item, perspective);
    tooltips.add(Localization.translate("itemtooltip", "blood_crystal_tooltip"));
    return tooltips;
    }
}
