package NecesseExpanded.Mobs.Raiders.PirateRaiders;

import necesse.inventory.InventoryItem;

// A ranged unit.
public class PirateSharpshooter extends PirateRaiderTemplate
{
    public PirateSharpshooter()
    {
        super();
        setSpeed(30F);
        this.setMaxHealth(350);
        this.setWeapon(new InventoryItem("flintlock"));
        this.helmet = new InventoryItem("wig");
    }
}
