package com.github.itzswirlz.PitPandaMod;

import com.github.itzswirlz.PitPandaMod.commands.CheckPitScammer;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PitPandaMod.MODID, version = PitPandaMod.VERSION)
public class PitPandaMod
{
    public static final String MODID = "pitpandamod";
    public static final String VERSION = "0.0.1";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	ClientCommandHandler.instance.registerCommand(new CheckPitScammer());
    }

}
