package NecesseExpanded.Registry;

import necesse.engine.registries.TileRegistry;
import necesse.level.gameTile.SimpleFloorTile;
import java.awt.Color;

public class RegisterTiles 
{
    public static void Register()
    {
        TileRegistry.registerTile("fishian_tile", new SimpleFloorTile("fishian_tile", new Color(0, 52, 91)), 2f, true);
    }
}
