package com.techm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BuildingBiMaps {

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
			
			person.forEach(System.out::println);
			Map<Integer, List<Person>> map=
					person.stream().collect(Collectors.groupingBy(Person::getAge));
					
			
			map.forEach((age,list)->System.out.println(age+":"+list));
			
			Map<Integer, Map<String,List<Person>>> biMap=
					new HashMap<>();
			
			person.forEach(persons->biMap.computeIfAbsent(
                                persons.getAge(),
                                HashMap::new )
					.merge(
                       persons.getGender(), 
                       new ArrayList<>(Arrays.asList(persons)),
                       (l1,l2)->{
                    	   l1.addAll(l2);
                    	   return l1;
                       }
							));
			
			System.out.println("Bimap:");
			biMap.forEach(
				(age,m)->System.out.println(age+" "+m)	);
					

	}

}
