package eu.cubix.mc.core;

import eu.cubix.mc.core.commands.Hub;
import eu.cubix.mc.core.events.Mention;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {

    private static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        System.out.println("[CubixCore] Le plugin est ON");

        getProxy().getPluginManager().registerCommand(this, new Hub());
        getProxy().getPluginManager().registerListener(this, new Mention());
    }

    @Override
    public void onDisable() {
        System.out.println("[CubixCore] Le plugin est OFF");
    }

    public static Main getInstance() {
        return instance;
    }
}
