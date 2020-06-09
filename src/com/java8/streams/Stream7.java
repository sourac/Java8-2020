/**
 * 
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class Stream7 {

	static class Person {
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

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
				new Person("David", 12));

		fireUp1(persons);
		fireUp2(persons);
		fireUp3(persons);
		fireUp4(persons);

	}

	/**
	 * @param persons
	 * 
	 *this will provide the summary of the person in the stream.
	 */
	private static void fireUp4(List<Person> persons) {
		IntSummaryStatistics ageSummary = persons.stream().collect(Collectors.summarizingInt(p -> p.age));
		
		System.out.println(ageSummary);

	}

	/**
	 * @param persons
	 * 
	 *                finding the average age of the person
	 */
	private static void fireUp3(List<Person> persons) {
		Double averageAge = persons.stream().collect(Collectors.averagingDouble(p -> p.age));
		System.out.println(averageAge);

	}

	/**
	 * @param persons
	 */
	private static void fireUp2(List<Person> persons) {
		Map<Integer, List<Person>> personByAge = persons.stream().collect(Collectors.groupingBy(o -> o.age));
		personByAge.forEach((age, p) -> System.out.format("age %s : %s\n", age, p));

	}

	/**
	 * @param persons
	 */
	private static void fireUp1(List<Person> persons) {
		List<Person> filteredList = persons.stream().filter(p -> p.name.startsWith("P")).collect(Collectors.toList());
		System.out.println(filteredList);

	}

}
