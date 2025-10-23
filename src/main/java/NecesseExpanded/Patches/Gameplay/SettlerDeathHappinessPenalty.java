package NecesseExpanded.Patches.Gameplay;

import java.util.HashSet;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.entity.mobs.Attacker;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.friendly.human.HumanMob;
import necesse.level.maps.levelData.settlementData.LevelSettler;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(target = HumanMob.class, name = "onDeath", arguments = {Attacker.class, HashSet.class})
public class SettlerDeathHappinessPenalty 
{
    @OnMethodExit
    static void onExit(@This HumanMob ThisSettler)
    {
        System.out.println("TEST " + ThisSettler.getMob().getDisplayName());
        if (ThisSettler.getSettlementServerData() != null)
        {
            for (LevelSettler Settler : ThisSettler.getSettlementServerData().settlers)
            {
                System.out.println("TESTSTRING " + Settler.getMob().getSettlerName());
                Settler.getMob().getMob().buffManager.addBuff(new ActiveBuff("settler_death_penalty", Settler.getMob().getMob(), 600f, Settler.getMob().getMob()), true);
            }
        }
    }
}
