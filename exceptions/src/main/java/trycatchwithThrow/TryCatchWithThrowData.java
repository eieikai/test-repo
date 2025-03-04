package trycatchwithThrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class TryCatchWithThrowData {

	public void useMessage() {
		try {
			String message = getData();

			System.out.println(checkMessage(message));

		} catch (IOException e) {
			System.err.println(e.getMessage());

		} catch (NoSuchElementException e) {
			System.err.println(e.getMessage());
		}
	}

	//create Check type must be throws that type
	//create Uncheck type , throw or don't throws you like
	//when used throws, same type or super type(of create object exception)
	private String checkMessage(String message) {

		if (message.isBlank()) {
			throw new NullPointerException ("There is no message");
		}
		return message;
	}

	private String getData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type Your Message!!!");
		return br.readLine();
	}
}
