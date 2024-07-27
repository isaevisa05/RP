package ru.laimcraft.rp;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import ru.laimcraft.rp.Events.PlayerJoinEvents;

public class EventsHandler implements Listener {
    private Core core;
    public EventsHandler(Core core) {this.core = core;}

    @EventHandler
    private void onPlayerJoinEvent(PlayerJoinEvent event) {
        PlayerJoinEvents playerJoinEvents = new PlayerJoinEvents(core, event);
    }
}
