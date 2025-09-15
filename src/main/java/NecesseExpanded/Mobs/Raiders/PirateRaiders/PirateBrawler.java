package NecesseExpanded.Mobs.Raiders.PirateRaiders;

import necesse.inventory.InventoryItem;

// A powerful melee unit.
public class PirateBrawler extends PirateRaiderTemplate
{
    public PirateBrawler()
    {
        super();
        setSpeed(30F);
        this.setMaxHealth(350);
        this.setWeapon(new InventoryItem("cutlass"));
        this.helmet = new InventoryItem("wig");
    }
}
