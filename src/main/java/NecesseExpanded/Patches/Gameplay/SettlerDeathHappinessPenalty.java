package NecesseExpanded.Patches.Gameplay;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.friendly.human.HumanMob;
import necesse.level.maps.levelData.settlementData.LevelSettler;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(target = HumanMob.class, name = "onDeath", arguments = {})
public class SettlerDeathHappinessPenalty 
{
    @OnMethodExit
    static void onExit(@This HumanMob ThisSettler)
    {
        if (ThisSettler.getWorldEntity() != null)
        {
            if (ThisSettler.getSettlementServerData() != null)
            {
                for (LevelSettler Settler : ThisSettler.getSettlementServerData().settlers)
                {
                    Settler.getMob().getMob().buffManager.addBuff(new ActiveBuff("settler_death_penalty", ThisSettler, 600f, ThisSettler), true);
                }
            }
        }
    }
}
