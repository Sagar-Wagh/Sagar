package com.techm.multithreading;

public class TxWorker implements Runnable{
  protected BankAccount2 account;
  protected char txType;
  protected int amt;
  
	public TxWorker(BankAccount2 account, char txType, int amt) {
	
	this.account = account;
	this.txType = txType;
	this.amt = amt;
}

	@Override
	public void run() {
		if(txType=='w')
			account.withdraw(amt);
		else if (txType=='d') {
			account.deposit(amt);
			
		}
		
	}

}
