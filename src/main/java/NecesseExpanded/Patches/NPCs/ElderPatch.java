package NecesseExpanded.Patches.NPCs;

import necesse.engine.modLoader.annotations.ModConstructorPatch;
import necesse.engine.util.GameRandom;
import necesse.entity.mobs.friendly.human.ElderHumanMob;
import necesse.entity.mobs.friendly.human.humanShop.SellingShopItem;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.miscItem.GatewayTabletItem;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModConstructorPatch(target = ElderHumanMob.class, arguments = {})
public class ElderPatch 
{
  @OnMethodExit
  static void onExit(@This ElderHumanMob Mob) 
  {
      (Mob.jobTypeHandler.getPriority("crafting")).disabledBySettler = false;
      (Mob.jobTypeHandler.getPriority("forestry")).disabledBySettler = false;
      (Mob.jobTypeHandler.getPriority("farming")).disabledBySettler = false;
      (Mob.jobTypeHandler.getPriority("hauling")).disabledBySettler = false;
      InventoryItem Tablet = new InventoryItem("gatewaytablet");
      GatewayTabletItem.initializeGatewayTablet(Tablet, new GameRandom(), 1);
      InventoryItem Tablet2 = new InventoryItem("gatewaytablet");
      GatewayTabletItem.initializeGatewayTablet(Tablet2, new GameRandom(), 2);
      InventoryItem Tablet3 = new InventoryItem("gatewaytablet");
      GatewayTabletItem.initializeGatewayTablet(Tablet3, new GameRandom(), 3);
      Mob.shop.sellingShop.addItem("tablet1", new SellingShopItem(1, 1).setItem(Tablet)).setRandomPrice(1500, 1500).addKilledMobRequirement("fallenwizard");
      Mob.shop.sellingShop.addItem("tablet2", new SellingShopItem(1, 1).setItem(Tablet2)).setRandomPrice(2000, 2000).addKilledAllMobsRequirement("spiderempress", "nightswarm", "motherslime");
      Mob.shop.sellingShop.addItem("tablet3", new SellingShopItem(1, 1).setItem(Tablet3)).setRandomPrice(2500, 2500).addKilledAllMobsRequirement("sunchampion", "moondancer");
  }
}
