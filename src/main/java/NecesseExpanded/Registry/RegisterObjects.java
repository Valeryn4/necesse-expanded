package NecesseExpanded.Registry;

import java.awt.Color;

import NecesseExpanded.Objects.*;
import necesse.engine.registries.ObjectRegistry;
import necesse.level.gameObject.CrystalClusterObject;
import necesse.level.gameObject.CrystalClusterSmallObject;
import necesse.level.gameObject.WallArrowTrapObject;
import necesse.level.gameObject.WallFlameTrapObject;
import necesse.level.gameObject.WallObject;
import necesse.level.gameObject.WallSawTrapObject;
import necesse.level.gameObject.WallVoidTrapObject;

public class RegisterObjects 
{
    public static void Register()
    {
        System.out.println("[Necesse Expanded] Registering new objects...");
        ObjectRegistry.registerObject("keg", new Keg(), 10, true);

        String[] crystalsCategory = new String[]{"objects", "landscaping", "crystals"};

        CrystalClusterObject.registerCrystalCluster("frostshard_cluster", new Color(82, 150, 255), 240.0F, "frostshard", 3, 4, 3, 15f, true, crystalsCategory);
        CrystalClusterObject.registerCrystalCluster("frostshard_cluster_pure", new Color(82, 150, 255), 240.0F, "frostshard", 3, 4, 3, 15f, true, crystalsCategory);
        ObjectRegistry.registerObject("frostshard_cluster_small", new CrystalClusterSmallObject("frostshard_cluster_small", new Color(82, 150, 255), 240.0F, "frostshard", 1, 2, 1, crystalsCategory), 5f, true);

        CrystalClusterObject.registerCrystalCluster("life_quartz_cluster", new Color(255, 100, 100), 0F, "lifequartz", 3, 4, 3, 15f, true, crystalsCategory);
        CrystalClusterObject.registerCrystalCluster("life_quartz_cluster_pure", new Color(255, 100, 100), 0F, "lifequartz", 3, 4, 3, 15f, true, crystalsCategory);
        ObjectRegistry.registerObject("life_quartz_cluster_small", new CrystalClusterSmallObject("life_quartz_cluster_small", new Color(255, 100, 100), 0F, "lifequartz", 1, 2, 1, crystalsCategory), 5f, true);

        int[] FishWallIDs = WallObject.registerWallObjects("fishian_", "fishian_wall", 3.0F, new Color(0, 62, 81), 0.5F, 1.0F);
        WallObject FishWall = (WallObject)ObjectRegistry.getObject(FishWallIDs[0]);
        ObjectRegistry.registerObject("fishian_flametrap", new WallFlameTrapObject(FishWall), 50.0F, true);
        ObjectRegistry.registerObject("fishian_arrowtrap", new WallArrowTrapObject(FishWall), 50.0F, true);
        ObjectRegistry.registerObject("fishian_voidtrap", new WallVoidTrapObject(FishWall), 50.0F, true);
        ObjectRegistry.registerObject("fishian_sawtrap", new WallSawTrapObject(FishWall), 50.0F, false, true, true);
    }
}
