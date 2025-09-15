package NecesseExpanded.Registry;

import NecesseExpanded.Items.Projectiles.RaiderBombProjectile;
import necesse.engine.registries.ProjectileRegistry;

public class RegisterProjectiles 
{
    public static void Register()
    {
        ProjectileRegistry.registerProjectile("raider_bomb_projectile", RaiderBombProjectile.class, "ironbomb", "ironbomb_shadow");
    }
}
