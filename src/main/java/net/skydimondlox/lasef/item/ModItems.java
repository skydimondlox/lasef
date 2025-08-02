package net.skydimondlox.lasef.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.skydimondlox.lasef.Lasef;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Lasef.MOD_ID);

    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
            () -> new Item(new Item.Properties()));



    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
