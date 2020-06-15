/**
 * 
 */
package com.java8.methodReference;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */

interface shitAgain {
//	void somethingToShow();
	void something();
}

public class MethodReference {

	/*
	 * method reference is used to refer method of the functional interface there
	 * are 3 types of method references : 1. reference to a static method 2.
	 * reference to an instance method 3. reference to a constructor
	 */

	public static void somethingToShow() {
		System.out.println("printing something that doesn't make sense...");
	}

	public static void main(String[] args) {

		shitAgain shit = MethodReference::somethingToShow;
		shit.something();

	}

}
