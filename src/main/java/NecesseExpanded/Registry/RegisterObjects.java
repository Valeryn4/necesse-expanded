package NecesseExpanded.Registry;

import NecesseExpanded.Objects.*;
import necesse.engine.registries.ObjectRegistry;

public class RegisterObjects 
{
    public static void Register()
    {
        System.out.println("[Necesse Expanded] Registering new objects...");
        ObjectRegistry.registerObject("keg", new Keg(), 10, true);

        
    }
}
