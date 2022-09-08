package com.newFeatures.java8.funtional_interfaces;

import java.io.PrintWriter;

public interface FunctionalInterfaceExample {
		
	public void execute();
	
	public default void print(String text) {
		System.out.println(text);
	}
	
	public static void print(String text, PrintWriter writer) {
		writer.write(text);
	}
}
