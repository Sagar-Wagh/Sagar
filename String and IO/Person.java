package com.techm.string;

public class Person {
private String name;
private int age;
 private String gender;
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getGender() {
	return gender;
}
public Person(String name, int age, String gender) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
}

}
