/**
 * 
 */
package com.java8.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Atul Sharma
 *
 * https://github.com/sourac
 */
public class Lambda5 {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("shani");
		list.add("shukr");
		list.add("mangal");
		list.add("rahu");
		list.add("ketu");
		
		//lambda with the foreach
		list.forEach(p->System.out.println(p));
		
	}

}
