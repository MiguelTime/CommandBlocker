package me.MiguelTime.commandblocker;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.entity.Player;

public class CommandListener implements Listener {

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();
        if (player.hasPermission("commandblocker.bypass")) return;

        String command = event.getMessage().split(" ")[0].replace("/", "").toLowerCase();
        if (!CommandBlocker.getInstance().getConfig().getStringList("allowed-commands").contains(command)) {
            player.sendMessage(CommandBlocker.getInstance().getMessage("command-blocked"));
            event.setCancelled(true);
        }
    }
}
