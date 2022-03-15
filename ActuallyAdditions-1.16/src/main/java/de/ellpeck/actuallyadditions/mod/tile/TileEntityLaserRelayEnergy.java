/*
 * This file ("TileEntityLaserRelayEnergy.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.tile;

import de.ellpeck.actuallyadditions.api.laser.IConnectionPair;
import de.ellpeck.actuallyadditions.api.laser.LaserType;
import de.ellpeck.actuallyadditions.api.laser.Network;
import de.ellpeck.actuallyadditions.mod.ActuallyAdditions;
import de.ellpeck.actuallyadditions.mod.blocks.ActuallyBlocks;
import de.ellpeck.actuallyadditions.mod.config.values.ConfigBoolValues;
import de.ellpeck.actuallyadditions.mod.util.StringUtil;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TileEntityLaserRelayEnergy extends TileEntityLaserRelay {

    public static final int CAP = 1000;
    public final ConcurrentHashMap<Direction, TileEntity> receiversAround = new ConcurrentHashMap<>();
    private final IEnergyStorage[] energyStorages = new IEnergyStorage[6];
    private Mode mode = Mode.BOTH;

    public TileEntityLaserRelayEnergy(TileEntityType<?> type) {
        super(type, LaserType.ENERGY);

        for (int i = 0; i < this.energyStorages.length; i++) {
            Direction facing = Direction.values()[i];
            this.energyStorages[i] = new IEnergyStorage() {
                @Override
                public int receiveEnergy(int amount, boolean simulate) {
                    return TileEntityLaserRelayEnergy.this.transmitEnergy(facing, amount, simulate);
                }

                @Override
                public int extractEnergy(int maxExtract, boolean simulate) {
                    return 0;
                }

                @Override
                public int getEnergyStored() {
                    return 0;
                }

                @Override
                public int getMaxEnergyStored() {
                    return TileEntityLaserRelayEnergy.this.getEnergyCap();
                }

                @Override
                public boolean canExtract() {
                    return false;
                }

                @Override
                public boolean canReceive() {
                    return true;
                }
            };
        }
    }

    public TileEntityLaserRelayEnergy() {
        this(ActuallyBlocks.LASER_RELAY.getTileEntityType());
    }

    private int transmitEnergy(Direction from, int maxTransmit, boolean simulate) {
        int transmitted = 0;
        if (maxTransmit > 0 && this.mode != Mode.OUTPUT_ONLY) {
            Network network = this.getNetwork();
            if (network != null) {
                transmitted = this.transferEnergyToReceiverInNeed(from, network, maxTransmit, simulate);
            }
        }
        return transmitted;
    }

    // TODO: [port] this is super hacky, review and fix up 
    @Override
    public LazyOptional<IEnergyStorage> getEnergyStorage(Direction facing) {
        return LazyOptional.of(() -> this.energyStorages[facing == null
            ? 0
            : facing.ordinal()]);
    }

    @Override
    public boolean shouldSaveDataOnChangeOrWorldStart() {
        return true;
    }

    @Override
    public void saveDataOnChangeOrWorldStart() {
        Map<Direction, TileEntity> old = new HashMap<>(this.receiversAround);
        boolean change = false;

        this.receiversAround.clear();
        for (Direction side : Direction.values()) {
            BlockPos pos = this.getBlockPos().relative(side);
            if (this.level.hasChunkAt(pos)) {
                TileEntity tile = this.level.getBlockEntity(pos);
                if (tile != null && !(tile instanceof TileEntityLaserRelay)) {
                    if (tile.getCapability(CapabilityEnergy.ENERGY, side.getOpposite()).isPresent()) {
                        this.receiversAround.put(side, tile);

                        TileEntity oldTile = old.get(side);
                        if (oldTile == null || !tile.equals(oldTile)) {
                            change = true;
                        }
                    }
                }
            }
        }

        if (change || old.size() != this.receiversAround.size()) {
            Network network = this.getNetwork();
            if (network != null) {
                network.changeAmount++;
            }
        }
    }

    private int transferEnergyToReceiverInNeed(Direction from, Network network, int maxTransfer, boolean simulate) {
        int transmitted = 0;
        //Keeps track of all the Laser Relays and Energy Acceptors that have been checked already to make nothing run multiple times
        Set<BlockPos> alreadyChecked = new ObjectOpenHashSet<>();

        Set<TileEntityLaserRelayEnergy> relaysThatWork = new ObjectOpenHashSet<>();
        int totalReceiverAmount = 0;

        for (IConnectionPair pair : network.connections) {
            for (BlockPos relay : pair.getPositions()) {
                if (relay != null && this.level.hasChunkAt(relay) && !alreadyChecked.contains(relay)) {
                    alreadyChecked.add(relay);
                    TileEntity relayTile = this.level.getBlockEntity(relay);
                    if (relayTile instanceof TileEntityLaserRelayEnergy) {
                        TileEntityLaserRelayEnergy theRelay = (TileEntityLaserRelayEnergy) relayTile;
                        if (theRelay.mode != Mode.INPUT_ONLY) {
                            boolean workedOnce = false;

                            for (Direction facing : theRelay.receiversAround.keySet()) {
                                if (theRelay != this || facing != from) {
                                    TileEntity tile = theRelay.receiversAround.get(facing);

                                    Direction opp = facing.getOpposite();
                                    if (tile != null) {
                                        Boolean received = tile.getCapability(CapabilityEnergy.ENERGY, opp).map(cap -> cap.receiveEnergy(maxTransfer, true) > 0).orElse(false);
                                        if (received) {
                                            totalReceiverAmount++;
                                            workedOnce = true;
                                        }
                                    }
                                }
                            }

                            if (workedOnce) {
                                relaysThatWork.add(theRelay);
                            }
                        }
                    }
                }
            }
        }

        if (totalReceiverAmount > 0 && !relaysThatWork.isEmpty()) {
            int amountPer = maxTransfer / totalReceiverAmount <= 0
                ? maxTransfer / totalReceiverAmount
                : maxTransfer;

            for (TileEntityLaserRelayEnergy theRelay : relaysThatWork) {
                double highestLoss = Math.max(theRelay.getLossPercentage(), this.getLossPercentage());
                int lowestCap = Math.min(theRelay.getEnergyCap(), this.getEnergyCap());
                for (Map.Entry<Direction, TileEntity> receiver : theRelay.receiversAround.entrySet()) {
                    if (receiver != null) {
                        Direction side = receiver.getKey();
                        Direction opp = side.getOpposite();
                        TileEntity tile = receiver.getValue();
                        if (!alreadyChecked.contains(tile.getBlockPos())) {
                            alreadyChecked.add(tile.getBlockPos());
                            if (theRelay != this || side != from) {
                                transmitted += tile.getCapability(CapabilityEnergy.ENERGY, opp).map(cap -> {
                                    int trans = 0;
                                    int theoreticalReceived = cap.receiveEnergy(Math.min(amountPer, lowestCap), true);
                                    if (theoreticalReceived > 0) {
                                        int deduct = this.calcDeduction(theoreticalReceived, highestLoss);
                                        if (deduct >= theoreticalReceived) { //Happens with small numbers
                                            deduct = 0;
                                        }

                                        trans += cap.receiveEnergy(theoreticalReceived - deduct, simulate);
                                        trans += deduct;
                                    }

                                    return trans;
                                }).orElse(0);

                                //If everything that could be transmitted was transmitted
                                if (transmitted >= maxTransfer) {
                                    return transmitted;
                                }
                            }
                        }
                    }
                }
            }
        }

        return transmitted;
    }

    private int calcDeduction(int theoreticalReceived, double highestLoss) {
        return ConfigBoolValues.LASER_RELAY_LOSS.isEnabled()
            ? MathHelper.ceil(theoreticalReceived * (highestLoss / 100))
            : 0;
    }

    public int getEnergyCap() {
        return CAP;
    }

    public double getLossPercentage() {
        return 5;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public String getExtraDisplayString() {
        return StringUtil.localize("info." + ActuallyAdditions.MODID + ".laserRelay.energy.extra") + ": " + TextFormatting.DARK_RED + StringUtil.localize(this.mode.name) + TextFormatting.RESET;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public String getCompassDisplayString() {
        return TextFormatting.GREEN + StringUtil.localize("info." + ActuallyAdditions.MODID + ".laserRelay.energy.display");
    }

    @Override
    public void onCompassAction(PlayerEntity player) {
        this.mode = this.mode.getNext();
    }

    @Override
    public void writeSyncableNBT(CompoundNBT compound, NBTType type) {
        super.writeSyncableNBT(compound, type);

        if (type != NBTType.SAVE_BLOCK) {
            compound.putString("Mode", this.mode.toString());
        }
    }

    @Override
    public void readSyncableNBT(CompoundNBT compound, NBTType type) {
        super.readSyncableNBT(compound, type);

        if (type != NBTType.SAVE_BLOCK) {
            String modeStrg = compound.getString("Mode");
            if (modeStrg != null && !modeStrg.isEmpty()) {
                this.mode = Mode.valueOf(modeStrg);
            }
        }
    }

    public enum Mode {
        BOTH("info." + ActuallyAdditions.MODID + ".laserRelay.mode.both"),
        OUTPUT_ONLY("info." + ActuallyAdditions.MODID + ".laserRelay.mode.outputOnly"),
        INPUT_ONLY("info." + ActuallyAdditions.MODID + ".laserRelay.mode.inputOnly");

        public final String name;

        Mode(String name) {
            this.name = name;
        }

        public Mode getNext() {
            int ordinal = this.ordinal() + 1;

            if (ordinal >= values().length) {
                ordinal = 0;
            }

            return values()[ordinal];
        }
    }
}
