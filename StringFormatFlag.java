package com.techm.stringjoiner;

public class StringFormatFlag {

	public static void main(String[] args) {
		String s1=String.format("W:%d X:%d", 5,345);
		String s2=String.format("Y:%d Z:%d", 480,15);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("--------------------------------");
		String s3=String.format("W:%4d X:%4d", 5,345);
		String s4=String.format("Y:%4d Z:%4d", 480,15);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("--------------------------------");
		String s5=String.format("W:%04d X:%04d", 5,345);
		String s6=String.format("Y:%04d Z:%04d", 480,15);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println("--------------------------------");
		String s7=String.format("W:%-4d X:%-4d", 5,345);
		String s8=String.format("Y:%-4d Z:%-4d", 480,15);
		System.out.println(s7);
		System.out.println(s8);
		
		//Format Flag:,
		String s9=String.format("%d", 1234567);
		System.out.println(s9);
		String s10=String.format("%,d", 1234567);
	    System.out.println(s10);
	    String s11=String.format("%,.2f", 1234567.0);
	    System.out.println(s11);
	}

}
