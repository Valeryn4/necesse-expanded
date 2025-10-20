package NecesseExpanded.Patches.Biomes;

import java.util.concurrent.atomic.AtomicInteger;
import java.awt.Point;
import java.awt.Rectangle;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.registries.ObjectRegistry;
import necesse.engine.registries.TileRegistry;
import necesse.inventory.lootTable.LootTablePresets;
import necesse.level.maps.biomes.plains.PlainsDeepCaveLevel;
import necesse.level.maps.generationModules.CaveGeneration;
import necesse.level.maps.generationModules.GenerationTools;
import necesse.level.maps.generationModules.LinesGeneration;
import necesse.level.maps.generationModules.PresetGeneration;
import necesse.level.maps.presets.Preset;
import necesse.level.maps.presets.RandomCaveChestRoom;
import necesse.level.maps.presets.TheCursedCroneArenaPreset;
import necesse.level.maps.presets.caveRooms.CaveRuins;
import necesse.level.maps.presets.modularPresets.runeboundTombPresets.RuneboundTombPreset;
import necesse.level.maps.presets.set.ChestRoomSet;
import necesse.level.maps.presets.set.FurnitureSet;
import necesse.level.maps.presets.set.WallSet;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.Advice.OnMethodEnter;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(arguments = {}, name = "generateLevel", target = PlainsDeepCaveLevel.class)
public class DeepPlainsBiomePatch 
{
    @SuppressWarnings("static-access")
    @OnMethodEnter(skipOn = Advice.OnNonDefaultValue.class)
    public static boolean onEnter(@This PlainsDeepCaveLevel Biome) 
    {
        System.out.println("[Necesse Expanded] Generating modified plains deep cave biome...");
        int deepRockTile = TileRegistry.getTileID("basaltrocktile");
        CaveGeneration cg = new CaveGeneration(Biome, "basaltrocktile", "basaltrock");
        cg.generateLevel(0.39F, 4, 3, 6);
        Point ArenaCentre = Biome.getArenaCenterTile(Biome);

        GenerationTools.generateRandomObjectVeinsOnTile
        (
            Biome, 
            cg.random, 
            0.2F, 
            4, 
            8, 
            deepRockTile,
            ObjectRegistry.getObjectID("wildcaveglow"), 
            0.2F, 
            false
        );

        GenerationTools.generateRandomSmoothTileVeins
        (
            Biome, 
            cg.random, 
            0.07F, 
            2, 3.0F, 
            9.0F, 
            3.0F, 
            6.0F,
            TileRegistry.getTileID("spiritwatertile"), 
            0.25F, 
            true
        );

        LinesGeneration lg = new LinesGeneration(ArenaCentre.x, ArenaCentre.y, 15.0F);
        int[] riverAngles = new int[] { 45, cg.random.getChance(0.5F) ? -1 : 45, 135,
                cg.random.getChance(0.5F) ? -1 : 135, 225, cg.random.getChance(0.5F) ? -1 : 225, 270,
                cg.random.getChance(0.5F) ? -1 : 270, 315, cg.random.getChance(0.5F) ? -1 : 315 };
        int[] var7 = riverAngles;
        int waterGrassID = riverAngles.length;
        int waterLanternID;
        for (waterLanternID = 0; waterLanternID < waterGrassID; ++waterLanternID) {
            int angle = var7[waterLanternID];
            if (angle != -1) {
                lg.addMultiArm(cg.random, angle, 20, Math.max(Biome.tileWidth, Biome.tileHeight), 5.0F, 10.0F, 4.0F,
                        6.0F, (armLG) -> {
                            return armLG.x2 < 0 || armLG.x2 > Biome.tileWidth || armLG.y2 < 0
                                    || armLG.y2 > Biome.tileHeight;
                        });
            }
        }

        // CellAutomaton ca = lg.doCellularAutomaton(cg.random);
        /* waterGrassID = ObjectRegistry.getObjectID("watergrass");
        waterLanternID = ObjectRegistry.getObjectID("waterlantern");
        ca.forEachTile(Biome, (level, tileX, tileY) -> {
            level.setTile(tileX, tileY, TileRegistry.spiritWaterID);
            if (cg.random.getChance(0.1F)) {
                level.setObject(tileX, tileY, waterGrassID);
            } else if (cg.random.getChance(0.02F)) {
                level.setObject(tileX, tileY, waterLanternID);
            }
        }); */

        Biome.liquidManager.calculateShores();

        cg.generateRandomSingleRocks(ObjectRegistry.getObjectID("basaltcaverock"), 0.005F);
        cg.generateRandomSingleRocks(ObjectRegistry.getObjectID("basaltcaverocksmall"), 0.01F);
        cg.generateRandomSingleRocks(ObjectRegistry.getObjectID("dryadtree"), 0.02F);
        cg.generateRandomSingleRocks(ObjectRegistry.getObjectID("cavebirchtree"), 0.02F);
        cg.generateRandomSingleRocks(ObjectRegistry.getObjectID("cavemapletree"), 0.02F);
        cg.generateRandomSingleRocks(ObjectRegistry.getObjectID("topazclustersmall"), 0.005F);
        cg.generateRandomSingleRocks(ObjectRegistry.getObjectID("topazcluster"), 0.002F);
        cg.generateRandomSingleRocks(ObjectRegistry.getObjectID("emeraldclustersmall"), 0.005F);
        cg.generateRandomSingleRocks(ObjectRegistry.getObjectID("emeraldclusterpure"), 0.002F);

        cg.generateOreVeins(0.05F, 3, 6, ObjectRegistry.getObjectID("copperorebasaltrock"));
        cg.generateOreVeins(0.25F, 3, 6, ObjectRegistry.getObjectID("ironorebasaltrock"));
        cg.generateOreVeins(0.15F, 3, 6, ObjectRegistry.getObjectID("goldorebasaltrock"));
        cg.generateOreVeins(0.2F, 3, 6, ObjectRegistry.getObjectID("tungstenorebasaltrock"));
        cg.generateOreVeins(0.05F, 3, 6, ObjectRegistry.getObjectID("lifequartzbasaltrock"));
        cg.generateOreVeins(0.15F, 3, 6, ObjectRegistry.getObjectID("amberbasaltrock"));
        
        PresetGeneration presets = new PresetGeneration(Biome);
        presets.addOccupiedSpace(new Rectangle(ArenaCentre.x - 15, ArenaCentre.y - 15, 30, 30));
        AtomicInteger chestRoomRotation = new AtomicInteger();
        int chestRoomAmount = cg.random.getIntBetween(13, 18);

        for (int i = 0; i < chestRoomAmount; ++i) 
        {
            Preset chestRoom = new RandomCaveChestRoom
            (
                cg.random, 
                LootTablePresets.deepPlainsCaveChest,
                chestRoomRotation, 
                new ChestRoomSet[] { ChestRoomSet.basalt });
                chestRoom.replaceTile
                (
                    TileRegistry.basaltFloorID, 
                    (Integer) cg.random.getOneOf
                    (
                        new Integer[] 
                        { 
                            TileRegistry.basaltFloorID, TileRegistry.basaltPathID 
                        }
                    )
                );
                presets.findRandomValidPositionAndApply(cg.random, 5, chestRoom, 10, true, true);
            }

            AtomicInteger caveRuinsRotation = new AtomicInteger();
            int caveRuinsCount = cg.random.getIntBetween(25, 35);

            for (int ix = 0; ix < caveRuinsCount; ++ix) 
            {
                WallSet wallSet = WallSet.basalt;
                FurnitureSet furnitureSet = (FurnitureSet) cg.random
                        .getOneOf(new FurnitureSet[] { FurnitureSet.birch, FurnitureSet.maple });
                String floorStringID = (String) cg.random.getOneOf(new String[] { "basaltfloor", "basaltpath" });
                Preset room = ((CaveRuins.CaveRuinGetter) cg.random.getOneOf(CaveRuins.caveRuinGetters)).get(cg.random,
                        wallSet, furnitureSet, floorStringID, LootTablePresets.plainsDeepCaveRuinsChest,
                        caveRuinsRotation);
                presets.findRandomValidPositionAndApply(cg.random, 5, room, 10, true, true);
            }

        cg.generateRandomCrates(0.03F, new int[] { ObjectRegistry.getObjectID("crate") });
        
        RuneboundTombPreset.generateRuneboundTombOnLevel(Biome, cg.random, presets);
        (new TheCursedCroneArenaPreset()).applyToLevelCentered(Biome, ArenaCentre.x, ArenaCentre.y);
        GenerationTools.checkValid(Biome);
        return true;
    }
}
