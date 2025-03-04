package custom;

public class CustomExceptionData {
	
	public String changeCheckToUncheck(String message) {
		try {
		String mess = getMyCheckException(message);
		System.out.println(mess);
		
		} catch (MyChekException e) {
			System.err.println(e.getMessage());
			throw new MyUnCheckException(e.getMessage());
		}
		return message;
	}
	
	
	public String getMyCheckException(String message) throws MyChekException {
		if(null == message || message.isBlank()) {
			throw new MyChekException("There is no message yet for check !");
		}
		return message;
	}
	
	
	public String getMyUnCheckException(String message) {
		if(null == message || message.isBlank()) {
			throw new MyUnCheckException("There is no message yet for uncheck !");
		}
		return message;
	}
}
