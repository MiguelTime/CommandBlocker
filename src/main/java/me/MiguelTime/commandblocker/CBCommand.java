package me.MiguelTime.commandblocker;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CBCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("cb")) {
            if (!sender.hasPermission("commandblocker.admin")) {
                sender.sendMessage(CommandBlocker.getInstance().getMessage("no-permission"));
                return true;
            }

            if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
                CommandBlocker.getInstance().reload();
                sender.sendMessage(CommandBlocker.getInstance().getMessage("reload-success"));
            } else {
                sender.sendMessage("§eUso: /cb reload");
            }
            return true;
        }

        if (label.equalsIgnoreCase("cbtest")) {
            if (!sender.hasPermission("commandblocker.test")) {
                sender.sendMessage(CommandBlocker.getInstance().getMessage("no-permission"));
                return true;
            }
            sender.sendMessage(CommandBlocker.getInstance().getMessage("test-success"));

            return true;
        }

        return false;
    }
}
