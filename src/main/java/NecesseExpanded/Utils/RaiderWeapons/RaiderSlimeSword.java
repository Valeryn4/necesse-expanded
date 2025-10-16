package NecesseExpanded.Utils.RaiderWeapons;

import necesse.inventory.item.toolItem.swordToolItem.WoodSwordToolItem;

public class RaiderSlimeSword extends WoodSwordToolItem
{
    public RaiderSlimeSword()
    {
        super();
        this.attackRange.setBaseValue(25);
        this.attackAnimTime.setBaseValue(200);
        this.attackDamage.setBaseValue(30.0F).setUpgradedValue(1.0F, 95.0F);
    }
}
