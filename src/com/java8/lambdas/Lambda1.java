/**
 * 
 */
package com.java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class Lambda1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		// normal sorting
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});

		// sorting using lambda
		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});

		//
		Collections.sort(names, (String a, String b) -> b.compareTo(b));

		//lambda infer the type of the incoming data
		Collections.sort(names, (a, b) -> b.compareTo(a));
		
		//all the above lambda operations does the same thing.
		
		System.out.println(names);
		
		names.sort(Collections.reverseOrder());

		System.out.println(names);
	}

}
