package sub1;

/*
 * 날짜 : 2019/10/15
 * 이름 : 이다함
 * 내용 : method 실행 영역과 메모리
 */

public class MethodScopeTest {

	public static void main(String[] args) {
	
		int result = 0;
		int start = 1;
		int end = 10;
		
		result = sum(start, end);
		System.out.println("결과 : "+result);
		
	}
	
	public static int sum(int s, int e) {
		
		int sum = 0;
		
		for(int k=s; k<=e; k++) {
			sum += k;
		}
		
		return sum;
	}
}
