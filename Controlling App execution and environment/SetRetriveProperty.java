package com.techm.appexecution;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class SetRetriveProperty {

	public static void main(String[] args) {
		Properties props=new Properties();
	    props.setProperty("displayName","Sagar");
	    String name=props.getProperty("displayName");
         System.out.println(name);
         String accNum=props.getProperty("accountNumber");
         System.out.println(accNum);
         String nextPos=props.getProperty("position","1");
         System.out.println(nextPos);
         
         //Storing Properties as simple text
         
         Properties prop=new Properties();
         prop.setProperty("displayName", "Sagar");
         prop.setProperty("accountNumber", "123-657-938");
         try(Writer writer=Files.newBufferedWriter(Paths.get("xyz.properties")))
         {
        	 prop.store(writer, "My Comment");
         }catch (Exception e) {
			
		}
	}

}
