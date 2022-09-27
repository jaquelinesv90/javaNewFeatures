package com.newFeatures.java14.record_keyword;

import java.util.Objects;

public class Person {
	
	private final String name;
	private final String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public int hashCode() {
		return Objects.hash(name, address);
	}
	
	public boolean equals(Object ob) {
		if() {
			
		}
	}
}
