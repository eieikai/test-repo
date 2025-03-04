package exceptions;

import org.junit.jupiter.api.Test;

public class BHandlerTest {
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
