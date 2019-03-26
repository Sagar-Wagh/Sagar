package com.techm.collections;

import java.util.TreeSet;


//implementing comparable interface 

public class CollectionSort implements Comparable<CollectionSort>
{
	
	String label,value;
	public CollectionSort(String label, String value)
	{
		this.label=label;
		this.value=value;
	}

	public String toString(){return label+" | "+value;}
	
	 public boolean equals(Object obj)
	 {
		CollectionSort other= (CollectionSort)obj;
		 
		 return value.equalsIgnoreCase(other.value) ;
	 }
	
	  
    @Override
	public int compareTo(CollectionSort other) 
	{
		return value.compareToIgnoreCase(other.value);
	}
	
    
    public static void main(String[] args) {
		
		
		 TreeSet<CollectionSort> tree=new TreeSet<>();
			tree.add(new CollectionSort("2222","ghi"));
			tree.add(new CollectionSort("3333","abc"));
			tree.add(new CollectionSort("1111","def"));
			
			tree.forEach(m->System.out.println(m));
		}
	

}
