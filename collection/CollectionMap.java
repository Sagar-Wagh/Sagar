package com.techm.collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {

	//Using Map
	
	public static void main(String[] args) {
	Map<String, String>map=new HashMap<>();
	map.put("1111", "sagar");
	map.put("2222", "sushil");
	map.put("3333", "abhinav");
	
	String s1=map.get("1111");
	System.out.println(s1);
	
	String s2=map.get("8888");
	System.out.println(s2);

	 String s3=map.getOrDefault("9999", "xyz");
	 System.out.println(s3);
	 System.out.println("--------------------------");
	 map.forEach((k,v)->System.out.println(k +" | "+v));
	 System.out.println("--------------------------");
	 map.replaceAll((k,v)->v.toUpperCase());
	 map.forEach((k,v)->System.out.println(k +" | "+v));
	}

}
