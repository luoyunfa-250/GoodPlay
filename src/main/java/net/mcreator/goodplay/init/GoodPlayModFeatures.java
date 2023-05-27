
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.goodplay.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.goodplay.world.features.ores.YasuojiFeature;
import net.mcreator.goodplay.GoodPlayMod;

@Mod.EventBusSubscriber
public class GoodPlayModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, GoodPlayMod.MODID);
	public static final RegistryObject<Feature<?>> YASUOJI = REGISTRY.register("yasuoji", YasuojiFeature::feature);
}
