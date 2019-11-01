package ex5;

/*
 * 날짜 : 2019/11/01
 * 이름 : 이다함
 * 내용 : 알고리즘 실습 - 최대공약수 구하기 
 * 
 * 개발과정
 * 1) 두 수 중 더 작은 값을 i에 저장
 * 2) i가 두 수의 공통된 약수인지 학인
 * 3) 공통된 약수이면 이 값을 결과값으로 돌려주고 종료
 * 4) 공통된 약수가 아니면 i를 1만큼 감소시키고 2번으로 돌아가 반복
 * 
 * 예) 4와 6의 최대공약수 찾기
 * 1 - i에 4를 저장(4와 6중 작은 값인 4가 최대공약수 후보 중 가장 큰 값)
 * 2 - 4는 i로 나누어 떨어지지만, 6은 나누어 떨어지지 않음
 */

public class GCDTest {

	public static void main(String[] args) {
		
		System.out.println("1과 5의 최대공약수 : "+gcd(1, 5));
		System.out.println("3과 6의 최대공약수 : "+gcd(3, 6));
		System.out.println("12과 18의 최대공약수 : "+gcd(12, 18));
		System.out.println("60과 24의 최대공약수 : "+gcd(60, 24));
	}
	
	public static int gcd(int a, int b) {
		
		int i = 0;
		
		// a와 b중 작은수를 i에 저장
		if(a < b) {
			i = a;
		}else {
			i = b;
		}
				
		// i를 1씩 감소하면서 a와 b의 최대공약수 구하기 
		while(true) {
			
			if(a%i == 0 && b%i == 0) {
				break;
			}
			i--;
		}
		
		return i;
	}
}