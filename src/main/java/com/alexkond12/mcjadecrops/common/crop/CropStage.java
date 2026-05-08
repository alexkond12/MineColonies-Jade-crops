package com.alexkond12.mcjadecrops.common.crop;

public enum CropStage {
    GROWING("tooltip.mcjadecrops.crop.growing"),
    MATURE("tooltip.mcjadecrops.crop.mature");

    private final String translationKey;

    CropStage(String translationKey) {
        this.translationKey = translationKey;
    }

    public String translationKey() {
        return translationKey;
    }
}