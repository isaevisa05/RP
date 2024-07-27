package ru.laimcraft.rp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new EventsHandler(this), this);
    }

    @Override
    public void onDisable() {
    }
}
