package exceptions;

import org.junit.jupiter.api.Test;

public class HandlerTest {
	Handler handle = new Handler();

	// @Test
	void testName() {

		handle.useName();
	}

	// @Test
	void testAge() {
		handle.useAge();
	}

	// @Test
	void testRecursive() {

		handle.recursive();
	}
}
