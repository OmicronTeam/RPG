package org.omicroncraft.toolbox;

import org.bukkit.ChatColor;

public class StringTool {

	public static String paint(String string) {
		return ChatColor.translateAlternateColorCodes('&', string);
	}

}
