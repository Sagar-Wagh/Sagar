package com.techm.stringjoiner;

public class StringFormatSpecifier {

	public static void main(String[] args) {
		int david=15,jhon=13,jack=8,harry=2;
		//concatenation vs. formatting
		String s1="My nephews are "+david+","+jhon+","+jack+","+harry+" years old";
       System.out.println(s1);
      
       String s2=String.format("My nephews are %d, %d, %d and %d years old",
    		   david,jhon,jack,harry);
	   System.out.println(s2);
       
       double avgDiff=((david-jhon)+(jhon-jack)+(jack-harry))/3.0d;
       String s3="The average between each is "+avgDiff+" years";
       System.out.println(s3);
       
       String s4=String.format("The average betwwen each is %.1f years",avgDiff);
       System.out.println(s4);
       //Format Flag:#
     //Decimal representation
       String s5=String.format("%d", 32);
       System.out.println(s5);
      //Octal representation
       String s6=String.format("%o", 32);
       String s7=String.format("%#o", 32);
       System.out.println(s6);
       System.out.println(s7);
       
       //Hex representation
       String s8=String.format("%x", 32);
       String s9=String.format("%#x", 32);
       String s10=String.format("%#X", 32);
       System.out.println(s8);
       System.out.println(s9);
       System.out.println(s10);
	}

}
