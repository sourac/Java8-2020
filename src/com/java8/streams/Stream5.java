/**
 * 
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class Stream5 {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("d2", "a2", "b1", "b3", "c");

		fire(strings);

	}

	/**
	 * @param strings
	 */
	private static void fire(List<String> strings) {
		strings
		.stream()
		.map(s -> {
			System.out.println("map : " + s);
			return s.toUpperCase();
		}).filter(s -> {
			System.out.println("filter :" + s);
			return s.startsWith("A");
		}).forEach(s -> System.out.println("foreach : " + s));

	}

}
