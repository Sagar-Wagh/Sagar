package com.techm.logsystem;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogMethodTypes2 {
	static Logger logger=LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
		 logger.setLevel(Level.ALL);
	        logger.entering("com.techm.logsystem.LogMethodTypes2", "main");
	        logger.logp(Level.WARNING, "com.techm.logsystem.LogMethodTypes", "main", "Warning level");
	        logger.exiting("com.techm.logsystem.LogMethodTypes2", "main");

	}

}
