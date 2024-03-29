package eu.cubix.mc.core;

import eu.cubix.mc.core.commands.Hub;
import eu.cubix.mc.core.events.PlayerEvent;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {

    private static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        System.out.println("[Core] Le plugin est ON");

        getProxy().getPluginManager().registerListener(this, new PlayerEvent(this));

        getProxy().getPluginManager().registerCommand(this, new Hub());
    }

    @Override
    public void onDisable() {
        System.out.println("[Core] Le plugin est OFF");
    }

    public static Main getInstance() {
        return instance;
    }
}
