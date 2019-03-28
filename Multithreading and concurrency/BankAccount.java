package com.techm.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BankAccount {
  public int balance;
  
	public BankAccount(int startBalance) {
	balance = startBalance;
}
	public int getBalance()
	{
		return balance;
		
	}
	public  void deposit(int amount)
	{
		balance+=amount;
	}

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(5);
		BankAccount account=new BankAccount(100);
		for(int i=0;i<5;i++){
		Worker worker=new Worker(account);
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
