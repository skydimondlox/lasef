package net.skydimondlox.lasef.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.skydimondlox.lasef.Lasef;
import net.skydimondlox.lasef.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Lasef.MOD_ID);

    public static final Supplier<CreativeModeTab> LASEF_TAB = CREATIVE_MODE_TAB.register("lasef_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.lasef.lasef_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALUMINIUM_INGOT);
                        output.accept(ModItems.RAW_ALUMINIUM);
                        output.accept(ModItems.TEMP);

                        output.accept(ModBlocks.ALUMINIUM_BLOCK);
                        output.accept(ModBlocks.ALUMINIUM_DEEPSLATE_ORE);
                        output.accept(ModBlocks.ALUMINIUM_ORE);
                        output.accept(ModBlocks.MAGIC_BLOCK);
                    }).build());

        public static final Supplier<CreativeModeTab> LASEF_TAB_TWO = CREATIVE_MODE_TAB.register("lasef_tab_two",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Lasef.MOD_ID, "lasef_tab"))
                    .title(Component.translatable("creativetab.lasef.lasef_tab_two"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALUMINIUM_INGOT);
                        output.accept(ModItems.RAW_ALUMINIUM);

                        output.accept(ModBlocks.ALUMINIUM_BLOCK);
                        output.accept(ModBlocks.ALUMINIUM_DEEPSLATE_ORE);
                        output.accept(ModBlocks.ALUMINIUM_ORE);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
