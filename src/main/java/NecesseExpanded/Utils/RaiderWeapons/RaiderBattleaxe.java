package NecesseExpanded.Utils.RaiderWeapons;

import necesse.engine.network.gameNetworkData.GNDItemMap;
import necesse.entity.mobs.attackHandler.AttackHandler;
import necesse.entity.mobs.attackHandler.BrutesBattleaxeAttackHandler;
import necesse.entity.mobs.itemAttacker.ItemAttackSlot;
import necesse.entity.mobs.itemAttacker.ItemAttackerMob;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.toolItem.swordToolItem.greatswordToolItem.BrutesBattleaxeToolItem;
import necesse.level.maps.Level;

// Reimplementation of the Brute's Battleaxe for raiders, for better accuracy.
public class RaiderBattleaxe extends BrutesBattleaxeToolItem 
{
    public InventoryItem onAttack(Level level, int x, int y, ItemAttackerMob attackerMob, int attackHeight,
            InventoryItem item, ItemAttackSlot slot, int animAttack, int seed, GNDItemMap mapContent) {
        attackerMob.startAttackHandler((AttackHandler) new BrutesBattleaxeAttackHandler(attackerMob, level, item,
                this, seed, x, y, false, slot, this.chargeLevels));
        return item;
    }
}
