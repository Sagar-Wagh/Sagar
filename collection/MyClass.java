package com.techm.collections;

import java.util.ArrayList;
import java.util.List;

public class MyClass {

	private String label;
	private String value;

	public MyClass(String label, String value)
	{
		this.label=label;
		this.value=value;
	}
	public String toString(){return label+" | "+value;}
	public static void main(String[] args) {
		
		//Removing member from collection
		ArrayList<MyClass> list=new ArrayList<>();
		
		MyClass m1=new MyClass("m1","abc");
        MyClass m2=new MyClass("m2","abc");
        MyClass m3=new MyClass("m3","abc");
       
        
       list.add(m1);
        list.add(m2);
        list.add(m3);
        
        list.remove(m3);  //uses equals method to find match.
        
       // List<MyClass> t = list.stream
        
           for(MyClass m:list)
        	System.out.println(m.getLabel());
        
        System.out.println("-----------------------");
        //Java 8 collection feature
        
        ArrayList<MyClass> list1=new ArrayList<>();
        list1.add(m1);
        list1.add(m2);
        list1.add(m3);

       
        list1.forEach(m-> System.out.println(m.getLabel()));
	

	System.out.println("----------------------------");
	
	//Using removeIf method
	ArrayList<MyClass> list2=new ArrayList<>();
	
	MyClass v1=new MyClass("v1","abc");
    MyClass v2=new MyClass("v2","xyz");
    MyClass v3=new MyClass("v3","abc");
	
     list2.add(v1);
     list2.add(v2);
     list2.add(v3);
     
     list2.removeIf(m ->m.getValue().equals("abc"));
     list2.forEach(m ->System.out.println(m.getLabel()));
	
	}

     public	String getLabel() {
		
		return label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	public boolean equals(Object o)
	{
		MyClass other=(MyClass) o;
		
		return value.equalsIgnoreCase(other.value);
		
	}

}
