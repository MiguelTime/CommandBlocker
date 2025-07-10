package me.MiguelTime.commandblocker;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;


public class CommandBlocker extends JavaPlugin {

    private static CommandBlocker instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new CommandListener(), this);
        getServer().getPluginManager().registerEvents(new TabCompleteListener(), this);
        getCommand("cb").setExecutor(new CBCommand());
        getCommand("cbtest").setExecutor(new CBCommand());
        getLogger().info("CommandBlocker activado correctamente.");
    }
    public String getMessage(String path) {
        return ChatColor.translateAlternateColorCodes('&',
                getConfig().getString("messages." + path, "§c[Mensaje no definido]"));
    }


    public static CommandBlocker getInstance() {
        return instance;
    }

    public void reload() {
        reloadConfig();
    }
}
