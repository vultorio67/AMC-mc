/*
 * This file ("ItemAxeAA.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.items;

import com.google.common.collect.ImmutableSet;
import de.ellpeck.actuallyadditions.mod.ActuallyAdditions;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.ToolType;

public class ItemAxeAA extends ToolItem {
    private IItemTier tier;
    public ItemAxeAA(IItemTier tier) {
        super(
            4.0f,
            -2f,
            tier,
            ImmutableSet.of(),
            new Properties()
                .addToolType(ToolType.AXE, tier.getLevel())
                .addToolType(ToolType.HOE, tier.getLevel())
                .addToolType(ToolType.SHOVEL, tier.getLevel())
                .addToolType(ToolType.PICKAXE, tier.getLevel())
                .durability(tier.getUses() * 4)
                .tab(ActuallyAdditions.GROUP)
        );

        this.tier = tier;
    }

/*
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

    public ItemAxeAA(IItemTier material) {
        super(6.0F, -3.0F, material, this.repairItem, unlocalizedName, this.rarity, EFFECTIVE_ON);
        this.setHarvestLevel("axe", material.getLevel());
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANT && material != Material.VINE
                ? super.getDestroySpeed(stack, state)
                : this.speed;
    }

    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return Collections.singleton("axe");
    }*/
}
