package com.gmail.molitor.alexander.it.events;

import com.gmail.molitor.alexander.it.tablist.TabListUpdater;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    private TabListUpdater tablistUpdater;

    public void onPlayerJoinListener(PlayerJoinEvent event) {
        Player p = event.getPlayer();
    }

    public void setTablistUpdater(TabListUpdater tablistUpdater) {
        this.tablistUpdater = tablistUpdater;
    }
}
