package xyz.vegetabledev.vegeessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class broadcast implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("broadcast")) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                str.append(args[i] + " ");
            }
            String s = str.toString();
            String prefix = "[VegeCraft]";
            Bukkit.getServer().broadcastMessage((ChatColor.translateAlternateColorCodes('&', prefix + s)));


        }
        return true;
    }
}
