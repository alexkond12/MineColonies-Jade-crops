package com.alexkond12.mcjadecrops.common.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class McJadeCropsConfig {
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.BooleanValue ENABLED;
    public static final ForgeConfigSpec.BooleanValue DEBUG_LOGGING;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        ENABLED = builder
                .comment("Enable the Jade tooltip integration for MineColonies crops.")
                .translation("config.mcjadecrops.enabled")
                .define("enabled", true);

        DEBUG_LOGGING = builder
                .comment("Log unsupported MineColonies blocks once.")
                .translation("config.mcjadecrops.debug_logging")
                .define("debugLogging", false);

        SPEC = builder.build();
    }

    private McJadeCropsConfig() {
    }
}
