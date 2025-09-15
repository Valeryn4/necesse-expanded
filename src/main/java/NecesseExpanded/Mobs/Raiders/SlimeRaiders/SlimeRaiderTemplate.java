package NecesseExpanded.Mobs.Raiders.SlimeRaiders;

import java.awt.Rectangle;
import necesse.engine.network.client.Client;
import necesse.engine.util.GameRandom;
import necesse.entity.mobs.hostile.ItemAttackerRaiderMob;
import necesse.gfx.gameTooltips.GameTooltips;
import necesse.gfx.gameTooltips.StringTooltips;
import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.LootTable;
import necesse.inventory.lootTable.lootItem.ChanceLootItem;
import necesse.inventory.lootTable.lootItem.LootItem;
import necesse.level.maps.LevelMap;

public class SlimeRaiderTemplate extends ItemAttackerRaiderMob {
    public SlimeRaiderTemplate() {
        super(false);
        this.setSpeed(40F);
        this.collision = new Rectangle(-10, -7, 20, 14);
        this.hitBox = new Rectangle(-14, -12, 28, 24);
        this.selectBox = new Rectangle(-15, -32, 30, 40);
        this.swimMaskMove = 10;
        this.swimMaskOffset = -2;
        this.swimSinkOffset = -8;

        SlimeRaiderTemplate.lootTable = new LootTable(
                new LootItemInterface[] {
                        (LootItemInterface) LootItem.between("coin", 30, 70),
                        (LootItemInterface) new ChanceLootItem(0.25F, "slimematter",
                                GameRandom.globalRandom.getIntBetween(1, 2))
                });
    }

    public void updateArmor() {
    }

    public boolean shouldDrawOnMap() {
        return true;
    }

    public boolean isVisibleOnMap(Client client, LevelMap map) {
        return true;
    }

    public Rectangle drawOnMapBox(double tileScale, boolean isMinimap) {
        return new Rectangle(-10, -24, 20, 24);
    }

    public GameTooltips getMapTooltips() {
    return (GameTooltips) new StringTooltips(getDisplayName() + " " + getHealth() + "/" + getMaxHealth());
  }
}
