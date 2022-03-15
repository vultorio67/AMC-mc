/*
 * This file ("DamageSources.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.misc;

import de.ellpeck.actuallyadditions.mod.ActuallyAdditions;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class DamageSources extends DamageSource {

    public static final DamageSource DAMAGE_ATOMIC_RECONSTRUCTOR = new DamageSources("atomicReconstructor", 5).bypassArmor();

    private final int messageCount;

    public DamageSources(String name, int messageCount) {
        super(name);
        this.messageCount = messageCount;
    }

    @Override
    public ITextComponent getLocalizedDeathMessage(LivingEntity entity) {
        String locTag = "death." + ActuallyAdditions.MODID + "." + this.msgId + "." + (entity.level.random.nextInt(this.messageCount) + 1);
        return new TranslationTextComponent(locTag, entity.getName());
    }
}
