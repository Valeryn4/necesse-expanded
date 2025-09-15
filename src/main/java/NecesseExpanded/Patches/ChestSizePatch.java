package NecesseExpanded.Patches;

import java.awt.Color;
import java.awt.Rectangle;
import necesse.engine.modLoader.annotations.ModConstructorPatch;
import necesse.inventory.item.toolItem.ToolType;
import necesse.level.gameObject.furniture.InventoryObject;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModConstructorPatch(target = InventoryObject.class, arguments = {String.class, int.class, Rectangle.class, ToolType.class, Color.class})
public class ChestSizePatch 
{
  @OnMethodExit
  static void onExit(@This InventoryObject inventoryObject) {
    inventoryObject.slots = 60;
  }
}
