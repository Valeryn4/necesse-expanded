package NecesseExpanded.Buffs;

import necesse.engine.localization.Localization;
import necesse.entity.mobs.MobWasKilledEvent;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffEventSubscriber;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.entity.mobs.hostile.SandwormBody;
import necesse.entity.mobs.hostile.SandwormTail;
import necesse.entity.mobs.hostile.SlimeWormBody;
import necesse.entity.pickup.ItemPickupEntity;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

// After killing a non-boss enemy, they'll drop 10% of their maximum health in coins.
public class LuckyRingBuff extends TrinketBuff
{
    public void init(ActiveBuff buff, BuffEventSubscriber eventSubscriber) 
    {}

    public void onHasKilledTarget(ActiveBuff buff, MobWasKilledEvent event) 
    {
        if 
        (
            !event.target.isBoss() 
            && event.target.getClass() != SandwormBody.class 
            && event.target.getClass() != SandwormTail.class
            && event.target.getClass() != SlimeWormBody.class
        )
        {
            InventoryItem Treasure = new InventoryItem("coin", event.target.getMaxHealth() / 10);
            ItemPickupEntity TreasureEntity = Treasure.getPickupEntity(event.target.getLevel(), event.target.x, event.target.y);
            event.target.getLevel().entityManager.pickups.add(TreasureEntity);
        }
    }

    public ListGameTooltips getTrinketTooltip(TrinketItem trinketItem, InventoryItem item, PlayerMob perspective) {
    ListGameTooltips tooltips = super.getTrinketTooltip(trinketItem, item, perspective);
    tooltips.add(Localization.translate("itemtooltip", "lucky_ring_tip"));
    return tooltips;
  }
}
