package com.newFeatures.java8;

public class FunctionalProgrammingExample {
	
	public static void main(String[] args) {
		
	String name = "Jaqueline";
	method1(name);
	
	Employee employee = new Employee(100,"Marie");
	
	method2(employee);
	
	//pass a method 
	method4(method4(name));
	
	//pass a lambda- the type of method parameter that receives 
	// must be of functional interface type
	method3((a,b) -> (a + b));
	
	}
	
	System.out::println;
	x -> System.out.println(name);
	
	interface Algebra{
		int operate(int a,int b);
	}
	
	public static void method1(String name) {	
	}
	
	public static void method2(Employee e) {
	}
	
	public static void method3(Algebra a) {
	}
	
	public static String method4(String name) {
		return "";
	}
	
}
