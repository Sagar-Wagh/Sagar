package com.techm.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerEdgeCaseHandle {

	public static void main(String[] args) {
		//Handling a single value
		StringJoiner sj=new StringJoiner(", ");
        sj.add("Alpha");
        String result=sj.toString();
        System.out.println(result);
        
      //StringJoiner with start and end values handling a single value
        StringJoiner sj1=new StringJoiner(", ", "{", "}");
        sj1.add("Alpha");
        String result1=sj1.toString();
        System.out.println(result1);
        
      //Handling No added values
        StringJoiner sj2=new StringJoiner(", ", "{", "}");
        String result2=sj2.toString();
        System.out.println(result2);
     
      //Handling EMPTY value
        StringJoiner sj3=new StringJoiner(", ", "{", "}");
        sj.setEmptyValue("EMPTY");
        String result3=sj3.toString();
        System.out.println(result3);
        
	}

}
