package com.Ray.TutorialMod.Item;

import com.Ray.TutorialMod.TutorialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            ()->new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            ()->new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
