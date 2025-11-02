package NecesseExpanded.Patches.NPCs;

import java.util.ArrayList;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.network.server.ServerClient;
import necesse.entity.mobs.friendly.human.ElderHumanMob;
import necesse.entity.mobs.friendly.human.humanShop.MageHumanMob;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.Return;
import net.bytebuddy.asm.Advice.This;
import necesse.engine.localization.message.GameMessage;
import necesse.engine.localization.message.LocalMessage;

// This patch modifies the mage's message code to provide new messages based on a list.
@ModMethodPatch(target = ElderHumanMob.class, name = "getMessages", arguments = {ServerClient.class})
public class ElderTalkPatch 
{
  @OnMethodExit
  static void onExit(@This MageHumanMob Mob, @Advice.Argument(0) ServerClient Player, @Return ArrayList<GameMessage> Messages)
  {
      Messages.clear();
      if (!Player.getLevel().getWorldEntity().isNight())
      {
        Messages.add(new LocalMessage("mobmsg", "elder_daytalk_1"));
        Messages.add(new LocalMessage("mobmsg", "elder_daytalk_2"));
        Messages.add(new LocalMessage("mobmsg", "elder_daytalk_3"));
      }
      else
      {
        Messages.add(new LocalMessage("mobmsg", "elder_nighttalk_1"));
        Messages.add(new LocalMessage("mobmsg", "elder_nighttalk_2"));
        Messages.add(new LocalMessage("mobmsg", "elder_nighttalk_3"));
      }
      
  }
}
