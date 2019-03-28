package com.techm.appexecution;

import java.util.Properties;

public class DefaultProperties {

	public static void main(String[] args) {
		Properties defaults=new Properties();
		defaults.setProperty("position", "1");
		
		Properties prop=new Properties(defaults);
		String s1=prop.getProperty("position");
		System.out.println(s1);
		
		int iPos=Integer.parseInt(s1);
		
		prop.setProperty("position",Integer.toString(++iPos));
		
		s1=prop.getProperty("position");
		System.out.println(s1);

	}

}
