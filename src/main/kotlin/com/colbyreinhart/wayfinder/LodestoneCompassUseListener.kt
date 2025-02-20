package com.colbyreinhart.wayfinder

import org.bukkit.event.Listener
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.CompassMeta
import org.bukkit.Location
import org.bukkit.entity.Player

class LodestoneCompassUseListener: Listener
{
	@EventHandler
	fun onCompassClick(event: PlayerInteractEvent)
	{
		if (event.action.isRightClick && event.item?.type == Material.COMPASS)
		{
			val compassMeta: CompassMeta = event.item!!.itemMeta as CompassMeta
			compassMeta.lodestone?.let {
				event.player.teleport(it.offset(0, 1, 0).toLocation(event.player.world))
			}
		}
	}
}