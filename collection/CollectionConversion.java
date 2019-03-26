 package com.techm.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionConversion {

	private String label;
	private String value;

	public CollectionConversion(String label, String value) {
		this.label=label;
		this.value=value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static void main(String[] args) {

		//Arraylist to Array
		ArrayList<CollectionConversion> list=new ArrayList<>();
		list.add(new CollectionConversion("c1","abc"));
		list.add(new CollectionConversion("c2","xyz"));
		list.add(new CollectionConversion("c1","abc"));
		Object objArray=list.toArray();
		
		CollectionConversion[] a1=list.toArray(new CollectionConversion[0] );
		CollectionConversion[] a2=new CollectionConversion[3];
		CollectionConversion[] a3=list.toArray(a2);
		
		if(a2==a3)
			System.out.println("a2 and a3 reference the same array");

		System.out.println("------------------------------");
		//Retriving a colection from an array
		CollectionConversion[] myArray={
				new CollectionConversion("val1", "abc"),
				new CollectionConversion("val2", "xyz"),
				new CollectionConversion("val3", "abc")
		};
		
		Collection<CollectionConversion> list1=Arrays.asList(myArray);
		list1.forEach(c->System.out.println(c.getLabel()));
	}

}
