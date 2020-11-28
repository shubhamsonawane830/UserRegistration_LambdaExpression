package com.bridgelabz.code;

import java.util.regex.Pattern;

public class EmailIdUtility {
	public static String result = "";

	public static String UserEmail(String emailId) {
		String regEx = "^[a-z]+[0-9]*([-_+.][0-9a-z]+)*@[0-9a-z]+[.][a-z]{2,4}([.][a-z]{2,3})*$";
		if (Pattern.matches(regEx, emailId)) {
			result = "valid";
		} else {
			result = "invalid";
		}
		return result;
	}
}