/**
 * 
 */
package com.java8.functionalInterface;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */

@FunctionalInterface
public interface FunctionInterfaceDef {

	public void doSomething();
	// public void doSomethingMore();

	/*
	 * Functional interface can have max one abstract method.
	 * 
	 * @functional interface annotation is provided for the compiler level error.
	 * even if we remove the @functionalInterface annotation and have only one
	 * abstract method, then also it is valid. Function interface also called the
	 * SAM(Single abstract method)
	 *
	 * In functional interface,we can define the deafult method now the default
	 * methods are not abstract, we can add as many we want.
	 *
	 * Now question comes, what if our functional interface has
	 * implemented/overriden the public method of the java.lang.object ?
	 *
	 * Well the answer to this is, that will still hold valid because, any
	 * implementation of the interface will have implementation from the
	 * java.lang.object or elsewhere.
	 * 
	 * 
	 */

	// f.ex if i override the toString() method from the object class, my functional interface will remain
	// valid.

	public String toString();

}
