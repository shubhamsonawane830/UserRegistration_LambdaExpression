package com.bridgelabz.code;

import java.util.regex.Pattern;

public class ValidateData {

	static boolean FirstName() throws PatternMismatchException {
		VariableStorage.regEx = "^[A-Z]+[a-z]{2,9}$";
		if (Pattern.matches(VariableStorage.regEx, VariableStorage.firstName)) {
			return true;
		} else {
			throw new PatternMismatchException("Invalid Input");
		}
	}

	static boolean LastName() throws PatternMismatchException {
		VariableStorage.regEx = "^[A-Z]+[a-z]{2,9}$";
		if (Pattern.matches(VariableStorage.regEx, VariableStorage.lastName)) {
			return true;
		} else {
			throw new PatternMismatchException("Invalid Input");
		}
	}

	static boolean UserEmail() throws PatternMismatchException {
		VariableStorage.regEx = "^[a-z]+[0-9]*([-_+.][0-9a-z]+)*@[0-9a-z]+[.][a-z]{2,4}([.][a-z]{2,3})*$";
		if (Pattern.matches(VariableStorage.regEx, VariableStorage.userEmail)) {
			return true;
		} else {
			throw new PatternMismatchException("Invalid Input");
		}
	}

	static boolean UserMobile() throws PatternMismatchException {
		VariableStorage.regEx = "^[0-9]{10}$";
		if (Pattern.matches(VariableStorage.regEx, VariableStorage.userMobile)) {
			return true;
		} else {
			throw new PatternMismatchException("Invalid Input");
		}

	}

	static boolean UserPassword() throws PatternMismatchException {
		VariableStorage.regEx = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
		if (Pattern.matches(VariableStorage.regEx, VariableStorage.userPassword)) {
			return true;
		} else {
			throw new PatternMismatchException("Invalid Input");
		}
	}
}