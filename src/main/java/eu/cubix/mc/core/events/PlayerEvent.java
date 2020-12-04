package eu.cubix.mc.core.events;

import eu.cubix.mc.core.Main;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PlayerEvent implements Listener {

    private final Main main;

    public PlayerEvent(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onJoin(PostLoginEvent e) {
        ProxiedPlayer player = e.getPlayer();

        player.setTabHeader(new TextComponent("§6§lCubix§e§lMC \n "), new TextComponent("\n §eLe serveur mini-jeux."));

        main.getLogger().info(e.getPlayer()+" a rejoint le serveur.");
    }

    @EventHandler
    public void onQuit(PlayerDisconnectEvent e) {
        ProxiedPlayer player = e.getPlayer();
        main.getLogger().info(e.getPlayer()+" a quitté le serveur.");
    }

}
