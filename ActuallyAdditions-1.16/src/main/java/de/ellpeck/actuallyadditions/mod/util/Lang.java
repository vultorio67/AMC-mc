package de.ellpeck.actuallyadditions.mod.util;

import de.ellpeck.actuallyadditions.mod.ActuallyAdditions;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fml.ForgeI18n;

import java.text.NumberFormat;

public class Lang {
    public static TranslationTextComponent trans(String prefix, String suffix, Object... args) {
        return new TranslationTextComponent(String.format("%s.%s.%s", prefix, ActuallyAdditions.MODID, suffix));
    }

    public static String transI18n(String prefix, String suffix, Object... args) {
        return ForgeI18n.parseFormat(String.format("%s.%s.%s", prefix, ActuallyAdditions.MODID, suffix), args);
    }

    /**
     * Cleans up any values into either a short variant {1M / 1M} or a long variant
     * like {1,000,000 / 1,000,000}
     *
     * @return a cleaned and formatting version of any energy values.
     */
    public static String cleanEnergyValues(int energy, int maxEnergy, boolean small) {
        String cleanEnergy, cleanMaxEnergy;

        if (small) {
            cleanEnergy = humanReadableValue(energy);
            cleanMaxEnergy = humanReadableValue(maxEnergy);
        } else {
            NumberFormat format = NumberFormat.getInstance();
            cleanEnergy = format.format(energy);
            cleanMaxEnergy = format.format(maxEnergy);
        }

        return String.format("%s / %s", cleanEnergy, cleanMaxEnergy);
    }

    public static String cleanEnergyValues(IEnergyStorage energy, boolean small) {
        return cleanEnergyValues(energy.getEnergyStored(), energy.getMaxEnergyStored(), small);
    }

    /**
     * Pretty values, turns numbers like 100000000 into 100M
     *
     * @param value value you need prettified
     *
     * @return a pretty string
     */
    public static String humanReadableValue(int value) {
        if (value < 1000) {
            return String.valueOf(value);
        }

        int exp = (int) (Math.log(value) / Math.log(1000));
        return String.format(
            "%,d%c",
            (int) (value / Math.pow(1000, exp)),
            "KMGTPE_____".charAt(exp - 1)
        );
    }
}
