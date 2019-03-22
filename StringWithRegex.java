package com.techm.stringjoiner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWithRegex {

	public static void main(String[] args) {
		String s1="apple, apple and orange please";
		String s2=s1.replaceAll("ple", "ricot");
        System.out.println(s2);
        
        String s3=s1.replaceAll("ple\\b", "ricot");
        System.out.println(s3);
        System.out.println("---------------------------");
        String[] parts=s1.split("\\b");
        for(String part:parts)
        System.out.println(part);
        System.out.println("----------------------------");
        for(String thePart:parts)
        	if(thePart.matches("\\w+"))
            System.out.println(thePart);
        
        System.out.println("-----------------------------");
        //Using Pattern and Matcher classes
        Pattern pattern=Pattern.compile("\\w+");
        Matcher matcher=pattern.matcher(s1);
        
        while(matcher.find())
        	System.out.println(matcher.group());
	}

}
