package io.github.juststicky.darkrift.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("§cOnly players can execute this command!");
            return true;
        }

        final Player player = (Player) commandSender;

        player.setAllowFlight(true);
        player.setFlying(true);

        player.sendMessage("§eYou are now flying!");

        return false;
    }
}
