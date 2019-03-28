package com.techm.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BankAccount2 {
	 public int balance;
	  
		public BankAccount2(int startBalance) {
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
        public void withdraw(int amount)
        {
        	balance-=amount;
        }
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(5);
		BankAccount2 b1=new BankAccount2(1000);
		TxWorker worker1=new TxPromoWorker(b1,'d',1000);
		BankAccount2 b2=new BankAccount2(1000);
		TxWorker worker2=new TxPromoWorker(b1,'d',1000);
		BankAccount2 b3=new BankAccount2(1000);
		TxWorker worker3=new TxPromoWorker(b1,'d',1000);
		BankAccount2 b4=new BankAccount2(1000);
		TxWorker worker4=new TxPromoWorker(b1,'d',1000);
		BankAccount2 b5=new BankAccount2(1000);
		TxWorker worker5=new TxPromoWorker(b1,'d',1000);
												
		
		TxWorker[] workers={worker1,worker2,worker3,worker4,worker5};
		
		for(TxWorker worker:workers)
					es.submit(worker);
		es.shutdown();
		  try {
			es.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

	}

}
