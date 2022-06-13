
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.teste.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.teste.block.entity.FusionOreTableBlockEntity;
import net.mcreator.teste.FusionModMod;

public class FusionModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, FusionModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FUSION_ORE_TABLE = register("fusion_ore_table", FusionModModBlocks.FUSION_ORE_TABLE,
			FusionOreTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
