package xyz.vegetabledev.vegeessentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gamemodes implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            // TODO set permissions on this command
            if (cmd.getName().equalsIgnoreCase("gms")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.RED + "You in Survival now ma boi");
            // TODO set permissions on this command
            } else if (cmd.getName().equalsIgnoreCase("gmc")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.RED + "You in Creative now ma boi");
            }
        } else {
            System.out.println("You can not run this command as console.");
        }
        return true;
        
    }
}
