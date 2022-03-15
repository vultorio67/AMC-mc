/*
 * This file ("DispenserHandlerFertilize.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.misc;

import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

// TODO: [port][note] might not be needed anymore
public class DispenserHandlerFertilize extends DefaultDispenseItemBehavior {

    @Override
    public ItemStack execute(IBlockSource source, ItemStack stack) {
        Direction facing = source.getBlockState().getValue(BlockStateProperties.FACING);
        BlockPos pos = source.getPos().relative(facing);

        if (BoneMealItem.growCrop(stack, source.getLevel(), pos)) {
            source.getLevel().levelEvent(2005, pos, 0);
        }

        return stack;
    }

}
