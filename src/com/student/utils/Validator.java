package com.student.utils;

public class Validator {

	public static boolean isValidEmail(String email) {
		if (email == null || email.isEmpty()) {
			return false;
		}
		return email.contains("@") && email.contains(".");
	}
	
	public static boolean isValidGrade(double grade) {
		return grade >= 0 && grade <= 10;
	}
	
}
