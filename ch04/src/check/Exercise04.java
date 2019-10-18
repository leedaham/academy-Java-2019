package check;

public class Exercise04 {
	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6)+1;	//math.random()은 랜덤값이라 정수가아님. (int)로 정수로 특정지어야함.
			int num2 = (int)(Math.random()*6)+1;	//math.random() 에 *n을 하면 0<x<6 의 범위를 가지게 됨.
			System.out.println("(" + num1 + "," + num2 + ")");
			if((num1+num2)==5) {
				break;
			}
		}

		System.out.println("프로그램 종료...");
	}
}
