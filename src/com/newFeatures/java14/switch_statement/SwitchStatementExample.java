package com.newFeatures.java14.switch_statement;

public class SwitchStatementExample {
	
	public static void main(String[] args) {
		
		boolean isTodayHolidayOld;
		String day = "MONDAY";
		
		switch(day) {
			case "MONDAY":
			case "TUESDAY":
			case "WEDNESDAY":
			case "THURSDAY":
			case "FRIDAY":
				isTodayHolidayOld = false;
				break;
			case "SATURDAY":
			case "SUNDAY":
				isTodayHolidayOld = true;
				break;
			default:
				throw new IllegalArgumentException("what's a "+ day);
		}
		
		boolean isTodayHolidayNew = switch(day) {
			case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" -> false;
			case "SATURDAY","SUNDAY" -> true;
			default -> throw new IllegalArgumentException("what's a "+ day);
		};
	}
}
