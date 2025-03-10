package com.example.examplemod.item;

import com.example.examplemod.TutorialMod;
import com.example.examplemod.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab>  CREATIVE_MOD_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MOD_TABS.register("tutorial_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.Natalia.get()))
                    .title(Component.translatable("cretivetab.tutorial_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Natalia.get());
                        output.accept(ModItems.Sapphire.get());
                        output.accept(ModItems.Peckio.get());
                        output.accept(Items.IRON_BOOTS);
                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModItems.METAL_DETECTOR.get());
                        output.accept(ModBlocks.SOUND_BLOCK.get());
                        output.accept(ModItems.CHUZO.get());
                        output.accept(ModItems.COLE.get());
                        output.accept(ModItems.ATOM.get());
                        output.accept(ModBlocks.GRAVITY_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }

}
