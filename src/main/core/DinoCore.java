package me.amogusimposta.dinochatfilter;

import org.bukkit.plugin.java.JavaPlugin;

public class DinoCore extends JavaPlugin {

    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new DinoAntiSwear(this), this);
    }
}
