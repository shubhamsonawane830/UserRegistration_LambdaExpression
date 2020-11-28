package com.bridgelabz.code;

@FunctionalInterface
interface Greetings {
	public void Welcome();
}

public class UserRegistration {

	public static void main(String[] args) {
		String Message = "*Welcome to user Registration*";
		Greetings welcome = () -> {
			System.out.println("" + Message);
		};
		welcome.Welcome();
		OperationsFlow operation = new OperationsFlow();
		try {
			operation.MethodCall();
		} catch (PatternMismatchException e) {
			System.out.println("" + e.getMessage());
		}
	}
}
