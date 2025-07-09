package me.MiguelTime.commandblocker;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;
import org.bukkit.entity.Player;

import java.util.Set;
import java.util.stream.Collectors;

public class TabCompleteListener implements Listener {

    @EventHandler
    public void onTabComplete(PlayerCommandSendEvent event) {
        Player player = event.getPlayer();
        if (player.hasPermission("commandblocker.bypass")) return;

        Set<String> allowed = CommandBlocker.getInstance().getConfig().getStringList("allowed-commands")
                .stream().map(String::toLowerCase).collect(Collectors.toSet());

        event.getCommands().removeIf(cmd -> !allowed.contains(cmd.toLowerCase()));
    }
}
