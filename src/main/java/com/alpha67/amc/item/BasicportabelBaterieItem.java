
package com.alpha67.amc.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.alpha67.amc.procedures.BasicportabelBaterieQuandLobjetEstFabriquefonduProcedure;
import com.alpha67.amc.itemgroup.AlphatabItemGroup;
import com.alpha67.amc.AmcModElements;

@AmcModElements.ModElement.Tag
public class BasicportabelBaterieItem extends AmcModElements.ModElement {
	@ObjectHolder("amc:basicportabel_baterie")
	public static final Item block = null;

	public BasicportabelBaterieItem(AmcModElements instance) {
		super(instance, 272);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AlphatabItemGroup.tab).maxDamage(5000).rarity(Rarity.COMMON));
			setRegistryName("basicportabel_baterie");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
			super.onCreated(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			BasicportabelBaterieQuandLobjetEstFabriquefonduProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("itemstack", itemstack))
					.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
		}
	}
}
