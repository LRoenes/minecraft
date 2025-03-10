package com.example.examplemod.item;

import com.example.examplemod.TutorialMod;
import com.example.examplemod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> Sapphire = ITEMS.register("sapphire",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Peckio = ITEMS.register("peckio",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Natalia = ITEMS.register("natalia",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Pollo = ITEMS.register("pollo",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Papitas = ITEMS.register("papitas",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Queso = ITEMS.register("queso",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Tartara = ITEMS.register("tartara",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            ()-> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> CHUZO = ITEMS.register("chuzo",
            ()-> new Item(new Item.Properties().food(ModFoods.CHUZO)));

    public static final RegistryObject<Item> ATOM = ITEMS.register("atom",
            ()-> new Item(new Item.Properties().food(ModFoods.ATOM)));


    public static final RegistryObject<Item> COLE = ITEMS.register("cole",
            ()-> new FuelItem(new Item.Properties(), 400));










    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }



}
