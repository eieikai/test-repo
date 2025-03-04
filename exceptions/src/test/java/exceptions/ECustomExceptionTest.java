package exceptions;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import custom.CustomExceptionData;
import custom.MyChekException;
import custom.MyUnCheckException;

public class ECustomExceptionTest {

	static CustomExceptionData data;

	@BeforeAll
	static void init() {
		data = new CustomExceptionData();
	}

	@Test
	void testException() {
		assertThrows(MyUnCheckException.class, () -> data. getMyUnCheckException(""));
		assertThrows(MyUnCheckException.class, () -> data.changeCheckToUncheck(null));
		assertThrows(MyChekException.class, () -> data.getMyCheckException(" "));
	}
}
