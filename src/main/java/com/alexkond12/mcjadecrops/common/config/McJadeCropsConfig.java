package com.alexkond12.mcjadecrops.common.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class McJadeCropsConfig {
    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.BooleanValue ENABLED;
    public static final ModConfigSpec.BooleanValue DEBUG_LOGGING;

    static {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

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