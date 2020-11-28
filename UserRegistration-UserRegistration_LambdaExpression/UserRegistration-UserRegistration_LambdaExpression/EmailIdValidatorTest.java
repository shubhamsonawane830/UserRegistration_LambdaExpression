package com.bridgelabz.code;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.*;
import java.util.Arrays;
import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class EmailIdValidatorTest {

	private String emailId;
	private String expected;

	public EmailIdValidatorTest(String emailId, String expected) {
		this.emailId = emailId;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}: isValid({0})={1}")

	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] {

				{ "abc@yahoo.com", "valid" }, { "abc-100@yahoo.com", "valid" }, { "abc.100@yahoo.com", "valid" },
				{ "abc111@abc.com", "valid" }, { "abc-100@abc.net", "valid" }, { "abc.100@abc.com.au", "valid" },
				{ "abc@1.com", "valid" }, { "abc@gmail.com.com", "valid" }, { "abc+100@gmail.com", "valid" }, });
	}

	@Test
	public void testIsValidEmailId() throws Exception {
		String actual = EmailIdUtility.UserEmail(emailId);
		extracted(actual);
	}

	@SuppressWarnings("deprecation")
	private void extracted(String actual) {
		assertThat(actual, is(equalTo(expected)));
	}
}
