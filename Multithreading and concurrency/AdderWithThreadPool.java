package com.techm.multithreading;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AdderWithThreadPool implements Runnable {

	private static String inFile;
	private static String outFile;
	public AdderWithThreadPool(String inFile, String outFile)
	{
		this.inFile=inFile;
		this.outFile=outFile;
	}
	
	public void doAdd() throws IOException
	{
		
		  System.out.println("hiii");
			  
	}
	public void run()
	{
		try {
			doAdd();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		String[] inFiles={"./file1.txt","./file2.txt","./file3.txt","./file4.txt","./file5.txt","./file6.txt"};
		String[] outFiles={"./file1.out.txt","./file2.out.txt","./file3.out.txt","./file4.out.txt","./file5.out.txt","./file6.out.txt"};
     ExecutorService es=Executors.newFixedThreadPool(3);
     
		  for(int i=0;i<inFiles.length;i++)
		  {
  AdderWithThreadPool adder=new AdderWithThreadPool(inFile, outFile);
     es.submit(adder);
		  }
		  es.shutdown();
		  try {
			es.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		  
	}


}
