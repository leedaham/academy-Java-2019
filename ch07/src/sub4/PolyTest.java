package sub4;

/*
날짜 : 2019/10/21
이름 : 이다함
내용 : 다형성(Polymorphism) 실습하기/교재 p305
 */

public class PolyTest {
	public static void main(String[] args) {
		
		//다형성 - 객체의 선언타입을 부모클래스로 지정하는 것
		Animal t = new Tiger(); //Animal을 선언타입으로 하므로써 Tiger와 Animal이 아닌 Animal만 참조함. 다만 Animal에서 오버라이드 된 함수때문에 tiger를 참조할 뿐.
		Animal e = new Eagle();	//Animal에 hunt메서드가 없다면 Tiger에 있는 hunt가 실행되지 않음.
		Animal s = new Shark();	//Animal로 선언하므로써 Tiger, Eagle, Shark를 Animal로 표준화 시켰다.
								//프로그램을 유연하게 만들었다.
		
		t.move();
		t.hunt(); 
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
		
	}
	
	
	
}
