package com.alexkond12.mcjadecrops.common.crop;

import com.alexkond12.mcjadecrops.common.registry.MineColoniesCropRegistry;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;
import java.util.OptionalInt;

public final class CropStageResolver {
    private CropStageResolver() {
    }

    public static Optional<CropProgress> resolve(BlockState state) {
        if (!MineColoniesCropRegistry.isMineColoniesBlock(state)) {
            return Optional.empty();
        }

        OptionalInt age = MineColoniesCropRegistry.getAge(state);
        OptionalInt maxAge = MineColoniesCropRegistry.getMaxAge(state);

        if (age.isEmpty() || maxAge.isEmpty()) {
            MineColoniesCropRegistry.logUnsupportedOnce(state);
            return Optional.empty();
        }

        return Optional.of(new CropProgress(age.getAsInt(), maxAge.getAsInt()));
    }
}