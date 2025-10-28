package NecesseExpanded.Registry;

import NecesseExpanded.World.Levels.FishianDungeonLevel;
import necesse.engine.registries.LevelRegistry;

public class RegisterLevels 
{
    public static void Register()
    {
        LevelRegistry.registerLevel("fishian_dungeon", FishianDungeonLevel.class);
    }
}
