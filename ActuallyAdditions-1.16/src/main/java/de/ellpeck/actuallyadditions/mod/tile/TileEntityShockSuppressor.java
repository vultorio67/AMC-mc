/*
 * This file ("TileEntityShockSuppressor.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.tile;

import de.ellpeck.actuallyadditions.mod.blocks.ActuallyBlocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.IEnergyStorage;

import java.util.ArrayList;
import java.util.List;

public class TileEntityShockSuppressor extends TileEntityBase implements IEnergyDisplay {

    public static final List<TileEntityShockSuppressor> SUPPRESSORS = new ArrayList<>();

    public static final int USE_PER = 300;
    public static final int RANGE = 5;

    public CustomEnergyStorage storage = new CustomEnergyStorage(300000, 400, 0);
    public final LazyOptional<IEnergyStorage> lazyEnergy = LazyOptional.of(() -> this.storage);
    private int oldEnergy;

    public TileEntityShockSuppressor() {
        super(ActuallyBlocks.SHOCK_SUPPRESSOR.getTileEntityType());
    }

    @Override
    public void onChunkUnloaded() {
        super.onChunkUnloaded();

        if (!this.level.isClientSide) {
            SUPPRESSORS.remove(this);
        }
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();

        if (!this.level.isClientSide) {
            SUPPRESSORS.remove(this);
        }
    }


    @Override
    public void updateEntity() {
        super.updateEntity();

        if (!this.level.isClientSide) {
            if (!this.isRemoved() && !SUPPRESSORS.contains(this)) {
                SUPPRESSORS.add(this);
            }

            if (this.oldEnergy != this.storage.getEnergyStored() && this.sendUpdateWithInterval()) {
                this.oldEnergy = this.storage.getEnergyStored();
            }
        }
    }

    @Override
    public void writeSyncableNBT(CompoundNBT compound, NBTType type) {
        super.writeSyncableNBT(compound, type);
        this.storage.writeToNBT(compound);
    }

    @Override
    public void readSyncableNBT(CompoundNBT compound, NBTType type) {
        super.readSyncableNBT(compound, type);
        this.storage.readFromNBT(compound);
    }

    @Override
    public CustomEnergyStorage getEnergyStorage() {
        return this.storage;
    }

    @Override
    public boolean needsHoldShift() {
        return false;
    }

    @Override
    public LazyOptional<IEnergyStorage> getEnergyStorage(Direction facing) {
        return this.lazyEnergy;
    }
}
