package com.gmail.molitor.alexander.it.worlds;

import org.bukkit.ChatColor;

import java.util.HashMap;

/**
 * Data class to hold Information about a world's name, its localised names and its color in chat.
 */
public class WorldInfo {
    private String name;
    private HashMap<String, String> localisedNames;
    private ChatColor color;

    public WorldInfo(String name, HashMap<String, String> localisedNames, ChatColor color) {
        this.name = name;
        this.localisedNames = localisedNames;
        this.color = color;
    }
}
