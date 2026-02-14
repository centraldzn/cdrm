package lol.squiggle.cdrm.item;

import lol.squiggle.cdrm.CentralDesignRadioMod;
import lol.squiggle.cdrm.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RADIO_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CentralDesignRadioMod.MOD_ID, "radio_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.radio"))
                    .icon(() -> new ItemStack(ModItems.HANDHELD_RADIO)).entries((displayContext, entries) -> {
                        entries.add(ModItems.HANDHELD_RADIO);

                        entries.add(ModBlocks.TABLETOP_RADIO);
                        entries.add(ModBlocks.OAK_TABLETOP_RADIO);
                    }).build());

    public static void registerItemGroups() {
        CentralDesignRadioMod.LOGGER.info("Registering item groups for " + CentralDesignRadioMod.MOD_ID);
    }
}
