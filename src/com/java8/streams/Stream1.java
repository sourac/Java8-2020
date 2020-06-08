package com.java8.streams;

import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {

		//way to create a stream
		//this is a stream of val
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p->System.out.println(p));
		
		//stream of array of elements
		Stream<Integer> stream1=Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
		stream1.forEach(p->System.out.println(p));

	}

}
