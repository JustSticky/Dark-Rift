package io.github.juststicky.darkrift;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class listeners implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        event.setJoinMessage("§a" + player.getName() + " has joined the server!");
    }

//    @EventHandler
//    public void onBlockBreak(BlockBreakEvent event) {
//        final Player player = event.getPlayer();
//        player.sendMessage("§cYou can't break that!");
//        event.setCancelled(true);
//    }
}
