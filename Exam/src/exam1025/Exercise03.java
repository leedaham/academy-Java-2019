package exam1025;

/*
 * 날짜 : 2019/10/25
 * 이름 : 이다함
 * 문항 : Exercise03
 */

public class Exercise03 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: "+sum);
	}
}
