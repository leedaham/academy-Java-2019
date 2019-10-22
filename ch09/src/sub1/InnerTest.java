package sub1;

import sub1.Outer.Inner;

/*
날짜 : 2019/10/22
이름 : 이다함
내용 : 중첩 클래스 실습하기/교재 p390
 */

public class InnerTest {
	public static void main(String[] args) {
		
		Outer out = new Outer(1);
		out.info();
		
		Inner inn = out.new Inner(2);
		inn.info();
	}
}
