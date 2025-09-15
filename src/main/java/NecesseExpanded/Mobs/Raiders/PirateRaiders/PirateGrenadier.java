package NecesseExpanded.Mobs.Raiders.PirateRaiders;

import necesse.inventory.InventoryItem;

// Throws explosives.
public class PirateGrenadier extends PirateRaiderTemplate
{
    public PirateGrenadier()
    {
        super();
        setSpeed(30F);
        this.setMaxHealth(350);
        this.setWeapon(new InventoryItem("handcannon"));
        this.helmet = new InventoryItem("wig");
    }
}
