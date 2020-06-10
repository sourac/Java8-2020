/**
 * 
 */
package com.java8.lambdas;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */

interface addition {
	public int add(int a, int b);
}

public class Lambda4 {

	public static void main(String[] args) {
 
		//lamda with two parameter
		addition add = (a, b) -> {
			return a + b;
		};

		System.out.println("addition of  these two value is  : " + add.add(4, 5));

	}

}
