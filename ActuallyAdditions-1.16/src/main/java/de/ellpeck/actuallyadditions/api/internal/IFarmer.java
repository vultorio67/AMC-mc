/*
 * This file ("IFarmer.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.api.internal;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;

/**
 * This is a helper interface for IFarmerBehavior.
 * <p>
 * This is not supposed to be implemented.
 * Can be cast to TileEntity.
 */
public interface IFarmer extends IEnergyTile {

    Direction getOrientation();

    boolean canAddToSeeds(List<ItemStack> stacks);

    boolean canAddToOutput(List<ItemStack> stacks);

    void addToSeeds(List<ItemStack> stacks);

    void addToOutput(List<ItemStack> stacks);
}
