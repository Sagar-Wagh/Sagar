package com.techm.runtimetype;

public class AccountWorker implements Runnable {
 BankAccount ba;
 static HighVolumeAccount hva;
 
	public AccountWorker(BankAccount ba) {
	super();
	this.ba = ba;
	
}
	 public AccountWorker(HighVolumeAccount hva) {
		super();
		 this.hva=hva;
		
	}
	 public  void doWork()
	 {
		 Thread t=new Thread(hva!=null ? hva:this);
			t.start();	 
	 }

	@Override
	public void run() {
		char txType='w';
		int amt=500;
	  if(txType=='w')
		  ba.withdrawal(amt);
	  else
		  ba.deposit(amt);
	
	}
	public static void main(String[] args) {
		AccountWorker aw=new AccountWorker(hva);
		aw.doWork();
	}

}
