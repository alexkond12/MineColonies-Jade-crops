package com.alexkond12.mcjadecrops.common.registry;

import com.alexkond12.mcjadecrops.MineColoniesJadeCrops;
import com.alexkond12.mcjadecrops.common.config.McJadeCropsConfig;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import org.slf4j.Logger;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class MineColoniesCropRegistry {
    private static final String NAMESPACE = "minecolonies";
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final Set<ResourceLocation> LOGGED_UNSUPPORTED = ConcurrentHashMap.newKeySet();

    private MineColoniesCropRegistry() {
    }

    public static boolean isMineColoniesBlock(BlockState state) {
        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(state.getBlock());
        return NAMESPACE.equals(id.getNamespace());
    }

    public static Optional<IntegerProperty> findAgeProperty(BlockState state) {
        for (Property<?> property : state.getProperties()) {
            if ("age".equals(property.getName()) && property instanceof IntegerProperty ageProperty) {
                return Optional.of(ageProperty);
            }
        }
        return Optional.empty();
    }

    public static OptionalInt getAge(BlockState state) {
        return findAgeProperty(state).map(property -> OptionalInt.of(state.getValue(property))).orElseGet(OptionalInt::empty);
    }

    public static OptionalInt getMaxAge(BlockState state) {
        return findAgeProperty(state)
                .map(property -> OptionalInt.of(property.getPossibleValues().stream().mapToInt(Integer::intValue).max().orElse(0)))
                .orElseGet(OptionalInt::empty);
    }

    public static void logUnsupportedOnce(BlockState state) {
        if (!McJadeCropsConfig.DEBUG_LOGGING.get()) {
            return;
        }

        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(state.getBlock());
        if (!NAMESPACE.equals(id.getNamespace())) {
            return;
        }

        if (LOGGED_UNSUPPORTED.add(id)) {
            LOGGER.warn("MineColonies block does not expose an age property: {}", id);
        }
    }
}