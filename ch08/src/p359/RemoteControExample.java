package p359;

import p349.RemoteControl;
import p351.Television;
import p352.Audio;

public class RemoteControExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
}
