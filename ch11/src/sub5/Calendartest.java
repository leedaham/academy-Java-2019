package sub5;

import java.util.Calendar;

/*
��¥ : 2019/10/23
�̸� : �̴���
���� : �ڹ�  CalendarŬ���� �ǽ��ϱ�/���� p533
 */

public class Calendartest {
	public static void main(String[] args) {
		
		//Calendar cal = new Calendar(); ��ü ���� ����. ��ü�� ���;���.
		
		//�̱��� ��ü : ch06 - sub4 - Calc.java ����
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int mon	 = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min  = cal.get(Calendar.MINUTE);
		int sec  = cal.get(Calendar.SECOND);
		
		System.out.printf("%d�� %d�� %d��\n", year, mon, date);
		System.out.printf("%d:%d:%d\n", hour, min, sec);
	}
}
