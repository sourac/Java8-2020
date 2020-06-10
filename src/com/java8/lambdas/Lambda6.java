/**
 * 
 */
package com.java8.lambdas;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class Lambda6 {

	public static void main(String[] args) {

		// creating a thread without a lambda
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("do something..");
			}
		});

		t1.start();

		
		//using lambda for creating the thread
		Thread t2 = new Thread(() -> {
			System.out.println("doing something with lambda");
		});
		t2.start();

	}

}
