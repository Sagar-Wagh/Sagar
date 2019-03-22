package com.techm.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(", ");
		sj.add("abc");
		sj.add("pqr");
		sj.add("xyz");
		
		String result=sj.toString();
 System.out.println(result);
 
 //StringJoiner with chaining methods
 StringJoiner sj1=new StringJoiner(", ");
	sj1.add("Alpha").add("Theta").add("Gamma");
	
	String result1=sj1.toString();
	 System.out.println(result1);
	

	//StringJoiner with start and end values
	 StringJoiner sj2=new StringJoiner(", ", "{", "}");
		sj2.add("Alpha");
		sj2.add("Theta");
		sj2.add("Gamma");
		
		String result2=sj2.toString();
		 System.out.println(result2);
		 
	//StringJoiner with more involved separator
		 StringJoiner sj3=new StringJoiner("], [", "[", "]");
			sj3.add("Alpha");
			sj3.add("Theta");
			sj3.add("Gamma");
			
			String result3=sj3.toString();
			 System.out.println(result3);
		}
}
