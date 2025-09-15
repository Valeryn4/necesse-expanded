package NecesseExpanded.Registry;

import necesse.engine.expeditions.TypesFishingTripExpedition;
import necesse.engine.registries.ExpeditionMissionRegistry;

public class RegisterExpeditions 
{
    public static void Register()
    {
        ExpeditionMissionRegistry.registerFishingTrip("demonfish_expedition", new TypesFishingTripExpedition("voidwizard", 400, 300, 400, "demonfish", new String[]{"rockfish", "terrorfish"}));
        ExpeditionMissionRegistry.registerFishingTrip("heartfish_expedition", new TypesFishingTripExpedition("reaper", 600, 500, 600, "heartfish", new String[]{"rockfish", "terrorfish", "demonfish"}));
    }
}
