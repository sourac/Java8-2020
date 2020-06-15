/**
 * 
 */
package com.java8.StringJoiner;

import java.util.StringJoiner;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class StringJoinerExample {

	/*
	 * Stringjoiner class is added in util package and is used to create a sequence
	 * of character separated by delimiter.
	 */

	public static void main(String[] args) {

		StringJoiner stringJoiner = new StringJoiner(",");
		stringJoiner.add("Citrix");
		stringJoiner.add("Verizone");
		stringJoiner.add("Amazon");
		stringJoiner.add("Facebook");
		stringJoiner.add("Google");
		
		System.out.println(stringJoiner);

	}

}
