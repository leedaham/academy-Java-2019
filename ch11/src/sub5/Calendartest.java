package sub5;

import java.util.Calendar;

/*
날짜 : 2019/10/23
이름 : 이다함
내용 : 자바  Calendar클래스 실습하기/교재 p533
 */

public class Calendartest {
	public static void main(String[] args) {
		
		//Calendar cal = new Calendar(); 객체 생성 못함. 객체를 얻어와야함.
		
		//싱글톤 객체 : ch06 - sub4 - Calc.java 참고
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int mon	 = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min  = cal.get(Calendar.MINUTE);
		int sec  = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일\n", year, mon, date);
		System.out.printf("%d:%d:%d\n", hour, min, sec);
	}
}
