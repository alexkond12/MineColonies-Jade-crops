package com.alexkond12.mcjadecrops.common.crop;

import net.minecraft.util.Mth;

public record CropProgress(int age, int maxAge) {
    public boolean isMature() {
        return age >= maxAge;
    }

    public int percent() {
        if (maxAge <= 0) {
            return 0;
        }
        return Mth.clamp(Math.round(age * 100.0f / maxAge), 0, 100);
    }
}