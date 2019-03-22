package com.techm.stringjoiner;

public class StringFormatFlag2 {
//Format flag:space,+ and (
	public static void main(String[] args) {
    String s1=String.format("%d", 123);
    String s2=String.format("%d", -456);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println("---------------------------");
    
    String s3=String.format("% d", 123);
    String s4=String.format("% d", -456);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println("---------------------------");
    
    String s5=String.format("%+d", 123);
    String s6=String.format("%+d", -456);
    System.out.println(s5);
    System.out.println(s6);
    System.out.println("---------------------------");
    
    String s7=String.format("%(d", 123);
    String s8=String.format("%(d", -456);
    System.out.println(s7);
    System.out.println(s8);
    String s9=String.format("% (d", 123);
    System.out.println(s9);
	}

}
