package com.newFeatures.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
	
		//for - before
		for(String variable:list) {
			System.out.print(variable);
		}
		
		//for - after
		list.forEach(variable -> System.out.println(variable));
		
	}

}
