package com.techm.lambdaexample;

import java.io.File;
import java.io.FileFilter;

public class FirstLambdaExample {

	 public static void main(String[] args) {
	/*	FileFilter filter=new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".java");
			}
		};
		*/
		FileFilter firstLambda=(File pathname) -> pathname.getName().endsWith(".java");
		
		File dir=new File("D:/Java8Features");
		
		File[] files=dir.listFiles(firstLambda);
		for(File f:files)
		{
			System.out.println(f);
		}
	}
}
