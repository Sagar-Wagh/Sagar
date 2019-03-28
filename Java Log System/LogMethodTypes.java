package com.techm.logsystem;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogMethodTypes {
	static Logger logger=LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
		//Level convenience methods
		logger.severe("severe level");
        logger.fine("Fine level");
        
        //Precise log methods
        logger.logp(Level.INFO,"com.techm.logsystem.LogMethodTypes" , "main", "Info level");
        
        //Precise convenience method
        logger.setLevel(Level.ALL);
        logger.entering("com.techm.logsystem.LogMethodTypes", "main");
        logger.logp(Level.WARNING, "com.techm.logsystem.LogMethodTypes", "main", "Warning level");
        logger.exiting("com.techm.logsystem.LogMethodTypes", "main");	
	}

}
