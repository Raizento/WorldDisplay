package com.gmail.molitor.alexander.it;

import com.gmail.molitor.alexander.it.worlds.WorldInfoFactory;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class WorldDisplayPlugin extends JavaPlugin {
    private WorldDisplayLogger logger;

    @Override
    public void onEnable() {
        logger = WorldDisplayLogger.getInstance();
        logger.info("Plugin enabled");

        try {
            WorldInfoFactory.createHashMapFromJson(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
        logger.info("Plugin disabled");
    }
}
