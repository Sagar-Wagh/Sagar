package com.techm.appexecution;

public class simpleDemo {

	public static void main(String[] args) {
  if(args.length<1)
	  System.out.println("No arguments provided");
  else
  {
	  for(String words:args)
		  System.out.println(words);
  }

	}

}
