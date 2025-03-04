package exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import trycatch.TryCatchData;

public class TryCatchTest {

	TryCatchData data = new TryCatchData();
	
	@Test
	void TestTryWithFinally() {
		String res = data.useCheckedWithTryFinallyAndResource();
		System.out.println(res);
	}

	//@Test
	void testTryMultiCatch() {
		int res1 = data.useUncheckedWithTryMulticatch(new int[2], "2");
		assertEquals(-1, res1);

		int res2 = data.useUncheckedWithTryMulticatch(new int[2], "hello");
		assertEquals(-1, res2);
	}

	// @Test
	void testTryCatch() {
		String res1 = data.useUncheckedWithTryCatch(127);
		System.out.println(res1);
		assertEquals(res1, "ClassCastException");

	}
}
