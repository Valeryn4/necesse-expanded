package NecesseExpanded.Mobs.Raiders.RuneboundRaiders;

import necesse.inventory.InventoryItem;

public class RuneboundWarrior extends RuneboundRaiderTemplate
{
    public RuneboundWarrior()
    {
        super();
        
        this.setMaxHealth(150);
        this.setSpeed(30F);
        this.setWeapon(new InventoryItem("ironsword"));
        this.helmet = new InventoryItem("runeboundhornhelmet");
        this.chest = new InventoryItem("runeboundleatherchest");
    }
}
