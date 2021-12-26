package com.gmail.molitor.alexander.it.tablist;

import org.bukkit.entity.Player;

public class TabListUpdater {
    private static TabListUpdater instance;

    private TabListUpdater() {}

    public static TabListUpdater getInstance() {
        if(instance == null) {
            instance = new TabListUpdater();
        }

        return instance;
    }

    public void updatePlayerListNameWithWorldName(Player p) {

    }
}
