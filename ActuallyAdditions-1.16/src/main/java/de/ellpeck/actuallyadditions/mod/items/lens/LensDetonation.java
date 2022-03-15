/*
 * This file ("LensDetonation.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.items.lens;

import de.ellpeck.actuallyadditions.api.internal.IAtomicReconstructor;
import de.ellpeck.actuallyadditions.api.lens.Lens;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;

public class LensDetonation extends Lens {

    private static final int ENERGY_USE = 250000;

    @Override
    public boolean invoke(BlockState state, BlockPos hitBlock, IAtomicReconstructor tile) {
        if (hitBlock != null && !state.getBlock().isAir(state, tile.getWorldObject(), hitBlock)) {
            if (tile.getEnergy() >= ENERGY_USE) {
                tile.getWorldObject().explode(null, hitBlock.getX() + 0.5, hitBlock.getY() + 0.5, hitBlock.getZ() + 0.5, 10F, true, Explosion.Mode.NONE); // TODO: [port][test] make sure this is the right explosion mode
                tile.extractEnergy(ENERGY_USE);
            }
            return true;
        }
        return false;
    }

    @Override
    public float[] getColor() {
        return new float[]{158F / 255F, 43F / 255F, 39F / 255F};
    }

    @Override
    public int getDistance() {
        return 30;
    }

    @Override
    public boolean canInvoke(IAtomicReconstructor tile, Direction sideToShootTo, int energyUsePerShot) {
        return tile.getEnergy() - energyUsePerShot >= ENERGY_USE;
    }
}
