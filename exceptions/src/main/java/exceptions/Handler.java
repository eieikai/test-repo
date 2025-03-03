package exceptions;

public class Handler {

		private Person person;
		
		private int count = 1;
		
		public Handler() {
			super();
			person = new Person();
			
		}
		
		//NullPointerException  when person object is not create 
		public void useName() {
			try {
				person.setName("John Doe");
				System.out.println(person.getName());
				
			}catch (NullPointerException e) {
				System.out.println("This is NullPointerException because there is no person");
			}
		}
		
		//ArithmeticException
		public void useAge() {
			try {
				person.setAge(20);
				int age = dividedByZero(person.getAge());
				System.out.println(age);
				
			}catch (ArithmeticException e) {
				System.out.println("This is ArithmeticException because any number can't divided by 0");
				
			}
		}
		
		//StackOverFlow Error
		public void recursive() {
			try {
				if(count > 0) {
					System.out.println("recursive : " + count);
					count ++ ;
					recursive();
				}
			}catch (StackOverflowError e) {
				System.out.println("This is StatckOverFlowError cause of recursive");
			}
		}
		
		private int dividedByZero(int age) {
			return age/0;
		}	
}
