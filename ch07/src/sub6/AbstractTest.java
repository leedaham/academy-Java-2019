package sub6;

/*
날짜 : 2019/10/21
이름 : 이다함
내용 : 추상클래스 실습하기/교재 p329
 */

//현실세계의 개체를 코드화 한 것 = 클래스
//추상클래스는 클래스들을 표준화한다.
public class AbstractTest {
	public static void main(String[] args) {
		
		//추상 메서드 선언(구현 안됨)
		//Unit unit = new Unit():
		
		Unit u1 = new Marin();
		Unit u2 = new Zealot();
		Unit u3 = new Zergling();
		
		u1.move();
		u1.attack();
		u1.speacial();
		
		u2.move();
		u2.attack();
		u2.speacial();
		
		u3.move();		
		u3.attack();
		u3.speacial();
	}
}
