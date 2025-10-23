package NecesseExpanded.Patches.NPCs;

import necesse.engine.modLoader.annotations.ModConstructorPatch;
import necesse.entity.mobs.friendly.human.ElderHumanMob;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModConstructorPatch(target = ElderHumanMob.class, arguments = {})
public class ElderActivityPatch 
{
  @OnMethodExit
  static void onExit(@This ElderHumanMob Mob) 
  {
      (Mob.jobTypeHandler.getPriority("crafting")).disabledBySettler = false;
      (Mob.jobTypeHandler.getPriority("forestry")).disabledBySettler = false;
      (Mob.jobTypeHandler.getPriority("farming")).disabledBySettler = false;
      (Mob.jobTypeHandler.getPriority("hauling")).disabledBySettler = false;
  }
}
