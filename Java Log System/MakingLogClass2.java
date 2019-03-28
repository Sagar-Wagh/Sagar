package com.techm.logsystem;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MakingLogClass2 {

	static Logger logger=LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
		
		logger.log(Level.INFO,"My First log message");
		logger.log(Level.INFO,"Another Message");
		
		System.out.println("-------------------");
		logger.setLevel(Level.FINE);
		logger.log(Level.SEVERE,"Severe level");
		logger.log(Level.FINE, "Fine level");
		logger.log(Level.FINEST, "Finest level");
	}

}
