package exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import check.CheckExceptionData;

public class CheckExceptionTest {

	CheckExceptionData data = new CheckExceptionData();

	@Test
	void fileTest() {
		String res = data.creteFile("");
		assertEquals(res, "exit");

		String res1 = data.creteFile("D:/data/");
		assertEquals(res1, "IOException");

	}
}
