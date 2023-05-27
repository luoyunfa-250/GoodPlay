
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.goodplay.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.goodplay.world.inventory.YaSuoJiMenu;
import net.mcreator.goodplay.GoodPlayMod;

public class GoodPlayModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GoodPlayMod.MODID);
	public static final RegistryObject<MenuType<YaSuoJiMenu>> YA_SUO_JI = REGISTRY.register("ya_suo_ji", () -> IForgeMenuType.create(YaSuoJiMenu::new));
}
