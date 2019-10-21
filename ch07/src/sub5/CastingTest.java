package sub5;

import sub4.Animal;
import sub4.Eagle;
import sub4.Tiger;

/*
날짜 : 2019/10/21
이름 : 이다함
내용 : 캐스팅 실습하기/교재 p306
 */

public class CastingTest {
	public static void main(String[] args) {
		
		// 캐스팅 - 타입변환
		int num1 = 1;
		double num2 = num1;
		
		double var1 = 1.23;
		int var2 = (int)var1;
		
		// 업캐스팅 (다형성)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		
		// 다운캐스팅
		Tiger t = (Tiger)a1;
		Eagle e = (Eagle)a2;
		
		t.move();
		e.move();
		
	}
}
