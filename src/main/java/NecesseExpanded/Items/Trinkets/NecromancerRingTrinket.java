package NecesseExpanded.Items.Trinkets;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.Item;
import necesse.inventory.item.trinketItem.TrinketItem;

public class NecromancerRingTrinket extends TrinketItem
{
    public NecromancerRingTrinket() 
    {
        super(Item.Rarity.LEGENDARY, 300);
    }

    @Override
    public TrinketBuff[] getBuffs(InventoryItem item) 
    {
        return new TrinketBuff[] { (TrinketBuff)BuffRegistry.getBuff("necromancer_ring_buff") };
    }
}
