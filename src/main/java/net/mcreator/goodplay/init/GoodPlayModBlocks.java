
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.goodplay.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.goodplay.block.YasuojiBlock;
import net.mcreator.goodplay.GoodPlayMod;

public class GoodPlayModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GoodPlayMod.MODID);
	public static final RegistryObject<Block> YASUOJI = REGISTRY.register("yasuoji", () -> new YasuojiBlock());
}
