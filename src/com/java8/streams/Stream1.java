package com.java8.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {

		// way to create a stream
		// this is a stream of val
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.print(p));
		System.out.println();
		System.out.println("--------------------------------------------");

		// stream of array of elements
		Stream<Integer> stream1 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		stream1.forEach(p -> System.out.print(p));
		System.out.println();
		System.out.println("--------------------------------------------");

		// list stream
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		//stream generate
		Stream<Integer> stream2 = list.stream();
		stream2.forEach(p -> System.out.print(p));
		System.out.println();
		System.out.println("--------------------------------------------");
		
//		Stream<Date> stream3 = Stream.generate(() -> {
//			return new Date();
//		});
//		stream3.forEach(p->System.out.println(p));
//		System.out.println();
//		System.out.println("--------------------------------------------");
//		
		
		//instream
		IntStream stream4 = "12345_abcdefg".chars();
		stream4.forEach(p->System.out.println(p));
		System.out.println();
		System.out.println("--------------------------------------------");
		

	}

}
