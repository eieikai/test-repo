package trycatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchData {

	public String useCheckedWithTryFinallyAndResource() {
		String str = null;
		int res = 0;
		
		//try with resource
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Type Number !!!");
			str = br.readLine();
			res = Integer.parseInt(str);
			//br.close();

		} catch (IOException  | NumberFormatException e) {
			str = "Exception";

		} finally {
			str = str + " With change the number of : " + res;
		}
		return str;
	}

	public int useUncheckedWithTryMulticatch(int[] array, String index) {
		try {
			int i = Integer.parseInt(index);
			return array[i];

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			return -1;
		}
	}
	@SuppressWarnings("unused")
	public String useUncheckedWithTryCatch(Integer num) {
		try {
			int i = num / 0;

			Object b = num;
			return (String) b;

		} catch (ClassCastException e) {
			return "ClassCastException";

		} catch (ArithmeticException e) {
			return "ArithmeticException";

		} catch (RuntimeException e) {
			return "RuntimeException";
		}
	}
}
