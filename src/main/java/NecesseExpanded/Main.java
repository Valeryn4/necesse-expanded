package NecesseExpanded;

import NecesseExpanded.Patches.*;
import NecesseExpanded.Registry.*;

import necesse.engine.modLoader.annotations.ModEntry;

@ModEntry
public class Main 
{ 
    public void init() 
    {
        RegisterItems.Register();
        RegisterFood.Register();
        RegisterMobs.Register();
        RegisterObjects.Register();
        RegisterRecipes.Register();
        RegisterEvents.Register();
        RegisterBuffs.Register();
        RegisterProjectiles.Register();

        SettlerHappiness.Update();
        UpdateLootTables.Update();
        ConfigureBiomes.Configure();
    } 
}
