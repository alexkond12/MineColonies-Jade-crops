package com.alexkond12.mcjadecrops;

import com.alexkond12.mcjadecrops.common.config.McJadeCropsConfig;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(MineColoniesJadeCrops.MODID)
public final class MineColoniesJadeCrops {
    public static final String MODID = "mcjadecrops";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MineColoniesJadeCrops() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, McJadeCropsConfig.SPEC);
        LOGGER.info("Loaded {}", MODID);
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MODID, path);
    }
}
