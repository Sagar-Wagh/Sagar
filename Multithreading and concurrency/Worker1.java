package com.techm.multithreading;

public class Worker1 implements Runnable {
	public BankAccount1 account;

	public Worker1(BankAccount1 account) {
		
		this.account = account;
	}
	public void run()
	{
	    synchronized(account){
		for(int i=0;i<10;i++){
		int startBalance=account.getBalance();
		account.deposit(10);
		int endBalance=account.getBalance();
		System.out.println("StartBalance "+startBalance);
		System.out.println("End Balance "+endBalance);
		}
	}}
}
