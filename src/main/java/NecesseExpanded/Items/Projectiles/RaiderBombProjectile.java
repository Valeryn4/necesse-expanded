package NecesseExpanded.Items.Projectiles;

import necesse.entity.levelEvent.explosionEvent.BombExplosionEvent;
import necesse.entity.levelEvent.explosionEvent.ExplosionEvent;
import necesse.entity.mobs.GameDamage;
import necesse.entity.mobs.Mob;
import necesse.entity.projectile.IronBombProjectile;

public class RaiderBombProjectile extends IronBombProjectile
{
    public RaiderBombProjectile(float x, float y, float targetX, float targetY, int speed, int distance, GameDamage damage, Mob owner) {
      super(x, y, targetX, targetY, speed, distance, damage, owner);
   }

    public ExplosionEvent getExplosionEvent(float x, float y) {
      float toolTier = Math.max(1.0F, this.getOwnerToolTier());
      return new BombExplosionEvent(x, y, 140, new GameDamage(200.0F, 1000.0F), false, toolTier, this.getOwner());
   }
}
