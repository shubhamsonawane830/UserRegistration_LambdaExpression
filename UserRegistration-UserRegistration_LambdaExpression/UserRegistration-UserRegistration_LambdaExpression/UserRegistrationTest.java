package com.bridgelabz.code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	@Test
	void FirstNameTest() throws PatternMismatchException {
		InputData.FirstName();
		ValidateData.FirstName();
		assertEquals(true, true);
	}

	@Test
	void LastNameTest() throws PatternMismatchException {
		InputData.LastName();
		ValidateData.LastName();
		assertEquals(true, true);
	}

	@Test
	void UserEmailTest() throws PatternMismatchException {
		InputData.UserEmail();
		ValidateData.UserEmail();
		assertEquals(true, true);
	}

	@Test
	void UserMobileTest() throws PatternMismatchException {
		InputData.UserMobile();
		ValidateData.UserMobile();
		assertEquals(true, true);
	}

}
