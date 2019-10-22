package sub3;

/*
날짜 : 2019/10/22
이름 : 이다함
내용 : 인터페이스 실습하기/교재 p344
 */

/*
프로그램은 응집도는 높아야하고, 결합도는 낮아야한다.
응집도를 높이는 것은 캡슐화 같은 것. (멤버의 변수를 private화 하는 것)
결합도 완화 = 객체간의 의존도를 낮춤. 객체간 다이렉트로 연결되면 하나가 문제가되면 연쇄적으로 문제가 생김.
 							 다이렉트로 연결되지 않게 인터페이스로 서로를 연결해주는 것임.
 */
public class InterfaceTest3 {
	public static void main(String[] args) {
		
		// 인터페이스 실습3 - 객체간의 결합도를 완화
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
	}
}
