/**
 * 
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class Stream6 {

	public static void main(String[] args) {

		fireUp1();
		fireUp2();
		fireUp3();

	}


	/**
	 * 
	 */
	private static void fireUp3() {
		IntStream.range(0, 10).average().ifPresent(System.out::println);

	}

	/**
	 * 
	 */
	private static void fireUp2() {
		IntStream.builder().add(1).add(3).add(5).add(7).add(11).build().average().ifPresent(System.out::println);

	}

	/**
	 * 
	 */
	private static void fireUp1() {

		int[] ints = { 1, 3, 5, 7, 11 };
		Arrays.stream(ints).average().ifPresent(System.out::println);

	}

}
