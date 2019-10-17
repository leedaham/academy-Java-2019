package sub1;

/*
 * 날짜 : 2019/10/11
 * 이름 : 이다함
 * 내용 : 조건문 실습하기 /교재 p108
 */

public class ConditionTest {

	public static void main(String[] args) {
		
		//if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			System.out.println("num1이 num2보다 크다.");
		}
		
		//중첩 if
		if (num1 > 0) {
			
			if(num2 > 1) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다");
			}
		}
		//위 중첩 if와 같음. 이걸 사용해야함.
		if(num1 > 0 && num2 > 1) {
			System.out.println("num1은 0보다 크고 num2는 1보다 크다");
		}
		
		//if ~ else
		if(num1 > num2) {
			//조건이 참일 때,
			System.out.println("num1이 num2보다 크다.");
		}else {
			//조건이 거짓일 때,
			System.out.println("num1이 num2보다 작다.");
		}
		
		//if ~ else if ~ else
		int n1 = 1, n2 = 2, n3 = 4, n4 = 4;
		
		//조건 여러개를 검사함.
		if(n1 > n2) {
			System.out.println("n1이 n2보다 크다");
		}else if(n2 > n3) {
			System.out.println("n2이 n3보다 크다");
		}else if(n3 > n4) {
			System.out.println("n3이 n4보다 크다");
		}else {
			System.out.println("n4가 제일 크다");
		}
		
		//switch (검사?)
		String fruit = "apple";
		
		switch(fruit) {
		
		case "banana":
			System.out.println("바나나 입니다.");
			break;
		case "orange":
			System.out.println("오렌지 입니다.");
			break;
		case "apple":
			System.out.println("사과 입니다.");
			break;
		case "grape":
			System.out.println("포도 입니다.");
			break;
		default:
			System.out.println("알 수 없습니다.");
			break;
		}
		
		System.out.println("프로그램 종료...");
	}
}
