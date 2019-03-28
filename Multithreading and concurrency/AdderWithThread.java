package com.techm.multithreading;

import java.io.IOException;

public class AdderWithThread implements Runnable{
	private static String inFile;
	private static String outFile;
	public AdderWithThread(String inFile, String outFile)
	{
		this.inFile=inFile;
		this.outFile=outFile;
	}
	
	public void doAdd() throws IOException
	{
		
		  System.out.println("hi");
			  
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
     Thread[] threads=new Thread[inFiles.length];
     
		  for(int i=0;i<inFiles.length;i++)
		  {
  AdderWithThread adder=new AdderWithThread(inFile, outFile);
   threads[i]=new Thread(adder);
  threads[i].start();
		  }
		  for(Thread thread:threads)
			try {
				thread.join();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
	}

}
