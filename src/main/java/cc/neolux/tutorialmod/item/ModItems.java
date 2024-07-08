package cc.neolux.tutorialmod.item;

import cc.neolux.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);

    public static final RegistryObject<Item> BEAR = ITEMS.register("bear",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.tutorialmod_tab)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
