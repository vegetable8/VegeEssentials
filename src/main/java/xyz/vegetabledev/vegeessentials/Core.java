package xyz.vegetabledev.vegeessentials;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.vegetabledev.vegeessentials.commands.gamemodes;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("VegeEssentials v1.0 | LOADING ");
        getCommand("gms").setExecutor(new gamemodes());
        getCommand("gmc").setExecutor(new gamemodes());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
