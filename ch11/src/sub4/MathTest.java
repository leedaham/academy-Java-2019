package sub4;

/*
날짜 : 2019/10/23
이름 : 이다함
내용 : 자바 Math클래스 실습하기/교재 p533
 */

public class MathTest {
	public static void main(String[] args) {
		
		// Math m = new Math(); - 안됨. 의도적으로 private으로 막아놈.
		// Math 객체를 생성할 수 없는 클래스
		
		System.out.println("PI : "+Math.PI);
		System.out.println("절대값 : "+Math.abs(-5));	//absolute number
		System.out.println("절대값 : "+Math.abs(-3.14));
		System.out.println("제곱근 : "+Math.sqrt(9));	//square root
		System.out.println("올림값 : "+Math.ceil(1.2));
		System.out.println("올림값 : "+Math.ceil(1.8));
		System.out.println("내림값 : "+Math.floor(1.8));
		System.out.println("내림값 : "+Math.floor(1.1));
		System.out.println("반올림 : "+Math.round(1.1));
		System.out.println("반올림 : "+Math.round(1.5));
		
		// random
		double num1 = Math.random();
		System.out.println("num1 : "+num1); // 0 ~ 1사이의 실수
		
		double num2 = num1 * 10;
		System.out.println("num2 : "+num2); // 0 ~ 10사이의 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : "+num3); // 1 ~ 10사이의 정수
		
		double num4 = Math.ceil(Math.random() * 10);
		System.out.println("num4 : "+num4); // 한번에 쓰기
		
		double num5 = Math.ceil(Math.random() * 45);
		System.out.println("num5 : "+num5); // 0~45사이의 정수
		
		
	}
}
