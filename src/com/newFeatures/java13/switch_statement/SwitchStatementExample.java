package com.newFeatures.java13.switch_statement;

public class SwitchStatementExample {
	
	
	public static void main(String[] args) {
		int numLettersBefore = 0 ;
		Day dayBefore = Day.WEDNESDAY;
		
		switch(dayBefore) {   
		case MONDAY:
		case FRIDAY:
		case SUNDAY:
			numLettersBefore=6;
			break;
		case TUESDAY:
			numLettersBefore =7;
			break;
		case THURSDAY:
		case SATURDAY:
			numLettersBefore =7;
		case WEDNESDAY:
			numLettersBefore =9;
			break;
			default:
				throw new IllegalStateException("Invalid day:"+ dayBefore);
		}
		
		
		// JAVA 13
		int numLettersAfter = 0;
		Day dayAfter = Day.WEDNESDAY;
		switch(dayAfter) {
			case MONDAY,FRIDAY,SUNDAY -> numLettersAfter = 6;
			case TUESDAY			  -> numLettersAfter = 7;
			case THURSDAY,SATURDAY    -> numLettersAfter = 8;
			case WEDNESDAY			  -> numLettersAfter = 9;
			default -> throw new IllegalStateException("Invalid day:"+ dayBefore);
		};
		
	}

}
