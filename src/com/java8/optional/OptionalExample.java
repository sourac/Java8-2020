/**
 * 
 */
package com.java8.optional;

import java.util.Optional;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class OptionalExample {
	/*
	 * introduced in java-8, used to deal with NullPointerException in java. it's in
	 * the util package.
	 */
	public static void main(String[] args) {

		String[] str = new String[10];
		// when the value is not present
		Optional<String> opt = Optional.ofNullable(str[1]);
		if (opt.isPresent()) {
			System.out.println("value is present...");
		} else {
			System.out.println("value is not present...");
		}

		//when the value is present.
		String[] str1 = new String[10];
		str1[1] = "Hello world";
		Optional<String> opt1 = Optional.ofNullable(str1[1]);
		if(opt1.isPresent()) {
			System.out.println("value present...");
		}else {
			System.out.println("value is not present...");
		}

	}

}
