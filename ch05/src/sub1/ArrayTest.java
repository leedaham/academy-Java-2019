package sub1;

/*
 * 날짜 : 2019/10/15
 * 이름 : 이다함
 * 내용 : 배열 실습하기
 */

public class ArrayTest {
	public static void main(String[] args) {
		
		//변수
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		//배열
		int num[] = {1, 2, 3, 4, 5};  //순서는 0-1-2-3-4. 즉, 0부터 시작.
		
		for(int i=0; i<=4; i++) {
			System.out.println("num 배열의" + (i+1) + "번째 원소 : "+num[i]);
		}
		
		//확인연습
		String person[] = {"김유신", "김춘추", "장보고", "강감찬", "이순신"};
		
		for(int i=0; i<5; i++) {
			System.out.println("person["+i+"] = "+person[i]);
		}
		
	}
}
