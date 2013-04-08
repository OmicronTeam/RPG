package org.omicroncraft.craftbukkit;

import org.bukkit.plugin.java.JavaPlugin;

public class Omicron extends JavaPlugin {

	private static Omicron plugin;

	public void onEnable() {
		plugin = this;
		
	}

	public void onDisable() {

	}

	public static Omicron getPlugin() {
		return plugin;
	}

}
