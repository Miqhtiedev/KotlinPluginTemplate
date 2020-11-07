package me.miqhtie.kttest.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent

class ExampleEvent : Listener {
    @EventHandler
    fun moveEvent(event: PlayerMoveEvent){
        //Code runs when player moves.
        println("The player has moved from ${event.from} to ${event.to}");
    }
}