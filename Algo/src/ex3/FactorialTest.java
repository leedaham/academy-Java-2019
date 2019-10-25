package ex3;


/*
 * 날짜 : 2019/10/25
 * 이름 : 이다함
 * 내용 : 알고리즘 실습 - 팩토리얼 구하기
 * 
 * 개발과정
 *  factorial(5)
 * 		-> 5 x factorial(4)
 *			-> 4 x factorial(3)
 *				-> 3 x factorial(2)
 *					-> 2 x factorial(1)
 *						-> 1 
 *					-> 2 x 1
 *				-> 3 x 2 x 1
 *			-> 4 x 3 x 2 x 1
 *		-> 5 x 4 x 3 x 2 x 1 = 120 (최종결과)
 */

public class FactorialTest {

	public static void main(String[] args) {
		/*
			팩토리얼 - 1부터 n까지 연속한 숫자를 차례로 곱한 값
			1! = 1
			2! = 1 x 2 = 2
			3! = 1 x 2 x 3 = 6
			4! = 1 x 2 x 3 x 4 = 24
			5! = 1 x 2 x 3 x 4 x 5 = 120
			n! = 1 x 2 x 3 x ... x (n-1) x n
		 */
		int rs = factorial(5);
		System.out.println(rs);
	}
	
	// factorial 메서드 정의 (재귀메서드)
	public static int factorial(int n) {
		if( n == 1) {
			return 1;
		}
		
		int result = n * factorial(n-1);
		
		return result;
	}
	
	/* 내가 한 답
	public static int factorial(int n) {
		int result = 1;
		for(int k=1; k<=n; k++) {
			result *= k;
		}
		return result;
	}*/
}