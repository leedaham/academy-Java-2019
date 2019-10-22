package sub1;

/*
날짜 : 2019/10/22
이름 : 이다함
내용 : 인터페이스 실습하기/교재 p344
 */

	//인터페이스
	// - 추상클래스보다 더 추상적임

public class InterfaceTest {
	public static void main(String[] args) {
		
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.chUp();
		lg.soundDown();
		
		samsung.powerOn();
		samsung.chDown();
		samsung.powerOff();
	}
}
