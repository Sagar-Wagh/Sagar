package com.techm.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AdderWithCallable implements Callable<Integer> {
	private static String inFile;
	public AdderWithCallable(String inFile)
	{
		this.inFile=inFile;
		
	}
	public int doAdd()
	{
		System.out.println("Hello");
		return 0;
	}
	
	@Override
	public Integer call() throws Exception {
		
		return doAdd();
	}
	
	public static void main(String[] args) {
		String[] inFiles={"./file1.txt","./file2.txt","./file3.txt","./file4.txt","./file5.txt","./file6.txt"};
		ExecutorService es=Executors.newFixedThreadPool(3);
		Future<Integer>[] results=new Future[inFiles.length];
		
		for(int i=0;i<inFiles.length;i++)
		  {
AdderWithCallable adder=new AdderWithCallable(inFile);
   results[i]=es.submit(adder);
	}
		
		for(Future<Integer> result:results)
		{
			
			try {
				int value = result.get();
				System.out.println("total "+ value);
			} catch (ExecutionException e) {
				
				Throwable adderEx=e.getCause();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
	

}
}
