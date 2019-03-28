package com.techm.appexecution;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class LoadingDefaultProperty {

	public static void main(String[] args) {
	try {
		Properties defaultProp=new Properties();
		try(InputStream inputStream=LoadingDefaultProperty.class.getResourceAsStream("MyDefaultValues.xml"))
				{
					defaultProp.loadFromXML(inputStream);
				}
				Properties userProp=new Properties(defaultProp);
				loadUserProp(userProp);
				
				String welcomeMessage=userProp.getProperty("welcomeMessage");
				String farewellMessage=userProp.getProperty("farewellMessage");
				
				System.out.println(welcomeMessage);
				System.out.println(farewellMessage);
				
				if(userProp.getProperty("isFirstRun").equalsIgnoreCase("Y"))
				{
					userProp.setProperty("welcomeMessage", "Welcome Back");
					userProp.setProperty("farewellMessage", "Things will be familier soon");
					userProp.setProperty("isFirstRun", "N");
					saveUserProp(userProp);
				}
				
	} catch (IOException e) 
	{
		System.out.println(e.getClass().getSimpleName()+"-"+e.getMessage());
	}
	
	}
	
	private static void saveUserProp(Properties userProp)throws IOException {
		try(OutputStream outputStream=Files.newOutputStream(Paths.get("userValue.xml"))){
			userProp.storeToXML(outputStream, null);
		}
		
	}

	private static Properties loadUserProp(Properties userProp) throws IOException
	{
		Path userFile=Paths.get("userValue.xml");
		if(Files.exists(userFile))
		{
			try(InputStream inputStream=Files.newInputStream(userFile)){
				userProp.loadFromXML(inputStream);
			}
		}
		return userProp;
		
	}

}
