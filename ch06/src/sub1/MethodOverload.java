package sub1;

/*
 * 날짜 : 2019/10/15
 * 이름 : 이다함
 * 내용 : overload method(함수) 실습하기
 */

public class MethodOverload {

	public static void main(String[] args) {
		overload(1);
		overload(1,2);
		overload("김유신");
		overload(true);
	}
	
	//overload method : method이름이 똑같지만 매개변수로 구분하는 method.
	public static void overload(int a) {
		System.out.println("첫번째 오버로드 메서드 실행...");
	}
	public static void overload(int a, int b) {
		System.out.println("두번째 오버로드 메서드 실행...");
	}
	public static void overload(String name) {
		System.out.println("세번째 오버로드 메서드 실행...");
	}
	public static void overload(boolean isOk) {
		System.out.println("네번째 오버로드 메서드 실행...");
	}
	
	
}
