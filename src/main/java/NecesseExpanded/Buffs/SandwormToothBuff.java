package NecesseExpanded.Buffs;

import necesse.engine.localization.Localization;
import necesse.engine.registries.BuffRegistry;
import necesse.engine.registries.DamageTypeRegistry;
import necesse.entity.mobs.MobWasHitEvent;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffEventSubscriber;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

// Melee attacks inflict slowing and poison damage for eight seconds, for 40 damage total.
public class SandwormToothBuff extends TrinketBuff
{
    public void init(ActiveBuff buff, BuffEventSubscriber eventSubscriber) 
    {}

    public void onHasAttacked(ActiveBuff buff, MobWasHitEvent event) 
    {
        if (!event.wasPrevented && event.damageType == DamageTypeRegistry.MELEE)
        {
            event.target.buffManager.addBuff(new ActiveBuff(BuffRegistry.Debuffs.WIDOW_POISON, event.target, 8.0F, event.attacker), event.target.isServer());
            event.target.buffManager.addBuff(new ActiveBuff(BuffRegistry.Debuffs.SPIDER_WEB_SLOW, event.target, 8.0F, event.attacker), event.target.isServer());
        }
    }

    public ListGameTooltips getTrinketTooltip(TrinketItem trinketItem, InventoryItem item, PlayerMob perspective) {
    ListGameTooltips tooltips = super.getTrinketTooltip(trinketItem, item, perspective);
    tooltips.add(Localization.translate("itemtooltip", "sandworm_tooth_tooltip"));
    return tooltips;
    }
}
