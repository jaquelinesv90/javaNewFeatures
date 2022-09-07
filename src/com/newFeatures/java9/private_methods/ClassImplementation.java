package com.newFeatures.java9.private_methods;

public class ClassImplementation implements PrivateMethodsExample {

	public static void main(String[] args) {
		PrivateMethodsExample variable = new ClassImplementation();
		variable.bar();
		
		PrivateMethodsExample.buzz();
	}
}
