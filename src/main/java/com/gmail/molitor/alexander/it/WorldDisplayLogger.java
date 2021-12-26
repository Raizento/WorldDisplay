package com.gmail.molitor.alexander.it;

import org.bukkit.Bukkit;

import java.util.logging.Logger;

public class WorldDisplayLogger {
    private static WorldDisplayLogger instance;

    private final String LOGGER_PREFIX = "[WorldDisplay]";
    private final String INFO = "[Info]";
    private Logger bukkitLogger;

    private WorldDisplayLogger() {
        bukkitLogger = Bukkit.getLogger();
    }

    public static WorldDisplayLogger getInstance() {
        if(instance == null) {
            instance = new WorldDisplayLogger();
        }

        return instance;
    }

    public void info(String msg) {
        bukkitLogger.info(LOGGER_PREFIX + INFO + " " + msg);
    }
}
