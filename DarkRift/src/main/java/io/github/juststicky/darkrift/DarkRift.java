package io.github.juststicky.darkrift;

import io.github.juststicky.darkrift.commands.FlyCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class DarkRift extends JavaPlugin {

    @Override
    public void onLoad() {
        // Called when the plugin is loaded but not enabled.

    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("The Dark Rift plugin has been enabled.");

        getLogger().severe("Error!");

        getServer().getPluginManager().registerEvents(new listeners(), this);

        getCommand("fly").setExecutor(new FlyCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
