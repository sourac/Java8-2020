/**
 * 
 */
package com.java8.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class Lambda7 {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Atul", 28));
		persons.add(new Person("Ciara", 27));
		persons.add(new Person("Dominco", 29));
		persons.add(new Person("Alex ", 25));
		persons.add(new Person("Greg ", 20));

		System.out.println("Before sorting the list : ");
		System.out.println(persons);
		Collections.sort(persons, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		
		System.out.println("-------------------------------------");
		System.out.println("After sorting with name : " );
        System.out.println(persons);
        
 
	}

}
