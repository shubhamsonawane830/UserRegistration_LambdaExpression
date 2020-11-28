package com.bridgelabz.code;

import java.util.Scanner;

public class InputData {
	static Scanner scan = new Scanner(System.in);

	public static void FirstName() {
		System.out.println("\nEnter First Name : ");
		VariableStorage.firstName = scan.next();
	}

	public static void LastName() {
		System.out.println("\nEnter Last Name : ");
		VariableStorage.lastName = scan.next();
	}

	public static void UserEmail() {
		System.out.println("\nEnter Email : ");
		VariableStorage.userEmail = scan.next();
	}

	public static void UserMobile() {
		System.out.println("\nEnter Mobile Number : ");
		VariableStorage.userMobile = scan.next();
	}

	public static void UserPassword() {
		System.out.println("\nEnter User Password: ");
		VariableStorage.userPassword = scan.next();
		scan.close();
	}

}