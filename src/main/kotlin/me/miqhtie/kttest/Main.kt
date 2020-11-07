package me.miqhtie.kttest

import me.miqhtie.kttest.commands.ExampleCommand
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {


    /**
     * @author Miqhtie
     */


    override fun onEnable() {
        println("Example Plugin Started");
        getCommand("example")!!.setExecutor(ExampleCommand());
    }
}