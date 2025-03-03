package check;

import java.io.File;
import java.io.IOException;

public class CheckExceptionData {

	public String creteFile(String dir) {
		try {
			File file = new File(dir + "text.txt");
			file.createNewFile();
			return file.exists() ? "exit" : "empty";

		} catch (IOException e) {
			return "IOException";
		}

	}
}
