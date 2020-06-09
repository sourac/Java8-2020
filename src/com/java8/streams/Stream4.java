/**
 * 
 */
package com.java8.streams;

import java.util.stream.IntStream;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class Stream4 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("---------------------------------------------------");
		
		IntStream.range(0, 10).forEach(i -> {
			if (i % 2 == 1)
				System.out.println(i);
		});
		
		System.out.println("---------------------------------------------------");
		IntStream.range(0, 10).filter(i->i%2==1).forEach(System.out::println);

	}

}
