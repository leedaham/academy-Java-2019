package sub3;

/*
날짜 : 2019/10/21
이름 : 이다함
내용 : 오버라이드 메서드 실습하기/교재 p295
 */

public class OverrideTest {
	public static void main(String[] args) {
		
		BBB b = new BBB();
		
		b.method1();
		b.method2();
		b.method2(1);
		b.method3();
	
		// final 실습
		// - final 변수 : 상수
		// - final 메서드 : 오버라이드 금지
		// - final 클래스 : 상속금지
		
		final int NUM = 1; //상수. 항상 같은 수. 바꿀 수 없음. 대문자사용.
		final double PI= 3.14;
		//NUM = 2; //상수는 값을 대입 할 수 없다.
	}
}

//오버라이드 = 재정의
//부모의 메서드와 중복되면 자식의 메서드가 실행됨 (덮어썼기 때문에)

