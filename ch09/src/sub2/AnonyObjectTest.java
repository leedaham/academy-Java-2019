package sub2;

/*
날짜 : 2019/10/22
이름 : 이다함
내용 : 익명 클래스 실습하기/교재 p404
 */

public class AnonyObjectTest {
	public static void main(String[] args) {

		//익명객체 - 인터페이스를 클래스 구현(implements)없이 new 연산으로 정의한 형태
		Person p = new Person() {
			@Override
			public void info() {
				System.out.println("Peroson info...");
			}
			@Override
			public void hello() {
				System.out.println("Peroson hello...");

			}
		};
		
		p.info();
		p.hello();
	}
}
