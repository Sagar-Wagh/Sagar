package com.techm.appexecution;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class StorePropertyAsXML {

	public static void main(String[] args) {
		 Properties prop=new Properties();
         prop.setProperty("displayName", "Sagar");
         prop.setProperty("accountNumber", "123-657-4938");
         try(OutputStream out=Files.newOutputStream(Paths.get("xyz.xml")))
         {
        	 prop.store(out, "My Comment");
         }catch (Exception e) {
			
		}

         try(InputStream in=Files.newInputStream(Paths.get("xyz.xml")))
        		 {
        	 prop.loadFromXML(in);
        		 }catch (Exception e) {
					
				}
         String val1=prop.getProperty("displayName");
         System.out.println(val1);
         String val2=prop.getProperty("accountNumber");
         System.out.println(val2);
	}

}
