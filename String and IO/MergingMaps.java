package com.techm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;






public class MergingMaps {

	public static void main(String[] args) {
		 List<Person> person=new ArrayList();
			
			try(BufferedReader reader=new BufferedReader(new InputStreamReader(
              MergingMaps.class.getResourceAsStream("people.txt")));
			
			Stream<String> stream=reader.lines();	
					){
				stream.map(line->{
					String[] s=line.split(" ");
					Person p=new Person(s[0].trim(), 
							Integer.parseInt(s[1]),
							s[2].trim());
					person.add(p);
					return p;
				
				})
				.forEach(System.out::println);
	}catch (IOException e) {
		System.out.println(e);
	}
  List<Person> list1=person.subList(1, 4);
  List<Person> list2=person.subList(4, person.size());
  
  Map<Integer, List<Person>> map1=mapByAge(list1);
  System.out.println("map1");
  map1.forEach((age,list)->System.out.println(age+":"+list));
  
  
 Map<Integer, List<Person>> map2=mapByAge(list2);
 System.out.println("map2");
 map2.forEach((age,list)->System.out.println(age+":"+list));
 
 
  map2.entrySet().stream()
  .forEach(
		  entry->
		    map1.merge(
		    		entry.getKey(),
		    		entry.getValue(),
		    		(l1,l2)->{
		    			l1.addAll(l2);
		    			return l1;
		    		}
		    		)
		  
		  );
  System.out.println("map 1 merged");
  map1.forEach((age,list)->System.out.println(age+":"+list));
}
	private static Map<Integer, List<Person>> mapByAge(List<Person> list)
	{
		Map<Integer, List<Person>> map=
	list.stream().collect(Collectors.groupingBy(Person::getAge));
	return map;
		
	}
}
