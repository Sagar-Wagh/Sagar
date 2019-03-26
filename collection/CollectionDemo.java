package com.techm.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionDemo {

	public static void main(String[] args) {
	//A simple collection of objects
		ArrayList list=new ArrayList<>();
		list.add("abc");
		list.add("pqr");
		System.out.println("Elements:" +list.size());
		
		for(Object o:list)
			System.out.println(o.toString());
		
		String s=(String) list.get(0);
		
		CollectionDemo c=new CollectionDemo();
		list.add(c);
System.out.println("----------------------------");
		
		//Collection and Type Safety
		ArrayList<String> list1=new ArrayList<>();
		list1.add("xyz");
		list1.add("mno");
		System.out.println("Elements:" +list1.size());
		
		for(String s1:list1)
			System.out.println(s1);
		String s2=list1.get(0);
		System.out.println("----------------------------");
		
		//Adding members from another collection
		LinkedList<String> list2=new LinkedList<>();
		list2.add("Sagar");
		list2.add("Sushil");
		list2.add("Abhinav");
		
		
		list1.addAll(list2);
		System.out.println("Elements:" +list1.size());
		for(String s1:list1)
			System.out.println(s1);
		
		
	}

}
