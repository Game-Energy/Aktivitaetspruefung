package de.gameenergy.event;

import de.gameenergy.util.method;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class events implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
//        method.SendTitleToAllPlayers("§a§lAktivitätsprüfung"," ");
        method.SendActionbarToAllPlayers("Melde dich bitte via Ticket bei Game-Energy");

    }

    @EventHandler
    public void onMove(PlayerMoveEvent e){

//        method.SendTitleToAllPlayers("§a§lAktivitätsprüfung"," ");
        method.SendActionbarToAllPlayers("&cMelde dich bitte via Ticket bei Game-Energy");

    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){

//        method.SendTitleToAllPlayers("§a§lAktivitätsprüfung"," ");
        method.SendActionbarToAllPlayers("&cMelde dich bitte via Ticket bei Game-Energy");

    }

    @EventHandler
    public void onChat(PlayerChatEvent e) {

        e.setCancelled(true);

        method.SendMessageToPlayer(e.getPlayer(), "Um weitere Informationen zu erhalten schreibe &l/info");

    }




}
