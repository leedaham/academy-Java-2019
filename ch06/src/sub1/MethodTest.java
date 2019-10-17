package sub1;

/*
 * 날짜 : 2019/10/15
 * 이름 : 이다함
 * 내용 : method(함수) 실습하기/교재 p214
 */

public class MethodTest {
	
	// main method : java program 시작점
	public static void main(String[] args) {
		
		//method 실행(호출)
		int rs1 = fx(1);
		int rs2 = fx(2);
		int rs3 = fx(3);
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
	}
	
	// fx method 정의 (method의 이름은 소문자로 이뤄저야 하고, class이름은 대문자로 시작해야함)
	public static int fx(int x) {
		int y = 2 * x + 1;
		return y;
	}
}
