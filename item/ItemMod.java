package com.idtech.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemMod {

    //BASIC ITEMS
    public static final Item STRUCTURE_GEL = ItemUtils.buildBasicItem("structuregel", CreativeModeTab.TAB_MISC);
    public static final Item GEL_ORE = ItemUtils.buildBasicItem("gelore", CreativeModeTab.TAB_MISC);
    public static final Item WAMY_ORE = ItemUtils.buildBasicItem("wamy", CreativeModeTab.TAB_MISC);
    public static final Item LOVE_ORE = ItemUtils.buildBasicItem("love", CreativeModeTab.TAB_MISC);
    //FOODS
    public static FoodProperties yummyFood = (new FoodProperties.Builder().nutrition(3).saturationMod(1.4f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1000, 3), 1.0f).alwaysEat().build());
    public static Item yummyFoodItem = ItemUtils.buildFoodItem("sushi", yummyFood);
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //BASIC ITEMS
        event.getRegistry().register(STRUCTURE_GEL);
        event.getRegistry().register(GEL_ORE);
        event.getRegistry().register(WAMY_ORE);
        event.getRegistry().register(LOVE_ORE);


        // ITEMS
        event.getRegistry().register(TeleportRodItem.INSTANCE);
        event.getRegistry().register(LightningHammerItem.INSTANCE);
        event.getRegistry().register(GelPickaxeItem.INSTANCE);
        event.getRegistry().register(GelSwordItem.INSTANCE);
        event.getRegistry().register(GelHoeItem.INSTANCE);
        event.getRegistry().register(GelShovelItem.INSTANCE);
        event.getRegistry().register(GelAxeItem.INSTANCE);
        // TOOLS

        // FOOD
        event.getRegistry().register(yummyFoodItem);
        // ARMOR
        event.getRegistry().register(CustomArmorItem.HELM);
        event.getRegistry().register(CustomArmorItem.CHEST);
        event.getRegistry().register(CustomArmorItem.LEGS);
        event.getRegistry().register(CustomArmorItem.FEET);


        //PROJECTILES

    }
}
