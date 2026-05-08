package com.alexkond12.mcjadecrops;

import com.alexkond12.mcjadecrops.common.config.McJadeCropsConfig;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(MineColoniesJadeCrops.MODID)
public final class MineColoniesJadeCrops {
    public static final String MODID = "mcjadecrops";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MineColoniesJadeCrops(ModContainer container) {
        container.registerConfig(net.neoforged.fml.config.ModConfig.Type.COMMON, McJadeCropsConfig.SPEC);
        LOGGER.info("Loaded {}", MODID);
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}