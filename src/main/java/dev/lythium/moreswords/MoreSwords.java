package dev.lythium.moreswords;

import dev.lythium.moreswords.Registry.Swords;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.slf4j.Logger;

@Mod(MoreSwords.MODID)
public class MoreSwords
{
    public static final String MODID = "moreswords";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MoreSwords()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::onClientSetup);
        modEventBus.addListener(this::addItemsToTabs);

        Swords.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event) { }

    private void onClientSetup(final FMLClientSetupEvent event) { }


    private void addItemsToTabs(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == CreativeModeTabs.COMBAT)
        {
            event.accept(Swords.DIRT_SWORD.get());
            event.accept(Swords.AMETHYST_SWORD.get());
            event.accept(Swords.ECHO_SWORD.get());
        }
    }
}
