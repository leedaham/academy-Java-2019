package sub1;

/*
날짜 : 2019/10/28
이름 : 이다함
내용 : 람다식 실습하기/교재 p678
 */

public class LambdaTest {
	public static void main(String[] args) {
		
		//람다식 : 매개변수를 가진 코드블럭을 갖는 익명함수
		Type1 t1 = () -> {System.out.println("Type1 람다식 실행..."); };
		Type2 t2 = (x) -> {System.out.println("Type2 람다식 실행... - "+x); };
		Type3 t3 = (x, y) -> {
			int result = x + y;
			return result;
		};
		
		//람다식 실행
		t1.fx();
		t2.fx(3);
		
		int result = t3.fx(2, 3);
		System.out.println("result : "+ result);
		
	}
}
