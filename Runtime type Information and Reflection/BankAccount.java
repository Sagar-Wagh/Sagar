package com.techm.runtimetype;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BankAccount {
private final String id;
private int balance=0;

     public BankAccount(String id) 
     {
	    this.id = id;
     }
	
     public BankAccount(String id, int balance) 
     {
	   this.id = id;
	   this.balance = balance;
     }

   public String getId()
   {
	   System.out.println(id);
	return id;
	   
   }
   public synchronized int getBalance()
   { 
	   System.out.println(id+" "+balance);
	return balance;
	   
   }
	public synchronized void deposit(int amount)
	{
		balance+=amount;
	}
	public synchronized void withdrawal(int amount)
	{
		balance-=amount;
	}
	static void doWork(Object obj)
	{
		Class<?> c=obj.getClass();
		showName(c);
	}
	
	//Class Instance from String name
	static void getName() 
	{
		 
		try {
			Class<?>	c = Class.forName("com.techm.runtimetype.BankAccount");
			  showName(c);
		    } catch (ClassNotFoundException e)
		     {
		    	e.printStackTrace();
		     }
	  
	}
	
	//Class Instance from Type literal
	static void getClassName()
	{
		Class<?> c=BankAccount.class;
		showName(c);
	}
	
	
	static void showName(Class<?> theClass)
	{
		System.out.println(theClass.getSimpleName());
	}
	
	static void fieldInfo(Object obj)
	{
		Class<?> theClass=obj.getClass();
		Field[] fields=theClass.getFields();
		displayFields(fields);
		
		Field[] declaredFields=theClass.getDeclaredFields();
		displayFields(declaredFields);
		
	}
 static void displayFields(Field[] arr) {
	
	 for(Field f:arr)
			System.out.println(f.getName()+" : "+f.getType());
	}
 
 static void callGetId(Object obj)
 {
	
	 try {
		 Class<?> theClass=obj.getClass();
		Method m=theClass.getMethod("getId()");
		Object result=m.invoke(obj);
		System.out.println("result "+ result);
	
	} catch (Exception e) {
		
		e.printStackTrace();
	} 
 }

public static void main(String[] args) {
	BankAccount acc1=new BankAccount("1234");
	BankAccount acc2=new BankAccount("5678", 500);
	doWork(acc1);
	getName();
	getClassName();
	fieldInfo(acc1);
	callGetId(acc1);
    // acc1.getId();
    // acc2.getBalance();
	}

}
