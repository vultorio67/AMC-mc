/*
 * This file ("TileEntityEnervator.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.tile;

import de.ellpeck.actuallyadditions.mod.blocks.ActuallyBlocks;
import de.ellpeck.actuallyadditions.mod.inventory.ContainerEnervator;
import de.ellpeck.actuallyadditions.mod.util.ItemStackHandlerAA.IAcceptor;
import de.ellpeck.actuallyadditions.mod.util.ItemStackHandlerAA.IRemover;
import de.ellpeck.actuallyadditions.mod.util.StackUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;

import javax.annotation.Nullable;

public class TileEntityEnervator extends TileEntityInventoryBase implements ISharingEnergyProvider, INamedContainerProvider {

    public final CustomEnergyStorage storage = new CustomEnergyStorage(50000, 0, 1000);
    public final LazyOptional<IEnergyStorage> lazyEnergy = LazyOptional.of(() -> this.storage);
    private int lastEnergy;

    public TileEntityEnervator() {
        super(ActuallyBlocks.ENERVATOR.getTileEntityType(), 2);
    }

    @Override
    public void writeSyncableNBT(CompoundNBT compound, NBTType type) {
        this.storage.writeToNBT(compound);
        super.writeSyncableNBT(compound, type);
    }

    @Override
    public void readSyncableNBT(CompoundNBT compound, NBTType type) {
        this.storage.readFromNBT(compound);
        super.readSyncableNBT(compound, type);
    }

    @Override
    public void updateEntity() {
        super.updateEntity();
        if (!this.level.isClientSide) {
            if (StackUtil.isValid(this.inv.getStackInSlot(0)) && !StackUtil.isValid(this.inv.getStackInSlot(1))) {
                if (this.storage.getEnergyStored() < this.storage.getMaxEnergyStored()) {
                    LazyOptional<IEnergyStorage> capability = this.inv.getStackInSlot(0).getCapability(CapabilityEnergy.ENERGY, null);

                    int maxExtract = this.storage.getMaxEnergyStored() - this.storage.getEnergyStored();
                    int extracted = capability.map(cap -> cap.extractEnergy(maxExtract, false)).orElse(0);
                    boolean canTakeUp = capability.map(cap -> cap.getEnergyStored() <= 0).orElse(false);

                    if (extracted > 0) {
                        this.storage.receiveEnergyInternal(extracted, false);
                    }

                    if (canTakeUp) {
                        this.inv.setStackInSlot(1, this.inv.getStackInSlot(0).copy());
                        this.inv.getStackInSlot(0).shrink(1);
                    }
                }
            }

            if (this.lastEnergy != this.storage.getEnergyStored() && this.sendUpdateWithInterval()) {
                this.lastEnergy = this.storage.getEnergyStored();
            }
        }
    }

    @Override
    public IAcceptor getAcceptor() {
        return (slot, stack, automation) -> !automation || slot == 0 && stack.getCapability(CapabilityEnergy.ENERGY, null).isPresent();
    }

    @Override
    public IRemover getRemover() {
        return (slot, automation) -> !automation || slot == 1;
    }

    public int getEnergyScaled(int i) {
        return this.storage.getEnergyStored() * i / this.storage.getMaxEnergyStored();
    }

    @Override
    public int getEnergyToSplitShare() {
        return this.storage.getEnergyStored();
    }

    @Override
    public boolean doesShareEnergy() {
        return true;
    }

    @Override
    public Direction[] getEnergyShareSides() {
        return Direction.values();
    }

    @Override
    public boolean canShareTo(TileEntity tile) {
        return true;
    }

    @Override
    public LazyOptional<IEnergyStorage> getEnergyStorage(Direction facing) {
        return this.lazyEnergy;
    }

    @Override
    public ITextComponent getDisplayName() {
        return StringTextComponent.EMPTY;
    }

    @Nullable
    @Override
    public Container createMenu(int windowId, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new ContainerEnervator(windowId, playerInventory, this);
    }
}
