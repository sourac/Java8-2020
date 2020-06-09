/**
 * 
 */
package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class Stream3 {

	public static final int MAX = 1000000;

	public static void main(String[] args) {
		sortsequential();
		sortParallel();
	}

	/**
	 * sequential sort
	 * 
	 */
	private static void sortsequential() {

		List<String> values = new ArrayList<String>(MAX);
		for (int i = 0; i < MAX; i++) {
			UUID uuid = UUID.randomUUID();
			values.add(uuid.toString());
		}

		long t0 = System.nanoTime();

		long count = values.stream().sorted().count();
		System.out.println(count);

		long t1 = System.nanoTime();

		long timetaken = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("sequential sort took : %d ms", timetaken));

	}

	/**
	 * parallel sort
	 */
	private static void sortParallel() {

		List<String> values = new ArrayList<String>(MAX);
		for (int i = 0; i < MAX; i++) {
			UUID uuid = UUID.randomUUID();
			values.add(uuid.toString());
		}

		long t0 = System.nanoTime();

		long count = values.parallelStream().sorted().count();
		System.out.println(count);

		long t1 = System.nanoTime();

		long timetaken = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("parallel sort took : %d ms", timetaken));

	}

}
