package sub2;

/*
 * 날짜 : 2019/10/16
 * 이름 : 이다함
 * 내용 : 자바 클래스 실습하기
 */
/*
 	클래스 = 객체 (Object)
 	자바 프로그램 = 객체 지향 프로그램 (Object Oriented Program, OOP)
 */
public class ClassTest {
	
	public static void main(String[] args) {
	
		//국민은행 객체생성 및 초기화
		Account kb = new Account("국민은행", "121-11-1234", "김유신", 10000);
		
		//기능활용
		kb.deposit(20000);
		kb.withdraw(5000);
		//kb.money -= 1; // 취약코드 -> 멤버변수의 캡슐화(private)를 통한 취약코드 예방
		
		kb.info();
		
		//우리은행 객체생성 및 초기화
		Account wr = new Account("우리은행", "1124801-8522", "박준영", 150000);
		
		//기능활용
		wr.deposit(100000);
		wr.withdraw(1500);
		wr.info();
	}
}
