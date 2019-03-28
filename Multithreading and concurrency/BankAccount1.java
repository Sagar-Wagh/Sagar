package com.techm.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BankAccount1 {
	 public int balance;
	  
		public BankAccount1(int startBalance) {
		balance = startBalance;
	}
		public synchronized int getBalance()
		{
			return balance;
			
		}
		public synchronized void deposit(int amount)
		{
			balance+=amount;
		}

		public static void main(String[] args) {
			ExecutorService es=Executors.newFixedThreadPool(5);
			BankAccount1 account1=new BankAccount1(100);
			
			for(int i=0;i<5;i++){
			Worker1 worker=new Worker1(account1);
			es.submit(worker);
			}
			  es.shutdown();
			  try {
				es.awaitTermination(60, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}

}
