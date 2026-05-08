package com.alexkond12.mcjadecrops.client.jade;

import com.alexkond12.mcjadecrops.MineColoniesJadeCrops;
import com.alexkond12.mcjadecrops.common.config.McJadeCropsConfig;
import com.alexkond12.mcjadecrops.common.crop.CropProgress;
import com.alexkond12.mcjadecrops.common.crop.CropStageResolver;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

public enum JadeCropComponentProvider implements IBlockComponentProvider {
    INSTANCE;

    @Override
    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
        if (!McJadeCropsConfig.ENABLED.get()) {
            return;
        }

        BlockState state = accessor.getBlockState();
        if (state == null) {
            return;
        }

        CropStageResolver.resolve(state).ifPresent(progress -> tooltip.add(buildLine(progress)));
    }

    private Component buildLine(CropProgress progress) {
        Component label = Component.translatable("tooltip.mcjadecrops.crop.growth")
                .withStyle(ChatFormatting.GRAY);

        Component value = progress.isMature()
                ? Component.translatable("tooltip.mcjadecrops.crop.mature").withStyle(ChatFormatting.GREEN)
                : Component.literal(progress.percent() + "%").withStyle(ChatFormatting.WHITE);

        return Component.empty()
                .append(label)
                .append(Component.literal(": ").withStyle(ChatFormatting.GRAY))
                .append(value);
    }

    @Override
    public ResourceLocation getUid() {
        return MineColoniesJadeCrops.id("crop_stage");
    }
}