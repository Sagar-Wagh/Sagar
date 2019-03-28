package com.techm.logsystem;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ParameterizedMethod {
	static Logger logger=LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
	logger.log(Level.INFO, "{0} is my favorite", "Java");
	logger.log(Level.INFO, "{0} is {1} km away from {2}", new Object[]{"Pune","120","Nagar"});
     doWork("Sagar", "Wagh");
	}
	public static void doWork(String fName,String lName)
	{
		logger.entering( "com.techm.logsystem.ParameterizedMethod", "doWork", new Object[]{"fName","lName"});
		String result="<"+fName+lName+">";
		logger.exiting( "com.techm.logsystem.ParameterizedMethod", "doWork", result);
	}

}
