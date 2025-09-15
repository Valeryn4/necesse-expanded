package NecesseExpanded.Registry;

import NecesseExpanded.Buffs.BloodCrystalBuff;
import NecesseExpanded.Buffs.LuckyRingBuff;
import NecesseExpanded.Buffs.NecromancerRingBuff;
import NecesseExpanded.Buffs.SandwormToothBuff;
import NecesseExpanded.Buffs.ShadowOrbBuff;
import necesse.engine.modifiers.ModifierValue;
import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.SimplePotionBuff;

public class RegisterBuffs 
{
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void Register()
    {
        System.out.println("[Necesse Expanded] Registering new buffs/debuffs...");

        BuffRegistry.registerBuff("blood_crystal_buff", new BloodCrystalBuff());
        BuffRegistry.registerBuff("shadow_orb_buff", new ShadowOrbBuff());
        BuffRegistry.registerBuff("sandworm_tooth_buff", new SandwormToothBuff());
        BuffRegistry.registerBuff("lucky_ring_buff", new LuckyRingBuff());
        BuffRegistry.registerBuff("necromancer_ring_buff", new NecromancerRingBuff());
        
        BuffRegistry.registerBuff("shadow_orb_bonus", new SimplePotionBuff(true, new ModifierValue[]{new ModifierValue(BuffModifiers.ALL_DAMAGE, 0.20F)}));
    }
}
