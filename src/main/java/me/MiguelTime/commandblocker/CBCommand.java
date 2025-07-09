package me.MiguelTime.commandblocker;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CBCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("cb")) {
            if (!sender.hasPermission("commandblocker.admin")) {
                sender.sendMessage("§cNo tienes permiso para usar este comando.");
                return true;
            }

            if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
                CommandBlocker.getInstance().reload();
                sender.sendMessage("§aConfiguración recargada correctamente.");
            } else {
                sender.sendMessage("§eUso: /cb reload");
            }
            return true;
        }

        if (label.equalsIgnoreCase("cbtest")) {
            if (!sender.hasPermission("commandblocker.test")) {
                sender.sendMessage("§cNo tienes permiso para usar este comando.");
                return true;
            }
            sender.sendMessage("§aEl plugin está funcionando correctamente.");
            return true;
        }

        return false;
    }
}
