package com.techm.multithreading;

public class TxPromoWorker extends TxWorker {

	private int bonus;
	public TxPromoWorker(BankAccount2 account, char txType, int amt) {
		super(account, txType, amt);
		
	}
	public void run()
	{
		if(txType=='w')
			account.withdraw(amt);
		else if (txType=='d') {
			synchronized (account) {
				
			
			account.deposit(amt);
			if(account.getBalance()>500)
				  bonus = (int)((account.getBalance()-500)*0.1);
			account.deposit(bonus);
	}
	}
	}
}
