package NecesseExpanded.Items.Trinkets;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.Item;
import necesse.inventory.item.trinketItem.TrinketItem;

public class ShadowOrbTrinket extends TrinketItem
{
    public ShadowOrbTrinket() 
    {
        super(Item.Rarity.RARE, 300);
    }

    @Override
    public TrinketBuff[] getBuffs(InventoryItem item) 
    {
        return new TrinketBuff[] { (TrinketBuff)BuffRegistry.getBuff("shadow_orb_buff") };
    }
}
