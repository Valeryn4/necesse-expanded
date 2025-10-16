package NecesseExpanded.Utils.RaiderWeapons;

import necesse.inventory.item.toolItem.swordToolItem.WoodSwordToolItem;

public class RaiderFakeSword extends WoodSwordToolItem
{
    public RaiderFakeSword()
    {
        super();
        this.attackRange.setBaseValue(25);
        this.attackAnimTime.setBaseValue(100);
    }
}
