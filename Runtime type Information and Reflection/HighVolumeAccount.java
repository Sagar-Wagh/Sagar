package com.techm.runtimetype;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class HighVolumeAccount extends BankAccount implements Runnable{

	public HighVolumeAccount(String id) {
		super(id);
		}
     public HighVolumeAccount(String id, int balance)
     {
    	 super(id, balance);
     }
     private int[] readDailyDeposits()
     {
		return null;
     }
     
     private int[] readDailyWithdrwals()
     {
		return null;
    	 
     }
	
	public void run() {
		for(int depositAmt:readDailyDeposits())
			deposit(depositAmt);
		for(int withdrawalAmt:readDailyWithdrwals())
			withdrawal(withdrawalAmt);
	}
	
	static void classInfo(Object o)
	{
		Class<?> theClass=o.getClass();
		System.out.println(theClass.getSimpleName());
		Class<?> superClass=theClass.getSuperclass();
		System.out.println(superClass.getSimpleName());
		Class<?>[] interfaces=theClass.getInterfaces();
		for(Class<?> interface1:interfaces)
		System.out.println(interface1.getSimpleName());
	}
	
	static void typeModifiers(Object obj)
    {
		Class<?> theClass=obj.getClass();
		int modifiers=theClass.getModifiers();
		if((modifiers & Modifier.FINAL)>0)
		{
			System.out.println("bitwise check-final");
		}
		if(Modifier.isFinal(modifiers))
		{
			System.out.println("method check-final");
		}
		if(Modifier.isPrivate(modifiers))
		System.out.println("method check - private");
	    
		else if(Modifier.isProtected(modifiers))
			System.out.println("method check - protected");
		
		else if(Modifier.isPublic(modifiers))
			System.out.println("method check - public");
		
		}
	
	static void methodInfo(Object obj)
	{
		Class<?> theClass=obj.getClass();
		Method[] methods=theClass.getMethods();
		for(Method m:methods)
			if(m.getDeclaringClass()!=Object.class)
			System.out.println(m.getName());
		
	   Method[] declaredMethods=theClass.getDeclaredMethods();
	   for(Method m:declaredMethods)
		   System.out.println(m.getName());
	}
		
		
		public static void main(String[] args) {
	
		HighVolumeAccount hva=new HighVolumeAccount("3456");
		classInfo(hva);
		typeModifiers(hva);
		methodInfo(hva);
	}
}
