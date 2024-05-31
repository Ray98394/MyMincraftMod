package com.ray.laxative.item;

import com.ray.laxative.Laxative;
import com.ray.laxative.item.custom.laxativeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Laxative.MODID);

    public static final RegistryObject<Item> LAXATIVE = ITEMS.register("laxative",
            ()->new laxativeItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
