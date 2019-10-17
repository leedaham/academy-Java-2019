package p69;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; // 빼기 * 더하기는 빼기니까 여전히 x는 -100
		int result2 = -x; // 빼기 * 빼기는 더하기니까  x는 100
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		//short result3 = -s; //컴파일 에러 (부호연산자의 산출타입이 int임)
		int result3 = -s;
		System.out.println("result3=" + result3);
	}
}
