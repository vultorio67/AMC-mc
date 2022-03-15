/*
 * This file ("IFarmerBehavior.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.api.farmer;

import de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI;
import de.ellpeck.actuallyadditions.api.internal.IFarmer;
import de.ellpeck.actuallyadditions.mod.misc.apiimpl.farmer.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public interface IFarmerBehavior {

    /**
     * Try to plant a seed with this behavior
     * If this method returns true, the seed ItemStack will be shrunk by one.
     * This method will not be called if the block at the given position is not replaceable.
     *
     * @param seed   The seed stack to plant
     * @param world  The world
     * @param pos    The position to plant the seed on
     * @param farmer The Farmer doing this action. Can be used to query and extract energy and add items to the slots
     * @return If planting was successful
     */
    FarmerResult tryPlantSeed(ItemStack seed, World world, BlockPos pos, IFarmer farmer);

    /**
     * Try to harvest a plant with this behavior
     *
     * @param world  The world
     * @param pos    The position of the plant
     * @param farmer The Farmer doing this action. Can be used to query and extract energy and add items to the slots
     * @return If harvesting was successful
     */
    FarmerResult tryHarvestPlant(ServerWorld world, BlockPos pos, IFarmer farmer);

    int getPriority();

    default Integer getPrioInt() {
        return getPriority();
    }

    static void initBehaviors() {
        ActuallyAdditionsAPI.addFarmerBehavior(new DefaultFarmerBehavior());
        ActuallyAdditionsAPI.addFarmerBehavior(new CactusFarmerBehavior());
        ActuallyAdditionsAPI.addFarmerBehavior(new NetherWartFarmerBehavior());
        ActuallyAdditionsAPI.addFarmerBehavior(new ReedFarmerBehavior());
        ActuallyAdditionsAPI.addFarmerBehavior(new MelonPumpkinFarmerBehavior());
    }
}
