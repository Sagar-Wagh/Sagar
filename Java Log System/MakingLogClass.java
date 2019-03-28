package com.techm.logsystem;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MakingLogClass {

	public static void main(String[] args) {
		LogManager lm=LogManager.getLogManager();
		Logger logger=lm.getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.log(Level.INFO,"My First log message");
		logger.log(Level.INFO,"Another Message");

	}

}
