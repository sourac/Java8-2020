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
public class StringJoinerMergeExample {

	public static void main(String[] args) {

		StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
		stringJoiner.add("Citrix");
		stringJoiner.add("Verizone");
		System.out.println(stringJoiner);

		StringJoiner stringJoiner1 = new StringJoiner(":", "[", "]");
		stringJoiner1.add("Amazon");
		stringJoiner1.add("Facebook");
		stringJoiner1.add("Google");
		
		System.out.println(stringJoiner1);
		
		//Now merging these two stringJoiners
		
	}

}
