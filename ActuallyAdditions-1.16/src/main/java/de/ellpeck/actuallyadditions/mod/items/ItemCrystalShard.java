///*
// * This file ("ItemCrystalShard.java") is part of the Actually Additions mod for Minecraft.
// * It is created and owned by Ellpeck and distributed
// * under the Actually Additions License to be found at
// * http://ellpeck.de/actaddlicense
// * View the source code at https://github.com/Ellpeck/ActuallyAdditions
// *
// * © 2015-2017 Ellpeck
// */
//
//package de.ellpeck.actuallyadditions.mod.items;
//
//import de.ellpeck.actuallyadditions.mod.ActuallyAdditions;
//import de.ellpeck.actuallyadditions.mod.blocks.BlockCrystal;
//import de.ellpeck.actuallyadditions.mod.items.base.ItemBase;
//import de.ellpeck.actuallyadditions.mod.util.IColorProvidingItem;
//import de.ellpeck.actuallyadditions.mod.util.StringUtil;
//import net.minecraft.client.renderer.color.IItemColor;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.item.EnumRarity;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.NonNullList;
//import net.minecraftforge.common.IRarity;
//
//
//public class ItemCrystalShard extends ItemBase implements IColorProvidingItem {
//
//    public ItemCrystalShard() {
//        super(name);
//        this.setHasSubtypes(true);
//        this.setMaxDamage(0);
//    }
//
//    @Override
//    public int getMetadata(int damage) {
//        return damage;
//    }
//
//    @Override
//    public String getDescriptionId(ItemStack stack) {
//        return stack.getItemDamage() >= BlockCrystal.ALL_CRYSTALS.length
//            ? StringUtil.BUGGED_ITEM_NAME
//            : this.getDescriptionId() + "_" + BlockCrystal.ALL_CRYSTALS[stack.getItemDamage()].name;
//    }
//
//    @Override
//    public IRarity getForgeRarity(ItemStack stack) {
//        return stack.getItemDamage() >= BlockCrystal.ALL_CRYSTALS.length
//            ? EnumRarity.COMMON
//            : BlockCrystal.ALL_CRYSTALS[stack.getItemDamage()].rarity;
//    }
//
//    @Override
//    @OnlyIn(Dist.CLIENT)
//    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) {
//        if (this.isInCreativeTab(tab)) {
//            for (int j = 0; j < BlockCrystal.ALL_CRYSTALS.length; j++) {
//                list.add(new ItemStack(this, 1, j));
//            }
//        }
//    }
//
//    @Override
//    protected void registerRendering() {
//        for (int i = 0; i < BlockCrystal.ALL_CRYSTALS.length; i++) {
//            ActuallyAdditions.PROXY.addRenderRegister(new ItemStack(this, 1, i), this.getRegistryName(), "inventory");
//        }
//    }
//
//    @Override
//    @OnlyIn(Dist.CLIENT)
//    public IItemColor getItemColor() {
//        return (stack, tintIndex) -> {
//            int damage = stack.getItemDamage();
//            if (damage >= 0 && damage < BlockCrystal.ALL_CRYSTALS.length) {
//                return BlockCrystal.ALL_CRYSTALS[damage].clusterColor;
//            } else {
//                return 0;
//            }
//        };
//    }
//}
