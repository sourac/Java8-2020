/**
 * 
 */
package com.java8.lambdas;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */

interface ShitAgain {
	public String youTalkingToMe(String name);
}

public class Lambda3 {

	public static void main(String[] args) {
		
		
		//single parameter lambda
		ShitAgain shit=(name)->{
			return "Hello " + name;
		};
		
		System.out.println(shit.youTalkingToMe("Barkha"));
		
		

	}

}
