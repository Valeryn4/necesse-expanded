package NecesseExpanded.Patches.NPCs;

import java.util.ArrayList;

import necesse.engine.modLoader.ModLoader;
import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.network.server.ServerClient;
import necesse.entity.mobs.friendly.human.ElderHumanMob;
import net.bytebuddy.asm.Advice.Argument;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.Return;
import necesse.engine.localization.message.GameMessage;
import necesse.engine.localization.message.LocalMessage;

// This patch modifies the elder's message code to provide new messages based on a list.
@ModMethodPatch(target = ElderHumanMob.class, name = "getMessages", arguments = {ServerClient.class})
public class ElderTalkPatch 
{
  // TODO: Must update to display player name itself.
  @OnMethodExit
  static void onExit(@Argument(0) ServerClient Player, @Return ArrayList<GameMessage> Messages)
  {
      Messages.clear();
      if (!Player.getLevel().getWorldEntity().isNight())
      {
        Messages.add((GameMessage)new LocalMessage("mobmsg", "elder_daytalk_1"));
        Messages.add((GameMessage)new LocalMessage("mobmsg", "elder_daytalk_2"));
        Messages.add((GameMessage)new LocalMessage("mobmsg", "elder_daytalk_3"));
      }
      else
      {
        Messages.add((GameMessage)new LocalMessage("mobmsg", "elder_nighttalk_1"));
        Messages.add((GameMessage)new LocalMessage("mobmsg", "elder_nighttalk_2"));
        Messages.add((GameMessage)new LocalMessage("mobmsg", "elder_nighttalk_3"));
      }

      for (int x = 0; x < ModLoader.getEnabledMods().size(); x++)
      {
        if (ModLoader.getEnabledMods().get(x).id == "aphoreateam.aphoreamod")
        {
          Messages.add((GameMessage)new LocalMessage("mobmsg", "elder_aphorea_mod"));
        }
        else if (ModLoader.getEnabledMods().get(x).id == "devs.scorchedbiome")
        {
          Messages.add((GameMessage)new LocalMessage("mobmsg", "elder_scorched_mod"));
        }
      }
      
  }
}
