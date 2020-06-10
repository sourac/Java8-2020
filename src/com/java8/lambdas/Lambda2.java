/**
 * 
 */
package com.java8.lambdas;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */

interface something {
	public void doShit();
}

public class Lambda2 {

	/*
	 * Lambda function are function without name. they're used to provide the
	 * implementation of the functional interface.
	 * 
	 */

	public static void main(String[] args) {
		
		int shit=10;
		something someShit= ()->{
			System.out.println("Doing shit from last " + shit + " minutes");
		};
		
		someShit.doShit();

	}

}
