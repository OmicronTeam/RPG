package org.omicroncraft.toolbox;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTool {

	private static Logger mc = Logger.getLogger("Minecraft");

	public static void log(Level level, String msg) {
		mc.log(level, msg);
	}

	public static void logException(Level level, Throwable e) {
		mc.log(level, "Exception thrown:\n" + e.getLocalizedMessage());
	}

	public static void logException(Level level, Throwable e, String extraInfo) {
		mc.log(level, extraInfo + "\nException info:\n" + e.getLocalizedMessage());
	}
	
	public static void logSevere(String msg) {
		mc.severe(msg);
	}
	
	public static void logWarning(String msg) {
		mc.warning(msg);
	}
	
	public static void logInfo(String msg) {
		mc.info(msg);
	}

}
