package cc.neolux.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab tutorialmod_tab = new CreativeModeTab("tutorialmod_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BEAR.get());
        }
    };
}
