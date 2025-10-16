package NecesseExpanded.Patches.Gameplay;

import necesse.engine.modLoader.annotations.ModConstructorPatch;
import necesse.engine.network.NetworkClient;
import necesse.entity.mobs.PlayerMob;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModConstructorPatch(target = PlayerMob.class, arguments = {long.class, NetworkClient.class})
public class PlayerMobPatch 
{
    @OnMethodExit
    static void onExit(@This PlayerMob Player) 
    {
        Player.setSpeed(60F);
        Player.setFriction(4.5f);
    }
}
