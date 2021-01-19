     /**
 * 
 */
package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class Stream2 {

	public static void main(String[] args) {
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");

		// filtering based on certain criteria
		stringCollection.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);

		System.out.println("---------------------------------------------------------------------");

		// sorting
		stringCollection.stream().sorted().filter((s) -> s.startsWith("a")).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------------");

		// mapping
		stringCollection.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a))
				.forEach(System.out::println);
		System.out.println("---------------------------------------------------------------------");

		// matching o/p: true
		boolean anyStartWithA = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));
		System.out.println(anyStartWithA);
		System.out.println("---------------------------------------------------------------------");

		boolean allStartsWithA = stringCollection.stream().allMatch((s) -> s.startsWith("a"));
		System.out.println(allStartsWithA);
		System.out.println("---------------------------------------------------------------------");

		boolean noneStartsWithZ = stringCollection.stream().noneMatch((s) -> s.startsWith("z"));
		System.out.println(noneStartsWithZ);
		System.out.println("---------------------------------------------------------------------");

		//count
		long startsWithB = stringCollection.stream().filter((s) -> s.startsWith("b")).count();
		System.out.println(startsWithB);
		System.out.println("---------------------------------------------------------------------");

	}

}
