package eu.cubix.mc.core.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Hub extends Command {

    public Hub() {
        super("lobby", null, "hub", "leave", "quit");
    }

    public void execute(final CommandSender sender, final String[] args) {
        if (sender instanceof ProxiedPlayer) {
            final ProxiedPlayer p = (ProxiedPlayer)sender;
            final ServerInfo s = p.getServer().getInfo();
            p.sendMessage("§eCubixMC §6� �eConnexion au serveur en cours... �6(�eHub�6)");
            if (s.getName().equalsIgnoreCase("Auth")) {
                p.sendMessage("�cCubixMC �4� �cErreur: Veuillez vous connecter ou vous enregistrer.");
            } else {
                p.connect(ProxyServer.getInstance().getServerInfo("Hub01"));
            }
        }
    }
}
