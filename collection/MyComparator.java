package com.techm.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator implements  Comparator<MyClass>{


	public static void main(String[] args) {
		 TreeSet<MyClass> tree=new TreeSet<>(new MyComparator());
			tree.add(new MyClass("2222","ghi"));
			tree.add(new MyClass("3333","abc"));
			tree.add(new MyClass("1111","def"));

			tree.forEach(m->System.out.println(m));
	}

	@Override
	public int compare(MyClass x, MyClass y) {
		
		return x.getLabel().compareToIgnoreCase(y.getLabel());
	}

}
