package com.colbyreinhart.wayfinder;

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.Listener
import org.bukkit.Bukkit

class Wayfinder: JavaPlugin()
{
	override fun onEnable()
	{
		Bukkit.getPluginManager().registerEvents(LodestoneCompassUseListener(), this);
	}
}
