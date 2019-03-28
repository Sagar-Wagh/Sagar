package com.techm.multithreading;

public class Worker implements Runnable {
 public BankAccount account;

public Worker(BankAccount account) {
	
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
