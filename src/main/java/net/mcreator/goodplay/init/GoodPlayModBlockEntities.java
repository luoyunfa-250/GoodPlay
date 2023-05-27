
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.goodplay.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.goodplay.block.entity.YasuojiBlockEntity;
import net.mcreator.goodplay.GoodPlayMod;

public class GoodPlayModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GoodPlayMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> YASUOJI = register("yasuoji", GoodPlayModBlocks.YASUOJI, YasuojiBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
