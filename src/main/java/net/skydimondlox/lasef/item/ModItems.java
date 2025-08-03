package net.skydimondlox.lasef.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.skydimondlox.lasef.Lasef;
import net.skydimondlox.lasef.item.custom.TempItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Lasef.MOD_ID);

    public static final DeferredItem<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TEMP = ITEMS.register("temp",
            () -> new TempItem(new Item.Properties().durability(32)));


    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
