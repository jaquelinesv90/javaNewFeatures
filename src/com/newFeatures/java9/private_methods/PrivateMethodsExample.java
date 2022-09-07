package com.newFeatures.java9.private_methods;

public interface PrivateMethodsExample {
		
	default void bar() {
		baz();
	}
	// private method
	private void baz() {
		System.out.println(" Hello world");
	}
	
	
	static void buzz() {
		System.out.print("static method");
	}
	
	private static void staticBaz() {
		System.out.print("static method");
	}
	
}
