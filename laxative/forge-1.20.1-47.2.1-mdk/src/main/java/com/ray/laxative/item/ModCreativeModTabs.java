package com.ray.laxative.item;

import com.ray.laxative.Laxative;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final String LAXATIVE_TAB_STRING = "creative.laxative_tab";
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
    DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Laxative.MODID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            ()-> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.LAXATIVE.get()))
                    .title(Component.translatable(LAXATIVE_TAB_STRING))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LAXATIVE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
