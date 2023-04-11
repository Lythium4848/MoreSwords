package dev.lythium.moreswords.Registry;

import dev.lythium.moreswords.MoreSwords;
import dev.lythium.moreswords.Swords.AmethystSword;
import dev.lythium.moreswords.Swords.DirtSword;
import dev.lythium.moreswords.Swords.EchoSword;
import dev.lythium.moreswords.Swords.SwordTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class Swords {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreSwords.MODID);

    public static final RegistryObject<SwordItem> DIRT_SWORD = ITEMS.register("dirt_sword", () ->
        new DirtSword(SwordTiers.DIRT_SWORD, 2, -2.4F, new Item.Properties())
    );

    public static final RegistryObject<SwordItem> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () ->
            new AmethystSword(SwordTiers.AMETHYST_SWORD, 6, -2.4F, new Item.Properties())
    );

    public static final RegistryObject<SwordItem> ECHO_SWORD = ITEMS.register("echo_sword", () ->
            new EchoSword(SwordTiers.ECHO_SWORD, 10, -2.4F, new Item.Properties())
    );
}
