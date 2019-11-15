package p591;

import p592.Calculator;
import p592.User1;
import p593.User2;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
