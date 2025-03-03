package spt.jdc.mkt.enum_test;

import java.util.Scanner;

public class WorkerDemo {
	
	private static Scanner sc;
	
	enum Day {
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int day = selectDay();
		String result = checkWorkDay(day);
		System.out.println(result);
	}
	
	static String checkWorkDay(int a) {
		Day day = Day.Sunday;
		
		for(Day d : Day.values()) {
			if(d.ordinal() == (a-1)) {
				day = d;
				break;
			}
		}
//		return switch(day) {
//		case Monday, Tuesday, Wednesday, Thursday, Friday -> "Work Day";
//		default -> "Off Day";
//		};
		
		String res = null;
		
		switch(day) {
		case Monday:
		case Tuesday:
		case Wednesday:
		case Thursday:
		case Friday:
			return "Work Day";
//			res = "Work Day";
//			break;
		case Saturday:
		case Sunday:
			return "Off Day";
		}
		
		return res;
	}
	
	static int selectDay() {
		System.out.println("""
				Select Number by Day!
				1.Sunday
				2.Monday 
				3.Tuesday 
				4.Wednesday 
				5.Thursday 
				6.Friday 
				7.Saturday
				""");
		
		return sc.nextInt();
		
	}
}
