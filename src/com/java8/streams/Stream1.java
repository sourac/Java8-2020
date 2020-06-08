package com.java8.streams;

import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {

		//way to create a stream
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p->System.out.println(p));

	}

}
