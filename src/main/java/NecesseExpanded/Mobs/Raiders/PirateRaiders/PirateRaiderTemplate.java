package NecesseExpanded.Mobs.Raiders.PirateRaiders;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;

import necesse.engine.gameLoop.tickManager.TickManager;
import necesse.engine.network.client.Client;
import necesse.engine.registries.MobRegistry;
import necesse.engine.util.GameRandom;
import necesse.entity.mobs.MaskShaderOptions;
import necesse.entity.mobs.Mob;
import necesse.entity.mobs.MobDrawable;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.mobs.hostile.ItemAttackerRaiderMob;
import necesse.entity.particle.FleshParticle;
import necesse.entity.particle.Particle.GType;
import necesse.gfx.GameSkin;
import necesse.gfx.HumanLook;
import necesse.gfx.camera.GameCamera;
import necesse.gfx.drawOptions.DrawOptions;
import necesse.gfx.drawOptions.human.HumanDrawOptions;
import necesse.gfx.drawOptions.texture.TextureDrawOptionsEnd;
import necesse.gfx.drawables.OrderableDrawables;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.armorItem.cosmetics.misc.ShirtArmorItem;
import necesse.inventory.item.armorItem.cosmetics.misc.ShoesArmorItem;
import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.LootTable;
import necesse.inventory.lootTable.LootTablePresets;
import necesse.inventory.lootTable.lootItem.ChanceLootItem;
import necesse.inventory.lootTable.lootItem.ChanceLootItemList;
import necesse.inventory.lootTable.lootItem.LootItem;
import necesse.level.maps.Level;
import necesse.level.maps.LevelMap;
import necesse.level.maps.light.GameLight;

public class PirateRaiderTemplate extends ItemAttackerRaiderMob {
    HumanLook Look = new HumanLook();
    
    public PirateRaiderTemplate() {
        super(false);
        this.setSpeed(30F);
        this.setArmor(10);
        this.collision = new Rectangle(-10, -7, 20, 14);
        this.hitBox = new Rectangle(-14, -12, 28, 24);
        this.selectBox = new Rectangle(-14, -41, 28, 48);
        this.swimMaskMove = 16;
        this.swimMaskOffset = -2;
        this.swimSinkOffset = -4;
        this.weapon = new InventoryItem("ironaxe");
        PirateRaiderTemplate.lootTable = new LootTable
        (
            new LootItemInterface[] 
            { 
                (LootItemInterface)LootItem.between("coin", getMaxHealth() / 30, getMaxHealth() / 20),
                (LootItemInterface)new ChanceLootItemList
                (
                    0.05F,
                    LootTablePresets.pirateDisplayStand
                ),
                (LootItemInterface) new ChanceLootItem(0.5F, "rum"),
                (LootItemInterface) new ChanceLootItem(0.05f, weapon.item.getStringID())
            }
        );
        this.helmet = new InventoryItem("wig");
        this.chest = new InventoryItem("pirateshirt");
        this.boots = new InventoryItem("pirateboots");
    }

    public void spawnDeathParticles(float knockbackX, float knockbackY) {
      GameSkin gameSkin = this.Look.getGameSkin(true);

      for(int i = 0; i < 4; ++i) {
         this.getLevel().entityManager.addParticle(new FleshParticle(this.getLevel(), gameSkin.getBodyTexture(), GameRandom.globalRandom.nextInt(5), 8, 32, this.x, this.y, 10.0F, knockbackX, knockbackY), GType.IMPORTANT_COSMETIC);
      }

   }

    public void updateAIAndLook() {
        super.updateAIAndLook();
        this.Look.randomizeLook(new GameRandom(), false);
    }

    public void updateArmor() {}

    public void addDrawables(List<MobDrawable> list, OrderableDrawables tileList, OrderableDrawables topList,
            Level level, int x, int y, TickManager tickManager, GameCamera camera, PlayerMob perspective) {
        super.addDrawables(list, tileList, topList, level, x, y, tickManager, camera, perspective);
        GameLight light = level.getLightLevel(x / 32, y / 32);
        int drawX = camera.getDrawX(x) - 22 - 10;
        int drawY = camera.getDrawY(y) - 44 - 7;
        int dir = getDir();
        Point sprite = getAnimSprite(x, y, dir);
        boolean inLiquid = inLiquid(x, y);
        if (inLiquid)
            sprite.x = 0;
        drawY += getBobbing(x, y);
        drawY += getLevel().getTile(x / 32, y / 32).getMobSinkingAmount((Mob) this);
        MaskShaderOptions swimMask = getSwimMaskShaderOptions(inLiquidFloat(x, y));
        HumanDrawOptions humanOptions = (new HumanDrawOptions(level, this.Look, false)).sprite(sprite).mask(swimMask)
                .dir(dir).light(light);
        if (inLiquid) {
            humanOptions.armSprite(2);
            humanOptions.mask(MobRegistry.Textures.boat_mask[sprite.y % 4], 0, -7);
        }
        if (this.helmet != null) {
            humanOptions.helmet(this.helmet);
        }
        if (this.chest != null) {
            humanOptions.chestplate(this.chest);
        } else {
            humanOptions.chestplate(ShirtArmorItem.addColorData(new InventoryItem("shirt"), this.Look.getShirtColor()));
        }
        if (this.boots != null) {
            humanOptions.boots(this.boots);
        } else {
            humanOptions.boots(ShoesArmorItem.addColorData(new InventoryItem("shoes"), this.Look.getShoesColor()));
        }
        setupAttackDraw(humanOptions);
        final DrawOptions drawOptions = humanOptions.pos(drawX, drawY);
        final TextureDrawOptionsEnd boat = inLiquid
                ? MobRegistry.Textures.woodBoat.initDraw().sprite(0, sprite.y, 64).light(light).pos(drawX,
                        drawY + 7)
                : null;
        list.add(new MobDrawable() {
            public void draw(TickManager tickManager) {
                if (boat != null)
                    boat.draw();
                drawOptions.draw();
            }
        });
        addShadowDrawables(tileList, x, y, light, camera);
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

   public void drawOnMap(TickManager tickManager, Client client, int x, int y, double tileScale, Rectangle drawBounds, boolean isMinimap) {
      int dir = this.getDir();
      Point sprite = this.getAnimSprite(this.getDrawX(), this.getDrawY(), dir);
      HumanDrawOptions humanOptions = (new HumanDrawOptions(this.getLevel(), this.Look, true)).sprite(sprite).dir(dir).size(32, 32);
      if (this.helmet != null) {
         humanOptions.helmet(this.helmet);
      }

      if (this.chest != null) {
         humanOptions.chestplate(this.chest);
      } else {
         humanOptions.chestplate(ShirtArmorItem.addColorData(new InventoryItem("shirt"), this.Look.getShirtColor()));
      }

      if (this.boots != null) {
         humanOptions.boots(this.boots);
      } else {
         humanOptions.boots(ShoesArmorItem.addColorData(new InventoryItem("shoes"), this.Look.getShoesColor()));
      }

      humanOptions.pos(x - 15, y - 26).draw();
   }
}
