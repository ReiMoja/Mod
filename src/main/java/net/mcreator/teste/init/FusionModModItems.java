
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.teste.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.teste.item.FusionRecipeBookItem;
import net.mcreator.teste.FusionModMod;

public class FusionModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FusionModMod.MODID);
	public static final RegistryObject<Item> FUSION_RECIPE_BOOK = REGISTRY.register("fusion_recipe_book", () -> new FusionRecipeBookItem());
	public static final RegistryObject<Item> FUSION_ORE_TABLE = block(FusionModModBlocks.FUSION_ORE_TABLE, CreativeModeTab.TAB_DECORATIONS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
