package sub1;

/*
날짜 : 2019/10/22
이름 : 이다함
내용 : 예외처리 실습하기/교재 p404
 */

public class ExceptionTest {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		int rs1 = 0, rs2 = 0, rs3 = 0, rs4 = 0;
		
		try {
			//에러가 발생할 가능성이 있는 코드로직
			rs1 = num1 + num2;
			rs2 = num1 - num2;
			rs3 = num1 * num2;
			rs4 = num1 / num2;
		}catch (Exception e) {
			//에러가 발생했을 때 처리할 로직
			e.printStackTrace();
		}
		
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		
		System.out.println("프로그램 종료...");
	}
}