package sub4;

/*
날짜 : 2019/10/21
이름 : 이다함
내용 : 다형성(Polymorphism) 실습하기/교재 p305
 */

public class PolyTest2 {
	//다형성을 이용하면 프로그램이 어떻게 유연해지는가~
	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		Shark s = new Shark();
		
		//객체 배열
		Animal objs[] = {t, e, s};
		
		objs[0].move();
		objs[0].hunt();
		
		objs[1].move();
		objs[1].hunt();
		
		objs[2].move();
		objs[2].hunt();
		
		//다형성을 이용한 메서드의 매개변수;
		move(t);
		move(e);
		move(s);
	}
	
	public static void move(Animal a) {
		a.move();
	}
}
//	Animal Class 생성.
//	Tiger Class 생성. (extends Animal)
//	Eagle Class 생성. (extends Animal)
//	Shark Class 생성. (extends Animal)
//
//	Tiger t = new Tiger();
//	Eagle e = new Eagle();
//	Shark s = new Shark(); 로 객체를 선언했었는데, 객체 선언타입을 Animal로 바꿈.
//
//	원래 Tiger, Eagle, Shark로 선언했을때는
//	Tiger, Eagle, Shark와 extends 한 Animal까지 참조했었음.
//	Animal로 선언함으로써 Tiger, Eagle, Shark는 참조하지않고 Animal만 참조함.
//	다만, Tiger, Eagle, Shark로부터 Override된 method들은 Animal에서 참조함.
//
//	Animal로 객체선언하며, 객체 배열을 할 수 있고,
//	Tiger, Eagle, Shark의 매개변수를 각각지정해주지 않아도 됨. 

