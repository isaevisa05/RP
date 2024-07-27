package ru.laimcraft.rp.Events;

import org.bukkit.event.player.PlayerJoinEvent;
import ru.laimcraft.rp.Core;

public class PlayerJoinEvents {
    private Core core;
    private PlayerJoinEvent event;
    public PlayerJoinEvents(Core core, PlayerJoinEvent event) {this.core = core; this.event = event;}
}
