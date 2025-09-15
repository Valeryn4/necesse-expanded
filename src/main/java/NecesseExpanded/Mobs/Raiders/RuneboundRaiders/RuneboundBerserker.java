package NecesseExpanded.Mobs.Raiders.RuneboundRaiders;

import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.inventory.InventoryItem;

// A powerful melee unit.
public class RuneboundBerserker extends RuneboundRaiderTemplate
{
    public RuneboundBerserker()
    {
        super();
        setSpeed(30F);
        this.setMaxHealth(150);
        this.buffManager.addBuff(new ActiveBuff("greaterattackspeedpotion", this, 720, null), true, true);

        this.setWeapon(new InventoryItem("battleaxe_special"));
        this.helmet = new InventoryItem("wig");
        this.chest = new InventoryItem("runeboundleatherchest");
    }
}
